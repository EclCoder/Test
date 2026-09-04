package com.facebook.ads.redexgen.core;

import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class UG {
    public static UG A00 = new UG();

    public static UG A00() {
        return A00;
    }

    public final ZJ A01(T8 t10, boolean z10) {
        return new ZJ(t10, z10, new C1594Sn());
    }

    public final Map<String, String> A02(T8 t10) {
        try {
            return A01(t10, false).A06();
        } catch (Throwable th2) {
            t10.A08().A4I(th2);
            return U8.A01(t10);
        }
    }
}
