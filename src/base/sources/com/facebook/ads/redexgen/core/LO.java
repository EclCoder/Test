package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class LO {
    public final int A00;
    public final long A01;

    public LO(int i10, long j10) {
        this.A00 = i10;
        this.A01 = j10;
    }

    public static LO A00(InterfaceC2549ms interfaceC2549ms, C10054v c10054v) throws IOException {
        interfaceC2549ms.AGt(c10054v.A0l(), 0, 8);
        c10054v.A0f(0);
        int iA0C = c10054v.A0C();
        long size = c10054v.A0O();
        return new LO(iA0C, size);
    }
}
