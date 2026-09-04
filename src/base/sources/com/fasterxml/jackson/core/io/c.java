package com.fasterxml.jackson.core.io;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f16241a = a.e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f16242b = a.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c f16243c = new c();

    private static int a(int i10, int i11) {
        if (i11 >= 56320 && i11 <= 57343) {
            return ((i10 - 55296) << 10) + C.DEFAULT_BUFFER_SEGMENT_SIZE + (i11 - 56320);
        }
        throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i10) + ", second 0x" + Integer.toHexString(i11) + "; illegal combination");
    }

    private static void b(int i10) {
        throw new IllegalArgumentException(i.d(i10));
    }

    public static c d() {
        return f16243c;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e6 A[SYNTHETIC] */
    public byte[] c(String str) {
        int i10;
        int i11;
        int length = str.length();
        int length2 = 200;
        byte[] bArrK = new byte[200];
        i8.c cVarL = null;
        int i12 = 0;
        int i13 = 0;
        loop0: while (i12 < length) {
            int i14 = i12 + 1;
            char cCharAt = str.charAt(i12);
            while (cCharAt <= 127) {
                if (i13 >= length2) {
                    if (cVarL == null) {
                        cVarL = i8.c.l(bArrK, i13);
                    }
                    byte[] bArrK2 = cVarL.k();
                    bArrK = bArrK2;
                    length2 = bArrK2.length;
                    i13 = 0;
                }
                int i15 = i13 + 1;
                bArrK[i13] = (byte) cCharAt;
                if (i14 >= length) {
                    i13 = i15;
                    break loop0;
                }
                char cCharAt2 = str.charAt(i14);
                i14++;
                cCharAt = cCharAt2;
                i13 = i15;
            }
            if (cVarL == null) {
                cVarL = i8.c.l(bArrK, i13);
            }
            if (i13 >= length2) {
                bArrK = cVarL.k();
                length2 = bArrK.length;
                i13 = 0;
            }
            if (cCharAt < 2048) {
                i10 = i13 + 1;
                bArrK[i13] = (byte) ((cCharAt >> 6) | PsExtractor.AUDIO_STREAM);
            } else {
                if (cCharAt < 55296 || cCharAt > 57343) {
                    int i16 = i13 + 1;
                    bArrK[i13] = (byte) ((cCharAt >> '\f') | 224);
                    if (i16 >= length2) {
                        bArrK = cVarL.k();
                        length2 = bArrK.length;
                        i16 = 0;
                    }
                    bArrK[i16] = (byte) (((cCharAt >> 6) & 63) | 128);
                    i10 = i16 + 1;
                } else {
                    if (cCharAt > 56319) {
                        b(cCharAt);
                    }
                    if (i14 >= length) {
                        b(cCharAt);
                    }
                    int i17 = i14 + 1;
                    int iA = a(cCharAt, str.charAt(i14));
                    if (iA > 1114111) {
                        b(iA);
                    }
                    int i18 = i13 + 1;
                    bArrK[i13] = (byte) ((iA >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                    if (i18 >= length2) {
                        bArrK = cVarL.k();
                        length2 = bArrK.length;
                        i18 = 0;
                    }
                    int i19 = i18 + 1;
                    bArrK[i18] = (byte) (((iA >> 12) & 63) | 128);
                    if (i19 >= length2) {
                        byte[] bArrK3 = cVarL.k();
                        bArrK = bArrK3;
                        length2 = bArrK3.length;
                        i19 = 0;
                    }
                    int i20 = i19 + 1;
                    bArrK[i19] = (byte) (((iA >> 6) & 63) | 128);
                    i11 = iA;
                    i12 = i17;
                    i10 = i20;
                }
                if (i10 >= length2) {
                    byte[] bArrK4 = cVarL.k();
                    bArrK = bArrK4;
                    length2 = bArrK4.length;
                    i10 = 0;
                }
                bArrK[i10] = (byte) ((i11 & 63) | 128);
                i13 = i10 + 1;
            }
            i11 = cCharAt;
            i12 = i14;
            if (i10 >= length2) {
                byte[] bArrK5 = cVarL.k();
                bArrK = bArrK5;
                length2 = bArrK5.length;
                i10 = 0;
            }
            bArrK[i10] = (byte) ((i11 & 63) | 128);
            i13 = i10 + 1;
        }
        return cVarL == null ? Arrays.copyOfRange(bArrK, 0, i13) : cVarL.i(i13);
    }
}
