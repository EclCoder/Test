package ui;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[] f54683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static byte[] f54684b;

    public static void a(int i10) {
        f54683a = new byte[i10];
        f54684b = new byte[i10];
    }

    public static byte[] b(byte[] bArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = 0;
        for (int i14 = i12 - 1; i14 >= 0; i14--) {
            f54683a[i13] = bArr[i14];
            i13++;
        }
        for (int i15 = ((i12 * 3) / 2) - 1; i15 >= i12; i15 -= 2) {
            byte[] bArr2 = f54683a;
            int i16 = i13 + 1;
            bArr2[i13] = bArr[i15 - 1];
            i13 += 2;
            bArr2[i16] = bArr[i15];
        }
        return f54683a;
    }

    public static byte[] c(byte[] bArr, int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = 0;
        for (int i14 = i12; i14 >= 0; i14--) {
            int i15 = 0;
            while (i15 < i11) {
                f54683a[i13] = bArr[(i15 * i10) + i14];
                i15++;
                i13++;
            }
        }
        int i16 = i10 * i11;
        int i17 = i11 / 2;
        while (i12 >= 0) {
            for (int i18 = i11; i18 < i17 + i11; i18++) {
                byte[] bArr2 = f54683a;
                int i19 = i16 + 1;
                int i20 = (i18 * i10) + i12;
                bArr2[i16] = bArr[i20 - 1];
                i16 += 2;
                bArr2[i19] = bArr[i20];
            }
            i12 -= 2;
        }
        return f54683a;
    }

    public static byte[] d(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = i11 - 1;
            while (i14 >= 0) {
                f54683a[i12] = bArr[(i14 * i10) + i13];
                i14--;
                i12++;
            }
        }
        int i15 = i10 * i11;
        int i16 = ((i15 * 3) / 2) - 1;
        for (int i17 = i10 - 1; i17 > 0; i17 -= 2) {
            for (int i18 = 0; i18 < i11 / 2; i18++) {
                byte[] bArr2 = f54683a;
                int i19 = i16 - 1;
                int i20 = (i18 * i10) + i15;
                bArr2[i16] = bArr[i20 + i17];
                i16 -= 2;
                bArr2[i19] = bArr[i20 + (i17 - 1)];
            }
        }
        return f54683a;
    }

    public static byte[] e(byte[] bArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = i12 / 4;
        System.arraycopy(bArr, 0, f54684b, 0, i12);
        for (int i14 = 0; i14 < i13; i14++) {
            byte[] bArr2 = f54684b;
            int i15 = i12 + i14;
            int i16 = (i14 * 2) + i12;
            bArr2[i15] = bArr[i16 + 1];
            bArr2[i15 + i13] = bArr[i16];
        }
        return f54684b;
    }

    public static byte[] f(byte[] bArr, int i10, int i11) {
        int i12 = i10 * i11;
        int i13 = i12 / 4;
        System.arraycopy(bArr, 0, f54684b, 0, i12);
        for (int i14 = 0; i14 < i13; i14++) {
            byte[] bArr2 = f54684b;
            int i15 = (i14 * 2) + i12;
            int i16 = i15 + 1;
            bArr2[i15] = bArr[i16];
            bArr2[i16] = bArr[i15];
        }
        return f54684b;
    }
}
