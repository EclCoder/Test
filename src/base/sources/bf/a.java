package bf;

import com.google.zxing.c;
import com.google.zxing.e;
import df.f;
import java.util.Map;
import ue.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {
    private static b b(f fVar, int i10, int i11, int i12) {
        df.b bVarA = fVar.a();
        if (bVarA == null) {
            throw new IllegalStateException();
        }
        int iE = bVarA.e();
        int iD = bVarA.d();
        int i13 = i12 << 1;
        int i14 = iE + i13;
        int i15 = i13 + iD;
        int iMax = Math.max(i10, i14);
        int iMax2 = Math.max(i11, i15);
        int iMin = Math.min(iMax / i14, iMax2 / i15);
        int i16 = (iMax - (iE * iMin)) / 2;
        int i17 = (iMax2 - (iD * iMin)) / 2;
        b bVar = new b(iMax, iMax2);
        int i18 = 0;
        while (i18 < iD) {
            int i19 = 0;
            int i20 = i16;
            while (i19 < iE) {
                if (bVarA.b(i19, i18) == 1) {
                    bVar.k(i20, i17, iMin, iMin);
                }
                i19++;
                i20 += iMin;
            }
            i18++;
            i17 += iMin;
        }
        return bVar;
    }

    @Override // com.google.zxing.e
    public b a(String str, com.google.zxing.a aVar, int i10, int i11, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != com.google.zxing.a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(aVar)));
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
        }
        cf.a aVarValueOf = cf.a.L;
        int i12 = 4;
        if (map != null) {
            c cVar = c.ERROR_CORRECTION;
            if (map.containsKey(cVar)) {
                aVarValueOf = cf.a.valueOf(map.get(cVar).toString());
            }
            c cVar2 = c.MARGIN;
            if (map.containsKey(cVar2)) {
                i12 = Integer.parseInt(map.get(cVar2).toString());
            }
        }
        return b(df.c.n(str, aVarValueOf, map), i10, i11, i12);
    }
}
