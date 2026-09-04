package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2261hk implements InterfaceC1552Qw {
    public final /* synthetic */ C7M A00;

    public C2261hk(C7M c7m) {
        this.A00 = c7m;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1552Qw
    public final void ACv(RK rk2) {
        rk2.A0d(true);
        if (rk2.A06 != null && rk2.A07 == null) {
            rk2.A06 = null;
        }
        rk2.A07 = null;
        if (!rk2.A0G() && !this.A00.A1x(rk2.A0H) && rk2.A0i()) {
            this.A00.removeDetachedView(rk2.A0H, false);
        }
    }
}
