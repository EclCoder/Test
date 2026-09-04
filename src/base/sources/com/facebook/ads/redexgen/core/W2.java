package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class W2 implements InterfaceC1854b8 {
    public final /* synthetic */ C1682Vz A00;

    public W2(C1682Vz c1682Vz) {
        this.A00 = c1682Vz;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1854b8
    public final void AE7(C1853b7 c1853b7) {
        this.A00.A0G.set(c1853b7.A00() != null);
        if (this.A00.A0H.get() && this.A00.A05 != null) {
            this.A00.A05.AFB(c1853b7.A00() != null);
        }
    }
}
