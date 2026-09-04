package ye;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n implements com.google.zxing.e {
    protected static int b(boolean[] zArr, int i10, int[] iArr, boolean z10) {
        int i11 = 0;
        for (int i12 : iArr) {
            int i13 = 0;
            while (i13 < i12) {
                zArr[i10] = z10;
                i13++;
                i10++;
            }
            i11 += i12;
            z10 = !z10;
        }
        return i11;
    }

    private static ue.b e(boolean[] zArr, int i10, int i11, int i12) {
        int length = zArr.length;
        int i13 = i12 + length;
        int iMax = Math.max(i10, i13);
        int iMax2 = Math.max(1, i11);
        int i14 = iMax / i13;
        int i15 = (iMax - (length * i14)) / 2;
        ue.b bVar = new ue.b(iMax, iMax2);
        int i16 = 0;
        while (i16 < length) {
            if (zArr[i16]) {
                bVar.k(i15, 0, i14, iMax2);
            }
            i16++;
            i15 += i14;
        }
        return bVar;
    }

    @Override // com.google.zxing.e
    public ue.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i10 + 'x' + i11);
        }
        int iD = d();
        if (map != null) {
            com.google.zxing.c cVar = com.google.zxing.c.MARGIN;
            if (map.containsKey(cVar)) {
                iD = Integer.parseInt(map.get(cVar).toString());
            }
        }
        return e(c(str), i10, i11, iD);
    }

    public abstract boolean[] c(String str);

    public int d() {
        return 10;
    }
}
