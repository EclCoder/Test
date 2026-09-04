package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.image.b;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBridgeBaitClickView extends RelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MBridgeDyImageView f29720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MBridgeDyImageView f29721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f29722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f29723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f29724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f29725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Animation f29728i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Animation f29729j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Animation f29730k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Animation f29731l;

    public MBridgeBaitClickView(Context context) {
        super(context);
        this.f29723d = "";
        this.f29724e = "";
        this.f29725f = "Click now for details";
        this.f29726g = 1;
        this.f29727h = 1342177280;
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f29728i = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f29728i.setRepeatCount(-1);
        this.f29728i.setRepeatMode(2);
        MBridgeDyImageView mBridgeDyImageView = this.f29720a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f29728i);
        }
    }

    private void e() {
        MBridgeDyImageView mBridgeDyImageView = this.f29721b;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.setVisibility(4);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f29728i = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f29728i.setRepeatCount(1);
        this.f29728i.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        this.f29729j = scaleAnimation2;
        scaleAnimation2.setDuration(1000L);
        this.f29729j.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f29730k = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f29730k.setRepeatCount(0);
        final AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f29729j);
        animationSet.addAnimation(this.f29730k);
        this.f29729j.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                if (MBridgeBaitClickView.this.f29721b != null) {
                    MBridgeBaitClickView.this.f29721b.setVisibility(4);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                if (MBridgeBaitClickView.this.f29721b != null) {
                    MBridgeBaitClickView.this.f29721b.setVisibility(0);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }
        });
        this.f29728i.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.f29720a != null) {
                            MBridgeBaitClickView.this.f29720a.startAnimation(MBridgeBaitClickView.this.f29728i);
                        }
                    }
                }, 1000L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.f29721b != null) {
                            MBridgeBaitClickView.this.f29721b.startAnimation(animationSet);
                        }
                    }
                }, 550L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }
        });
        MBridgeDyImageView mBridgeDyImageView2 = this.f29720a;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(this.f29728i);
        }
    }

    private void getDefaultClickText() {
        try {
            this.f29725f = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
        } catch (Throwable th2) {
            q0.b("MBridgeAnimationClickView", th2.getMessage());
        }
    }

    public void init(int i10) {
        this.f29726g = i10;
        init();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f29728i;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f29729j;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f29730k;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f29731l;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    public void startAnimation() {
        int i10 = this.f29726g;
        if (i10 == 2) {
            this.f29721b.setVisibility(4);
            d();
            return;
        }
        if (i10 == 3) {
            e();
            return;
        }
        if (i10 == 4) {
            this.f29721b.setVisibility(4);
            a();
        } else if (i10 != 5) {
            b();
        } else {
            c();
        }
    }

    private void a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f29728i = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f29728i.setRepeatCount(1);
        this.f29728i.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (MBridgeBaitClickView.this.f29720a != null) {
                            MBridgeBaitClickView.this.f29720a.startAnimation(MBridgeBaitClickView.this.f29728i);
                        }
                    }
                }, 1000L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        MBridgeDyImageView mBridgeDyImageView = this.f29720a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f29728i);
        }
    }

    private void b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f29728i = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f29728i.setRepeatCount(-1);
        this.f29728i.setRepeatMode(2);
        MBridgeDyImageView mBridgeDyImageView = this.f29720a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f29728i);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f29729j = scaleAnimation2;
        scaleAnimation2.setDuration(400L);
        this.f29729j.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
        this.f29730k = alphaAnimation;
        alphaAnimation.setDuration(400L);
        this.f29730k.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f29729j);
        animationSet.addAnimation(this.f29730k);
        MBridgeDyImageView mBridgeDyImageView2 = this.f29721b;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(animationSet);
        }
    }

    private void c() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.f29731l = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.f29731l.setRepeatMode(2);
        this.f29731l.setRepeatCount(-1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f29729j = scaleAnimation;
        scaleAnimation.setDuration(600L);
        this.f29729j.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f29730k = alphaAnimation;
        alphaAnimation.setDuration(600L);
        this.f29730k.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f29729j);
        animationSet.addAnimation(this.f29730k);
        MBridgeDyImageView mBridgeDyImageView = this.f29720a;
        if (mBridgeDyImageView != null) {
            mBridgeDyImageView.startAnimation(this.f29731l);
        }
        MBridgeDyImageView mBridgeDyImageView2 = this.f29721b;
        if (mBridgeDyImageView2 != null) {
            mBridgeDyImageView2.startAnimation(animationSet);
        }
    }

    public void init(int i10, int i11) {
        this.f29727h = i10;
        this.f29726g = i11;
        init();
    }

    public void init(int i10, int i11, String str, String str2, String str3) {
        this.f29727h = i10;
        this.f29726g = i11;
        this.f29723d = str;
        this.f29724e = str2;
        this.f29725f = str3;
        init();
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29723d = "";
        this.f29724e = "";
        this.f29725f = "Click now for details";
        this.f29726g = 1;
        this.f29727h = 1342177280;
    }

    public void init() {
        try {
            setBackgroundColor(this.f29727h);
            getDefaultClickText();
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            int iA = v0.a(getContext(), 55.0f);
            int iA2 = v0.a(getContext(), 33.0f);
            this.f29721b = new MBridgeDyImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
            layoutParams.setMargins(iA2, iA2, 0, 0);
            this.f29721b.setLayoutParams(layoutParams);
            final int iA3 = i0.a(getContext(), "mbridge_icon_click_circle", "drawable");
            if (TextUtils.isEmpty(this.f29724e)) {
                this.f29721b.setImageResource(iA3);
            } else {
                b.a(c.n().d()).a(this.f29723d, new com.mbridge.msdk.foundation.same.image.c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.1
                    @Override // com.mbridge.msdk.foundation.same.image.c
                    public void onFailedLoad(String str, String str2) {
                        MBridgeBaitClickView.this.f29721b.setImageResource(iA3);
                    }

                    @Override // com.mbridge.msdk.foundation.same.image.c
                    public void onSuccessLoad(Bitmap bitmap, String str) {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        MBridgeBaitClickView.this.f29721b.setImageBitmap(bitmap);
                    }
                });
            }
            int iA4 = v0.a(getContext(), 108.0f);
            int iA5 = v0.a(getContext(), 35.0f);
            int iA6 = v0.a(getContext(), 43.0f);
            this.f29720a = new MBridgeDyImageView(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA4, iA4);
            layoutParams2.setMargins(iA5, iA6, 0, 0);
            this.f29720a.setLayoutParams(layoutParams2);
            final int iA7 = i0.a(getContext(), "mbridge_icon_click_hand", "drawable");
            if (TextUtils.isEmpty(this.f29723d)) {
                this.f29720a.setImageResource(iA7);
            } else {
                b.a(c.n().d()).a(this.f29723d, new com.mbridge.msdk.foundation.same.image.c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.2
                    @Override // com.mbridge.msdk.foundation.same.image.c
                    public void onFailedLoad(String str, String str2) {
                        MBridgeBaitClickView.this.f29720a.setImageResource(iA7);
                    }

                    @Override // com.mbridge.msdk.foundation.same.image.c
                    public void onSuccessLoad(Bitmap bitmap, String str) {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        MBridgeBaitClickView.this.f29720a.setImageBitmap(bitmap);
                    }
                });
            }
            relativeLayout.addView(this.f29721b);
            relativeLayout.addView(this.f29720a);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(relativeLayout);
            this.f29722c = new TextView(getContext());
            this.f29722c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.f29722c.setText(this.f29725f);
            this.f29722c.setTextColor(-1);
            this.f29722c.setGravity(14);
            linearLayout.addView(this.f29722c);
            addView(linearLayout);
        } catch (Throwable th2) {
            q0.b("MBridgeAnimationClickView", th2.getMessage());
        }
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f29723d = "";
        this.f29724e = "";
        this.f29725f = "Click now for details";
        this.f29726g = 1;
        this.f29727h = 1342177280;
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f29723d = "";
        this.f29724e = "";
        this.f29725f = "Click now for details";
        this.f29726g = 1;
        this.f29727h = 1342177280;
    }
}
