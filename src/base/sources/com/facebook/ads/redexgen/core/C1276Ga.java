package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1276Ga extends AbstractRunnableC1685Wc {
    public final /* synthetic */ C10074x A00;

    public C1276Ga(C10074x c10074x) {
        this.A00 = c10074x;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1685Wc
    public final void A07() {
        if (this.A00.A00 != null) {
            this.A00.A00.A1F();
        }
        this.A00.A09.setToolbarActionMode(this.A00.getCloseButtonStyle());
        this.A00.A09.A0A();
        this.A00.A06.set(true);
    }
}
