package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2556n0 implements HY {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final InterfaceC1299Gx A06;

    public C2556n0(InterfaceC1299Gx interfaceC1299Gx, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.A06 = interfaceC1299Gx;
        this.A03 = j10;
        this.A05 = j11;
        this.A02 = j12;
        this.A04 = j13;
        this.A01 = j14;
        this.A00 = j15;
    }

    public final long A05(long j10) {
        return this.A06.AKQ(j10);
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final long A7t() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final HX A91(long j10) {
        return new HX(new HZ(j10, C1298Gw.A05(this.A06.AKQ(j10), this.A05, this.A02, this.A04, this.A01, this.A00)));
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final boolean AAj() {
        return true;
    }
}
