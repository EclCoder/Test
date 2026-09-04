package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2241hP extends WP {
    public final /* synthetic */ C2238hM A00;

    public C2241hP(C2238hM c2238hM) {
        this.A00 = c2238hM;
    }

    @Override // com.facebook.ads.redexgen.core.WP
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onAdLoaded(this.A00.A01.A07());
        }
    }
}
