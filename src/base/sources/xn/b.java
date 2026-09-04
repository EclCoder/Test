package xn;

import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b {
    public static final boolean a(byte[] a10, int i10, byte[] b10, int i11, int i12) {
        kotlin.jvm.internal.s.h(a10, "a");
        kotlin.jvm.internal.s.h(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final int c(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final long d(long j10) {
        return ((j10 & 255) << 56) | (((-72057594037927936L) & j10) >>> 56) | ((71776119061217280L & j10) >>> 40) | ((280375465082880L & j10) >>> 24) | ((1095216660480L & j10) >>> 8) | ((4278190080L & j10) << 8) | ((16711680 & j10) << 24) | ((65280 & j10) << 40);
    }

    public static final short e(short s10) {
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    public static final String f(byte b10) {
        return bm.r.u(new char[]{yn.b.d()[(b10 >> 4) & 15], yn.b.d()[b10 & 15]});
    }

    public static final String g(int i10) {
        if (i10 == 0) {
            return MBridgeConstans.ENDCARD_URL_TYPE_PL;
        }
        int i11 = 0;
        char[] cArr = {yn.b.d()[(i10 >> 28) & 15], yn.b.d()[(i10 >> 24) & 15], yn.b.d()[(i10 >> 20) & 15], yn.b.d()[(i10 >> 16) & 15], yn.b.d()[(i10 >> 12) & 15], yn.b.d()[(i10 >> 8) & 15], yn.b.d()[(i10 >> 4) & 15], yn.b.d()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return bm.r.v(cArr, i11, 8);
    }
}
