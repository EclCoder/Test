package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class g implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f20377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f20378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float[] f20379c = new float[2];

    public g(View view, View view2) {
        this.f20377a = view;
        this.f20378b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        h.a(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f20379c);
        View view = this.f20377a;
        if (view != null) {
            view.setAlpha(this.f20379c[0]);
        }
        View view2 = this.f20378b;
        if (view2 != null) {
            view2.setAlpha(this.f20379c[1]);
        }
    }
}
