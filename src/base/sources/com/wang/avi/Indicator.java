package com.wang.avi;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Indicator extends Drawable implements Animatable {
    private static final Rect ZERO_BOUNDS_RECT = new Rect();
    private ArrayList<ValueAnimator> mAnimators;
    private boolean mHasAnimators;
    private Paint mPaint;
    private HashMap<ValueAnimator, ValueAnimator.AnimatorUpdateListener> mUpdateListeners = new HashMap<>();
    private int alpha = 255;
    protected Rect drawBounds = ZERO_BOUNDS_RECT;
    private float mAnimationSpeedMultiplier = 1.0f;

    public Indicator() {
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setColor(-1);
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setAntiAlias(true);
    }

    private void applySpeedMultiplierToAnimators() {
        ArrayList<ValueAnimator> arrayList = this.mAnimators;
        if (arrayList == null || this.mAnimationSpeedMultiplier == 1.0f) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            ValueAnimator valueAnimator = arrayList.get(i10);
            i10++;
            ValueAnimator valueAnimator2 = valueAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.setDuration((long) (valueAnimator2.getDuration() / this.mAnimationSpeedMultiplier));
            }
        }
    }

    private void ensureAnimators() {
        if (this.mHasAnimators) {
            return;
        }
        this.mAnimators = onCreateAnimators();
        this.mHasAnimators = true;
        applySpeedMultiplierToAnimators();
    }

    private boolean isStarted() {
        Iterator<ValueAnimator> it = this.mAnimators.iterator();
        if (it.hasNext()) {
            return it.next().isStarted();
        }
        return false;
    }

    private void startAnimators() {
        for (int i10 = 0; i10 < this.mAnimators.size(); i10++) {
            ValueAnimator valueAnimator = this.mAnimators.get(i10);
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.mUpdateListeners.get(valueAnimator);
            if (animatorUpdateListener != null) {
                valueAnimator.addUpdateListener(animatorUpdateListener);
            }
            valueAnimator.start();
        }
    }

    private void stopAnimators() {
        ArrayList<ValueAnimator> arrayList = this.mAnimators;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                ValueAnimator valueAnimator = arrayList.get(i10);
                i10++;
                ValueAnimator valueAnimator2 = valueAnimator;
                if (valueAnimator2 != null && valueAnimator2.isStarted()) {
                    valueAnimator2.removeAllUpdateListeners();
                    valueAnimator2.end();
                }
            }
        }
    }

    public void addUpdateListener(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.mUpdateListeners.put(valueAnimator, animatorUpdateListener);
    }

    public int centerX() {
        return this.drawBounds.centerX();
    }

    public int centerY() {
        return this.drawBounds.centerY();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        draw(canvas, this.mPaint);
    }

    public abstract void draw(Canvas canvas, Paint paint);

    public float exactCenterX() {
        return this.drawBounds.exactCenterX();
    }

    public float exactCenterY() {
        return this.drawBounds.exactCenterY();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.alpha;
    }

    public float getAnimationSpeedMultiplier() {
        return this.mAnimationSpeedMultiplier;
    }

    public int getColor() {
        return this.mPaint.getColor();
    }

    public Rect getDrawBounds() {
        return this.drawBounds;
    }

    public int getHeight() {
        return this.drawBounds.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    public int getWidth() {
        return this.drawBounds.width();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Iterator<ValueAnimator> it = this.mAnimators.iterator();
        if (it.hasNext()) {
            return it.next().isRunning();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setDrawBounds(rect);
    }

    public abstract ArrayList<ValueAnimator> onCreateAnimators();

    public void postInvalidate() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.alpha = i10;
    }

    public void setAnimationSpeedMultiplier(float f10) {
        this.mAnimationSpeedMultiplier = f10;
        if (!this.mHasAnimators || this.mAnimators == null) {
            return;
        }
        applySpeedMultiplierToAnimators();
    }

    public void setColor(int i10) {
        this.mPaint.setColor(i10);
    }

    public void setDrawBounds(Rect rect) {
        setDrawBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        ensureAnimators();
        if (this.mAnimators == null || isStarted()) {
            return;
        }
        startAnimators();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        stopAnimators();
    }

    public void setDrawBounds(int i10, int i11, int i12, int i13) {
        this.drawBounds = new Rect(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
