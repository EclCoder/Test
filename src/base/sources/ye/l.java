package ye;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f57521a = {1, 1, 1, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f57522b = {3, 1, 1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[][] f57523c = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // ye.n, com.google.zxing.e
    public ue.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map map) {
        if (aVar == com.google.zxing.a.f22464i) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(aVar)));
    }

    @Override // ye.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[(length * 9) + 9];
        int iB = n.b(zArr, 0, f57521a, true);
        for (int i10 = 0; i10 < length; i10 += 2) {
            int iDigit = Character.digit(str.charAt(i10), 10);
            int iDigit2 = Character.digit(str.charAt(i10 + 1), 10);
            int[] iArr = new int[10];
            for (int i11 = 0; i11 < 5; i11++) {
                int i12 = i11 * 2;
                int[][] iArr2 = f57523c;
                iArr[i12] = iArr2[iDigit][i11];
                iArr[i12 + 1] = iArr2[iDigit2][i11];
            }
            iB += n.b(zArr, iB, iArr, true);
        }
        n.b(zArr, iB, f57522b, true);
        return zArr;
    }
}
