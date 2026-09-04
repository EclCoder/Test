package com.mbridge.msdk.config.dynamic.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import com.mbridge.msdk.dycreator.baseview.rewardpopview.AcquireRewardPopViewConst;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f29361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private LinearGradient f29362e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f29363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f29364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f29365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f29366d = 40;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f29367e = 3.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f29368f = 1.5f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f29369g = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f29358a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f29359b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f29360c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f29361d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    private void a() {
        setTextSize(this.f29361d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f29362e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f29358a, this.f29359b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f29360c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f29362e);
        super.onDraw(canvas);
    }

    public MBGradientAndShadowTextView(Context context, a aVar) {
        super(context);
        this.f29358a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f29359b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f29360c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f29361d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (aVar != null) {
            this.f29358a = aVar.f29363a;
            this.f29359b = aVar.f29364b;
            this.f29360c = aVar.f29365c;
            this.f29361d = aVar.f29366d;
            this.mShadowRadius = aVar.f29367e;
            this.mShadowDx = aVar.f29368f;
            this.mShadowDy = aVar.f29369g;
        }
        a();
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29358a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f29359b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f29360c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f29361d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f29358a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f29359b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f29360c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f29361d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f29358a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f29359b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f29360c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f29361d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}
