package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class DA implements InterfaceC2112fK {
    public ValueAnimator A00;
    public EnumC2111fJ A01 = EnumC2111fJ.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    public DA(View view, int i10, int i11, int i12) {
        this.A05 = view;
        this.A02 = i10;
        this.A04 = i11;
        this.A03 = i12;
    }

    private ValueAnimator A00(View view, int i10, int i11) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, i11);
        valueAnimatorOfInt.setDuration(this.A02);
        valueAnimatorOfInt.addUpdateListener(new C2121fT(this, view));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (this.A00 != null) {
            this.A00.removeAllListeners();
            this.A00 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z10) {
        if (z10) {
            this.A01 = EnumC2111fJ.A05;
            this.A00 = A00(this.A05, this.A03, this.A04);
            this.A00.addListener(new C2120fS(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A04);
        YB.A0H(this.A05);
        this.A01 = EnumC2111fJ.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z10) {
        YB.A0L(this.A05);
        if (z10) {
            this.A01 = EnumC2111fJ.A03;
            this.A00 = A00(this.A05, this.A04, this.A03);
            this.A00.addListener(new C2119fR(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A03);
        this.A01 = EnumC2111fJ.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2112fK
    public final void A4A(boolean z10, boolean z11) {
        if (z11) {
            A08(z10);
        } else {
            A09(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2112fK
    public final EnumC2111fJ A9B() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2112fK
    public final void cancel() {
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
