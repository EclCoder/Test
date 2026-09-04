package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract /* synthetic */ class AbstractC1440Mj {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{9, 28, 19, 3, 16, 9, 18, 17, 36, 27, 11, 30, 17, 16, 21, 30};
    }

    public static long A00(InterfaceC1441Mk interfaceC1441Mk) {
        return interfaceC1441Mk.A6h(A02(0, 7, 111), -1L);
    }

    public static Uri A01(InterfaceC1441Mk interfaceC1441Mk) {
        String strA6j = interfaceC1441Mk.A6j(A02(7, 9, Sdk$SDKError.b.JSON_ENCODE_ERROR_VALUE), null);
        if (strA6j == null) {
            return null;
        }
        return Uri.parse(strA6j);
    }
}
