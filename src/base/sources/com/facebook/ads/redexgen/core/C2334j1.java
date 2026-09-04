package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2334j1 extends AbstractRunnableC1685Wc {
    public final /* synthetic */ AbstractC2333j0 A00;
    public final /* synthetic */ C1670Vm A01;

    public C2334j1(AbstractC2333j0 abstractC2333j0, C1670Vm c1670Vm) {
        this.A00 = abstractC2333j0;
        this.A01 = c1670Vm;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1685Wc
    public final void A07() {
        this.A00.A0B.A0F().A5g(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
