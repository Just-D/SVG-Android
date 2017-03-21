package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_find_replace extends SVGRenderer {

    public ic_find_replace(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(11.0f, 6.0f);
        mPath.rCubicTo(1.38f, 0.0f, 2.63f, 0.56f, 3.54f, 1.46f);
        mPath.lineTo(12.0f, 10.0f);
        mPath.rLineTo(6.0f, 0f);
        mPath.lineTo(18.0f, 4.0f);
        mPath.rLineTo(-2.05f, 2.05f);
        mPath.cubicTo(14.68f, 4.78f, 12.93f, 4.0f, 11.0f, 4.0f);
        mPath.rCubicTo(-3.53f, 0.0f, -6.43f, 2.61f, -6.92f, 6.0f);
        mPath.lineTo(6.1f, 10.0f);
        mPath.rCubicTo(0.46f, -2.28f, 2.48f, -4.0f, 4.9f, -4.0f);
        mPath.close();
        mPath.moveTo(11.0f, 6.0f);
        mPath.rMoveTo(5.64f, 9.14f);
        mPath.rCubicTo(0.66f, -0.9f, 1.12f, -1.97f, 1.28f, -3.14f);
        mPath.lineTo(15.9f, 12.0f);
        mPath.rCubicTo(-0.46f, 2.28f, -2.48f, 4.0f, -4.9f, 4.0f);
        mPath.rCubicTo(-1.38f, 0.0f, -2.63f, -0.56f, -3.54f, -1.46f);
        mPath.lineTo(10.0f, 12.0f);
        mPath.lineTo(4.0f, 12.0f);
        mPath.rLineTo(0f, 6.0f);
        mPath.rLineTo(2.05f, -2.05f);
        mPath.cubicTo(7.32f, 17.22f, 9.07f, 18.0f, 11.0f, 18.0f);
        mPath.rCubicTo(1.55f, 0.0f, 2.98f, -0.51f, 4.14f, -1.36f);
        mPath.lineTo(20.0f, 21.49f);
        mPath.lineTo(21.49f, 20.0f);
        mPath.rLineTo(-4.85f, -4.86f);
        mPath.close();
        mPath.moveTo(16.64f, 15.14f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}