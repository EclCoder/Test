package com.facebook.ads.redexgen.core;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC1859bD {
    A05(0),
    A04(1),
    A03(2);

    public static byte[] A01;
    public int A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{78, 67, 76, 70, 81, 65, 67, 82, 71, 56, 39, 58, 60, 58, 41, 33, 60, 22, 13, 16, 19, 6, 0, 10, 5, 10, 6, 7};
    }

    static {
        A02();
    }

    EnumC1859bD(int i10) {
        this.A00 = i10;
    }

    public static EnumC1859bD A00(int i10) {
        for (EnumC1859bD enumC1859bD : values()) {
            if (enumC1859bD.A00 == i10) {
                return enumC1859bD;
            }
        }
        return A04;
    }

    public final int A04() {
        return this.A00;
    }
}
