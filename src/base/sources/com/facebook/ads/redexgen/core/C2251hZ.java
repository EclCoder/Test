package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2251hZ extends R7 {
    public boolean A00 = false;
    public final /* synthetic */ AbstractC2246hU A01;

    public C2251hZ(AbstractC2246hU abstractC2246hU) {
        this.A01 = abstractC2246hU;
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public final void A0L(C7M c7m, int i10) {
        super.A0L(c7m, i10);
        if (i10 == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.core.R7
    public final void A0M(C7M c7m, int i10, int i11) {
        if (i10 != 0 || i11 != 0) {
            this.A00 = true;
        }
    }
}
