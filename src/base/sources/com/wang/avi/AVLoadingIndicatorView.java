package com.wang.avi;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.wang.avi.indicators.BallPulseIndicator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class AVLoadingIndicatorView extends View {
    private static final BallPulseIndicator DEFAULT_INDICATOR = new BallPulseIndicator();
    private static final int MIN_DELAY = 500;
    private static final int MIN_SHOW_TIME = 500;
    private static final String TAG = "AVLoadingIndicatorView";
    private float mAnimationSpeedMultiplier;
    private final Runnable mDelayedHide;
    private final Runnable mDelayedShow;
    private boolean mDismissed;
    private Indicator mIndicator;
    private int mIndicatorColor;
    int mMaxHeight;
    int mMaxWidth;
    int mMinHeight;
    int mMinWidth;
    private boolean mPostedHide;
    private boolean mPostedShow;
    private boolean mShouldStartAnimationDrawable;
    private long mStartTime;

    public AVLoadingIndicatorView(Context context) {
        super(context);
        this.mStartTime = -1L;
        this.mPostedHide = false;
        this.mPostedShow = false;
        this.mDismissed = false;
        this.mDelayedHide = new Runnable() { // from class: com.wang.avi.AVLoadingIndicatorView.1
            @Override // java.lang.Runnable
            public void run() {
                AVLoadingIndicatorView.this.mPostedHide = false;
                AVLoadingIndicatorView.this.mStartTime = -1L;
                AVLoadingIndicatorView.this.setVisibility(8);
            }
        };
        this.mDelayedShow = new Runnable() { // from class: com.wang.avi.AVLoadingIndicatorView.2
            @Override // java.lang.Runnable
            public void run() {
                AVLoadingIndicatorView.this.mPostedShow = false;
                if (AVLoadingIndicatorView.this.mDismissed) {
                    return;
                }
                AVLoadingIndicatorView.this.mStartTime = System.currentTimeMillis();
                AVLoadingIndicatorView.this.setVisibility(0);
            }
        };
        this.mAnimationSpeedMultiplier = 1.0f;
        init(context, null, 0, 0);
    }

    private void init(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.mMinWidth = 24;
        this.mMaxWidth = 48;
        this.mMinHeight = 24;
        this.mMaxHeight = 48;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AVLoadingIndicatorView, i10, i11);
        this.mMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.AVLoadingIndicatorView_minWidth, this.mMinWidth);
        this.mMaxWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.AVLoadingIndicatorView_maxWidth, this.mMaxWidth);
        this.mMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.AVLoadingIndicatorView_minHeight, this.mMinHeight);
        this.mMaxHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.AVLoadingIndicatorView_maxHeight, this.mMaxHeight);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.AVLoadingIndicatorView_indicatorName);
        this.mIndicatorColor = typedArrayObtainStyledAttributes.getColor(R.styleable.AVLoadingIndicatorView_indicatorColor, -1);
        this.mAnimationSpeedMultiplier = typedArrayObtainStyledAttributes.getFloat(R.styleable.AVLoadingIndicatorView_animationSpeedMultiplier, 1.0f);
        setIndicator(string);
        if (this.mIndicator == null) {
            setIndicator(DEFAULT_INDICATOR);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void removeCallbacks() {
        removeCallbacks(this.mDelayedHide);
        removeCallbacks(this.mDelayedShow);
    }

    private void updateDrawableBounds(int i10, int i11) {
        int i12;
        int paddingRight = i10 - (getPaddingRight() + getPaddingLeft());
        int paddingTop = i11 - (getPaddingTop() + getPaddingBottom());
        Indicator indicator = this.mIndicator;
        if (indicator != null) {
            float intrinsicWidth = indicator.getIntrinsicWidth() / this.mIndicator.getIntrinsicHeight();
            float f10 = paddingRight;
            float f11 = paddingTop;
            float f12 = f10 / f11;
            int i13 = 0;
            if (intrinsicWidth == f12) {
                i12 = 0;
            } else if (f12 > intrinsicWidth) {
                int i14 = (int) (f11 * intrinsicWidth);
                int i15 = (paddingRight - i14) / 2;
                i13 = i15;
                paddingRight = i14 + i15;
                i12 = 0;
            } else {
                int i16 = (int) (f10 * (1.0f / intrinsicWidth));
                int i17 = (paddingTop - i16) / 2;
                int i18 = i16 + i17;
                i12 = i17;
                paddingTop = i18;
            }
            this.mIndicator.setBounds(i13, i12, paddingRight, paddingTop);
        }
    }

    private void updateDrawableState() {
        int[] drawableState = getDrawableState();
        Indicator indicator = this.mIndicator;
        if (indicator == null || !indicator.isStateful()) {
            return;
        }
        this.mIndicator.setState(drawableState);
    }

    void drawTrack(Canvas canvas) {
        Indicator indicator = this.mIndicator;
        if (indicator != null) {
            int iSave = canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            indicator.draw(canvas);
            canvas.restoreToCount(iSave);
            if (this.mShouldStartAnimationDrawable) {
                indicator.start();
                this.mShouldStartAnimationDrawable = false;
            }
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Indicator indicator = this.mIndicator;
        if (indicator != null) {
            indicator.setHotspot(f10, f11);
        }
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        updateDrawableState();
    }

    public float getAnimationSpeedMultiplier() {
        return this.mAnimationSpeedMultiplier;
    }

    public Indicator getIndicator() {
        return this.mIndicator;
    }

    public void hide() {
        this.mDismissed = true;
        removeCallbacks(this.mDelayedShow);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.mStartTime;
        long j11 = jCurrentTimeMillis - j10;
        if (j11 >= 500 || j10 == -1) {
            setVisibility(8);
        } else {
            if (this.mPostedHide) {
                return;
            }
            postDelayed(this.mDelayedHide, 500 - j11);
            this.mPostedHide = true;
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (!verifyDrawable(drawable)) {
            super.invalidateDrawable(drawable);
            return;
        }
        Rect bounds = drawable.getBounds();
        int scrollX = getScrollX() + getPaddingLeft();
        int scrollY = getScrollY() + getPaddingTop();
        invalidate(bounds.left + scrollX, bounds.top + scrollY, bounds.right + scrollX, bounds.bottom + scrollY);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        startAnimation();
        removeCallbacks();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        stopAnimation();
        super.onDetachedFromWindow();
        removeCallbacks();
    }

    @Override // android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawTrack(canvas);
    }

    @Override // android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        int iMax;
        int iMax2;
        try {
            Indicator indicator = this.mIndicator;
            if (indicator != null) {
                iMax2 = Math.max(this.mMinWidth, Math.min(this.mMaxWidth, indicator.getIntrinsicWidth()));
                iMax = Math.max(this.mMinHeight, Math.min(this.mMaxHeight, indicator.getIntrinsicHeight()));
            } else {
                iMax = 0;
                iMax2 = 0;
            }
            updateDrawableState();
            setMeasuredDimension(View.resolveSizeAndState(iMax2 + getPaddingLeft() + getPaddingRight(), i10, 0), View.resolveSizeAndState(iMax + getPaddingTop() + getPaddingBottom(), i11, 0));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        updateDrawableBounds(i10, i11);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 == 8 || i10 == 4) {
            stopAnimation();
        } else {
            startAnimation();
        }
    }

    public void setAnimationSpeedMultiplier(float f10) {
        this.mAnimationSpeedMultiplier = f10;
        Indicator indicator = this.mIndicator;
        if (indicator != null) {
            indicator.setAnimationSpeedMultiplier(f10);
        }
    }

    public void setIndicator(Indicator indicator) {
        Indicator indicator2 = this.mIndicator;
        if (indicator2 != indicator) {
            if (indicator2 != null) {
                indicator2.setCallback(null);
                unscheduleDrawable(this.mIndicator);
            }
            this.mIndicator = indicator;
            setIndicatorColor(this.mIndicatorColor);
            setAnimationSpeedMultiplier(this.mAnimationSpeedMultiplier);
            if (indicator != null) {
                indicator.setCallback(this);
            }
            postInvalidate();
        }
    }

    public void setIndicatorColor(int i10) {
        this.mIndicatorColor = i10;
        this.mIndicator.setColor(i10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (getVisibility() != i10) {
            super.setVisibility(i10);
            if (i10 == 8 || i10 == 4) {
                stopAnimation();
            } else {
                startAnimation();
            }
        }
    }

    public void show() {
        this.mStartTime = -1L;
        this.mDismissed = false;
        removeCallbacks(this.mDelayedHide);
        if (this.mPostedShow) {
            return;
        }
        postDelayed(this.mDelayedShow, 500L);
        this.mPostedShow = true;
    }

    public void smoothToHide() {
        startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_out));
        setVisibility(8);
    }

    public void smoothToShow() {
        startAnimation(AnimationUtils.loadAnimation(getContext(), android.R.anim.fade_in));
        setVisibility(0);
    }

    void startAnimation() {
        if (getVisibility() != 0) {
            return;
        }
        if (this.mIndicator != null) {
            this.mShouldStartAnimationDrawable = true;
        }
        postInvalidate();
    }

    void stopAnimation() {
        if (this.mIndicator != null) {
            this.mIndicator.stop();
            this.mShouldStartAnimationDrawable = false;
        }
        postInvalidate();
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return drawable == this.mIndicator || super.verifyDrawable(drawable);
    }

    public void setIndicator(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if (!str.contains(".")) {
            sb2.append(getClass().getPackage().getName());
            sb2.append(".indicators");
            sb2.append(".");
        }
        sb2.append(str);
        try {
            setIndicator((Indicator) Class.forName(sb2.toString()).newInstance());
        } catch (ClassNotFoundException unused) {
            Log.e(TAG, "Didn't find your class , check the name again !");
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        } catch (InstantiationException e11) {
            e11.printStackTrace();
        }
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mStartTime = -1L;
        this.mPostedHide = false;
        this.mPostedShow = false;
        this.mDismissed = false;
        this.mDelayedHide = new Runnable() { // from class: com.wang.avi.AVLoadingIndicatorView.1
            @Override // java.lang.Runnable
            public void run() {
                AVLoadingIndicatorView.this.mPostedHide = false;
                AVLoadingIndicatorView.this.mStartTime = -1L;
                AVLoadingIndicatorView.this.setVisibility(8);
            }
        };
        this.mDelayedShow = new Runnable() { // from class: com.wang.avi.AVLoadingIndicatorView.2
            @Override // java.lang.Runnable
            public void run() {
                AVLoadingIndicatorView.this.mPostedShow = false;
                if (AVLoadingIndicatorView.this.mDismissed) {
                    return;
                }
                AVLoadingIndicatorView.this.mStartTime = System.currentTimeMillis();
                AVLoadingIndicatorView.this.setVisibility(0);
            }
        };
        this.mAnimationSpeedMultiplier = 1.0f;
        init(context, attributeSet, 0, R.style.AVLoadingIndicatorView);
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mStartTime = -1L;
        this.mPostedHide = false;
        this.mPostedShow = false;
        this.mDismissed = false;
        this.mDelayedHide = new Runnable() { // from class: com.wang.avi.AVLoadingIndicatorView.1
            @Override // java.lang.Runnable
            public void run() {
                AVLoadingIndicatorView.this.mPostedHide = false;
                AVLoadingIndicatorView.this.mStartTime = -1L;
                AVLoadingIndicatorView.this.setVisibility(8);
            }
        };
        this.mDelayedShow = new Runnable() { // from class: com.wang.avi.AVLoadingIndicatorView.2
            @Override // java.lang.Runnable
            public void run() {
                AVLoadingIndicatorView.this.mPostedShow = false;
                if (AVLoadingIndicatorView.this.mDismissed) {
                    return;
                }
                AVLoadingIndicatorView.this.mStartTime = System.currentTimeMillis();
                AVLoadingIndicatorView.this.setVisibility(0);
            }
        };
        this.mAnimationSpeedMultiplier = 1.0f;
        init(context, attributeSet, i10, R.style.AVLoadingIndicatorView);
    }

    public AVLoadingIndicatorView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.mStartTime = -1L;
        this.mPostedHide = false;
        this.mPostedShow = false;
        this.mDismissed = false;
        this.mDelayedHide = new Runnable() { // from class: com.wang.avi.AVLoadingIndicatorView.1
            @Override // java.lang.Runnable
            public void run() {
                AVLoadingIndicatorView.this.mPostedHide = false;
                AVLoadingIndicatorView.this.mStartTime = -1L;
                AVLoadingIndicatorView.this.setVisibility(8);
            }
        };
        this.mDelayedShow = new Runnable() { // from class: com.wang.avi.AVLoadingIndicatorView.2
            @Override // java.lang.Runnable
            public void run() {
                AVLoadingIndicatorView.this.mPostedShow = false;
                if (AVLoadingIndicatorView.this.mDismissed) {
                    return;
                }
                AVLoadingIndicatorView.this.mStartTime = System.currentTimeMillis();
                AVLoadingIndicatorView.this.setVisibility(0);
            }
        };
        this.mAnimationSpeedMultiplier = 1.0f;
        init(context, attributeSet, i10, R.style.AVLoadingIndicatorView);
    }
}
