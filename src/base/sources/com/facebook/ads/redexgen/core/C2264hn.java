package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2264hn implements RR {
    public final /* synthetic */ C7M A00;

    public C2264hn(C7M c7m) {
        this.A00 = c7m;
    }

    @Override // com.facebook.ads.redexgen.core.RR
    public final void AH9(RK rk2, C1553Qx c1553Qx, C1553Qx c1553Qx2) {
        this.A00.A1l(rk2, c1553Qx, c1553Qx2);
    }

    @Override // com.facebook.ads.redexgen.core.RR
    public final void AHB(RK rk2, C1553Qx c1553Qx, C1553Qx c1553Qx2) {
        this.A00.A0r.A0Y(rk2);
        this.A00.A1m(rk2, c1553Qx, c1553Qx2);
    }

    @Override // com.facebook.ads.redexgen.core.RR
    public final void AHD(RK rk2, C1553Qx c1553Qx, C1553Qx c1553Qx2) {
        rk2.A0d(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0R(rk2, rk2, c1553Qx, c1553Qx2)) {
                this.A00.A1O();
            }
        } else {
            if (!this.A00.A05.A0Q(rk2, c1553Qx, c1553Qx2)) {
                return;
            }
            this.A00.A1O();
        }
    }

    @Override // com.facebook.ads.redexgen.core.RR
    public final void AKZ(RK rk2) {
        this.A00.A06.A1F(rk2.A0H, this.A00.A0r);
    }
}
