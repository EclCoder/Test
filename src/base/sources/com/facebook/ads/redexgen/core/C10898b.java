package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C10898b implements InterfaceC2522mF {
    public long A00;
    public final long A01;
    public final C09914h A03 = new C09914h();
    public final C09914h A02 = new C09914h();

    public C10898b(long j10, long j11, long j12) {
        this.A00 = j10;
        this.A01 = j12;
        this.A03.A04(0L);
        this.A02.A04(j11);
    }

    public final void A00(long j10) {
        this.A00 = j10;
    }

    public final void A01(long j10, long j11) {
        if (A02(j10)) {
            return;
        }
        this.A03.A04(j10);
        this.A02.A04(j11);
    }

    public final boolean A02(long j10) {
        long lastIndexedTimeUs = this.A03.A03(this.A03.A02() - 1);
        return j10 - lastIndexedTimeUs < 100000;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2522mF
    public final long A7j() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final long A7t() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final HX A91(long j10) {
        int iA0C = C5C.A0C(this.A03, j10, true, true);
        HZ hz = new HZ(this.A03.A03(iA0C), this.A02.A03(iA0C));
        if (hz.A01 != j10) {
            int targetIndex = this.A03.A02();
            if (iA0C != targetIndex - 1) {
                int targetIndex2 = iA0C + 1;
                long jA03 = this.A03.A03(targetIndex2);
                int targetIndex3 = iA0C + 1;
                HZ nextSeekPoint = new HZ(jA03, this.A02.A03(targetIndex3));
                return new HX(hz, nextSeekPoint);
            }
        }
        return new HX(hz);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2522mF
    public final long A9H(long j10) {
        return this.A03.A03(C5C.A0C(this.A02, j10, true, true));
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final boolean AAj() {
        return true;
    }
}
