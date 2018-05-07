package com.android.project.abcappen.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import com.android.project.abcappen.letters.LetterDot;
import com.android.project.abcappen.services.Sounds;

/**
 * Created by martin on 2018-04-19.
 */

public class PaintView extends View {

    private static final float TOUCH_TOLERANCE = 4;
    private static char CURRENT_CHAR = 'A';


    private Bitmap mBitmap;
    private Canvas mCanvas;
    private PathMeasure pathMeasure;
    private Path mPath;
    private Paint mPaint;
    private float mX, mY;
    private int currentDot;
    private int dotDistance;
    private int currentPathLength;
    private LetterDot letterDot;

    private ArrayList<Path> paths;
    private int currentLineNr;
    private Drawable[] currentLine;
    private Drawable background;
    private Context context;

    private Sounds sounds;
    private Toast toast;

    public PaintView(Context context) {
        super(context);
    }

    public PaintView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;

        sounds = new Sounds(context);
        paths = new ArrayList<>();
        pathMeasure = new PathMeasure();
        mPath = new Path();
        mPaint = new Paint();

        currentDot = 0;
        currentLineNr = 0;

        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeJoin(Paint.Join.ROUND);
        mPaint.setStrokeWidth(10f);
    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        mCanvas = new Canvas(mBitmap);
        clear();
    }


    public void clear() {
        currentDot = 0;
        currentLineNr = 0;
        letterDot = new LetterDot(CURRENT_CHAR, mCanvas, context);
        background = letterDot.getBackground();
        background.setBounds(0, 0, mCanvas.getWidth(), mCanvas.getHeight());
        paths.clear();
        mPath.reset();
        mPath.moveTo(mX, mY);
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        letterDot.getBackground().draw(canvas);

        for (Path p : paths) {
            canvas.drawPath(p, mPaint);
        }

        for (Drawable d : letterDot.dotLines[currentLineNr]) {
            d.draw(canvas);
        }
        canvas.drawPath(mPath, mPaint);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {

        float x = event.getX();
        float y = event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                mPath = new Path();
                touchStart(x, y);
                System.out.println("X: " + x);
                System.out.println("Y: " + y);
                invalidate();
                break;

            case MotionEvent.ACTION_MOVE:
                touchMove(x, y);
                pathMeasure.setPath(mPath, false);
                currentLine = letterDot.dotLines[currentLineNr];

                //check collision with dots
                if (currentLine[currentDot].getBounds().intersect((int) x - 30, (int) y - 30, (int) x + 20, (int) y + 30)) {
                    currentPathLength = (int) pathMeasure.getLength();
                    sounds.playPopSound();
                    if (currentDot == 0 && pathMeasure.getLength() >= 100) {
                        toast = Toast.makeText(context, "Please follow the dots", Toast.LENGTH_SHORT);
                        toast.show();
                        clear();
                        break;
                    }

                    //check if we are not on the last dot, if not calc distance to next dot
                    if (currentDot + 1 != currentLine.length) {
                        int currentDotX, currentDotY, nextDotX, nextDotY;
                        int A, B;
                        currentDotX = currentLine[currentDot].getBounds().centerX();
                        currentDotY = currentLine[currentDot].getBounds().centerY();
                        nextDotX = currentLine[currentDot + 1].getBounds().centerX();
                        nextDotY = currentLine[currentDot + 1].getBounds().centerY();
                        A = nextDotX - currentDotX;
                        B = currentDotY - nextDotY;
                        dotDistance = (int) Math.sqrt(A * A + B * B);
                    }

                    //TODO: FIX REMOVAL OF DOTS, TEMPORARY SOLUTION IN PLACE
                    currentLine[currentDot].setBounds(0, 0, 0, 0);
                    currentDot++;

                    //check if line and letter is finished
                    if (currentDot == currentLine.length) {
                        currentLineNr++;
                        toast = Toast.makeText(context, "Line: " + currentLineNr + " finished", Toast.LENGTH_SHORT);
                        toast.show();
                        paths.add(mPath);
                        currentDot = 0;
                        if (currentLineNr == letterDot.dotLines.length) {
                            toast = Toast.makeText(context, "Letter " + letterDot.getLetter() + " finished, Good job!", Toast.LENGTH_SHORT);
                            toast.show();
                            currentLineNr = 0;
                        }
                    }
                }

                //check if the drawn path is longer than the distance to the next dot
                if (pathMeasure.getLength() - currentPathLength >= dotDistance + 50) {
                    toast = Toast.makeText(context, "Please follow the dots", Toast.LENGTH_SHORT);
                    toast.show();
                    clear();
                    break;
                }
                invalidate();
                break;
            case MotionEvent.ACTION_UP:
                touchUp();
                invalidate();
                break;
        }

        return true;
    }


    private void touchStart(float x, float y) {
        mPath.moveTo(x, y);
        mX = x;
        mY = y;

    }

    public void touchMove(float x, float y) {
        float dx = Math.abs(x - mX);
        float dy = Math.abs(y - mY);

        if (dx >= TOUCH_TOLERANCE || dy >= TOUCH_TOLERANCE) {
            mPath.quadTo(mX, mY, (x + mX) / 2, (y + mY) / 2);
            mX = x;
            mY = y;
        }

    }

    public void touchUp() {
        mPath.lineTo(mX, mY);
    }

    public Canvas getmCanvas() {
        return mCanvas;
    }

    public Path getmPath() {
        return mPath;
    }

    public Paint getmPaint() {
        return mPaint;
    }

    public float getmX() {
        return mX;
    }

    public float getmY() {
        return mY;
    }
}