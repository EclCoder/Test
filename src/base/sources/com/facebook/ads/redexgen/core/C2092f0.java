package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2092f0 implements InterfaceC1609Tc {
    public final T8 A00;

    public C2092f0(T8 t10) {
        this.A00 = t10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1609Tc
    public final void A4I(Throwable th2) {
        TX.A0E(th2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1609Tc
    public final void AA3(String str) {
        VL.A08(this.A00, str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1609Tc
    public final void AA4(String str) {
        VL.A09(this.A00, str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1609Tc
    public final void ABC(String str, int i10, C1611Te c1611Te) {
        TX.A06(this.A00, str, i10, c1611Te);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1609Tc
    public final void ABD(String str, int i10, C1611Te c1611Te) {
        TX.A06(this.A00, str, i10, c1611Te);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1609Tc
    public final void ABo(long j10, long j11, long j12, long j13, int i10, Exception exc) {
        AbstractC1615Ti.A03(this.A00, j10, j11, j12, j13, i10, exc);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1609Tc
    public final void ABz(String str, int i10, C1611Te c1611Te) {
        TX.A07(this.A00, str, i10, c1611Te);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1609Tc
    public final void ACA(String str, int i10, C1611Te c1611Te) {
        TX.A08(this.A00, str, i10, c1611Te);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1609Tc
    public final void ACP() {
        this.A00.A04().ACP();
    }
}
