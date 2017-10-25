package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
    Paint mPaint = new Paint();
    Path mPath = new Path();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setAntiAlias(true);

        mPaint.setColor(Color.RED);
        canvas.drawArc(200, 100, 500, 400, -180, 120, true, mPaint);
        mPaint.setColor(Color.GREEN);
        canvas.drawArc(200, 100, 500, 400, -55, 55, true, mPaint);
        mPaint.setColor(Color.BLUE);
        canvas.drawArc(200, 100, 500, 400, 5, 10, true, mPaint);
        mPaint.setColor(Color.YELLOW);
        canvas.drawArc(200, 100, 500, 400, 15, 10, true, mPaint);
        mPaint.setColor(Color.CYAN);
        canvas.drawArc(200, 100, 500, 400, 30, 50, true, mPaint);
        mPaint.setColor(Color.LTGRAY);
        canvas.drawArc(200, 100, 500, 400, 85, 90, true, mPaint);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
    }
}
