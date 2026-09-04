package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1699Wr extends AbstractRunnableC1685Wc {
    public final /* synthetic */ Wm A00;

    public C1699Wr(Wm wm2) {
        this.A00 = wm2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1685Wc
    public final void A07() throws Exception {
        Wm.A00(this.A00);
        if (this.A00.A01 > 0) {
            try {
                Thread.sleep(this.A00.A01);
            } catch (InterruptedException unused) {
            }
        }
        this.A00.A0B();
    }
}
