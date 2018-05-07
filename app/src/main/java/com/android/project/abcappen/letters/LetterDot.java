package com.android.project.abcappen.letters;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Log;

import com.android.project.abcappen.R;

/**
 * Created by martin on 2018-05-02.
 */

public class LetterDot {
    private static String LETTER_DOT_TAG = "LETTER_DOT";
    public static int CANVAS_WIDTH = 2048;
    public static int CANVAS_HEIGHT = 1392;

    private Canvas canvas;
    private Drawable background;
    private char letter;
    private int dotSize = 20;
    private float left, top, right, bottom, diffX, diffY;

    private Drawable dot1, dot2, dot3, dot4, dot5, dot6, dot7, dot8, dot9, dot10, dot11, dot12, dot13, dot14,
            dot15, dot16, dot17, dot18, dot19, dot20, dot21, dot22, dot23, dot24, dot25, dot26, dot27, dot28;

    private Drawable[] dotLine1;
    private Drawable[] dotLine2;
    private Drawable[] dotLine3;

    public Drawable[][] dotLines = new Drawable[3][];


    public LetterDot(char letter, Canvas canvas, Context context) {
        initDots(context);
        this.letter = letter;
        this.canvas = canvas;

        switch (letter) {
            // DONE
            case 'A':
                Log.i(LETTER_DOT_TAG, "Letter A printed");
                this.background = context.getResources().getDrawable(R.drawable.letter_a);
                dotLine1 = new Drawable[5];
                dotLine2 = new Drawable[5];
                dotLine3 = new Drawable[4];
                risingDiagonalLeft();
                fallingDiagonalRight();
                horizontalLineCenterLow();
                break;
            //DONE
            case 'B':
                Log.i(LETTER_DOT_TAG, "Letter B printed");
                this.background = context.getResources().getDrawable(R.drawable.letter_b);
                dotLine1 = new Drawable[5];
                dotLine2 = new Drawable[10];
                dotLine3 = new Drawable[11];
                straightLineLeft();
                halfCircleHigh();
                halvCircleLow();
                break;
            case 'C':
                Log.i(LETTER_DOT_TAG, "Letter C printed");
                this.background = context.getResources().getDrawable(R.drawable.letter_c);
                dotLine1 = new Drawable[16];
                halvCircleLeft();
                break;
            case 'D':
                Log.i(LETTER_DOT_TAG, "Letter D printed");
                this.background = context.getResources().getDrawable(R.drawable.letter_d);
                dotLine1 = new Drawable[5];
                dotLine2 = new Drawable[15];
                straightLineLeft();
                halvCircleRight();
                break;
            case 'E':
                Log.i(LETTER_DOT_TAG, "Letter E printed");
                dotLine1 = new Drawable[5];
                straightLineLeft();

                break;
            case 'F':
                Log.i(LETTER_DOT_TAG, "Letter F printed");
                dotLine1 = new Drawable[5];
                straightLineLeft();
                break;
            case 'G':
                break;
            case 'H':
                break;
            case 'I':
                break;
            case 'J':
                break;
            case 'K':
                Log.i(LETTER_DOT_TAG, "Letter K printed");
                dotLine1 = new Drawable[5];
                straightLineLeft();
                break;
            case 'L':
                Log.i(LETTER_DOT_TAG, "Letter L printed");
                dotLine1 = new Drawable[5];
                straightLineLeft();
                break;
            case 'M':
                break;
            case 'N':
                Log.i(LETTER_DOT_TAG, "Letter N printed");
                dotLine1 = new Drawable[5];
                straightLineLeft();
                break;
            case 'O':
                break;
            case 'P':
                Log.i(LETTER_DOT_TAG, "Letter P printed");
                dotLine1 = new Drawable[5];
                dotLine2 = new Drawable[10];
                straightLineLeft();
                halfCircleHigh();
                break;
            case 'Q':
                break;
            case 'R':
                Log.i(LETTER_DOT_TAG, "Letter R printed");
                dotLine1 = new Drawable[5];
                straightLineLeft();
                break;
            case 'S':
                break;
            case 'T':
                break;
            case 'U':
                break;
            case 'V':
                break;
            case 'W':
                break;
            case 'X':
                break;
            case 'Y':
                break;
            case 'Z':
                break;
            case 'Å':
                risingDiagonalLeft();
                fallingDiagonalRight();
                horizontalLineCenterLow();
                break;
            case 'Ä':
                risingDiagonalLeft();
                fallingDiagonalRight();
                horizontalLineCenterLow();
                break;
            case 'Ö':
                break;
        }

    }


