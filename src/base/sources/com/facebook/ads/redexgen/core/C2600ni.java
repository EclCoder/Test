package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2600ni implements InterfaceC1250Ez {
    public long A00;
    public long A01;
    public C2600ni A02;
    public C1249Ey A03;

    public C2600ni(long j10, int i10) {
        A02(j10, i10);
    }

    public final int A00(long j10) {
        return ((int) (j10 - this.A01)) + this.A03.A00;
    }

    public final C2600ni A01() {
        this.A03 = null;
        C2600ni c2600ni = this.A02;
        this.A02 = null;
        return c2600ni;
    }

    public final void A02(long j10, int i10) {
        AbstractC09823y.A08(this.A03 == null);
        this.A01 = j10;
        this.A00 = ((long) i10) + j10;
    }

    public final void A03(C1249Ey c1249Ey, C2600ni c2600ni) {
        this.A03 = c1249Ey;
        this.A02 = c2600ni;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1250Ez
    public final C1249Ey A6u() {
        return (C1249Ey) AbstractC09823y.A01(this.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1250Ez
    public final C2600ni ACc() {
        if (this.A02 == null || this.A02.A03 == null) {
            return null;
        }
        return this.A02;
    }
}
