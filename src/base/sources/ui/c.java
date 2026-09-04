package ui;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f54686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static byte[] f54687b;

    public static void a(int i10) {
        f54686a = new byte[i10];
        f54687b = new byte[i10];
    }

    public static byte[] b(byte[] bArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = i12 - 1;
        int i14 = 0;
        while (i13 >= 0) {
            f54686a[i14] = bArr[i13];
            i13--;
            i14++;
        }
        int i15 = (i12 / 4) + i12;
        int i16 = i15 - 1;
        while (i16 >= i12) {
            f54686a[i14] = bArr[i16];
            i16--;
            i14++;
        }
        int length = bArr.length - 1;
        while (length >= i15) {
            f54686a[i14] = bArr[length];
            length--;
            i14++;
        }
        return f54686a;
    }

    public static byte[] c(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            int i14 = 0;
            while (i14 < i11) {
                f54686a[i12] = bArr[(i14 * i10) + i13];
                i14++;
                i12++;
            }
        }
        int i15 = i11 * i10;
        int i16 = i15 / 4;
        int i17 = i16 / i10;
        int i18 = 0;
        while (true) {
            int i19 = i10 / 2;
            if (i18 >= i19) {
                return f54686a;
            }
            for (int i20 = 0; i20 < i17; i20++) {
                byte[] bArr2 = f54686a;
                int i21 = i12 + i16;
                int i22 = i10 * i20;
                int i23 = ((i16 + i15) + i22) - i18;
                bArr2[i21] = bArr[(i23 + i19) - 1];
                bArr2[i21 + 1] = bArr[(i23 + i10) - 1];
                int i24 = i12 + 1;
                int i25 = (i22 + i15) - i18;
                bArr2[i12] = bArr[(i25 + i19) - 1];
                i12 += 2;
                bArr2[i24] = bArr[(i25 + i10) - 1];
            }
            i18++;
        }
    }

    public static byte[] d(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = i11 - 1;
            while (i15 >= 0) {
                f54686a[i13] = bArr[(i15 * i10) + i14];
                i15--;
                i13++;
            }
        }
        int i16 = i11 * i10;
        int i17 = i16 / 4;
        int i18 = i17 / i10;
        while (true) {
            int i19 = i10 / 2;
            if (i12 >= i19) {
                return f54686a;
            }
            for (int i20 = i18 - 1; i20 >= 0; i20--) {
                byte[] bArr2 = f54686a;
                int i21 = i13 + i17;
                int i22 = i10 * i20;
                int i23 = i17 + i16 + i22 + i12;
                bArr2[i21] = bArr[i23 + i19];
                bArr2[i21 + 1] = bArr[i23];
                int i24 = i13 + 1;
                int i25 = i22 + i16 + i12;
                bArr2[i13] = bArr[i25 + i19];
                i13 += 2;
                bArr2[i24] = bArr[i25];
            }
            i12++;
        }
    }

    public static byte[] e(byte[] bArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = i12 / 4;
        System.arraycopy(bArr, 0, f54687b, 0, i12);
        int i14 = i12 + i13;
        System.arraycopy(bArr, i14, f54687b, i12, i13);
        System.arraycopy(bArr, i12, f54687b, i14, i13);
        return f54687b;
    }

    public static byte[] f(byte[] bArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = i12 / 4;
        System.arraycopy(bArr, 0, f54687b, 0, i12);
        for (int i14 = 0; i14 < i13; i14++) {
            byte[] bArr2 = f54687b;
            int i15 = (i14 * 2) + i12;
            int i16 = i12 + i14;
            bArr2[i15] = bArr[i16 + i13];
            bArr2[i15 + 1] = bArr[i16];
        }
        return f54687b;
    }
}
