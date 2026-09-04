package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2420kZ implements InterfaceC1428Lx {
    public final InterfaceC1425Lu A00;

    public C2420kZ(InterfaceC1425Lu interfaceC1425Lu) {
        this.A00 = interfaceC1425Lu;
    }

    public final InterfaceC1425Lu A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1428Lx
    public final C8J ACL() {
        return new C8J(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1428Lx
    public final C2424kd ACM() {
        return new C2424kd(this);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1428Lx
    public final C2424kd ACN(String str) {
        return new C2424kd(this, str);
    }
}
