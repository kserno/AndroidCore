package com.kserno.collapsingheader;

import android.graphics.Typeface;
import android.support.annotation.ColorInt;
import android.support.transition.Slide;
import android.view.Gravity;

/**
 * Created by filipsollar on 5.4.18.
 */

public class TextModel {

    @ColorInt
    private int mColor;
    private Typeface mTypeface;
    private int mFontSizePx;
    @Slide.GravityFlag
    private int gravity = Gravity.START;

    public TextModel(int color, Typeface typeface, int fontSizePx) {
        mColor = color;
        mTypeface = typeface;
        mFontSizePx = fontSizePx;
    }

    public int getColor() {
        return mColor;
    }

    public Typeface getTypeface() {
        return mTypeface;
    }

    public int getFontSizePx() {
        return mFontSizePx;
    }

    public int getGravity() {
        return gravity;
    }
}
