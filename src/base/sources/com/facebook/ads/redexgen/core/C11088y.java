package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C11088y extends Exception {
    public static byte[] A03;
    public final int A00;
    public final C2758qI A01;
    public final boolean A02;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-26, 26, 9, 14, 20, -7, 23, 6, 8, 16, -59, 28, 23, 14, 25, 10, -59, 11, 6, 14, 17, 10, 9, -33, -59};
    }

    public C11088y(int i10, C2758qI c2758qI, boolean z10) {
        super(A00(0, 25, 91) + i10);
        this.A02 = z10;
        this.A00 = i10;
        this.A01 = c2758qI;
    }
}
