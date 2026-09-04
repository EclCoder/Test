package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LinearGradient f29850e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class GradientAndShadowParameters {
        public int gradientEndColor;
        public int gradientStartColor;
        public int shadowColor;
        public int textSize = 40;
        public float shadowRadius = 3.0f;
        public float shadowDx = 1.5f;
        public float shadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f29846a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f29847b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f29848c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f29849d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    private void a() {
        setTextSize(this.f29849d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f29850e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f29846a, this.f29847b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f29848c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f29850e);
        super.onDraw(canvas);
    }

    public MBGradientAndShadowTextView(Context context, GradientAndShadowParameters gradientAndShadowParameters) {
        super(context);
        this.f29846a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f29847b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f29848c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f29849d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (gradientAndShadowParameters != null) {
            this.f29846a = gradientAndShadowParameters.gradientStartColor;
            this.f29847b = gradientAndShadowParameters.gradientEndColor;
            this.f29848c = gradientAndShadowParameters.shadowColor;
            this.f29849d = gradientAndShadowParameters.textSize;
            this.mShadowRadius = gradientAndShadowParameters.shadowRadius;
            this.mShadowDx = gradientAndShadowParameters.shadowDx;
            this.mShadowDy = gradientAndShadowParameters.shadowDy;
        }
        a();
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29846a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f29847b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f29848c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f29849d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f29846a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f29847b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f29848c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f29849d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f29846a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f29847b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f29848c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f29849d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}
