package com.facebook.ads.redexgen.core;

import com.inmobi.media.core.config.models.CrashConfig;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2508m1 implements HY {
    public final /* synthetic */ C2507m0 A00;

    public C2508m1(C2507m0 c2507m0) {
        this.A00 = c2507m0;
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final long A7t() {
        return this.A00.A0B.A05(this.A00.A07);
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final HX A91(long j10) {
        long jA06 = this.A00.A0B.A06(j10);
        long j11 = this.A00.A09;
        long j12 = this.A00.A08;
        long targetGranule = this.A00.A09;
        long j13 = (j12 - targetGranule) * jA06;
        long targetGranule2 = this.A00.A07;
        long estimatedPosition = C5C.A0T((j11 + (j13 / targetGranule2)) - CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, this.A00.A09, this.A00.A08 - 1);
        return new HX(new HZ(j10, estimatedPosition));
    }

    @Override // com.facebook.ads.redexgen.core.HY
    public final boolean AAj() {
        return true;
    }
}
