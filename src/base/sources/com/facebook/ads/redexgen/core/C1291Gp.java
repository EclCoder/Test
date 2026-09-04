package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1291Gp implements InterfaceC1737Yf {
    public final /* synthetic */ AbstractC1285Gj A00;

    public C1291Gp(AbstractC1285Gj abstractC1285Gj) {
        this.A00 = abstractC1285Gj;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1737Yf
    public final void AEZ(int i10) {
        this.A00.A0d();
        if (this.A00.A01 != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = i10;
            this.A00.A01.setLayoutParams(layoutParams);
        }
    }
}