    public void initDots(Context context) {
        dot1 = context.getResources().getDrawable(R.drawable.dot);
        dot2 = context.getResources().getDrawable(R.drawable.dot);
        dot3 = context.getResources().getDrawable(R.drawable.dot);
        dot4 = context.getResources().getDrawable(R.drawable.dot);
        dot5 = context.getResources().getDrawable(R.drawable.dot);

        dot6 = context.getResources().getDrawable(R.drawable.dot);
        dot7 = context.getResources().getDrawable(R.drawable.dot);
        dot8 = context.getResources().getDrawable(R.drawable.dot);
        dot9 = context.getResources().getDrawable(R.drawable.dot);
        dot10 = context.getResources().getDrawable(R.drawable.dot);

        dot11 = context.getResources().getDrawable(R.drawable.dot);
        dot12 = context.getResources().getDrawable(R.drawable.dot);
        dot13 = context.getResources().getDrawable(R.drawable.dot);
        dot14 = context.getResources().getDrawable(R.drawable.dot);
        dot15 = context.getResources().getDrawable(R.drawable.dot);

        dot16 = context.getResources().getDrawable(R.drawable.dot);
        dot17 = context.getResources().getDrawable(R.drawable.dot);
        dot18 = context.getResources().getDrawable(R.drawable.dot);
        dot19 = context.getResources().getDrawable(R.drawable.dot);
        dot20 = context.getResources().getDrawable(R.drawable.dot);

        dot21 = context.getResources().getDrawable(R.drawable.dot);
        dot22 = context.getResources().getDrawable(R.drawable.dot);
        dot23 = context.getResources().getDrawable(R.drawable.dot);
        dot24 = context.getResources().getDrawable(R.drawable.dot);
        dot25 = context.getResources().getDrawable(R.drawable.dot);

        dot26 = context.getResources().getDrawable(R.drawable.dot);
        dot27 = context.getResources().getDrawable(R.drawable.dot);
        dot28 = context.getResources().getDrawable(R.drawable.dot);


    }

    public char getLetter() {
        return letter;
    }

    public void risingDiagonalLeft() {
        dotLine1[0] = dot1;
        dotLine1[1] = dot2;
        dotLine1[2] = dot3;
        dotLine1[3] = dot4;
        dotLine1[4] = dot5;

        dotLines[0] = dotLine1;

        diffX = 0.25f;
        diffY = 0.62f;

        for (Drawable d : dotLine1) {
            left = (canvas.getWidth() * diffX) - dotSize;
            top = (canvas.getHeight() * diffY) - dotSize;
            right = (canvas.getWidth() * diffX) + dotSize;
            bottom = (canvas.getHeight() * diffY) + dotSize;
            d.setBounds((int) left, (int) top, (int) right, (int) bottom);
            diffX = diffX + 0.05f;
            diffY = diffY - 0.07f;
        }
    }

    public void fallingDiagonalRight() {
        dotLine2[0] = dot6;
        dotLine2[1] = dot7;
        dotLine2[2] = dot8;
        dotLine2[3] = dot9;
        dotLine2[4] = dot10;

        dotLines[1] = dotLine2;

        diffX = 0.53f;
        diffY = 0.34f;

        for (Drawable d : dotLine2) {
            left = (canvas.getWidth() * diffX) - dotSize;
            top = (canvas.getHeight() * diffY) - dotSize;
            right = (canvas.getWidth() * diffX) + dotSize;
            bottom = (canvas.getHeight() * diffY) + dotSize;
            d.setBounds((int) left, (int) top, (int) right, (int) bottom);
            diffX = diffX + 0.05f;
            diffY = diffY + 0.07f;
        }
    }

