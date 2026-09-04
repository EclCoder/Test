package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.77, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass77 extends C2244hS {
    public AnonymousClass77(C1560Re c1560Re) {
        super(c1560Re);
    }

    @Override // com.facebook.ads.redexgen.core.C2244hS, com.facebook.ads.redexgen.core.InterfaceC1739Yh
    public final /* bridge */ /* synthetic */ void A44(View view, int i10, RelativeLayout.LayoutParams layoutParams) {
        super.A44(view, i10, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.C2244hS, com.facebook.ads.redexgen.core.InterfaceC1739Yh
    public final /* bridge */ /* synthetic */ void A45(View view, RelativeLayout.LayoutParams layoutParams) {
        super.A45(view, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.C2244hS, com.facebook.ads.redexgen.core.InterfaceC1739Yh
    public final void A4j(String str) {
        super.A4j(str);
        if (this.A00.get() == null) {
            return;
        }
        String strA03 = EnumC2091ez.A08.A03();
        String rewardedVideoError = EnumC2091ez.A09.A03();
        if (str.equals(strA03)) {
            this.A00.get().finish(11);
        } else if (str.equals(rewardedVideoError)) {
            this.A00.get().finish(12);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C2244hS, com.facebook.ads.redexgen.core.InterfaceC1739Yh
    public final /* bridge */ /* synthetic */ void A4k(String str, UL ul2) {
        super.A4k(str, ul2);
    }

    @Override // com.facebook.ads.redexgen.core.C2244hS, com.facebook.ads.redexgen.core.InterfaceC1739Yh
    public final /* bridge */ /* synthetic */ void AAo(String str, C1468Nm c1468Nm) {
        super.AAo(str, c1468Nm);
    }

    @Override // com.facebook.ads.redexgen.core.C2244hS, com.facebook.ads.redexgen.core.InterfaceC1739Yh
    public final /* bridge */ /* synthetic */ void ADJ(int i10) {
        super.ADJ(i10);
    }
}
