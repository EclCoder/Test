package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ep, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1240Ep extends AbstractRunnableC1685Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C1235Ek A02;

    public C1240Ep(C1235Ek c1235Ek, int i10, int i11) {
        this.A02 = c1235Ek;
        this.A00 = i10;
        this.A01 = i11;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1685Wc
    public final void A07() {
        this.A02.A0C.A02(new C1223Dy(this.A00, this.A01));
    }
}
