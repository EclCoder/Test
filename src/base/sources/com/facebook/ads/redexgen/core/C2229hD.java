package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2229hD implements XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C2228hC A01;

    public C2229hD(C2228hC c2228hC, int i10) {
        this.A01 = c2228hC;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void ADS() {
        this.A01.A0C.A0F().ABa();
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void AFV(float f10) {
        float f11 = 1.0f - (f10 / this.A00);
        if (this.A01.A0G != null) {
            this.A01.A0G.setProgressWithAnimation(100.0f * f11);
        }
    }
}
