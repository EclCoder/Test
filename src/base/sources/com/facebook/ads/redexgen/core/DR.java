package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class DR implements InterfaceC2112fK {
    public int A00;
    public ValueAnimator A01;
    public EnumC2111fJ A02 = EnumC2111fJ.A04;
    public final int A03;
    public final int A04;
    public final View A05;

    public DR(View view, int i10, int i11, int i12) {
        this.A05 = view;
        this.A03 = i10;
        this.A00 = i11;
        this.A04 = i12;
    }

    private ValueAnimator A00(int i10, int i11, View view) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, i11);
        valueAnimatorOfInt.setDuration(this.A03);
        valueAnimatorOfInt.addUpdateListener(new C2115fN(this, view));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z10) {
        if (z10) {
            this.A02 = EnumC2111fJ.A05;
            this.A01 = A00(this.A00, this.A04, this.A05);
            this.A01.addListener(new C2114fM(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        YB.A0H(this.A05);
        this.A02 = EnumC2111fJ.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z10) {
        YB.A0L(this.A05);
        if (z10) {
            this.A02 = EnumC2111fJ.A03;
            this.A01 = A00(this.A04, this.A00, this.A05);
            this.A01.addListener(new C2113fL(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = EnumC2111fJ.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2112fK
    public final void A4A(boolean z10, boolean z11) {
        if (z11) {
            A07(z10);
        } else {
            A08(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2112fK
    public final EnumC2111fJ A9B() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2112fK
    public final void cancel() {
        if (this.A01 != null) {
            this.A01.cancel();
        }
    }
}
