package com.facebook.ads.redexgen.core;

import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2539mi extends H2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2539mi(final HJ hj2, int i10, long j10, long j11) {
        super(new InterfaceC1299Gx() { // from class: com.facebook.ads.redexgen.X.mk
            @Override // com.facebook.ads.redexgen.core.InterfaceC1299Gx
            public final long AKQ(long j12) {
                return hj2.A07(j12);
            }
        }, new C2540mj(hj2, i10), hj2.A06(), 0L, hj2.A09, j10, j11, hj2.A05(), Math.max(6, hj2.A06));
        Objects.requireNonNull(hj2);
    }
}
