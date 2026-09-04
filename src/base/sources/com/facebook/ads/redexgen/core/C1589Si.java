package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Si, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1589Si {
    public static InterfaceC1590Sj A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-91, -88, -79, -90, -85, -80, -92, -75, -82};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (C1589Si.class) {
            if (A00 == null) {
                return;
            }
            C1611Te c1611Te = new C1611Te(A00.AIb());
            c1611Te.A05(1);
            C2194ge c2194geA00 = T7.A00();
            if (c2194geA00 != null) {
                c2194geA00.A08().ABC(A00(0, 9, 49), 3401, c1611Te);
            }
            A00.reset();
        }
    }

    public static void A03(long j10) {
        if (j10 > 0) {
            A00 = new C2207gr();
            new C1591Sk(j10);
        }
    }
}
