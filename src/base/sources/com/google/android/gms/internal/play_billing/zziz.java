package com.google.android.gms.internal.play_billing;

import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class zziz {
    protected static final int zza(String str, byte[] bArr, int i10, int i11) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        if (length - i10 > i11) {
            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
        }
        System.arraycopy(bytes, 0, bArr, i10, length);
        return i10 + length;
    }

    static int zzb(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt >= 2048) {
                try {
                    int i13 = zzjc.zza;
                    int length2 = str.length();
                    while (i11 < length2) {
                        char cCharAt2 = str.charAt(i11);
                        if (cCharAt2 < 2048) {
                            i10 += (127 - cCharAt2) >>> 31;
                        } else {
                            i10 += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i11) < 65536) {
                                    throw new zzjb(i11, length2);
                                }
                                i11++;
                            }
                        }
                        i11++;
                    }
                    i12 += i10;
                    break;
                } catch (zzjb unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
            i12 += (127 - cCharAt) >>> 31;
            i11++;
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i12) + 4294967296L));
    }
}
