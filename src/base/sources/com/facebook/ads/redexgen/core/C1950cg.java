package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1950cg extends AnimatorListenerAdapter {
    public final /* synthetic */ C1361Ji A00;
    public final /* synthetic */ boolean A01;

    public C1950cg(C1361Ji c1361Ji, boolean z10) {
        this.A00 = c1361Ji;
        this.A01 = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.A00.A0t(this.A00.A0D, true);
        if (!this.A01 && this.A00.A08 != null) {
            this.A00.A08.destroy();
        }
    }
}
