package com.mbridge.msdk.thrid.okio;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f33635a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f33636b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    public static String a(byte[] bArr) {
        return a(bArr, f33635a);
    }

    private static String a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            bArr3[i10] = bArr2[(bArr[i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 2];
            int i12 = i11 + 1;
            bArr3[i10 + 1] = bArr2[((bArr[i11] & 3) << 4) | ((bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4)];
            int i13 = i10 + 3;
            int i14 = (bArr[i12] & 15) << 2;
            int i15 = i11 + 2;
            bArr3[i10 + 2] = bArr2[i14 | ((bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 6)];
            i10 += 4;
            bArr3[i13] = bArr2[bArr[i15] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            bArr3[i10] = bArr2[(bArr[length] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 2];
            bArr3[i10 + 1] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i10 + 2] = 61;
            bArr3[i10 + 3] = 61;
        } else if (length2 == 2) {
            bArr3[i10] = bArr2[(bArr[length] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 2];
            int i16 = (bArr[length] & 3) << 4;
            int i17 = length + 1;
            bArr3[i10 + 1] = bArr2[((bArr[i17] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4) | i16];
            bArr3[i10 + 2] = bArr2[(bArr[i17] & 15) << 2];
            bArr3[i10 + 3] = 61;
        }
        try {
            return new String(bArr3, C.ASCII_NAME);
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }
}
