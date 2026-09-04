package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1436Mf {
    public final long A00;
    public final long A01;

    public C1436Mf(long j10, long j11) {
        this.A01 = j10;
        this.A00 = j11;
    }

    public final boolean A00(long j10, long j11) {
        if (this.A00 == -1) {
            return j10 >= this.A01;
        }
        return j11 != -1 && this.A01 <= j10 && j10 + j11 <= this.A01 + this.A00;
    }

    public final boolean A01(long j10, long j11) {
        if (this.A01 <= j10) {
            return this.A00 == -1 || this.A01 + this.A00 > j10;
        }
        return j11 == -1 || j10 + j11 > this.A01;
    }
}
