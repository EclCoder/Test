package com.facebook.ads.redexgen.core;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class JH {
    public static byte[] A00;
    public static String[] A01 = {"f", "wBzTr9isyWuzk0Was82fzP", "sjHXZ8xDB", "rmj8ZpQPq6N", "k0JnkexrU5JvppKLiAvWnmQe", "wOTrIZh22Rcriy8Kptm38zvp", "MO9vm10BV89BFpJ5cx5aSl", "G2cEiJ7mV"};

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 26);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {-68, -33, -33, -44, -83, -32, -37, -39, -63, -32, -43, -40, -20, 5, 10, 12, 7, 7, 6, 9, 11, -4, -5, -73, 7, 10, 10, -1, -73, 13, -4, 9, 10, 0, 6, 5, -47, -73};
        String[] strArr = A01;
        if (strArr[2].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "tjOAGVDnT";
        strArr2[7] = "ur6F1gHbb";
        A00 = bArr;
    }

    static {
        A03();
    }

    public static JG A00(byte[] bArr) {
        C10054v c10054v = new C10054v(bArr);
        if (c10054v.A0A() < 32) {
            return null;
        }
        c10054v.A0f(0);
        if (c10054v.A0C() != c10054v.A07() + 4 || c10054v.A0C() != 1886614376) {
            return null;
        }
        int dataSize = AbstractC1347Iu.A01(c10054v.A0C());
        if (dataSize > 1) {
            AbstractC09904g.A07(A01(0, 12, 82), A01(12, 26, Sdk$SDKError.b.INVALID_METRICS_ENDPOINT_VALUE) + dataSize);
            return null;
        }
        UUID uuid = new UUID(c10054v.A0P(), c10054v.A0P());
        if (dataSize == 1) {
            c10054v.A0g(c10054v.A0L() * 16);
        }
        int atomType = c10054v.A0L();
        String[] strArr = A01;
        if (strArr[2].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A01[6] = "Op4nBnIC0DPoqkcvuw04qL";
        if (atomType != c10054v.A07()) {
            return null;
        }
        byte[] bArr2 = new byte[atomType];
        c10054v.A0k(bArr2, 0, atomType);
        return new JG(uuid, dataSize, bArr2);
    }

    public static UUID A02(byte[] bArr) {
        JG parsedAtom = A00(bArr);
        if (parsedAtom != null) {
            return parsedAtom.A01;
        }
        return null;
    }
}
