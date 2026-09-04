package com.facebook.ads.redexgen.core;

import com.facebook.ads.CacheFlag;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C10717j extends AbstractC2333j0 {
    public C10717j(C2198gi c2198gi, O7 o10) {
        super(c2198gi, o10);
    }

    private C2331iy A00(Runnable runnable) {
        return new C2331iy(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2333j0
    public final NQ A0I() {
        C2385jz successfullyLoadedAdapter = (C2385jz) this.A01;
        if (successfullyLoadedAdapter != null) {
            return successfullyLoadedAdapter.A09();
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2333j0
    public final void A0P() {
        C2385jz interstitialAdapter = (C2385jz) this.A01;
        interstitialAdapter.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2333j0
    public final void A0R(N1 n10, C1629Tw c1629Tw, C1627Tu c1627Tu, O8 o10) {
        C2385jz c2385jz = (C2385jz) n10;
        C2332iz c2332iz = new C2332iz(this, o10, c2385jz);
        A0H().postDelayed(c2332iz, c1629Tw.A05().A05());
        EnumSet<CacheFlag> enumSet = this.A08.A0B;
        if (enumSet == null) {
            enumSet = CacheFlag.ALL;
        }
        c2385jz.A0A(this.A0B, A00(c2332iz), o10, enumSet, this.A08.A04, this.A08.A05, this.A08.A02);
    }
}
