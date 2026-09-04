package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2032e1 implements InterfaceC2147ft {
    public static byte[] A01;
    public final C2194ge A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{82, 39, 76, 72, 39, 90, 101, 101, 102, 39, 88, 101, 127, 126, 99, 100, 109, 39, 94, 101, 97, 111, 100, 12, 10, 28, 11, 84, 24, 30, 28, 23, 13};
    }

    public C2032e1(C2194ge c2194ge) {
        this.A00 = c2194ge;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2147ft
    public final Map<String, String> A6g(boolean z10) {
        HashMap map = new HashMap();
        if (!SZ.A00().A04()) {
            map.put(A00(0, 23, 64), UG.A00().A01(this.A00, true).A04());
        }
        map.put(A00(23, 10, 51), UJ.A06(new C1621To(this.A00), this.A00, z10));
        return map;
    }
}
