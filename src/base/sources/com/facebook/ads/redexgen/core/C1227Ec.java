package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1227Ec implements Comparable<C1227Ec> {
    public final boolean A00;
    public final boolean A01;

    public C1227Ec(C2758qI c2758qI, int i10) {
        this.A00 = (c2758qI.A0H & 1) != 0;
        this.A01 = C11159h.A0S(i10, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C1227Ec c1227Ec) {
        return AbstractC2610ns.A01().A09(this.A01, c1227Ec.A01).A09(this.A00, c1227Ec.A00).A05();
    }
}
