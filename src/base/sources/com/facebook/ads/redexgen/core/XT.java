package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum XT {
    A04(0),
    A05(1),
    A03(2);

    public static byte[] A01;
    public final int A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{37, 56, 56, 35, 50, 51, 101, 126, 123, 126, 127, 103, 126, 86, 77, 81, 76, 76, 87, 70, 71};
    }

    static {
        A01();
    }

    XT(int i10) {
        this.A00 = i10;
    }
}
