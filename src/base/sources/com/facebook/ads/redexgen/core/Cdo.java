package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.do, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class Cdo {
    public String A02;
    public String A03;
    public String A04;
    public final NY A06;
    public final C1468Nm A07;
    public final C2198gi A08;
    public C1456Na A01 = C1456Na.A01(null);
    public int A00 = 1000;
    public boolean A05 = false;

    public Cdo(C2198gi c2198gi, NY ny, C1468Nm c1468Nm) {
        this.A08 = c2198gi;
        this.A06 = ny;
        this.A07 = c1468Nm;
    }

    public final Cdo A09(int i10) {
        this.A00 = i10;
        return this;
    }

    public final Cdo A0A(C1456Na c1456Na) {
        this.A01 = c1456Na;
        return this;
    }

    public final Cdo A0B(String str) {
        this.A04 = str;
        return this;
    }

    public final Cdo A0C(String str) {
        this.A02 = str;
        return this;
    }

    public final Cdo A0D(String str) {
        this.A03 = str;
        return this;
    }

    public final Cdo A0E(boolean z10) {
        this.A05 = z10;
        return this;
    }

    public final C2021dq A0F() {
        return new C2021dq(this, null);
    }
}
