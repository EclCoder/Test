package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class AL extends C2684p5 {
    public static byte[] A01;
    public final String A00;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 87);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-11, 26, 34, 13, 24, 21, 16, -52, 15, 27, 26, 32, 17, 26, 32, -52, 32, 37, 28, 17, -26, -52};
    }

    public AL(String str, C10185i c10185i) {
        super(A01(0, 22, 85) + str, c10185i, 2003, 1);
        this.A00 = str;
    }
}
