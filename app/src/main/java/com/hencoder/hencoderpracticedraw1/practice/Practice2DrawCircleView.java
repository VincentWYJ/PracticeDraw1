package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {
    Paint mPaint = new Paint();

    /**在java代码中创建实例调用*/
    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    /**在xml文件中添加组件调用*/
    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        /**
         * 其实上面的super方法也是调用了this(context, attrs, 0)方法，直接在此调用效果相同
         */
    }

    /**一般场景不需要调用*/
    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setAntiAlias(true);

        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLACK);
        canvas.drawCircle(200, 150, 120, mPaint);

        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(2);
        mPaint.setColor(Color.BLACK);
        canvas.drawCircle(500, 150, 120, mPaint);

        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        mPaint.setColor(Color.rgb(100, 100, 200));
        canvas.drawCircle(200, 420, 120, mPaint);

        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(20);
        mPaint.setColor(Color.BLACK);
        canvas.drawCircle(500, 420, 120, mPaint);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
    }
}
