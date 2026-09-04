package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.p8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2687p8 implements C5Y {
    public final InterfaceC10295t A00;

    public C2687p8() {
        this(null);
    }

    public C2687p8(InterfaceC10295t interfaceC10295t) {
        this.A00 = interfaceC10295t;
    }

    @Override // com.facebook.ads.redexgen.core.C5Y
    public final InterfaceC2694pF A5I() {
        C09191j c09191j = new C09191j();
        if (this.A00 != null) {
            c09191j.A43(this.A00);
        }
        return c09191j;
    }
}
