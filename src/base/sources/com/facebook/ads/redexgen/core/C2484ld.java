package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2484ld implements InterfaceC1362Jj {
    public final long[] A00;
    public final C2708pT[] A01;

    public C2484ld(C2708pT[] c2708pTArr, long[] jArr) {
        this.A01 = c2708pTArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1362Jj
    public final List<C2708pT> A7X(long j10) {
        int iA0L = C5C.A0L(this.A00, j10, true, false);
        if (iA0L == -1 || this.A01[iA0L] == C2708pT.A0J) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.A01[iA0L]);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1362Jj
    public final long A83(int i10) {
        boolean z10 = true;
        AbstractC09823y.A07(i10 >= 0);
        if (i10 >= this.A00.length) {
            z10 = false;
        }
        AbstractC09823y.A07(z10);
        return this.A00[i10];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1362Jj
    public final int A84() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1362Jj
    public final int A8a(long j10) {
        int iA0K = C5C.A0K(this.A00, j10, false, false);
        int index = this.A00.length;
        if (iA0K < index) {
            return iA0K;
        }
        return -1;
    }
}
