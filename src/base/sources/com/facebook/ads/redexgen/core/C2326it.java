package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.it, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2326it extends AbstractRunnableC1685Wc {
    public final /* synthetic */ C10847w A00;
    public final /* synthetic */ O8 A01;
    public final /* synthetic */ C10627a A02;

    public C2326it(C10627a c10627a, O8 o10, C10847w c10847w) {
        this.A02 = c10627a;
        this.A01 = o10;
        this.A00 = c10847w;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1685Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0F().A5g(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A07.A0G(new C1670Vm(adErrorType, ""));
    }
}