    public void horizontalLineCenterLow() {
        dotLine3[0] = dot11;
        dotLine3[1] = dot12;
        dotLine3[2] = dot13;
        dotLine3[3] = dot14;

        dotLines[2] = dotLine3;

        diffX = 0.36f;
        diffY = 0.55f;

        for (Drawable d : dotLine3) {
            left = (canvas.getWidth() * diffX) - dotSize;
            top = (canvas.getHeight() * diffY) - dotSize;
            right = (canvas.getWidth() * diffX) + dotSize;
            bottom = (canvas.getHeight() * diffY) + dotSize;
            d.setBounds((int) left, (int) top, (int) right, (int) bottom);
            diffX = diffX + 0.09f;
        }
    }

    public void straightLineLeft() {
        dotLine1[0] = dot1;
        dotLine1[1] = dot2;
        dotLine1[2] = dot3;
        dotLine1[3] = dot4;
        dotLine1[4] = dot5;

        dotLines[0] = dotLine1;

        diffX = 0.3f;
        diffY = 0.325f;

        for (Drawable d : dotLine1) {
            left = (canvas.getWidth() * diffX) - dotSize;
            top = (canvas.getHeight() * diffY) - dotSize;
            right = (canvas.getWidth() * diffX) + dotSize;
            bottom = (canvas.getHeight() * diffY) + dotSize;
            d.setBounds((int) left, (int) top, (int) right, (int) bottom);
            diffY = diffY + 0.076f;
        }
    }

