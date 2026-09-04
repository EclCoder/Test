package i3;

import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class e {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f40862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f40863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f40864c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long[] f40865d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f40866e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f40867f;

        private b(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
            this.f40862a = jArr;
            this.f40863b = iArr;
            this.f40864c = i10;
            this.f40865d = jArr2;
            this.f40866e = iArr2;
            this.f40867f = j10;
        }
    }

    public static b a(int i10, long[] jArr, int[] iArr, long j10) {
        int i11 = 8192 / i10;
        int iJ = 0;
        for (int i12 : iArr) {
            iJ += c0.j(i12, i11);
        }
        long[] jArr2 = new long[iJ];
        int[] iArr2 = new int[iJ];
        long[] jArr3 = new long[iJ];
        int[] iArr3 = new int[iJ];
        int i13 = 0;
        int i14 = 0;
        int iMax = 0;
        for (int i15 = 0; i15 < iArr.length; i15++) {
            int i16 = iArr[i15];
            long j11 = jArr[i15];
            while (i16 > 0) {
                int iMin = Math.min(i11, i16);
                jArr2[i14] = j11;
                int i17 = i10 * iMin;
                iArr2[i14] = i17;
                iMax = Math.max(iMax, i17);
                jArr3[i14] = ((long) i13) * j10;
                iArr3[i14] = 1;
                j11 += (long) iArr2[i14];
                i13 += iMin;
                i16 -= iMin;
                i14++;
            }
        }
        return new b(jArr2, iArr2, iMax, jArr3, iArr3, j10 * ((long) i13));
    }
}
