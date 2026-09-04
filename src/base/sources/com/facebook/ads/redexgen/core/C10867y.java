package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C10867y extends AbstractC2337j4 {
    public final /* synthetic */ C10847w A00;
    public final /* synthetic */ AbstractC2367jh A01;
    public final /* synthetic */ C10737l A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10867y(C10847w c10847w, boolean z10, boolean z11, C10737l c10737l, AbstractC2367jh abstractC2367jh) {
        super(z10);
        this.A00 = c10847w;
        this.A03 = z11;
        this.A02 = c10737l;
        this.A01 = abstractC2367jh;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2337j4
    public final void A00() {
        this.A00.A01.AFp(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2337j4
    public final void A01(boolean z10) {
        if (!C1648Up.A1t(this.A00.A04) || !this.A03) {
            if (this.A00.A05 == WK.A0J) {
                this.A00.A04.A0F().AER();
            }
            this.A00.A0C.set(true);
            this.A00.A01.AFm(this.A01);
            return;
        }
        this.A00.A06 = AbstractC1983dD.A01(this.A00.A04, this.A02, 0, new C2376jq(this));
    }
}
