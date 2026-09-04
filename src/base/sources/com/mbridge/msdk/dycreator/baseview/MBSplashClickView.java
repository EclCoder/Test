package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.image.b;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBSplashClickView extends MBRelativeLayout {
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f29636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f29637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f29638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f29639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f29640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f29641k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f29642l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f29643m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f29644n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f29645o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f29646p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f29647q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f29648r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f29649s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ImageView f29650t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f29651u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final RectF f29652v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Paint f29653w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Paint f29654x;

    public MBSplashClickView(Context context) {
        super(context);
        this.f29636f = "浏览第三方应用";
        this.f29637g = "View";
        this.f29638h = "打开第三方应用";
        this.f29639i = "Open";
        this.f29640j = "下载第三方应用";
        this.f29641k = "Install";
        this.f29642l = "mbridge_splash_btn_arrow_right";
        this.f29643m = "mbridge_splash_btn_circle";
        this.f29644n = "mbridge_splash_btn_finger";
        this.f29645o = "mbridge_splash_btn_go";
        this.f29646p = "mbridge_splash_btn_light";
        this.f29647q = "mbridge_expand_data";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f29652v = new RectF();
        this.f29653w = new Paint();
        this.f29654x = new Paint();
        a();
    }

    private void c() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(1000L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        final ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(400L);
        scaleAnimation2.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBSplashClickView.this.f29651u.setVisibility(4);
                MBSplashClickView.this.f29651u.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MBSplashClickView.this.f29651u.startAnimation(scaleAnimation2);
                    }
                }, 1600L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                MBSplashClickView.this.f29651u.setVisibility(0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }
        });
        this.f29651u.setVisibility(4);
        this.f29650t.startAnimation(scaleAnimation);
        this.f29651u.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.2
            @Override // java.lang.Runnable
            public void run() {
                MBSplashClickView.this.f29651u.startAnimation(scaleAnimation2);
            }
        }, 800L);
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        this.f29650t.startAnimation(scaleAnimation);
    }

    private void e() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(1000L);
        translateAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.3
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(final Animation animation) {
                MBSplashClickView.this.f29650t.setVisibility(4);
                MBSplashClickView.this.f29650t.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MBSplashClickView.this.f29650t.startAnimation(animation);
                    }
                }, 2000L);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                MBSplashClickView.this.f29650t.setVisibility(0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }
        });
        this.f29650t.startAnimation(translateAnimation);
    }

    private void setBgDrawable(int i10) {
        int color = Color.parseColor("#666666");
        int color2 = Color.parseColor("#8FC31F");
        int color3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i10 == 2) {
            gradientDrawable.setColor(color2);
        } else {
            gradientDrawable.setColor(color3);
            gradientDrawable.setStroke(2, color);
        }
        gradientDrawable.setCornerRadius(200);
        setBackground(gradientDrawable);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.f29652v, this.f29654x, 31);
        canvas.drawRoundRect(this.f29652v, 200.0f, 200.0f, this.f29654x);
        canvas.saveLayer(this.f29652v, this.f29653w, 31);
        super.draw(canvas);
        canvas.restore();
    }

    public void initView(String str) {
        this.f29648r = str;
        b();
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBRelativeLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f29649s;
        if (i10 == 2) {
            d();
        } else if (i10 == 1) {
            e();
        } else if (i10 == 3) {
            c();
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBRelativeLayout, android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f29652v.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    private void a() {
        this.f29653w.setAntiAlias(true);
        this.f29653w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f29654x.setAntiAlias(true);
        this.f29654x.setColor(-1);
    }

    private void b() {
        RelativeLayout.LayoutParams layoutParams;
        int identifier;
        View viewA;
        if (!a(this.f29648r)) {
            boolean zContains = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
            if (TextUtils.isEmpty(this.f29648r)) {
                this.f29648r = zContains ? "浏览第三方应用" : "View";
            }
            this.f29649s = 2;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        String string = (viewGroup == null || (viewA = a(viewGroup, "mbridge_expand_data")) == null || !(viewA instanceof TextView)) ? "" : ((TextView) viewA).getText().toString();
        setBgDrawable(this.f29649s);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setText(this.f29648r);
        this.f29650t = new ImageView(getContext());
        int i10 = this.f29649s;
        if (i10 == 2) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_go", "drawable", c.n().i());
            layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 35.0f), v0.a(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = v0.a(getContext(), 10.0f);
        } else if (i10 == 1) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_light", "drawable", c.n().i());
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.leftMargin = 20;
            layoutParams.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = v0.a(getContext(), 50.0f);
            imageView.setImageResource(getResources().getIdentifier("mbridge_splash_btn_arrow_right", "drawable", c.n().i()));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i10 == 3) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_finger", "drawable", c.n().i());
            layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 25.0f), v0.a(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = v0.a(getContext(), 50.0f);
            layoutParams.topMargin = v0.a(getContext(), 18.0f);
            this.f29651u = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(v0.a(getContext(), 30.0f), v0.a(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = v0.a(getContext(), 50.0f);
            layoutParams4.topMargin = v0.a(getContext(), 5.0f);
            this.f29651u.setLayoutParams(layoutParams4);
            this.f29651u.setImageResource(getResources().getIdentifier("mbridge_splash_btn_circle", "drawable", c.n().i()));
            addView(this.f29651u);
        } else {
            layoutParams = null;
            identifier = 0;
        }
        this.f29650t.setLayoutParams(layoutParams);
        if (TextUtils.isEmpty(string)) {
            this.f29650t.setImageResource(identifier);
        } else {
            a(this.f29650t, string, identifier);
        }
        addView(textView);
        addView(this.f29650t);
        invalidate();
    }

    private boolean a(String str) {
        str.getClass();
        switch (str) {
            case "Install":
            case "下载第三方应用":
                this.f29649s = 3;
                return true;
            case "Open":
            case "打开第三方应用":
                this.f29649s = 1;
                return true;
            case "View":
            case "浏览第三方应用":
                this.f29649s = 2;
                return true;
            default:
                return false;
        }
    }

    private void a(final ImageView imageView, String str, final int i10) {
        if (imageView == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                imageView.setBackgroundResource(i10);
            }
            b.a(c.n().d()).a(str, new com.mbridge.msdk.foundation.same.image.c() { // from class: com.mbridge.msdk.dycreator.baseview.MBSplashClickView.4
                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onFailedLoad(String str2, String str3) {
                    ImageView imageView2 = imageView;
                    if (imageView2 != null) {
                        imageView2.setBackgroundResource(i10);
                    }
                }

                @Override // com.mbridge.msdk.foundation.same.image.c
                public void onSuccessLoad(Bitmap bitmap, String str2) {
                    if (imageView != null) {
                        if (bitmap == null || bitmap.isRecycled()) {
                            imageView.setBackgroundResource(i10);
                            return;
                        }
                        if (MBSplashClickView.this.f29651u != null) {
                            MBSplashClickView mBSplashClickView = MBSplashClickView.this;
                            mBSplashClickView.removeView(mBSplashClickView.f29651u);
                        }
                        imageView.setImageBitmap(bitmap);
                    }
                }
            });
        } catch (Exception e10) {
            q0.a("MBSplashClickView", e10.getMessage());
            imageView.setBackgroundResource(i10);
        }
    }

    private View a(ViewGroup viewGroup, String str) {
        if (viewGroup != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (viewGroup.getId() == str.hashCode()) {
                        return viewGroup;
                    }
                    int childCount = viewGroup.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt.getId() == str.hashCode()) {
                            return childAt;
                        }
                        if (childAt instanceof ViewGroup) {
                            a((ViewGroup) childAt, str);
                        }
                    }
                    return null;
                }
            } catch (Exception e10) {
                q0.b("MBSplashClickView", e10.getMessage());
            }
        }
        return null;
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29636f = "浏览第三方应用";
        this.f29637g = "View";
        this.f29638h = "打开第三方应用";
        this.f29639i = "Open";
        this.f29640j = "下载第三方应用";
        this.f29641k = "Install";
        this.f29642l = "mbridge_splash_btn_arrow_right";
        this.f29643m = "mbridge_splash_btn_circle";
        this.f29644n = "mbridge_splash_btn_finger";
        this.f29645o = "mbridge_splash_btn_go";
        this.f29646p = "mbridge_splash_btn_light";
        this.f29647q = "mbridge_expand_data";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f29652v = new RectF();
        this.f29653w = new Paint();
        this.f29654x = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f29636f = "浏览第三方应用";
        this.f29637g = "View";
        this.f29638h = "打开第三方应用";
        this.f29639i = "Open";
        this.f29640j = "下载第三方应用";
        this.f29641k = "Install";
        this.f29642l = "mbridge_splash_btn_arrow_right";
        this.f29643m = "mbridge_splash_btn_circle";
        this.f29644n = "mbridge_splash_btn_finger";
        this.f29645o = "mbridge_splash_btn_go";
        this.f29646p = "mbridge_splash_btn_light";
        this.f29647q = "mbridge_expand_data";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f29652v = new RectF();
        this.f29653w = new Paint();
        this.f29654x = new Paint();
        a();
    }
}
