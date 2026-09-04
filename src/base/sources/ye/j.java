package ye;

import com.google.zxing.FormatException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends q {
    @Override // ye.n, com.google.zxing.e
    public ue.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map map) {
        if (aVar == com.google.zxing.a.EAN_13) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(aVar)));
    }

    @Override // ye.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + p.b(str);
            } catch (FormatException e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!p.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int i10 = i.f57520f[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iB = n.b(zArr, 0, p.f57525a, true);
        for (int i11 = 1; i11 <= 6; i11++) {
            int iDigit = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                iDigit += 10;
            }
            iB += n.b(zArr, iB, p.f57529e[iDigit], false);
        }
        int iB2 = iB + n.b(zArr, iB, p.f57526b, false);
        for (int i12 = 7; i12 <= 12; i12++) {
            iB2 += n.b(zArr, iB2, p.f57528d[Character.digit(str.charAt(i12), 10)], true);
        }
        n.b(zArr, iB2, p.f57525a, true);
        return zArr;
    }
}
