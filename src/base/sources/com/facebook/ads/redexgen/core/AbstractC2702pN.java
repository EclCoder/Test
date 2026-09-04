package com.facebook.ads.redexgen.core;

import com.google.common.primitives.ElementTypesAreNonnullByDefault;
import com.inmobi.media.core.config.models.AdConfig;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC2702pN {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 49);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{0, 58, 59, 111, 32, 41, 111, 61, 46, 33, 40, 42, 117, 111, 106, 60};
    }

    public static char A00(byte b10, byte b11) {
        return (char) ((b10 << 8) | (b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
    }

    public static char A01(long value) {
        char c10 = (char) value;
        AbstractC2428ki.A0H(((long) c10) == value, A02(0, 16, Sdk$SDKError.b.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), value);
        return c10;
    }

    public static boolean A04(char[] array, char target) {
        for (char c10 : array) {
            if (c10 == target) {
                return true;
            }
        }
        return false;
    }
}
