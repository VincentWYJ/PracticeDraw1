package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    Paint mPaintW = new Paint();
    Paint mPaintG = new Paint();
    Path mPath = new Path();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaintW.setAntiAlias(true);
        mPaintG.setAntiAlias(true);

        mPaintW.setColor(Color.WHITE);
        mPaintW.setStyle(Paint.Style.STROKE);
        mPath.moveTo(80, 80);
        mPath.rLineTo(0 , 350);
        mPath.rLineTo(550, 0);
        canvas.drawPath(mPath, mPaintW);

        mPaintG.setColor(Color.GREEN);
        mPaintG.setStyle(Paint.Style.FILL);
        mPaintW.setTextAlign(Paint.Align.CENTER);
        mPaintW.setTextSize(20);
        canvas.drawRect(100, 425, 160, 430, mPaintG);
        canvas.drawText("Froyo", 130, 450, mPaintW);
        canvas.drawRect(180, 400, 240, 430, mPaintG);
        canvas.drawText("GB", 210, 450, mPaintW);
        canvas.drawRect(260, 400, 320, 430, mPaintG);
        canvas.drawText("ICS", 290, 450, mPaintW);
        canvas.drawRect(340, 325, 400, 430, mPaintG);
        canvas.drawText("JB", 370, 450, mPaintW);
        canvas.drawRect(420, 225, 480, 430, mPaintG);
        canvas.drawText("Kitkat", 450, 450, mPaintW);
        canvas.drawRect(500, 125, 560, 430, mPaintG);
        canvas.drawText("L", 530, 450, mPaintW);
        canvas.drawRect(580, 300, 640, 430, mPaintG);
        canvas.drawText("M", 610, 450, mPaintW);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
    }
}
