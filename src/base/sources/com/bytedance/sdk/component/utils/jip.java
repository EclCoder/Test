package com.bytedance.sdk.component.utils;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class jip {
    private static final char[] hnj = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String hnj(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                    messageDigest.update(str.getBytes(C.UTF8_NAME));
                    return hnj(messageDigest.digest());
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static String hnj(byte[] bArr) {
        if (bArr != null) {
            return hnj(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    public static String hnj(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            if (i10 >= 0 && i10 + i11 <= bArr.length) {
                int i12 = i11 * 2;
                char[] cArr = new char[i12];
                int i13 = 0;
                for (int i14 = 0; i14 < i11; i14++) {
                    byte b10 = bArr[i14 + i10];
                    int i15 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    int i16 = i13 + 1;
                    char[] cArr2 = hnj;
                    cArr[i13] = cArr2[i15 >> 4];
                    i13 += 2;
                    cArr[i16] = cArr2[b10 & 15];
                }
                return new String(cArr, 0, i12);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }
}
