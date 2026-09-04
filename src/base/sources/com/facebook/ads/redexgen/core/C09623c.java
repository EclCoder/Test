package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C09623c extends AbstractC1218Dt {
    public final /* synthetic */ C1206Dh A00;

    public C09623c(C1206Dh c1206Dh) {
        this.A00 = c1206Dh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1219Du c1219Du) {
        if (this.A00.A01 == null || c1219Du.A00().getAction() != 0) {
            return;
        }
        this.A00.A04.removeCallbacksAndMessages(null);
        this.A00.A07(new C2099f7(this));
    }
}