    public void halfCircleHigh() {
        dotLine2[0] = dot6;
        dotLine2[1] = dot7;
        dotLine2[2] = dot8;
        dotLine2[3] = dot9;
        dotLine2[4] = dot10;
        dotLine2[5] = dot11;
        dotLine2[6] = dot12;
        dotLine2[7] = dot13;
        dotLine2[8] = dot14;
        dotLine2[9] = dot15;

        dotLines[1] = dotLine2;

        left = (canvas.getWidth() * 0.38f) - dotSize;
        top = (canvas.getHeight() * 0.325f) - dotSize;
        right = (canvas.getWidth() * 0.38f) + dotSize;
        bottom = (canvas.getHeight() * 0.325f) + dotSize;
        dot6.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.46f) - dotSize;
        top = (canvas.getHeight() * 0.325f) - dotSize;
        right = (canvas.getWidth() * 0.46f) + dotSize;
        bottom = (canvas.getHeight() * 0.325f) + dotSize;
        dot7.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.54f) - dotSize;
        top = (canvas.getHeight() * 0.325f) - dotSize;
        right = (canvas.getWidth() * 0.54f) + dotSize;
        bottom = (canvas.getHeight() * 0.325f) + dotSize;
        dot8.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.62f) - dotSize;
        top = (canvas.getHeight() * 0.335f) - dotSize;
        right = (canvas.getWidth() * 0.62f) + dotSize;
        bottom = (canvas.getHeight() * 0.335f) + dotSize;
        dot9.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.68f) - dotSize;
        top = (canvas.getHeight() * 0.38f) - dotSize;
        right = (canvas.getWidth() * 0.68f) + dotSize;
        bottom = (canvas.getHeight() * 0.38f) + dotSize;
        dot10.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.64f) - dotSize;
        top = (canvas.getHeight() * 0.428f) - dotSize;
        right = (canvas.getWidth() * 0.64f) + dotSize;
        bottom = (canvas.getHeight() * 0.428f) + dotSize;
        dot11.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.58f) - dotSize;
        top = (canvas.getHeight() * 0.47f) - dotSize;
        right = (canvas.getWidth() * 0.58f) + dotSize;
        bottom = (canvas.getHeight() * 0.47f) + dotSize;
        dot12.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.5f) - dotSize;
        top = (canvas.getHeight() * 0.475f) - dotSize;
        right = (canvas.getWidth() * 0.5f) + dotSize;
        bottom = (canvas.getHeight() * 0.475f) + dotSize;
        dot13.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.43f) - dotSize;
        top = (canvas.getHeight() * 0.475f) - dotSize;
        right = (canvas.getWidth() * 0.43f) + dotSize;
        bottom = (canvas.getHeight() * 0.475f) + dotSize;
        dot14.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.36f) - dotSize;
        top = (canvas.getHeight() * 0.475f) - dotSize;
        right = (canvas.getWidth() * 0.36f) + dotSize;
        bottom = (canvas.getHeight() * 0.475f) + dotSize;
        dot15.setBounds((int) left, (int) top, (int) right, (int) bottom);

    }

    public void halvCircleLow() {

        dotLine3[0] = dot16;
        dotLine3[1] = dot17;
        dotLine3[2] = dot18;
        dotLine3[3] = dot19;
        dotLine3[4] = dot20;
        dotLine3[5] = dot21;
        dotLine3[6] = dot22;
        dotLine3[7] = dot23;
        dotLine3[8] = dot24;
        dotLine3[9] = dot25;
        dotLine3[10] = dot26;

        dotLines[2] = dotLine3;

        left = (canvas.getWidth() * 0.36f) - dotSize;
        top = (canvas.getHeight() * 0.475f) - dotSize;
        right = (canvas.getWidth() * 0.36f) + dotSize;
        bottom = (canvas.getHeight() * 0.475f) + dotSize;
        dot16.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.43f) - dotSize;
        top = (canvas.getHeight() * 0.475f) - dotSize;
        right = (canvas.getWidth() * 0.43f) + dotSize;
        bottom = (canvas.getHeight() * 0.475f) + dotSize;
        dot17.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.5f) - dotSize;
        top = (canvas.getHeight() * 0.475f) - dotSize;
        right = (canvas.getWidth() * 0.5f) + dotSize;
        bottom = (canvas.getHeight() * 0.475f) + dotSize;
        dot18.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.58f) - dotSize;
        top = (canvas.getHeight() * 0.47f) - dotSize;
        right = (canvas.getWidth() * 0.58f) + dotSize;
        bottom = (canvas.getHeight() * 0.47f) + dotSize;
        dot19.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.64f) - dotSize;
        top = (canvas.getHeight() * 0.5f) - dotSize;
        right = (canvas.getWidth() * 0.64f) + dotSize;
        bottom = (canvas.getHeight() * 0.5f) + dotSize;
        dot20.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.685f) - dotSize;
        top = (canvas.getHeight() * 0.54f) - dotSize;
        right = (canvas.getWidth() * 0.685f) + dotSize;
        bottom = (canvas.getHeight() * 0.54f) + dotSize;
        dot21.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.69f) - dotSize;
        top = (canvas.getHeight() * 0.59f) - dotSize;
        right = (canvas.getWidth() * 0.69f) + dotSize;
        bottom = (canvas.getHeight() * 0.59f) + dotSize;
        dot22.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.64f) - dotSize;
        top = (canvas.getHeight() * 0.625f) - dotSize;
        right = (canvas.getWidth() * 0.64f) + dotSize;
        bottom = (canvas.getHeight() * 0.625f) + dotSize;
        dot23.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.55f) - dotSize;
        top = (canvas.getHeight() * 0.637f) - dotSize;
        right = (canvas.getWidth() * 0.55f) + dotSize;
        bottom = (canvas.getHeight() * 0.637f) + dotSize;
        dot24.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.46f) - dotSize;
        top = (canvas.getHeight() * 0.637f) - dotSize;
        right = (canvas.getWidth() * 0.46f) + dotSize;
        bottom = (canvas.getHeight() * 0.637f) + dotSize;
        dot25.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.38f) - dotSize;
        top = (canvas.getHeight() * 0.637f) - dotSize;
        right = (canvas.getWidth() * 0.38f) + dotSize;
        bottom = (canvas.getHeight() * 0.637f) + dotSize;
        dot26.setBounds((int) left, (int) top, (int) right, (int) bottom);
    }

    public void circle() {
        dotLine1[0] = dot1;
        dotLine1[1] = dot2;
        dotLine1[2] = dot3;
        dotLine1[3] = dot4;
        dotLine1[4] = dot5;
        dotLine1[5] = dot6;
        dotLine1[6] = dot7;
        dotLine1[7] = dot8;
        dotLine1[8] = dot9;
        dotLine1[9] = dot10;

    }

    public void halvCircleLeft() {
        dotLine1[0] = dot1;
        dotLine1[1] = dot2;
        dotLine1[2] = dot3;
        dotLine1[3] = dot4;
        dotLine1[4] = dot5;
        dotLine1[5] = dot6;
        dotLine1[6] = dot7;
        dotLine1[7] = dot8;
        dotLine1[8] = dot9;
        dotLine1[9] = dot10;
        dotLine1[10] = dot11;
        dotLine1[11] = dot12;
        dotLine1[12] = dot13;
        dotLine1[13] = dot14;
        dotLine1[14] = dot15;
        dotLine1[15] = dot16;

        dotLines[0] = dotLine1;

        left = (canvas.getWidth() * 0.74f) - dotSize;
        top = (canvas.getHeight() * 0.4f) - dotSize;
        right = (canvas.getWidth() * 0.74f) + dotSize;
        bottom = (canvas.getHeight() * 0.4f) + dotSize;
        dot1.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.675f) - dotSize;
        top = (canvas.getHeight() * 0.36f) - dotSize;
        right = (canvas.getWidth() * 0.675f) + dotSize;
        bottom = (canvas.getHeight() * 0.36f) + dotSize;
        dot2.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.6f) - dotSize;
        top = (canvas.getHeight() * 0.33f) - dotSize;
        right = (canvas.getWidth() * 0.6f) + dotSize;
        bottom = (canvas.getHeight() * 0.33f) + dotSize;
        dot3.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.52f) - dotSize;
        top = (canvas.getHeight() * 0.32f) - dotSize;
        right = (canvas.getWidth() * 0.52f) + dotSize;
        bottom = (canvas.getHeight() * 0.32f) + dotSize;
        dot4.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.44f) - dotSize;
        top = (canvas.getHeight() * 0.33f) - dotSize;
        right = (canvas.getWidth() * 0.44f) + dotSize;
        bottom = (canvas.getHeight() * 0.33f) + dotSize;
        dot5.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.36f) - dotSize;
        top = (canvas.getHeight() * 0.36f) - dotSize;
        right = (canvas.getWidth() * 0.36f) + dotSize;
        bottom = (canvas.getHeight() * 0.36f) + dotSize;
        dot6.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.29f) - dotSize;
        top = (canvas.getHeight() * 0.41f) - dotSize;
        right = (canvas.getWidth() * 0.29f) + dotSize;
        bottom = (canvas.getHeight() * 0.41f) + dotSize;
        dot7.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.27f) - dotSize;
        top = (canvas.getHeight() * 0.485f) - dotSize;
        right = (canvas.getWidth() * 0.27f) + dotSize;
        bottom = (canvas.getHeight() * 0.485f) + dotSize;
        dot8.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.295f) - dotSize;
        top = (canvas.getHeight() * 0.555f) - dotSize;
        right = (canvas.getWidth() * 0.295f) + dotSize;
        bottom = (canvas.getHeight() * 0.555f) + dotSize;
        dot9.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.34f) - dotSize;
        top = (canvas.getHeight() * 0.605f) - dotSize;
        right = (canvas.getWidth() * 0.34f) + dotSize;
        bottom = (canvas.getHeight() * 0.605f) + dotSize;
        dot10.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.415f) - dotSize;
        top = (canvas.getHeight() * 0.635f) - dotSize;
        right = (canvas.getWidth() * 0.415f) + dotSize;
        bottom = (canvas.getHeight() * 0.635f) + dotSize;
        dot11.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.49f) - dotSize;
        top = (canvas.getHeight() * 0.6455f) - dotSize;
        right = (canvas.getWidth() * 0.49f) + dotSize;
        bottom = (canvas.getHeight() * 0.6455f) + dotSize;
        dot12.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.565f) - dotSize;
        top = (canvas.getHeight() * 0.6415f) - dotSize;
        right = (canvas.getWidth() * 0.565f) + dotSize;
        bottom = (canvas.getHeight() * 0.6415f) + dotSize;
        dot13.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.635f) - dotSize;
        top = (canvas.getHeight() * 0.625f) - dotSize;
        right = (canvas.getWidth() * 0.635f) + dotSize;
        bottom = (canvas.getHeight() * 0.625f) + dotSize;
        dot14.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.7f) - dotSize;
        top = (canvas.getHeight() * 0.6f) - dotSize;
        right = (canvas.getWidth() * 0.7f) + dotSize;
        bottom = (canvas.getHeight() * 0.6f) + dotSize;
        dot15.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.74f) - dotSize;
        top = (canvas.getHeight() * 0.55f) - dotSize;
        right = (canvas.getWidth() * 0.74f) + dotSize;
        bottom = (canvas.getHeight() * 0.55f) + dotSize;
        dot16.setBounds((int) left, (int) top, (int) right, (int) bottom);
    }

    public void halvCircleRight() {
        dotLine2[0] = dot6;
        dotLine2[1] = dot7;
        dotLine2[2] = dot8;
        dotLine2[3] = dot9;
        dotLine2[4] = dot10;
        dotLine2[5] = dot11;
        dotLine2[6] = dot12;
        dotLine2[7] = dot13;
        dotLine2[8] = dot14;
        dotLine2[9] = dot15;
        dotLine2[10] = dot16;
        dotLine2[11] = dot17;
        dotLine2[12] = dot18;
        dotLine2[13] = dot19;
        dotLine2[14] = dot20;

        dotLines[1] = dotLine2;

        left = (canvas.getWidth() * 0.32f) - dotSize;
        top = (canvas.getHeight() * 0.325f) - dotSize;
        right = (canvas.getWidth() * 0.32f) + dotSize;
        bottom = (canvas.getHeight() * 0.325f) + dotSize;
        dot6.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.4f) - dotSize;
        top = (canvas.getHeight() * 0.325f) - dotSize;
        right = (canvas.getWidth() * 0.4f) + dotSize;
        bottom = (canvas.getHeight() * 0.325f) + dotSize;
        dot7.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.48f) - dotSize;
        top = (canvas.getHeight() * 0.325f) - dotSize;
        right = (canvas.getWidth() * 0.48f) + dotSize;
        bottom = (canvas.getHeight() * 0.325f) + dotSize;
        dot8.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.56f) - dotSize;
        top = (canvas.getHeight() * 0.33f) - dotSize;
        right = (canvas.getWidth() * 0.56f) + dotSize;
        bottom = (canvas.getHeight() * 0.33f) + dotSize;
        dot9.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.63f) - dotSize;
        top = (canvas.getHeight() * 0.345f) - dotSize;
        right = (canvas.getWidth() * 0.63f) + dotSize;
        bottom = (canvas.getHeight() * 0.345f) + dotSize;
        dot10.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.69f) - dotSize;
        top = (canvas.getHeight() * 0.38f) - dotSize;
        right = (canvas.getWidth() * 0.69f) + dotSize;
        bottom = (canvas.getHeight() * 0.38f) + dotSize;
        dot11.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.71f) - dotSize;
        top = (canvas.getHeight() * 0.44f) - dotSize;
        right = (canvas.getWidth() * 0.71f) + dotSize;
        bottom = (canvas.getHeight() * 0.44f) + dotSize;
        dot12.setBounds((int) left, (int) top, (int) right, (int) bottom);

    }

    public Drawable getBackground() {
        return background;
    }
}

