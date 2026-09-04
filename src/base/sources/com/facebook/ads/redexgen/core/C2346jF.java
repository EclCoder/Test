package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2346jF implements SM {
    public final /* synthetic */ AbstractC2363jd A00;
    public final /* synthetic */ InterfaceC1475Nt A01;
    public final /* synthetic */ C1476Nu A02;
    public final /* synthetic */ C2198gi A03;
    public final /* synthetic */ boolean A04;

    public C2346jF(C1476Nu c1476Nu, C2198gi c2198gi, boolean z10, AbstractC2363jd abstractC2363jd, InterfaceC1475Nt interfaceC1475Nt) {
        this.A02 = c1476Nu;
        this.A03 = c2198gi;
        this.A04 = z10;
        this.A00 = abstractC2363jd;
        this.A01 = interfaceC1475Nt;
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACx() {
        if (C1648Up.A1q(this.A03) && this.A04) {
            this.A02.A02.add(AbstractC1983dD.A01(this.A03, this.A00, 1, new C2347jG(this)));
        } else {
            this.A01.ACp();
        }
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final void ACy() {
        this.A01.ACo(AdError.CACHE_ERROR);
    }
}
