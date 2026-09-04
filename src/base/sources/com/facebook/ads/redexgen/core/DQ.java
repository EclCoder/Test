package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class DQ implements InterfaceC2112fK {
    public ViewPropertyAnimator A00;
    public EnumC2111fJ A01 = EnumC2111fJ.A04;
    public final int A02;
    public final View A03;
    public final boolean A04;

    public DQ(View view, int i10, boolean z10) {
        this.A02 = i10;
        this.A03 = view;
        this.A04 = z10;
    }

    private void A04(boolean z10) {
        this.A01 = EnumC2111fJ.A03;
        if (this.A04) {
            YB.A0L(this.A03);
        }
        if (!z10) {
            this.A03.setAlpha(1.0f);
            this.A01 = EnumC2111fJ.A02;
        } else {
            this.A00 = this.A03.animate().alpha(1.0f).setDuration(this.A02).setListener(new C2116fO(this));
        }
    }

    private void A05(boolean z10) {
        this.A01 = EnumC2111fJ.A05;
        if (!z10) {
            this.A03.setAlpha(0.0f);
            this.A01 = EnumC2111fJ.A04;
        } else {
            this.A00 = this.A03.animate().alpha(0.0f).setDuration(this.A02).setListener(new C2117fP(this));
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2112fK
    public final void A4A(boolean z10, boolean z11) {
        if (z11) {
            A05(z10);
        } else {
            A04(z10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2112fK
    public final EnumC2111fJ A9B() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2112fK
    public final void cancel() {
        this.A03.clearAnimation();
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
