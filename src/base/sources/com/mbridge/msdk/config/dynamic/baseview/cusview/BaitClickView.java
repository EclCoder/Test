package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class BaitClickView extends ComponentRelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f29238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f29239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f29240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f29241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f29242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f29243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f29246i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Animation f29247j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Animation f29248k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Animation f29249l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Animation f29250m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f29251a;

        a(int i10) {
            this.f29251a = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            BaitClickView.this.f29239b.setImageResource(this.f29251a);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap.isRecycled()) {
                return;
            }
            BaitClickView.this.f29239b.setImageBitmap(bitmap);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements com.mbridge.msdk.foundation.same.image.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f29253a;

        b(int i10) {
            this.f29253a = i10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            BaitClickView.this.f29238a.setImageResource(this.f29253a);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap.isRecycled()) {
                return;
            }
            BaitClickView.this.f29238a.setImageBitmap(bitmap);
        }
    }

    public BaitClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29241d = "";
        this.f29242e = "";
        this.f29243f = "Click now for details";
        this.f29244g = 1;
        this.f29245h = 1342177280;
        this.f29246i = 0;
    }

    private void d() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f29247j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f29247j.setRepeatCount(-1);
        this.f29247j.setRepeatMode(2);
        ImageView imageView = this.f29238a;
        if (imageView != null) {
            imageView.startAnimation(this.f29247j);
        }
    }

    private void e() {
        ImageView imageView = this.f29239b;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f29247j = scaleAnimation;
        scaleAnimation.setDuration(500L);
        this.f29247j.setRepeatCount(1);
        this.f29247j.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        this.f29248k = scaleAnimation2;
        scaleAnimation2.setDuration(1000L);
        this.f29248k.setRepeatCount(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f29249l = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f29249l.setRepeatCount(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f29248k);
        animationSet.addAnimation(this.f29249l);
        this.f29248k.setAnimationListener(new c());
        this.f29247j.setAnimationListener(new d(animationSet));
        ImageView imageView2 = this.f29238a;
        if (imageView2 != null) {
            imageView2.startAnimation(this.f29247j);
        }
    }

    private void getDefaultClickText() {
        try {
            this.f29243f = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
        } catch (Throwable th2) {
            q0.b("BaitClickView", th2.getMessage());
        }
    }

    public void init(int i10) {
        this.f29244g = i10;
        init();
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f29247j;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f29248k;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f29249l;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f29250m;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, com.mbridge.msdk.config.dynamic.baseview.inter.a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(strValueOf) && strValueOf.equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get("radius");
            if (obj instanceof String) {
                this.f29246i = Integer.parseInt(obj.toString());
            }
            init();
        } catch (Exception e10) {
            q0.b("BaitClickView", e10.getMessage());
        }
    }

    public void startAnimation() {
        int i10 = this.f29244g;
        if (i10 == 2) {
            this.f29239b.setVisibility(4);
            d();
            return;
        }
        if (i10 == 3) {
            e();
            return;
        }
        if (i10 == 4) {
            this.f29239b.setVisibility(4);
            a();
        } else if (i10 != 5) {
            b();
        } else {
            c();
        }
    }

    private void a() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        this.f29247j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f29247j.setRepeatCount(1);
        this.f29247j.setAnimationListener(new e());
        ImageView imageView = this.f29238a;
        if (imageView != null) {
            imageView.startAnimation(this.f29247j);
        }
    }

    private void b() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f29247j = scaleAnimation;
        scaleAnimation.setDuration(200L);
        this.f29247j.setRepeatCount(-1);
        this.f29247j.setRepeatMode(2);
        ImageView imageView = this.f29238a;
        if (imageView != null) {
            imageView.startAnimation(this.f29247j);
        }
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f29248k = scaleAnimation2;
        scaleAnimation2.setDuration(400L);
        this.f29248k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
        this.f29249l = alphaAnimation;
        alphaAnimation.setDuration(400L);
        this.f29249l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f29248k);
        animationSet.addAnimation(this.f29249l);
        ImageView imageView2 = this.f29239b;
        if (imageView2 != null) {
            imageView2.startAnimation(animationSet);
        }
    }

    private void c() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
        this.f29250m = rotateAnimation;
        rotateAnimation.setDuration(300L);
        this.f29250m.setRepeatMode(2);
        this.f29250m.setRepeatCount(-1);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
        this.f29248k = scaleAnimation;
        scaleAnimation.setDuration(600L);
        this.f29248k.setRepeatCount(-1);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        this.f29249l = alphaAnimation;
        alphaAnimation.setDuration(600L);
        this.f29249l.setRepeatCount(-1);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(this.f29248k);
        animationSet.addAnimation(this.f29249l);
        ImageView imageView = this.f29238a;
        if (imageView != null) {
            imageView.startAnimation(this.f29250m);
        }
        ImageView imageView2 = this.f29239b;
        if (imageView2 != null) {
            imageView2.startAnimation(animationSet);
        }
    }

    public void init(int i10, int i11) {
        this.f29245h = i10;
        this.f29244g = i11;
        init();
    }

    public void init(int i10, int i11, String str, String str2, String str3) {
        this.f29245h = i10;
        this.f29244g = i11;
        this.f29241d = str;
        this.f29242e = str2;
        this.f29243f = str3;
        init();
    }

    public void init() {
        try {
            if (this.f29246i == 0) {
                setBackgroundColor(this.f29245h);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(this.f29245h);
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(v0.a(getContext(), this.f29246i));
                setBackground(gradientDrawable);
            }
            getDefaultClickText();
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            int iA = v0.a(getContext(), 55.0f);
            int iA2 = v0.a(getContext(), 33.0f);
            this.f29239b = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, iA);
            layoutParams.setMargins(iA2, iA2, 0, 0);
            this.f29239b.setLayoutParams(layoutParams);
            int iA3 = i0.a(getContext(), "mbridge_icon_click_circle", "drawable");
            if (TextUtils.isEmpty(this.f29242e)) {
                this.f29239b.setImageResource(iA3);
            } else {
                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f29241d, new a(iA3));
            }
            int iA4 = v0.a(getContext(), 108.0f);
            int iA5 = v0.a(getContext(), 35.0f);
            int iA6 = v0.a(getContext(), 43.0f);
            this.f29238a = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iA4, iA4);
            layoutParams2.setMargins(iA5, iA6, 0, 0);
            this.f29238a.setLayoutParams(layoutParams2);
            int iA7 = i0.a(getContext(), "mbridge_icon_click_hand", "drawable");
            if (TextUtils.isEmpty(this.f29241d)) {
                this.f29238a.setImageResource(iA7);
            } else {
                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.f29241d, new b(iA7));
            }
            relativeLayout.addView(this.f29239b);
            relativeLayout.addView(this.f29238a);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(relativeLayout);
            this.f29240c = new TextView(getContext());
            this.f29240c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.f29240c.setText(this.f29243f);
            this.f29240c.setTextColor(-1);
            this.f29240c.setGravity(14);
            linearLayout.addView(this.f29240c);
            addView(linearLayout);
        } catch (Throwable th2) {
            q0.b("BaitClickView", th2.getMessage());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Animation.AnimationListener {
        c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (BaitClickView.this.f29239b != null) {
                BaitClickView.this.f29239b.setVisibility(4);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (BaitClickView.this.f29239b != null) {
                BaitClickView.this.f29239b.setVisibility(0);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AnimationSet f29256a;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f29239b != null) {
                    BaitClickView.this.f29239b.startAnimation(d.this.f29256a);
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f29238a != null) {
                    BaitClickView.this.f29238a.startAnimation(BaitClickView.this.f29247j);
                }
            }
        }

        d(AnimationSet animationSet) {
            this.f29256a = animationSet;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            BaitClickView.this.postDelayed(new b(), 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            BaitClickView.this.postDelayed(new a(), 550L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements Animation.AnimationListener {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (BaitClickView.this.f29238a != null) {
                    BaitClickView.this.f29238a.startAnimation(BaitClickView.this.f29247j);
                }
            }
        }

        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            BaitClickView.this.postDelayed(new a(), 1000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
