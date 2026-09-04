package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class K6 extends AbstractRunnableC1685Wc {
    public final /* synthetic */ C1361Ji A00;
    public final /* synthetic */ boolean A01;

    public K6(C1361Ji c1361Ji, boolean z10) {
        this.A00 = c1361Ji;
        this.A01 = z10;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1685Wc
    public final void A07() {
        AbstractC1733Yb abstractC1733YbA0B = this.A00.A0b.A0B();
        if (abstractC1733YbA0B == null) {
            return;
        }
        abstractC1733YbA0B.setPageDetailsVisible((this.A01 || abstractC1733YbA0B.A0E()) ? false : true);
        abstractC1733YbA0B.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
