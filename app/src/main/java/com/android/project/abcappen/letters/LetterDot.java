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
    
    private Canvas canvas;
    private Drawable background;
    private char letter;
    private int dotSize = 20;
    private float left, top, right, bottom, diffX, diffY;

    private Drawable dot1, dot2, dot3, dot4, dot5, dot6, dot7, dot8, dot9, dot10, dot11, dot12, dot13, dot14,
            dot15, dot16, dot17, dot18, dot19, dot20, dot21, dot22, dot23, dot24, dot25, dot26, dot27, dot28, dot29;

    private Drawable[] dotLine1;
    private Drawable[] dotLine2;
    private Drawable[] dotLine3;
    private Drawable[] dotLine4;

    public Drawable[][] dotLines;


    public LetterDot(char letter, Canvas canvas, Context context) {
        initDots(context);
        this.letter = letter;
        this.canvas = canvas;

        switch (letter) {
            // DONE
            case 'A':
                Log.i(LETTER_DOT_TAG, "Letter A printed");
                this.background = context.getResources().getDrawable(R.drawable.letter_a);
                dotLines = new Drawable[3][];
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
                dotLines = new Drawable[3][];
                dotLine1 = new Drawable[5];
                dotLine2 = new Drawable[12];
                dotLine3 = new Drawable[12];
                straightLineLeft();
                halfCircleHigh();
                halfCircleLow();
                break;
            case 'C':
                Log.i(LETTER_DOT_TAG, "Letter C printed");
                this.background = context.getResources().getDrawable(R.drawable.letter_c);
                dotLines = new Drawable[1][];
                dotLine1 = new Drawable[16];
                halfCircleLeft();
                break;
            case 'D':
                Log.i(LETTER_DOT_TAG, "Letter D printed");
                this.background = context.getResources().getDrawable(R.drawable.letter_d);
                dotLines = new Drawable[2][];
                dotLine1 = new Drawable[5];
                dotLine2 = new Drawable[14];
                straightLineLeft();
                halfCircleRight();
                break;
            case 'E':
                Log.i(LETTER_DOT_TAG, "Letter E printed");
                this.background = context.getResources().getDrawable(R.drawable.letter_e);
                dotLines = new Drawable[4][];
                dotLine1 = new Drawable[5];
                dotLine2 = new Drawable[5];
                dotLine3 = new Drawable[5];
                dotLine4 = new Drawable[5];

                straightLineLeft();
                horizontalLineHigh();
                horizontalLineMiddle();
                dotLine4 = horizontalLineLow(dotLine4);
                dotLines[3] = dotLine4;


                break;
            case 'F':
                Log.i(LETTER_DOT_TAG, "Letter F printed");
                this.background = context.getResources().getDrawable(R.drawable.letter_f);
                dotLines = new Drawable[3][];
                dotLine1 = new Drawable[5];
                dotLine2 = new Drawable[5];
                dotLine3 = new Drawable[5];
                straightLineLeft();
                horizontalLineHigh();
                horizontalLineMiddle();
                break;
            case 'G':
                Log.i(LETTER_DOT_TAG, "Letter G printed");
                this.background = context.getResources().getDrawable(R.drawable.letter_g);
                dotLines = new Drawable[2][];
                dotLine1 = new Drawable[16];
                dotLine2 = new Drawable[5];
                halfCircleLeft();
                gDotFix();
                break;
            case 'H':
                break;
            case 'I':
                Log.i(LETTER_DOT_TAG, "Letter I printed");
                this.background = context.getResources().getDrawable(R.drawable.letter_i);
                dotLines = new Drawable[1][];
                dotLine1 = new Drawable[5];
                straightLineCenter();
                break;
            case 'J':
                Log.i(LETTER_DOT_TAG, "Letter J printed");
                this.background = context.getResources().getDrawable(R.drawable.letter_j);
                dotLines = new Drawable[1][];
                dotLine1 = new Drawable[10];
                jDots();
                break;
            case 'K':
                Log.i(LETTER_DOT_TAG, "Letter K printed");
                this.background = context.getResources().getDrawable(R.drawable.letter_k);
                dotLines = new Drawable[3][];
                dotLine1 = new Drawable[5];
                dotLine2 = new Drawable[7];
                dotLine3 = new Drawable[5];
                straightLineLeft();
                diagonalRisingLineFromMiddle();
                diagonalFallingLineFromMiddle();
                break;
            case 'L':
                Log.i(LETTER_DOT_TAG, "Letter L printed");
                this.background = context.getResources().getDrawable(R.drawable.letter_l);
                dotLines = new Drawable[2][];
                dotLine1 = new Drawable[5];
                dotLine4 = new Drawable[5];
                straightLineLeft();
                dotLine4 = horizontalLineLow(dotLine4);
                dotLines[1] = dotLine4;

                break;
            case 'M':
                Log.i(LETTER_DOT_TAG, "Letter M printed");
                this.background = context.getResources().getDrawable(R.drawable.letter_m);
                break;
            case 'N':
                Log.i(LETTER_DOT_TAG, "Letter N printed");
                this.background = context.getResources().getDrawable(R.drawable.letter_n);
                dotLines = new Drawable[3][];
                dotLine1 = new Drawable[5];
                dotLine2 = new Drawable[7];
                dotLine3 = new Drawable[5];
                straightLineLeft();
                diagonalFallingLineFromLeft();
                straightLineRight();
                break;
            case 'O':
                Log.i(LETTER_DOT_TAG, "Letter O printed");
                this.background = context.getResources().getDrawable(R.drawable.letter_o);
                dotLines = new Drawable[1][];
                dotLine1 = new Drawable[17];
                circle();
                break;
            case 'P':
                Log.i(LETTER_DOT_TAG, "Letter P printed");
                this.background = context.getResources().getDrawable(R.drawable.letter_p);
                dotLines = new Drawable[2][];
                dotLine1 = new Drawable[5];
                dotLine2 = new Drawable[10];
                straightLineLeft();
                halfCircleHigh();
                break;
            case 'Q':
                break;
            case 'R':
                Log.i(LETTER_DOT_TAG, "Letter R printed");
                this.background = context.getResources().getDrawable(R.drawable.letter_r);
                dotLines = new Drawable[3][];
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
        dot29 = context.getResources().getDrawable(R.drawable.dot);


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
        dotLine2[10] = dot16;
        dotLine2[11] = dot17;

        dotLines[1] = dotLine2;

        left = (canvas.getWidth() * 0.32f) - dotSize;
        top = (canvas.getHeight() * 0.325f) - dotSize;
        right = (canvas.getWidth() * 0.32f) + dotSize;
        bottom = (canvas.getHeight() * 0.325f) + dotSize;
        dot6.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.38f) - dotSize;
        top = (canvas.getHeight() * 0.325f) - dotSize;
        right = (canvas.getWidth() * 0.38f) + dotSize;
        bottom = (canvas.getHeight() * 0.325f) + dotSize;
        dot7.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.46f) - dotSize;
        top = (canvas.getHeight() * 0.325f) - dotSize;
        right = (canvas.getWidth() * 0.46f) + dotSize;
        bottom = (canvas.getHeight() * 0.325f) + dotSize;
        dot8.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.54f) - dotSize;
        top = (canvas.getHeight() * 0.325f) - dotSize;
        right = (canvas.getWidth() * 0.54f) + dotSize;
        bottom = (canvas.getHeight() * 0.325f) + dotSize;
        dot9.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.62f) - dotSize;
        top = (canvas.getHeight() * 0.335f) - dotSize;
        right = (canvas.getWidth() * 0.62f) + dotSize;
        bottom = (canvas.getHeight() * 0.335f) + dotSize;
        dot10.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.68f) - dotSize;
        top = (canvas.getHeight() * 0.38f) - dotSize;
        right = (canvas.getWidth() * 0.68f) + dotSize;
        bottom = (canvas.getHeight() * 0.38f) + dotSize;
        dot11.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.64f) - dotSize;
        top = (canvas.getHeight() * 0.428f) - dotSize;
        right = (canvas.getWidth() * 0.64f) + dotSize;
        bottom = (canvas.getHeight() * 0.428f) + dotSize;
        dot12.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.58f) - dotSize;
        top = (canvas.getHeight() * 0.47f) - dotSize;
        right = (canvas.getWidth() * 0.58f) + dotSize;
        bottom = (canvas.getHeight() * 0.47f) + dotSize;
        dot13.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.51f) - dotSize;
        top = (canvas.getHeight() * 0.475f) - dotSize;
        right = (canvas.getWidth() * 0.51f) + dotSize;
        bottom = (canvas.getHeight() * 0.475f) + dotSize;
        dot14.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.44f) - dotSize;
        top = (canvas.getHeight() * 0.475f) - dotSize;
        right = (canvas.getWidth() * 0.44f) + dotSize;
        bottom = (canvas.getHeight() * 0.475f) + dotSize;
        dot15.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.38f) - dotSize;
        top = (canvas.getHeight() * 0.475f) - dotSize;
        right = (canvas.getWidth() * 0.38f) + dotSize;
        bottom = (canvas.getHeight() * 0.475f) + dotSize;
        dot16.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.32f) - dotSize;
        top = (canvas.getHeight() * 0.475f) - dotSize;
        right = (canvas.getWidth() * 0.32f) + dotSize;
        bottom = (canvas.getHeight() * 0.475f) + dotSize;
        dot17.setBounds((int) left, (int) top, (int) right, (int) bottom);

    }

    public void halfCircleLow() {

        dotLine3[0] = dot18;
        dotLine3[1] = dot19;
        dotLine3[2] = dot20;
        dotLine3[3] = dot21;
        dotLine3[4] = dot22;
        dotLine3[5] = dot23;
        dotLine3[6] = dot24;
        dotLine3[7] = dot25;
        dotLine3[8] = dot26;
        dotLine3[9] = dot27;
        dotLine3[10] = dot28;
        dotLine3[11] = dot29;

        dotLines[2] = dotLine3;

        left = (canvas.getWidth() * 0.36f) - dotSize;
        top = (canvas.getHeight() * 0.475f) - dotSize;
        right = (canvas.getWidth() * 0.36f) + dotSize;
        bottom = (canvas.getHeight() * 0.475f) + dotSize;
        dot18.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.43f) - dotSize;
        top = (canvas.getHeight() * 0.475f) - dotSize;
        right = (canvas.getWidth() * 0.43f) + dotSize;
        bottom = (canvas.getHeight() * 0.475f) + dotSize;
        dot19.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.5f) - dotSize;
        top = (canvas.getHeight() * 0.475f) - dotSize;
        right = (canvas.getWidth() * 0.5f) + dotSize;
        bottom = (canvas.getHeight() * 0.475f) + dotSize;
        dot20.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.58f) - dotSize;
        top = (canvas.getHeight() * 0.47f) - dotSize;
        right = (canvas.getWidth() * 0.58f) + dotSize;
        bottom = (canvas.getHeight() * 0.47f) + dotSize;
        dot21.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.64f) - dotSize;
        top = (canvas.getHeight() * 0.5f) - dotSize;
        right = (canvas.getWidth() * 0.64f) + dotSize;
        bottom = (canvas.getHeight() * 0.5f) + dotSize;
        dot22.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.685f) - dotSize;
        top = (canvas.getHeight() * 0.54f) - dotSize;
        right = (canvas.getWidth() * 0.685f) + dotSize;
        bottom = (canvas.getHeight() * 0.54f) + dotSize;
        dot23.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.695f) - dotSize;
        top = (canvas.getHeight() * 0.59f) - dotSize;
        right = (canvas.getWidth() * 0.695f) + dotSize;
        bottom = (canvas.getHeight() * 0.59f) + dotSize;
        dot24.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.645f) - dotSize;
        top = (canvas.getHeight() * 0.625f) - dotSize;
        right = (canvas.getWidth() * 0.645f) + dotSize;
        bottom = (canvas.getHeight() * 0.625f) + dotSize;
        dot25.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.575f) - dotSize;
        top = (canvas.getHeight() * 0.637f) - dotSize;
        right = (canvas.getWidth() * 0.575f) + dotSize;
        bottom = (canvas.getHeight() * 0.637f) + dotSize;
        dot26.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.5f) - dotSize;
        top = (canvas.getHeight() * 0.637f) - dotSize;
        right = (canvas.getWidth() * 0.5f) + dotSize;
        bottom = (canvas.getHeight() * 0.637f) + dotSize;
        dot27.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.415f) - dotSize;
        top = (canvas.getHeight() * 0.637f) - dotSize;
        right = (canvas.getWidth() * 0.415f) + dotSize;
        bottom = (canvas.getHeight() * 0.637f) + dotSize;
        dot28.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.33f) - dotSize;
        top = (canvas.getHeight() * 0.637f) - dotSize;
        right = (canvas.getWidth() * 0.33f) + dotSize;
        bottom = (canvas.getHeight() * 0.637f) + dotSize;
        dot29.setBounds((int) left, (int) top, (int) right, (int) bottom);
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
        dotLine1[10] = dot11;
        dotLine1[11] = dot12;
        dotLine1[12] = dot13;
        dotLine1[13] = dot14;
        dotLine1[14] = dot15;
        dotLine1[15] = dot16;
        dotLine1[16] = dot17;

        dotLines[0] = dotLine1;

        left = (canvas.getWidth() * 0.505f) - dotSize;
        top = (canvas.getHeight() * 0.32f) - dotSize;
        right = (canvas.getWidth() * 0.505f) + dotSize;
        bottom = (canvas.getHeight() * 0.32f) + dotSize;
        dot1.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.435f) - dotSize;
        top = (canvas.getHeight() * 0.329f) - dotSize;
        right = (canvas.getWidth() * 0.435f) + dotSize;
        bottom = (canvas.getHeight() * 0.329f) + dotSize;
        dot2.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.35f) - dotSize;
        top = (canvas.getHeight() * 0.36f) - dotSize;
        right = (canvas.getWidth() * 0.35f) + dotSize;
        bottom = (canvas.getHeight() * 0.36f) + dotSize;
        dot3.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.29f) - dotSize;
        top = (canvas.getHeight() * 0.41f) - dotSize;
        right = (canvas.getWidth() * 0.29f) + dotSize;
        bottom = (canvas.getHeight() * 0.41f) + dotSize;
        dot4.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.27f) - dotSize;
        top = (canvas.getHeight() * 0.48f) - dotSize;
        right = (canvas.getWidth() * 0.27f) + dotSize;
        bottom = (canvas.getHeight() * 0.48f) + dotSize;
        dot5.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.29f) - dotSize;
        top = (canvas.getHeight() * 0.55f) - dotSize;
        right = (canvas.getWidth() * 0.29f) + dotSize;
        bottom = (canvas.getHeight() * 0.55f) + dotSize;
        dot6.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.35f) - dotSize;
        top = (canvas.getHeight() * 0.61f) - dotSize;
        right = (canvas.getWidth() * 0.35f) + dotSize;
        bottom = (canvas.getHeight() * 0.61f) + dotSize;
        dot7.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.435f) - dotSize;
        top = (canvas.getHeight() * 0.641f) - dotSize;
        right = (canvas.getWidth() * 0.435f) + dotSize;
        bottom = (canvas.getHeight() * 0.641f) + dotSize;
        dot8.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.52f) - dotSize;
        top = (canvas.getHeight() * 0.645f) - dotSize;
        right = (canvas.getWidth() * 0.52f) + dotSize;
        bottom = (canvas.getHeight() * 0.645f) + dotSize;
        dot9.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.615f) - dotSize;
        top = (canvas.getHeight() * 0.641f) - dotSize;
        right = (canvas.getWidth() * 0.615f) + dotSize;
        bottom = (canvas.getHeight() * 0.641f) + dotSize;
        dot10.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.7f) - dotSize;
        top = (canvas.getHeight() * 0.61f) - dotSize;
        right = (canvas.getWidth() * 0.7f) + dotSize;
        bottom = (canvas.getHeight() * 0.61f) + dotSize;
        dot11.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.76f) - dotSize;
        top = (canvas.getHeight() * 0.55f) - dotSize;
        right = (canvas.getWidth() * 0.76f) + dotSize;
        bottom = (canvas.getHeight() * 0.55f) + dotSize;
        dot12.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.78f) - dotSize;
        top = (canvas.getHeight() * 0.48f) - dotSize;
        right = (canvas.getWidth() * 0.78f) + dotSize;
        bottom = (canvas.getHeight() * 0.48f) + dotSize;
        dot13.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.76f) - dotSize;
        top = (canvas.getHeight() * 0.41f) - dotSize;
        right = (canvas.getWidth() * 0.76f) + dotSize;
        bottom = (canvas.getHeight() * 0.41f) + dotSize;
        dot14.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.7f) - dotSize;
        top = (canvas.getHeight() * 0.36f) - dotSize;
        right = (canvas.getWidth() * 0.7f) + dotSize;
        bottom = (canvas.getHeight() * 0.36f) + dotSize;
        dot15.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.615f) - dotSize;
        top = (canvas.getHeight() * 0.329f) - dotSize;
        right = (canvas.getWidth() * 0.615f) + dotSize;
        bottom = (canvas.getHeight() * 0.329f) + dotSize;
        dot16.setBounds((int) left, (int) top, (int) right, (int) bottom);

        left = (canvas.getWidth() * 0.535f) - dotSize;
        top = (canvas.getHeight() * 0.32f) - dotSize;
        right = (canvas.getWidth() * 0.535f) + dotSize;
        bottom = (canvas.getHeight() * 0.32f) + dotSize;
        dot17.setBounds((int) left, (int) top, (int) right, (int) bottom);

    }

    public void halfCircleLeft() {
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

    public void halfCircleRight() {
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

        left = (canvas.getWidth() * 0.725f) - dotSize;
        top = (canvas.getHeight() * 0.445f) - dotSize;
        right = (canvas.getWidth() * 0.725f) + dotSize;
        bottom = (canvas.getHeight() * 0.445f) + dotSize;
        dot12.setBounds((int)left, (int) top, (int)right, (int)bottom);

        left = (canvas.getWidth() * 0.725f) - dotSize;
        top = (canvas.getHeight() * 0.52f) - dotSize;
        right = (canvas.getWidth() * 0.725f) + dotSize;
        bottom = (canvas.getHeight() * 0.52f) + dotSize;
        dot13.setBounds((int)left, (int) top, (int)right, (int)bottom);

        left = (canvas.getWidth() * 0.68f) - dotSize;
        top = (canvas.getHeight() * 0.575f) - dotSize;
        right = (canvas.getWidth() * 0.68f) + dotSize;
        bottom = (canvas.getHeight() * 0.575f) + dotSize;
        dot14.setBounds((int)left, (int) top, (int)right, (int)bottom);

        left = (canvas.getWidth() * 0.62f) - dotSize;
        top = (canvas.getHeight() * 0.615f) - dotSize;
        right = (canvas.getWidth() * 0.62f) + dotSize;
        bottom = (canvas.getHeight() * 0.615f) + dotSize;
        dot15.setBounds((int)left, (int) top, (int)right, (int)bottom);

        left = (canvas.getWidth() * 0.55f) - dotSize;
        top = (canvas.getHeight() * 0.635f) - dotSize;
        right = (canvas.getWidth() * 0.55f) + dotSize;
        bottom = (canvas.getHeight() * 0.635f) + dotSize;
        dot16.setBounds((int)left, (int) top, (int)right, (int)bottom);

        left = (canvas.getWidth() * 0.48f) - dotSize;
        top = (canvas.getHeight() * 0.64f) - dotSize;
        right = (canvas.getWidth() * 0.48f) + dotSize;
        bottom = (canvas.getHeight() * 0.64f) + dotSize;
        dot17.setBounds((int)left, (int) top, (int)right, (int)bottom);

        left = (canvas.getWidth() * 0.4f) - dotSize;
        top = (canvas.getHeight() * 0.64f) - dotSize;
        right = (canvas.getWidth() * 0.4f) + dotSize;
        bottom = (canvas.getHeight() * 0.64f) + dotSize;
        dot18.setBounds((int)left, (int) top, (int)right, (int)bottom);

        left = (canvas.getWidth() * 0.32f) - dotSize;
        top = (canvas.getHeight() * 0.64f) - dotSize;
        right = (canvas.getWidth() * 0.32f) + dotSize;
        bottom = (canvas.getHeight() * 0.64f) + dotSize;
        dot19.setBounds((int)left, (int) top, (int)right, (int)bottom);

    }
    public void horizontalLineHigh() {
        dotLine2[0] = dot6;
        dotLine2[1] = dot7;
        dotLine2[2] = dot8;
        dotLine2[3] = dot9;
        dotLine2[4] = dot10;

        dotLines[1] = dotLine2;

        diffX = 0.34f;
        diffY = 0.325f;

        for (Drawable d : dotLine2) {
            left = (canvas.getWidth() * diffX) - dotSize;
            top = (canvas.getHeight() * diffY) - dotSize;
            right = (canvas.getWidth() * diffX) + dotSize;
            bottom = (canvas.getHeight() * diffY) + dotSize;
            d.setBounds((int) left, (int) top, (int) right, (int) bottom);
            diffX = diffX + 0.083f;
        }
    }

    public void horizontalLineMiddle(){
        dotLine3[0] = dot11;
        dotLine3[1] = dot12;
        dotLine3[2] = dot13;
        dotLine3[3] = dot14;
        dotLine3[4] = dot15;

        dotLines[2] = dotLine3;

        diffX = 0.34f;
        diffY = 0.475f;

        for (Drawable d : dotLine3) {
            left = (canvas.getWidth() * diffX) - dotSize;
            top = (canvas.getHeight() * diffY) - dotSize;
            right = (canvas.getWidth() * diffX) + dotSize;
            bottom = (canvas.getHeight() * diffY) + dotSize;
            d.setBounds((int) left, (int) top, (int) right, (int) bottom);
            diffX = diffX + 0.072f;
        }
    }

    // reusable
    public Drawable[] horizontalLineLow(Drawable[] dotLine){
            dotLine[0] = dot16;
            dotLine[1] = dot17;
            dotLine[2] = dot18;
            dotLine[3] = dot19;
            dotLine[4] = dot20;

            diffX = 0.34f;
            diffY = 0.64f;

            for (Drawable d : dotLine) {
                left = (canvas.getWidth() * diffX) - dotSize;
                top = (canvas.getHeight() * diffY) - dotSize;
                right = (canvas.getWidth() * diffX) + dotSize;
                bottom = (canvas.getHeight() * diffY) + dotSize;
                d.setBounds((int) left, (int) top, (int) right, (int) bottom);
                diffX = diffX + 0.085f;
            }
            return dotLine;
    }

    public void gDotFix(){
        dotLine1[0] = dot1;
        dotLine1[1] = dot2;
        dotLine1[2] = dot3;
        dotLine1[13] = dot14;
        dotLine1[14] = dot15;
        dotLine1[15] = dot16;

        dotLine2[0] = dot17;
        dotLine2[1] = dot18;
        dotLine2[2] = dot19;
        dotLine2[3] = dot20;
        dotLine2[4] = dot21;

        dotLines[0] = dotLine1;
        dotLines[1] = dotLine2;

        left = (canvas.getWidth() * 0.75f) - dotSize;
        top = (canvas.getHeight() * 0.39f) - dotSize;
        right = (canvas.getWidth() * 0.75f) + dotSize;
        bottom = (canvas.getHeight() * 0.39f) + dotSize;
        dot1.setBounds((int)left, (int) top, (int)right, (int)bottom);

        left = (canvas.getWidth() * 0.69f) - dotSize;
        top = (canvas.getHeight() * 0.35f) - dotSize;
        right = (canvas.getWidth() * 0.69f) + dotSize;
        bottom = (canvas.getHeight() * 0.35f) + dotSize;
        dot2.setBounds((int)left, (int) top, (int)right, (int)bottom);

        left = (canvas.getWidth() * 0.61f) - dotSize;
        top = (canvas.getHeight() * 0.325f) - dotSize;
        right = (canvas.getWidth() * 0.61f) + dotSize;
        bottom = (canvas.getHeight() * 0.325f) + dotSize;
        dot3.setBounds((int)left, (int) top, (int)right, (int)bottom);

        left = (canvas.getWidth() * 0.635f) - dotSize;
        top = (canvas.getHeight() * 0.638f) - dotSize;
        right = (canvas.getWidth() * 0.635f) + dotSize;
        bottom = (canvas.getHeight() * 0.638f) + dotSize;
        dot14.setBounds((int)left, (int) top, (int)right, (int)bottom);

        left = (canvas.getWidth() * 0.7f) - dotSize;
        top = (canvas.getHeight() * 0.622f) - dotSize;
        right = (canvas.getWidth() * 0.7f) + dotSize;
        bottom = (canvas.getHeight() * 0.622f) + dotSize;
        dot15.setBounds((int)left, (int) top, (int)right, (int)bottom);

        left = (canvas.getWidth() * 0.765f) - dotSize;
        top = (canvas.getHeight() * 0.6f) - dotSize;
        right = (canvas.getWidth() * 0.765f) + dotSize;
        bottom = (canvas.getHeight() * 0.6f) + dotSize;
        dot16.setBounds((int)left, (int) top, (int)right, (int)bottom);

        // OBS. second line
        left = (canvas.getWidth() * 0.58f) - dotSize;
        top = (canvas.getHeight() * 0.5f) - dotSize;
        right = (canvas.getWidth() * 0.58f) + dotSize;
        bottom = (canvas.getHeight() * 0.5f) + dotSize;
        dot17.setBounds((int)left, (int) top, (int)right, (int)bottom);

        left = (canvas.getWidth() * 0.645f) - dotSize;
        top = (canvas.getHeight() * 0.5f) - dotSize;
        right = (canvas.getWidth() * 0.645f) + dotSize;
        bottom = (canvas.getHeight() * 0.5f) + dotSize;
        dot18.setBounds((int)left, (int) top, (int)right, (int)bottom);

        left = (canvas.getWidth() * 0.71f) - dotSize;
        top = (canvas.getHeight() * 0.5f) - dotSize;
        right = (canvas.getWidth() * 0.71f) + dotSize;
        bottom = (canvas.getHeight() * 0.5f) + dotSize;
        dot19.setBounds((int)left, (int) top, (int)right, (int)bottom);

        left = (canvas.getWidth() * 0.77f) - dotSize;
        top = (canvas.getHeight() * 0.5f) - dotSize;
        right = (canvas.getWidth() * 0.77f) + dotSize;
        bottom = (canvas.getHeight() * 0.5f) + dotSize;
        dot20.setBounds((int)left, (int) top, (int)right, (int)bottom);

        left = (canvas.getWidth() * 0.77f) - dotSize;
        top = (canvas.getHeight() * 0.565f) - dotSize;
        right = (canvas.getWidth() * 0.77f) + dotSize;
        bottom = (canvas.getHeight() * 0.565f) + dotSize;
        dot21.setBounds((int)left, (int) top, (int)right, (int)bottom);
    }

    public void straightLineCenter(){
        dotLine1[0] = dot1;
        dotLine1[1] = dot2;
        dotLine1[2] = dot3;
        dotLine1[3] = dot4;
        dotLine1[4] = dot5;

        dotLines[0] = dotLine1;

        diffX = 0.495f;
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

    public void jDots(){
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

        dotLines[0] = dotLine1;

        diffX = 0.545f;
        diffY = 0.325f;

        for (int i = 0; i < 4; i++){
            left = (canvas.getWidth() * diffX) - dotSize;
            top = (canvas.getHeight() * diffY) - dotSize;
            right = (canvas.getWidth() * diffX) + dotSize;
            bottom = (canvas.getHeight() * diffY) + dotSize;
            dotLine1[i].setBounds((int) left, (int) top, (int) right, (int) bottom);
            diffY = diffY + 0.078f;
        }

        left = (canvas.getWidth() * 0.5f) - dotSize;
        top = (canvas.getHeight() * 0.61f) - dotSize;
        right = (canvas.getWidth() * 0.5f) + dotSize;
        bottom = (canvas.getHeight() * 0.61f) + dotSize;
        dot5.setBounds((int)left, (int) top, (int)right, (int)bottom);

        left = (canvas.getWidth() * 0.44f) - dotSize;
        top = (canvas.getHeight() * 0.64f) - dotSize;
        right = (canvas.getWidth() * 0.44f) + dotSize;
        bottom = (canvas.getHeight() * 0.64f) + dotSize;
        dot6.setBounds((int)left, (int) top, (int)right, (int)bottom);

        left = (canvas.getWidth() * 0.38f) - dotSize;
        top = (canvas.getHeight() * 0.645f) - dotSize;
        right = (canvas.getWidth() * 0.38f) + dotSize;
        bottom = (canvas.getHeight() * 0.645f) + dotSize;
        dot7.setBounds((int)left, (int) top, (int)right, (int)bottom);

        left = (canvas.getWidth() * 0.315f) - dotSize;
        top = (canvas.getHeight() * 0.635f) - dotSize;
        right = (canvas.getWidth() * 0.315f) + dotSize;
        bottom = (canvas.getHeight() * 0.635f) + dotSize;
        dot8.setBounds((int)left, (int) top, (int)right, (int)bottom);

        left = (canvas.getWidth() * 0.27f) - dotSize;
        top = (canvas.getHeight() * 0.61f) - dotSize;
        right = (canvas.getWidth() * 0.27f) + dotSize;
        bottom = (canvas.getHeight() * 0.61f) + dotSize;
        dot9.setBounds((int)left, (int) top, (int)right, (int)bottom);

        left = (canvas.getWidth() * 0.235f) - dotSize;
        top = (canvas.getHeight() * 0.56f) - dotSize;
        right = (canvas.getWidth() * 0.235f) + dotSize;
        bottom = (canvas.getHeight() * 0.56f) + dotSize;
        dot10.setBounds((int)left, (int) top, (int)right, (int)bottom);
    }

    public void diagonalRisingLineFromMiddle(){
        dotLine2[0] = dot6;
        dotLine2[1] = dot7;
        dotLine2[2] = dot8;
        dotLine2[3] = dot9;
        dotLine2[4] = dot10;
        dotLine2[5] = dot11;
        dotLine2[6] = dot12;

        dotLines[1] = dotLine2;

        diffX = 0.3f;
        diffY = 0.53f;

        for (Drawable d : dotLine2) {
            left = (canvas.getWidth() * diffX) - dotSize;
            top = (canvas.getHeight() * diffY) - dotSize;
            right = (canvas.getWidth() * diffX) + dotSize;
            bottom = (canvas.getHeight() * diffY) + dotSize;
            d.setBounds((int) left, (int) top, (int) right, (int) bottom);
            diffX = diffX + 0.065f;
            diffY = diffY - 0.033f;
        }
    }

    public void diagonalFallingLineFromMiddle(){
        dotLine3[0] = dot13;
        dotLine3[1] = dot14;
        dotLine3[2] = dot15;
        dotLine3[3] = dot16;
        dotLine3[4] = dot17;

        dotLines[2] = dotLine3;

        diffX = 0.5f;
        diffY = 0.45f;

        for (Drawable d : dotLine3) {
            left = (canvas.getWidth() * diffX) - dotSize;
            top = (canvas.getHeight() * diffY) - dotSize;
            right = (canvas.getWidth() * diffX) + dotSize;
            bottom = (canvas.getHeight() * diffY) + dotSize;
            d.setBounds((int) left, (int) top, (int) right, (int) bottom);
            diffX = diffX + 0.055f;
            diffY = diffY + 0.048f;
        }
    }

    public void diagonalFallingLineFromLeft(){
        dotLine2[0] = dot6;
        dotLine2[1] = dot7;
        dotLine2[2] = dot8;
        dotLine2[3] = dot9;
        dotLine2[4] = dot10;
        dotLine2[5] = dot11;
        dotLine2[6] = dot12;

        dotLines[1] = dotLine2;

        diffX = 0.32f;
        diffY = 0.325f;

        for (Drawable d : dotLine2) {
            left = (canvas.getWidth() * diffX) - dotSize;
            top = (canvas.getHeight() * diffY) - dotSize;
            right = (canvas.getWidth() * diffX) + dotSize;
            bottom = (canvas.getHeight() * diffY) + dotSize;
            d.setBounds((int) left, (int) top, (int) right, (int) bottom);
            diffX = diffX + 0.063f;
            diffY = diffY + 0.05f;
        }
    }

    public void straightLineRight(){
        dotLine3[0] = dot13;
        dotLine3[1] = dot14;
        dotLine3[2] = dot15;
        dotLine3[3] = dot16;
        dotLine3[4] = dot17;

        dotLines[2] = dotLine3;

        diffX = 0.725f;
        diffY = 0.325f;

        for (Drawable d : dotLine3) {
            left = (canvas.getWidth() * diffX) - dotSize;
            top = (canvas.getHeight() * diffY) - dotSize;
            right = (canvas.getWidth() * diffX) + dotSize;
            bottom = (canvas.getHeight() * diffY) + dotSize;
            d.setBounds((int) left, (int) top, (int) right, (int) bottom);
            diffY = diffY + 0.076f;
        }
    }

    public Drawable getBackground() {
        return background;
    }
}

