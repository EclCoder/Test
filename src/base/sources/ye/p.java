package ye;

import com.google.zxing.FormatException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int[] f57525a = {1, 1, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f57526b = {1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f57527c = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int[][] f57528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[][] f57529e;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f57528d = iArr;
        int[][] iArr2 = new int[20][];
        f57529e = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i10 = 10; i10 < 20; i10++) {
            int[] iArr3 = f57528d[i10 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                iArr4[i11] = iArr3[(iArr3.length - i11) - 1];
            }
            f57529e[i10] = iArr4;
        }
    }

    static boolean a(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i10 = length - 1;
        return b(charSequence.subSequence(0, i10)) == Character.digit(charSequence.charAt(i10), 10);
    }

    static int b(CharSequence charSequence) throws FormatException {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            int iCharAt = charSequence.charAt(i11) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw FormatException.d();
            }
            i10 += iCharAt;
        }
        int i12 = i10 * 3;
        for (int i13 = length - 2; i13 >= 0; i13 -= 2) {
            int iCharAt2 = charSequence.charAt(i13) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw FormatException.d();
            }
            i12 += iCharAt2;
        }
        return (1000 - i12) % 10;
    }
}
