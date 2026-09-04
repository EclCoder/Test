package com.coremedia.iso;

import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class Hex {
    private static final char[] DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static byte[] decodeHex(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        while (i10 < str.length()) {
            int i11 = i10 + 2;
            byteArrayOutputStream.write(Integer.parseInt(str.substring(i10, i11), 16));
            i10 = i11;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static String encodeHex(byte[] bArr) {
        return encodeHex(bArr, 0);
    }

    public static String encodeHex(byte[] bArr, int i10) {
        int length = bArr.length;
        char[] cArr = new char[(length << 1) + (i10 > 0 ? length / i10 : 0)];
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (i10 > 0 && i12 % i10 == 0 && i11 > 0) {
                cArr[i11] = '-';
                i11++;
            }
            int i13 = i11 + 1;
            char[] cArr2 = DIGITS;
            byte b10 = bArr[i12];
            cArr[i11] = cArr2[(b10 & 240) >>> 4];
            i11 += 2;
            cArr[i13] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }
}
