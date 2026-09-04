package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1598Sr extends AbstractRunnableC1685Wc {
    public final /* synthetic */ long A00;
    public final /* synthetic */ WA A01;
    public final /* synthetic */ WD A02;
    public final /* synthetic */ String A03;

    public C1598Sr(WD wd2, String str, long j10, WA wa2) {
        this.A02 = wd2;
        this.A03 = str;
        this.A00 = j10;
        this.A01 = wa2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1685Wc
    public final void A07() {
        this.A02.A0N(this.A03, this.A00, this.A01);
    }
}
