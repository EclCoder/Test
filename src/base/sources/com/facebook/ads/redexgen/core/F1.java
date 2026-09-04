package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class F1 extends AbstractRunnableC1685Wc {
    public final /* synthetic */ C1245Eu A00;

    public F1(C1245Eu c1245Eu) {
        this.A00 = c1245Eu;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1685Wc
    public final void A07() {
        this.A00.A03.A07();
        this.A00.A04.getEventBus().A04(this.A00.A06, this.A00.A05);
    }
}
