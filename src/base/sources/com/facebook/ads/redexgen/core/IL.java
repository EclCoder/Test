package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class IL extends AbstractRunnableC1685Wc {
    public static byte[] A01;
    public static String[] A02 = {"mPUp", "QaVG6HdjpkfaxAZj0g", "f", "awRGdU6dgRZhiPVlhe", "rFOzx0t9VnUrXKVKNhKeQ4JnbF82l9OW", "Jupus4hVDLzI", "SNB8L6kKTybUpjfk2kEtWCUyw", "zmy1APRNrfa5"};
    public final /* synthetic */ C5S A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-23, -4, -9, -8, 2, -77, 10, -12, 6, -77, 1, -8, 9, -8, 5, -77, 3, 5, -8, 3, -12, 5, -8, -9};
    }

    static {
        A01();
    }

    public IL(C5S c5s) {
        this.A00 = c5s;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1685Wc
    public final void A07() {
        if (!this.A00.A0C) {
            C5S c5s = this.A00;
            String[] strArr = A02;
            if (strArr[2].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A02[3] = "r7zn";
            c5s.A0S(A00(0, 24, Sdk$SDKError.b.TPAT_ERROR_VALUE));
        }
    }
}
