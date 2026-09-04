package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2332iz extends AbstractRunnableC1685Wc {
    public final /* synthetic */ C2385jz A00;
    public final /* synthetic */ O8 A01;
    public final /* synthetic */ C10717j A02;

    public C2332iz(C10717j c10717j, O8 o10, C2385jz c2385jz) {
        this.A02 = c10717j;
        this.A01 = o10;
        this.A00 = c2385jz;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1685Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        C1670Vm c1670VmA00 = C1670Vm.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5g(c1670VmA00.A03().getErrorCode(), c1670VmA00.A04());
        this.A02.A07.A0G(c1670VmA00);
    }
}
