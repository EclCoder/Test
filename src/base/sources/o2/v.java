package o2;

import androidx.media3.common.ParserException;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f48167a;
    }

    private static boolean a(w1.u uVar, y yVar, int i10) {
        int iJ = j(uVar, i10);
        return iJ != -1 && iJ <= yVar.f48172b;
    }

    private static boolean b(w1.u uVar, int i10) {
        return uVar.G() == w1.c0.x(uVar.e(), i10, uVar.f() - 1, 0);
    }

    private static boolean c(w1.u uVar, y yVar, boolean z10, a aVar) {
        try {
            long jN = uVar.N();
            if (!z10) {
                jN *= (long) yVar.f48172b;
            }
            aVar.f48167a = jN;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(w1.u uVar, y yVar, int i10, a aVar) {
        int iF = uVar.f();
        long jI = uVar.I();
        long j10 = jI >>> 16;
        if (j10 != i10) {
            return false;
        }
        return g((int) ((jI >> 4) & 15), yVar) && f((int) ((jI >> 1) & 7), yVar) && !(((jI & 1) > 1L ? 1 : ((jI & 1) == 1L ? 0 : -1)) == 0) && c(uVar, yVar, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(uVar, yVar, (int) ((jI >> 12) & 15)) && e(uVar, yVar, (int) ((jI >> 8) & 15)) && b(uVar, iF);
    }

    private static boolean e(w1.u uVar, y yVar, int i10) {
        int i11 = yVar.f48175e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == yVar.f48176f;
        }
        if (i10 == 12) {
            return uVar.G() * 1000 == i11;
        }
        if (i10 <= 14) {
            int iM = uVar.M();
            if (i10 == 14) {
                iM *= 10;
            }
            if (iM == i11) {
                return true;
            }
        }
        return false;
    }

    private static boolean f(int i10, y yVar) {
        return i10 == 0 || i10 == yVar.f48179i;
    }

    private static boolean g(int i10, y yVar) {
        if (i10 <= 7) {
            return i10 == yVar.f48177g - 1;
        }
        return i10 <= 10 && yVar.f48177g == 2;
    }

    public static boolean h(q qVar, y yVar, int i10, a aVar) {
        long peekPosition = qVar.getPeekPosition();
        byte[] bArr = new byte[2];
        qVar.peekFully(bArr, 0, 2);
        if ((((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) != i10) {
            qVar.resetPeekPosition();
            qVar.advancePeekPosition((int) (peekPosition - qVar.getPosition()));
            return false;
        }
        w1.u uVar = new w1.u(16);
        System.arraycopy(bArr, 0, uVar.e(), 0, 2);
        uVar.S(s.c(qVar, uVar.e(), 2, 14));
        qVar.resetPeekPosition();
        qVar.advancePeekPosition((int) (peekPosition - qVar.getPosition()));
        return d(uVar, yVar, i10, aVar);
    }

    public static long i(q qVar, y yVar) throws ParserException {
        qVar.resetPeekPosition();
        qVar.advancePeekPosition(1);
        byte[] bArr = new byte[1];
        qVar.peekFully(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        qVar.advancePeekPosition(2);
        int i10 = z10 ? 7 : 6;
        w1.u uVar = new w1.u(i10);
        uVar.S(s.c(qVar, uVar.e(), 0, i10));
        qVar.resetPeekPosition();
        a aVar = new a();
        if (c(uVar, yVar, z10, aVar)) {
            return aVar.f48167a;
        }
        throw ParserException.a(null, null);
    }

    public static int j(w1.u uVar, int i10) {
        switch (i10) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return uVar.G() + 1;
            case 7:
                return uVar.M() + 1;
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
