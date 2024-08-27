package com.nhathuy.travishuyprogressbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;


public class TravisHuyProgressBar extends View {

    @JvmField
    public int mProgress =0;
    @JvmField
    public int mMax=100;
    @JvmField
    public int mStartColor;
    @JvmField
    public int mEndColor;
    @JvmField
    public int mBackgroundColor;
    @JvmField
    public float mCornerRadius;
    private Paint mPaint;
    private RectF mRectF;
    private int[] mGradientColor;

    public TravisHuyProgressBar(Context context) {
        super(context);
        init(null);
    }


    public TravisHuyProgressBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    @JvmOverloads
    public TravisHuyProgressBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }


    private void init(@Nullable AttributeSet attrs) {
        mPaint=new Paint(Paint.ANTI_ALIAS_FLAG);
        mRectF= new RectF();

        if (attrs!=null){
            TypedArray a= getContext().obtainStyledAttributes(attrs,R.styleable.TravisHuyProgressBar);
            mStartColor = a.getColor(R.styleable.TravisHuyProgressBar_startColor,0xFFFF5722);
            mEndColor =a.getColor(R.styleable.TravisHuyProgressBar_endColor,0xFFFFC107);
            mBackgroundColor=a.getColor(R.styleable.TravisHuyProgressBar_backgroundColor,0xFFE0E0E0);
            mCornerRadius=a.getDimension(R.styleable.TravisHuyProgressBar_cornerRadius,2);
            mProgress=a.getInt(R.styleable.TravisHuyProgressBar_progress,0);
            mMax=a.getInt(R.styleable.TravisHuyProgressBar_max,100);

            int gradientColorsResourceId=a.getResourceId(R.styleable.TravisHuyProgressBar_gradientColors,0);
            if(gradientColorsResourceId!=0){
                mGradientColor=getResources().getIntArray(gradientColorsResourceId);
            }
            a.recycle();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width=getWidth();
        int height=getHeight();

        mPaint.setShader(null);
        mPaint.setColor(mBackgroundColor);
        mRectF.set(0, 0, width, height);
        canvas.drawRoundRect(mRectF,mCornerRadius,mCornerRadius,mPaint);

        if(mProgress>0){
            float progressWidth= (float) mProgress/mMax*width;
            mRectF.set(0,0,progressWidth,height);

            if(mGradientColor!=null && mGradientColor.length>=2){
                mPaint.setShader(new LinearGradient(0,0,progressWidth,0,mGradientColor,null, Shader.TileMode.CLAMP));
            }
            else{
                mPaint.setShader(new LinearGradient(0,0,progressWidth,0,mStartColor,mEndColor, Shader.TileMode.CLAMP));
            }

            canvas.drawRoundRect(mRectF,mCornerRadius,mCornerRadius,mPaint);
        }
    }

    public void setProgress(int mProgress) {
        this.mProgress = mProgress;
        invalidate();
    }

    public void setMax(int mMax) {
        this.mMax = mMax;
        invalidate();
    }

    public void setStartColor(int mStartColor) {
        this.mStartColor = mStartColor;
        mGradientColor=null;
        invalidate();
    }

    public void setEndColor(int mEndColor) {
        this.mEndColor = mEndColor;
        mGradientColor=null;
        invalidate();
    }

    public void setBackgroundColor(int mBackgroundColor) {
        this.mBackgroundColor = mBackgroundColor;
        invalidate();
    }

    public void setCornerRadius(float mCornerRadius) {
        this.mCornerRadius = mCornerRadius;
        invalidate();
    }

    public void setColors(int startColor, int endColor){
        mStartColor=startColor;
        mEndColor=endColor;
        mGradientColor=null;
        invalidate();
    }


    public void setGradientColors(int[] colors) {
        if(colors!=null && colors.length>=2){
            mGradientColor=colors;
            invalidate();
        }

    }
}
