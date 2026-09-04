package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2544mn implements HY {
    public final long A00;
    public final HX A01;

    public C2544mn(long j10) {
        this(j10, 0L);
    }

    public C2544mn(long j10, long j11) {
        this.A00 = j10;
        this.A01 = new HX(j11 == 0 ? HZ.A04 : new HZ(0L, j11));
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final long A7t() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final HX A91(long j10) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final boolean AAj() {
        return false;
    }
}
