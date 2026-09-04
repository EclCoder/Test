package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class F8 implements InterfaceC2168gE {
    public final /* synthetic */ C2066ea A00;

    public F8(C2066ea c2066ea) {
        this.A00 = c2066ea;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2168gE
    public final void AHA() {
        if (this.A00.A02 != null) {
            this.A00.A02.A4j(this.A00.A03.A94());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2168gE
    public final void AHC(C2170gG c2170gG) {
        if (this.A00.A02 == null) {
            return;
        }
        if (c2170gG == null || !c2170gG.A00()) {
            this.A00.A01.A0F().ABv();
            this.A00.A02.A4j(this.A00.A03.A94());
        } else {
            this.A00.A01.A0F().ABw();
            this.A00.A02.A4j(this.A00.A03.A95());
        }
    }
}
