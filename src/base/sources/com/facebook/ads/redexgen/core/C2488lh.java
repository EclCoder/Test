package com.facebook.ads.redexgen.core;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2488lh implements InterfaceC1362Jj {
    public final List<C2708pT> A00;

    public C2488lh(List<C2708pT> list) {
        this.A00 = list;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1362Jj
    public final List<C2708pT> A7X(long j10) {
        return j10 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1362Jj
    public final long A83(int i10) {
        AbstractC09823y.A07(i10 == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1362Jj
    public final int A84() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1362Jj
    public final int A8a(long j10) {
        return j10 < 0 ? 0 : -1;
    }
}
