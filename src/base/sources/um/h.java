package um;

import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class h {
    public static /* synthetic */ String a(long j10, int i10) {
        if (j10 == 0) {
            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        if (j10 > 0) {
            return Long.toString(j10, i10);
        }
        if (i10 < 2 || i10 > 36) {
            i10 = 10;
        }
        int i11 = 64;
        char[] cArr = new char[64];
        int i12 = i10 - 1;
        if ((i10 & i12) == 0) {
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i10);
            do {
                i11--;
                cArr[i11] = Character.forDigit(((int) j10) & i12, i10);
                j10 >>>= iNumberOfTrailingZeros;
            } while (j10 != 0);
        } else {
            long jA = (i10 & 1) == 0 ? (j10 >>> 1) / ((long) (i10 >>> 1)) : bm.i0.a(j10, i10);
            long j11 = i10;
            cArr[63] = Character.forDigit((int) (j10 - (jA * j11)), i10);
            i11 = 63;
            while (jA > 0) {
                i11--;
                cArr[i11] = Character.forDigit((int) (jA % j11), i10);
                jA /= j11;
            }
        }
        return new String(cArr, i11, 64 - i11);
    }
}
