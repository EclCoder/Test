package com.fasterxml.jackson.core.io;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import java.math.BigDecimal;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f16249a = String.valueOf(Long.MIN_VALUE).substring(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f16250b = String.valueOf(Long.MAX_VALUE);

    private static NumberFormatException a(String str) {
        return new NumberFormatException("Value \"" + str + "\" can not be represented as BigDecimal");
    }

    public static boolean b(char[] cArr, int i10, int i11, boolean z10) {
        String str = z10 ? f16249a : f16250b;
        int length = str.length();
        if (i11 < length) {
            return true;
        }
        if (i11 > length) {
            return false;
        }
        for (int i12 = 0; i12 < length; i12++) {
            int iCharAt = cArr[i10 + i12] - str.charAt(i12);
            if (iCharAt != 0) {
                return iCharAt < 0;
            }
        }
        return true;
    }

    public static BigDecimal c(String str) {
        try {
            return new BigDecimal(str);
        } catch (NumberFormatException unused) {
            throw a(str);
        }
    }

    public static BigDecimal d(char[] cArr) {
        return e(cArr, 0, cArr.length);
    }

    public static BigDecimal e(char[] cArr, int i10, int i11) {
        try {
            return new BigDecimal(cArr, i10, i11);
        } catch (NumberFormatException unused) {
            throw a(new String(cArr, i10, i11));
        }
    }

    public static double f(String str) {
        if ("2.2250738585072012e-308".equals(str)) {
            return Double.MIN_VALUE;
        }
        return Double.parseDouble(str);
    }

    public static int g(char[] cArr, int i10, int i11) {
        int i12 = cArr[(i10 + i11) - 1] - '0';
        switch (i11) {
            case 9:
                i12 += (cArr[i10] - '0') * 100000000;
                i10++;
            case 8:
                i12 += (cArr[i10] - '0') * 10000000;
                i10++;
            case 7:
                i12 += (cArr[i10] - '0') * 1000000;
                i10++;
            case 6:
                i12 += (cArr[i10] - '0') * DefaultOggSeeker.MATCH_BYTE_RANGE;
                i10++;
            case 5:
                i12 += (cArr[i10] - '0') * 10000;
                i10++;
            case 4:
                i12 += (cArr[i10] - '0') * 1000;
                i10++;
            case 3:
                i12 += (cArr[i10] - '0') * 100;
                i10++;
            case 2:
                return i12 + ((cArr[i10] - '0') * 10);
            default:
                return i12;
        }
    }

    public static long h(char[] cArr, int i10, int i11) {
        int i12 = i11 - 9;
        return (((long) g(cArr, i10, i12)) * C.NANOS_PER_SECOND) + ((long) g(cArr, i10 + i12, 9));
    }
}
