package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1322Hu {
    public final InterfaceC1305Hd A00;

    public abstract boolean A0B(C10054v c10054v) throws C3K;

    public abstract boolean A0C(C10054v c10054v, long j10) throws C3K;

    public AbstractC1322Hu(InterfaceC1305Hd interfaceC1305Hd) {
        this.A00 = interfaceC1305Hd;
    }

    public final boolean A00(C10054v c10054v, long j10) throws C3K {
        return A0B(c10054v) && A0C(c10054v, j10);
    }
}
