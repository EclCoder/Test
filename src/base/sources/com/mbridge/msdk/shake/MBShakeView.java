package com.mbridge.msdk.shake;

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
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBShakeView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Animation f32539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f32540b;

    public MBShakeView(Context context) {
        super(context);
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "浏览第三方应用" : "Redirect to third party application";
        }
        return str;
    }

    private void setBgDrawable(View view) {
        int color = Color.parseColor("#80000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(200);
        view.setBackground(gradientDrawable);
    }

    public void initView(String str) {
        initView(str, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    public MBShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void initView(String str, boolean z10) {
        setOrientation(1);
        setGravity(1);
        View imageView = new ImageView(getContext());
        imageView.setLayoutParams(new LinearLayout.LayoutParams(v0.a(getContext(), z10 ? 60.0f : 80.0f), v0.a(getContext(), z10 ? 60.0f : 80.0f)));
        setBgDrawable(imageView);
        this.f32540b = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(v0.a(getContext(), z10 ? 20.0f : 40.0f), v0.a(getContext(), z10 ? 20.0f : 40.0f));
        layoutParams.gravity = 17;
        this.f32540b.setLayoutParams(layoutParams);
        this.f32540b.setImageResource(getResources().getIdentifier("mbridge_cm_btn_shake", "drawable", c.n().i()));
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        frameLayout.addView(imageView);
        frameLayout.addView(this.f32540b);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = v0.a(getContext(), 10.0f);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        if (getContext().getResources().getConfiguration().locale.getLanguage().contains("zh")) {
            textView.setText("摇动手机 或 点击图标");
        } else {
            textView.setText("Shake your phone");
        }
        textView.setTextSize(z10 ? 16.0f : 20.0f);
        textView.setTextColor(-1);
        textView.setShadowLayer(8.0f, 3.0f, 3.0f, -16777216);
        String strA = a(str);
        TextView textView2 = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = v0.a(getContext(), 5.0f);
        textView2.setLayoutParams(layoutParams3);
        textView2.setGravity(17);
        textView2.setText(strA);
        textView2.setTextSize(z10 ? 12.0f : 16.0f);
        textView2.setTextColor(-1);
        textView2.setShadowLayer(8.0f, 3.0f, 3.0f, -16777216);
        addView(frameLayout);
        addView(textView);
        addView(textView2);
    }

    public MBShakeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    public MBShakeView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    private void a() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 10.0f, 1, 0.5f, 1, 0.5f);
        this.f32539a = rotateAnimation;
        rotateAnimation.setDuration(100L);
        this.f32539a.setRepeatMode(2);
        this.f32539a.setRepeatCount(-1);
        this.f32540b.startAnimation(this.f32539a);
    }
}
