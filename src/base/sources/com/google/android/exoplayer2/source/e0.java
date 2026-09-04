package com.google.android.exoplayer2.source;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface e0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Random f17623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f17624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f17625c;

        public a(int i10) {
            this(i10, new Random());
        }

        private static int[] b(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int iNextInt = random.nextInt(i12);
                iArr[i11] = iArr[iNextInt];
                iArr[iNextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        @Override // com.google.android.exoplayer2.source.e0
        public e0 a(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.f17624b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f17624b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f17623a.nextLong()));
                }
                int i15 = iArr2[i13];
                if (i15 < i10 || i15 >= i11) {
                    int i16 = i13 - i14;
                    if (i15 >= i10) {
                        i15 -= i12;
                    }
                    iArr[i16] = i15;
                } else {
                    i14++;
                }
                i13++;
            }
        }

        @Override // com.google.android.exoplayer2.source.e0
        public e0 cloneAndClear() {
            return new a(0, new Random(this.f17623a.nextLong()));
        }

        @Override // com.google.android.exoplayer2.source.e0
        public e0 cloneAndInsert(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f17623a.nextInt(this.f17624b.length + 1);
                int i14 = i13 + 1;
                int iNextInt = this.f17623a.nextInt(i14);
                iArr2[i13] = iArr2[iNextInt];
                iArr2[iNextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f17624b.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f17624b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f17623a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    int i18 = iArr4[i16];
                    iArr3[i12] = i18;
                    if (i18 >= i10) {
                        iArr3[i12] = i18 + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        @Override // com.google.android.exoplayer2.source.e0
        public int getFirstIndex() {
            int[] iArr = this.f17624b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.e0
        public int getLastIndex() {
            int[] iArr = this.f17624b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.e0
        public int getLength() {
            return this.f17624b.length;
        }

        @Override // com.google.android.exoplayer2.source.e0
        public int getNextIndex(int i10) {
            int i11 = this.f17625c[i10] + 1;
            int[] iArr = this.f17624b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.e0
        public int getPreviousIndex(int i10) {
            int i11 = this.f17625c[i10] - 1;
            if (i11 >= 0) {
                return this.f17624b[i11];
            }
            return -1;
        }

        private a(int i10, Random random) {
            this(b(i10, random), random);
        }

        private a(int[] iArr, Random random) {
            this.f17624b = iArr;
            this.f17623a = random;
            this.f17625c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f17625c[iArr[i10]] = i10;
            }
        }
    }

    e0 a(int i10, int i11);

    e0 cloneAndClear();

    e0 cloneAndInsert(int i10, int i11);

    int getFirstIndex();

    int getLastIndex();

    int getLength();

    int getNextIndex(int i10);

    int getPreviousIndex(int i10);
}
