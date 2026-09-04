package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1390Kl extends AbstractRunnableC1685Wc {
    public final /* synthetic */ AbstractC1883bb A00;

    public C1390Kl(AbstractC1883bb abstractC1883bb) {
        this.A00 = abstractC1883bb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1685Wc
    public final void A07() {
        this.A00.setPressed(false);
        this.A00.postOnAnimationDelayed(this.A00.A09, this.A00.A08);
    }
}
