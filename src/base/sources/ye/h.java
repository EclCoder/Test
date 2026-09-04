package ye;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class h extends n {
    private static int f(boolean[] zArr, int i10, int[] iArr) {
        int length = iArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i10 + 1;
            zArr[i10] = iArr[i11] != 0;
            i11++;
            i10 = i12;
        }
        return 9;
    }

    private static int g(String str, int i10) {
        int iIndexOf = 0;
        int i11 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i11;
            i11++;
            if (i11 > i10) {
                i11 = 1;
            }
        }
        return iIndexOf % 47;
    }

    private static void h(int i10, int[] iArr) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) == 0) {
                i12 = 0;
            }
            iArr[i11] = i12;
        }
    }

    @Override // ye.n, com.google.zxing.e
    public ue.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map map) {
        if (aVar == com.google.zxing.a.CODE_93) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(aVar)));
    }

    @Override // ye.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        int[] iArr = new int[9];
        int length2 = ((str.length() + 4) * 9) + 1;
        h(g.f57518b[47], iArr);
        boolean[] zArr = new boolean[length2];
        int iF = f(zArr, 0, iArr);
        for (int i10 = 0; i10 < length; i10++) {
            h(g.f57518b["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i10))], iArr);
            iF += f(zArr, iF, iArr);
        }
        int iG = g(str, 20);
        int[] iArr2 = g.f57518b;
        h(iArr2[iG], iArr);
        int iF2 = iF + f(zArr, iF, iArr);
        h(iArr2[g(str + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iG), 15)], iArr);
        int iF3 = iF2 + f(zArr, iF2, iArr);
        h(iArr2[47], iArr);
        zArr[iF3 + f(zArr, iF3, iArr)] = true;
        return zArr;
    }
}
