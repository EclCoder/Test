package u9;

import com.google.android.exoplayer2.ParserException;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f54306a;
    }

    private static boolean a(ob.d0 d0Var, t tVar, int i10) {
        int iJ = j(d0Var, i10);
        return iJ != -1 && iJ <= tVar.f54311b;
    }

    private static boolean b(ob.d0 d0Var, int i10) {
        return d0Var.H() == r0.u(d0Var.e(), i10, d0Var.f() - 1, 0);
    }

    private static boolean c(ob.d0 d0Var, t tVar, boolean z10, a aVar) {
        try {
            long jO = d0Var.O();
            if (!z10) {
                jO *= (long) tVar.f54311b;
            }
            aVar.f54306a = jO;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(ob.d0 d0Var, t tVar, int i10, a aVar) {
        int iF = d0Var.f();
        long J = d0Var.J();
        long j10 = J >>> 16;
        if (j10 != i10) {
            return false;
        }
        return g((int) ((J >> 4) & 15), tVar) && f((int) ((J >> 1) & 7), tVar) && !(((J & 1) > 1L ? 1 : ((J & 1) == 1L ? 0 : -1)) == 0) && c(d0Var, tVar, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(d0Var, tVar, (int) ((J >> 12) & 15)) && e(d0Var, tVar, (int) ((J >> 8) & 15)) && b(d0Var, iF);
    }

    private static boolean e(ob.d0 d0Var, t tVar, int i10) {
        int i11 = tVar.f54314e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == tVar.f54315f;
        }
        if (i10 == 12) {
            return d0Var.H() * 1000 == i11;
        }
        if (i10 <= 14) {
            int iN = d0Var.N();
            if (i10 == 14) {
                iN *= 10;
            }
            if (iN == i11) {
                return true;
            }
        }
        return false;
    }

    private static boolean f(int i10, t tVar) {
        return i10 == 0 || i10 == tVar.f54318i;
    }

    private static boolean g(int i10, t tVar) {
        if (i10 <= 7) {
            return i10 == tVar.f54316g - 1;
        }
        return i10 <= 10 && tVar.f54316g == 2;
    }

    public static boolean h(l lVar, t tVar, int i10, a aVar) {
        long peekPosition = lVar.getPeekPosition();
        byte[] bArr = new byte[2];
        lVar.peekFully(bArr, 0, 2);
        if ((((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) != i10) {
            lVar.resetPeekPosition();
            lVar.advancePeekPosition((int) (peekPosition - lVar.getPosition()));
            return false;
        }
        ob.d0 d0Var = new ob.d0(16);
        System.arraycopy(bArr, 0, d0Var.e(), 0, 2);
        d0Var.T(n.c(lVar, d0Var.e(), 2, 14));
        lVar.resetPeekPosition();
        lVar.advancePeekPosition((int) (peekPosition - lVar.getPosition()));
        return d(d0Var, tVar, i10, aVar);
    }

    public static long i(l lVar, t tVar) throws ParserException {
        lVar.resetPeekPosition();
        lVar.advancePeekPosition(1);
        byte[] bArr = new byte[1];
        lVar.peekFully(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        lVar.advancePeekPosition(2);
        int i10 = z10 ? 7 : 6;
        ob.d0 d0Var = new ob.d0(i10);
        d0Var.T(n.c(lVar, d0Var.e(), 0, i10));
        lVar.resetPeekPosition();
        a aVar = new a();
        if (c(d0Var, tVar, z10, aVar)) {
            return aVar.f54306a;
        }
        throw ParserException.a(null, null);
    }

    public static int j(ob.d0 d0Var, int i10) {
        switch (i10) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return d0Var.H() + 1;
            case 7:
                return d0Var.N() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
