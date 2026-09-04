package com.googlecode.mp4parser.util;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class Math {
    public static long gcd(long j10, long j11) {
        while (true) {
            long j12 = j11;
            long j13 = j10;
            j10 = j12;
            if (j10 <= 0) {
                return j13;
            }
            j11 = j13 % j10;
        }
    }

    public static long lcm(long j10, long j11) {
        return j10 * (j11 / gcd(j10, j11));
    }

    public static int gcd(int i10, int i11) {
        while (true) {
            int i12 = i11;
            int i13 = i10;
            i10 = i12;
            if (i10 <= 0) {
                return i13;
            }
            i11 = i13 % i10;
        }
    }

    public static long lcm(long[] jArr) {
        long jLcm = jArr[0];
        for (int i10 = 1; i10 < jArr.length; i10++) {
            jLcm = lcm(jLcm, jArr[i10]);
        }
        return jLcm;
    }

    public static int lcm(int i10, int i11) {
        return i10 * (i11 / gcd(i10, i11));
    }
}
