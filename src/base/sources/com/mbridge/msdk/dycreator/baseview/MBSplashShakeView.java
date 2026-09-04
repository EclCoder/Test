package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c1.pGX.geAgcEazw;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class MBSplashShakeView extends MBLinearLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f29666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f29667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f29668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f29669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f29670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f29671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ImageView f29672l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Animation f29673m;

    public MBSplashShakeView(Context context) {
        super(context);
        this.f29666f = "浏览第三方应用";
        this.f29667g = "View";
        this.f29668h = "打开第三方应用";
        this.f29669i = "Open";
        this.f29670j = "下载第三方应用";
        this.f29671k = "Install";
    }

    private String a(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String str2 = geAgcEazw.WyKESAdhdfSydzK;
        if (!zIsEmpty) {
            str.getClass();
            byte b10 = -1;
            switch (str.hashCode()) {
                case -672744069:
                    if (str.equals("Install")) {
                        b10 = 0;
                    }
                    break;
                case 2464362:
                    if (str.equals("Open")) {
                        b10 = 1;
                    }
                    break;
                case 2666181:
                    if (str.equals(str2)) {
                        b10 = 2;
                    }
                    break;
                case 855294846:
                    if (str.equals("下载第三方应用")) {
                        b10 = 3;
                    }
                    break;
                case 1383132195:
                    if (str.equals("打开第三方应用")) {
                        b10 = 4;
                    }
                    break;
                case 1681333335:
                    if (str.equals("浏览第三方应用")) {
                        b10 = 5;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return str;
            }
        }
        return getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "浏览第三方应用" : str2;
    }

    private void setBgDrawable(View view) {
        int color = Color.parseColor("#60000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(200);
        view.setBackground(gradientDrawable);
    }

    public void initView(String str) {
        setOrientation(1);
        setGravity(1);
        View imageView = new ImageView(getContext());
        imageView.setLayoutParams(new LinearLayout.LayoutParams(v0.a(getContext(), 80.0f), v0.a(getContext(), 80.0f)));
        setBgDrawable(imageView);
        this.f29672l = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(v0.a(getContext(), 40.0f), v0.a(getContext(), 40.0f));
        layoutParams.gravity = 17;
        this.f29672l.setLayoutParams(layoutParams);
        this.f29672l.setImageResource(getResources().getIdentifier("mbridge_cm_btn_shake", "drawable", c.n().i()));
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        frameLayout.addView(imageView);
        frameLayout.addView(this.f29672l);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = v0.a(getContext(), 10.0f);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setText("Shake your phone");
        textView.setTextSize(16.0f);
        textView.setTextColor(-1);
        String strA = a(str);
        TextView textView2 = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = v0.a(getContext(), 5.0f);
        textView2.setLayoutParams(layoutParams3);
        textView2.setGravity(17);
        textView2.setText(strA);
        textView2.setTextSize(12.0f);
        textView2.setTextColor(-1);
        addView(frameLayout);
        addView(textView);
        addView(textView2);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBLinearLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f29672l != null) {
            a();
        }
    }

    private void a() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 10.0f, 1, 0.5f, 1, 0.5f);
        this.f29673m = rotateAnimation;
        rotateAnimation.setDuration(100L);
        this.f29673m.setRepeatMode(2);
        this.f29673m.setRepeatCount(-1);
        this.f29672l.startAnimation(this.f29673m);
    }

    public MBSplashShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29666f = "浏览第三方应用";
        this.f29667g = "View";
        this.f29668h = "打开第三方应用";
        this.f29669i = "Open";
        this.f29670j = "下载第三方应用";
        this.f29671k = "Install";
    }

    public MBSplashShakeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f29666f = "浏览第三方应用";
        this.f29667g = "View";
        this.f29668h = "打开第三方应用";
        this.f29669i = "Open";
        this.f29670j = "下载第三方应用";
        this.f29671k = "Install";
    }
}
