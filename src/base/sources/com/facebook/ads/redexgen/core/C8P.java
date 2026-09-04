package com.facebook.ads.redexgen.core;

import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8P, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class C8P extends AbstractC2678oz implements InterfaceC1362Jj {
    public long A00;
    public InterfaceC1362Jj A01;

    @Override // com.facebook.ads.redexgen.core.AbstractC2678oz
    public abstract void A0B();

    @Override // com.facebook.ads.redexgen.core.AbstractC10305u
    public final void A0A() {
        super.A0A();
        this.A01 = null;
    }

    public final void A0C(long j10, InterfaceC1362Jj interfaceC1362Jj, long j11) {
        super.A01 = j10;
        this.A01 = interfaceC1362Jj;
        if (j11 == Long.MAX_VALUE) {
            j11 = super.A01;
        }
        this.A00 = j11;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1362Jj
    public final List<C2708pT> A7X(long j10) {
        return ((InterfaceC1362Jj) AbstractC09823y.A01(this.A01)).A7X(j10 - this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1362Jj
    public final long A83(int i10) {
        return ((InterfaceC1362Jj) AbstractC09823y.A01(this.A01)).A83(i10) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1362Jj
    public final int A84() {
        return ((InterfaceC1362Jj) AbstractC09823y.A01(this.A01)).A84();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1362Jj
    public final int A8a(long j10) {
        return ((InterfaceC1362Jj) AbstractC09823y.A01(this.A01)).A8a(j10 - this.A00);
    }
}
