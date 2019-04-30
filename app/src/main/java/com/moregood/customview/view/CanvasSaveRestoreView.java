package com.moregood.customview.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import com.moregood.customview.R;

public class CanvasSaveRestoreView extends View {
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private int mWidth, mHeight;
    private Bitmap bitmap;

    public CanvasSaveRestoreView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mPaint.setStyle(Paint.Style.STROKE);
        bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(bitmap, getWidth()/2 , 0 , mPaint);
        canvas.save();
        canvas.rotate(10 , getWidth()/2 , getHeight()/2);
        //第二张
        canvas.drawBitmap(bitmap, getWidth()/2 , getHeight()/4 , mPaint);
        //旋转45
        canvas.restore();
        //第三张
        canvas.drawBitmap(bitmap, getWidth()/2 , getHeight()/2- bitmap.getHeight()/2 , mPaint);
    }
}
