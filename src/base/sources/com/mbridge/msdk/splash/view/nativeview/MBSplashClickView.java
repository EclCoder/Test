package com.mbridge.msdk.splash.view.nativeview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBSplashClickView extends RelativeLayout {
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f32909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f32910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f32911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f32912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f32913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f32914i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f32915j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f32916k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f32917l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f32918m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ImageView f32919n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ImageView f32920o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final RectF f32921p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Paint f32922q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Paint f32923r;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f32927a;

        b(ScaleAnimation scaleAnimation) {
            this.f32927a = scaleAnimation;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBSplashClickView.this.f32920o.startAnimation(this.f32927a);
        }
    }

    public MBSplashClickView(Context context) {
        super(context);
        this.f32906a = "浏览第三方应用";
        this.f32907b = "View";
        this.f32908c = "打开第三方应用";
        this.f32909d = "Open";
        this.f32910e = "下载第三方应用";
        this.f32911f = "Install";
        this.f32912g = "mbridge_splash_btn_arrow_right";
        this.f32913h = "mbridge_splash_btn_circle";
        this.f32914i = "mbridge_splash_btn_finger";
        this.f32915j = "mbridge_splash_btn_go";
        this.f32916k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f32921p = new RectF();
        this.f32922q = new Paint();
        this.f32923r = new Paint();
        a();
    }

    private void c() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(400L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(200L);
        scaleAnimation2.setAnimationListener(new a(scaleAnimation2));
        this.f32920o.setVisibility(4);
        this.f32919n.startAnimation(scaleAnimation);
        this.f32920o.postDelayed(new b(scaleAnimation2), 500L);
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        this.f32919n.startAnimation(scaleAnimation);
    }

    private void e() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(1000L);
        translateAnimation.setAnimationListener(new c());
        this.f32919n.startAnimation(translateAnimation);
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
        canvas.saveLayer(this.f32921p, this.f32923r, 31);
        canvas.drawRoundRect(this.f32921p, 200.0f, 200.0f, this.f32923r);
        canvas.saveLayer(this.f32921p, this.f32922q, 31);
        super.draw(canvas);
        canvas.restore();
    }

    public void initView(String str) {
        this.f32917l = str;
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f32918m;
        if (i10 == 2) {
            d();
        } else if (i10 == 1) {
            e();
        } else if (i10 == 3) {
            c();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f32921p.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    private void a() {
        this.f32922q.setAntiAlias(true);
        this.f32922q.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f32923r.setAntiAlias(true);
        this.f32923r.setColor(-1);
    }

    private void b() {
        RelativeLayout.LayoutParams layoutParams;
        int identifier;
        if (!a(this.f32917l)) {
            boolean zContains = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
            if (TextUtils.isEmpty(this.f32917l)) {
                this.f32917l = zContains ? "浏览第三方应用" : "View";
            }
            this.f32918m = 2;
        }
        setBgDrawable(this.f32918m);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(15);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setText(this.f32917l);
        this.f32919n = new ImageView(getContext());
        int i10 = this.f32918m;
        if (i10 == 2) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_go", "drawable", com.mbridge.msdk.foundation.controller.c.n().i());
            layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 35.0f), v0.a(getContext(), 35.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(15);
            layoutParams.rightMargin = v0.a(getContext(), 10.0f);
        } else if (i10 == 1) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_light", "drawable", com.mbridge.msdk.foundation.controller.c.n().i());
            layoutParams = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams.leftMargin = 20;
            layoutParams.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = v0.a(getContext(), 50.0f);
            imageView.setImageResource(getResources().getIdentifier("mbridge_splash_btn_arrow_right", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i10 == 3) {
            identifier = getResources().getIdentifier("mbridge_splash_btn_finger", "drawable", com.mbridge.msdk.foundation.controller.c.n().i());
            layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 25.0f), v0.a(getContext(), 25.0f));
            layoutParams.addRule(11);
            layoutParams.rightMargin = v0.a(getContext(), 50.0f);
            layoutParams.topMargin = v0.a(getContext(), 18.0f);
            this.f32920o = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(v0.a(getContext(), 30.0f), v0.a(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = v0.a(getContext(), 50.0f);
            layoutParams4.topMargin = v0.a(getContext(), 5.0f);
            this.f32920o.setLayoutParams(layoutParams4);
            this.f32920o.setImageResource(getResources().getIdentifier("mbridge_splash_btn_circle", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
            addView(this.f32920o);
        } else {
            layoutParams = null;
            identifier = 0;
        }
        this.f32919n.setLayoutParams(layoutParams);
        this.f32919n.setImageResource(identifier);
        addView(textView);
        addView(this.f32919n);
        invalidate();
    }

    private boolean a(String str) {
        str.getClass();
        switch (str) {
            case "Install":
            case "下载第三方应用":
                this.f32918m = 3;
                return true;
            case "Open":
            case "打开第三方应用":
                this.f32918m = 1;
                return true;
            case "View":
            case "浏览第三方应用":
                this.f32918m = 2;
                return true;
            default:
                return false;
        }
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32906a = "浏览第三方应用";
        this.f32907b = "View";
        this.f32908c = "打开第三方应用";
        this.f32909d = "Open";
        this.f32910e = "下载第三方应用";
        this.f32911f = "Install";
        this.f32912g = "mbridge_splash_btn_arrow_right";
        this.f32913h = "mbridge_splash_btn_circle";
        this.f32914i = "mbridge_splash_btn_finger";
        this.f32915j = "mbridge_splash_btn_go";
        this.f32916k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f32921p = new RectF();
        this.f32922q = new Paint();
        this.f32923r = new Paint();
        a();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScaleAnimation f32924a;

        /* JADX INFO: renamed from: com.mbridge.msdk.splash.view.nativeview.MBSplashClickView$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class RunnableC0455a implements Runnable {
            RunnableC0455a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                MBSplashClickView.this.f32920o.startAnimation(a.this.f32924a);
            }
        }

        a(ScaleAnimation scaleAnimation) {
            this.f32924a = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.f32920o.setVisibility(4);
            MBSplashClickView.this.f32920o.postDelayed(new RunnableC0455a(), 700L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f32920o.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Animation.AnimationListener {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Animation f32930a;

            a(Animation animation) {
                this.f32930a = animation;
            }

            @Override // java.lang.Runnable
            public void run() {
                MBSplashClickView.this.f32919n.startAnimation(this.f32930a);
            }
        }

        c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.f32919n.setVisibility(4);
            MBSplashClickView.this.f32919n.postDelayed(new a(animation), 2000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            MBSplashClickView.this.f32919n.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f32906a = "浏览第三方应用";
        this.f32907b = "View";
        this.f32908c = "打开第三方应用";
        this.f32909d = "Open";
        this.f32910e = "下载第三方应用";
        this.f32911f = "Install";
        this.f32912g = "mbridge_splash_btn_arrow_right";
        this.f32913h = "mbridge_splash_btn_circle";
        this.f32914i = "mbridge_splash_btn_finger";
        this.f32915j = "mbridge_splash_btn_go";
        this.f32916k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f32921p = new RectF();
        this.f32922q = new Paint();
        this.f32923r = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f32906a = "浏览第三方应用";
        this.f32907b = "View";
        this.f32908c = "打开第三方应用";
        this.f32909d = "Open";
        this.f32910e = "下载第三方应用";
        this.f32911f = "Install";
        this.f32912g = "mbridge_splash_btn_arrow_right";
        this.f32913h = "mbridge_splash_btn_circle";
        this.f32914i = "mbridge_splash_btn_finger";
        this.f32915j = "mbridge_splash_btn_go";
        this.f32916k = "mbridge_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.f32921p = new RectF();
        this.f32922q = new Paint();
        this.f32923r = new Paint();
    }
}
