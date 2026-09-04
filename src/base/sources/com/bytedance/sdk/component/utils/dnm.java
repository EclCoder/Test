package com.bytedance.sdk.component.utils;

import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dnm {
    private static final byte[] hnj = hnj("VP8X");

    private static byte[] hnj(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new byte[1];
        }
    }

    public static boolean hnj(byte[] bArr, int i10) {
        try {
            boolean zHnj = hnj(bArr, i10 + 12, hnj);
            int i11 = i10 + 20;
            if (bArr.length <= i11) {
                return false;
            }
            boolean z10 = (bArr[i11] & 2) == 2;
            if (zHnj && z10) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean hnj(byte[] bArr, int i10, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i10 > bArr.length) {
            return false;
        }
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            if (bArr[i11 + i10] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }
}
