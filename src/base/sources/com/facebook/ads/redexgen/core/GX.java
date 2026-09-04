package com.facebook.ads.redexgen.core;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class GX extends AbstractRunnableC1685Wc {
    public final /* synthetic */ InterfaceC2020dp A00;
    public final /* synthetic */ C2021dq A01;

    public GX(C2021dq c2021dq, InterfaceC2020dp interfaceC2020dp) {
        this.A01 = c2021dq;
        this.A00 = interfaceC2020dp;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1685Wc
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new GY(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
