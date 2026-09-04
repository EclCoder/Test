package com.facebook.ads.redexgen.core;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ke, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1383Ke implements InterfaceC1854b8 {
    public final WeakReference<C6M> A00;

    public C1383Ke(C6M c6m) {
        this.A00 = new WeakReference<>(c6m);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1854b8
    public final void AE7(C1853b7 c1853b7) {
        C6M c6m = this.A00.get();
        if (c6m != null) {
            c6m.A04 = c1853b7.A00() != null;
            c6m.A02();
        }
    }
}
