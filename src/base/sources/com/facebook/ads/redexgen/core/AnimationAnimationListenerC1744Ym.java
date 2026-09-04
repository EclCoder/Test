package com.facebook.ads.redexgen.core;

import android.view.animation.Animation;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class AnimationAnimationListenerC1744Ym implements Animation.AnimationListener {
    public final /* synthetic */ ViewOnClickListenerC10596x A00;

    public AnimationAnimationListenerC1744Ym(ViewOnClickListenerC10596x viewOnClickListenerC10596x) {
        this.A00 = viewOnClickListenerC10596x;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        ((PZ) this.A00).A08.finish(16);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
