package com.facebook.ads.redexgen.core;

import android.animation.Animator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2118fQ implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ DB A02;

    public C2118fQ(DB db2, int i10, int i11) {
        this.A02 = db2;
        this.A01 = i10;
        this.A00 = i11;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A02.A07(this.A00, this.A01, false);
        if (this.A02.A00 != null) {
            this.A02.A00.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        EnumC2111fJ enumC2111fJ;
        DB db2 = this.A02;
        if (this.A01 == this.A02.A04) {
            enumC2111fJ = EnumC2111fJ.A02;
        } else {
            enumC2111fJ = EnumC2111fJ.A04;
        }
        db2.A01 = enumC2111fJ;
        if (this.A02.A00 != null) {
            this.A02.A00.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
