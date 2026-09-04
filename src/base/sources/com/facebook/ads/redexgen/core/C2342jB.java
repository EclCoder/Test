package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2342jB implements SM {
    public final /* synthetic */ C1476Nu A00;

    public C2342jB(C1476Nu c1476Nu) {
        this.A00 = c1476Nu;
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACx() {
        this.A00.A04.ACp();
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACy() {
        this.A00.A04.ACo(AdError.CACHE_ERROR);
    }
}
