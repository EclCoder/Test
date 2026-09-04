package com.facebook.ads.redexgen.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2460lF implements L8 {
    public C2758qI A00;
    public AnonymousClass53 A01;
    public InterfaceC1305Hd A02;

    public C2460lF(String str) {
        this.A00 = new C09492p().A11(str).A14();
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    private void A00() {
        AbstractC09823y.A02(this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.L8
    public final void A5A(C10054v c10054v) {
        A00();
        long jA03 = this.A01.A03();
        long jA04 = this.A01.A04();
        if (jA03 == C.TIME_UNSET || jA04 == C.TIME_UNSET) {
            return;
        }
        if (jA04 != this.A00.A0M) {
            this.A00 = this.A00.A07().A0s(jA04).A14();
            this.A02.A6e(this.A00);
        }
        int iA07 = c10054v.A07();
        this.A02.AIr(c10054v, iA07);
        this.A02.AIu(jA03, 1, iA07, 0, null);
    }

    @Override // com.facebook.ads.redexgen.core.L8
    public final void AAA(AnonymousClass53 anonymousClass53, HA ha2, LG lg2) {
        this.A01 = anonymousClass53;
        lg2.A05();
        this.A02 = ha2.AKS(lg2.A03(), 5);
        this.A02.A6e(this.A00);
    }
}
