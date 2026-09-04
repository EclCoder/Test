package v3;

import android.util.Pair;
import androidx.media3.common.ParserException;
import o2.q;
import w1.c0;
import w1.n;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f55151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f55152b;

        private a(int i10, long j10) {
            this.f55151a = i10;
            this.f55152b = j10;
        }

        public static a a(q qVar, u uVar) {
            qVar.peekFully(uVar.e(), 0, 8);
            uVar.T(0);
            return new a(uVar.p(), uVar.w());
        }
    }

    public static boolean a(q qVar) {
        u uVar = new u(8);
        int i10 = a.a(qVar, uVar).f55151a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        qVar.peekFully(uVar.e(), 0, 4);
        uVar.T(0);
        int iP = uVar.p();
        if (iP == 1463899717) {
            return true;
        }
        n.c("WavHeaderReader", "Unsupported form type: " + iP);
        return false;
    }

    public static c b(q qVar) throws ParserException {
        byte[] bArr;
        u uVar = new u(16);
        a aVarD = d(1718449184, qVar, uVar);
        w1.a.g(aVarD.f55152b >= 16);
        qVar.peekFully(uVar.e(), 0, 16);
        uVar.T(0);
        int iY = uVar.y();
        int iY2 = uVar.y();
        int iX = uVar.x();
        int iX2 = uVar.x();
        int iY3 = uVar.y();
        int iY4 = uVar.y();
        int i10 = ((int) aVarD.f55152b) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            qVar.peekFully(bArr, 0, i10);
        } else {
            bArr = c0.f55774f;
        }
        byte[] bArr2 = bArr;
        qVar.skipFully((int) (qVar.getPeekPosition() - qVar.getPosition()));
        return new c(iY, iY2, iX, iX2, iY3, iY4, bArr2);
    }

    public static long c(q qVar) {
        u uVar = new u(8);
        a aVarA = a.a(qVar, uVar);
        if (aVarA.f55151a != 1685272116) {
            qVar.resetPeekPosition();
            return -1L;
        }
        qVar.advancePeekPosition(8);
        uVar.T(0);
        qVar.peekFully(uVar.e(), 0, 8);
        long jU = uVar.u();
        qVar.skipFully(((int) aVarA.f55152b) + 8);
        return jU;
    }

    private static a d(int i10, q qVar, u uVar) throws ParserException {
        a aVarA = a.a(qVar, uVar);
        while (aVarA.f55151a != i10) {
            n.h("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarA.f55151a);
            long j10 = aVarA.f55152b;
            long j11 = 8 + j10;
            if (j10 % 2 != 0) {
                j11 = 9 + j10;
            }
            if (j11 > 2147483647L) {
                throw ParserException.c("Chunk is too large (~2GB+) to skip; id: " + aVarA.f55151a);
            }
            qVar.skipFully((int) j11);
            aVarA = a.a(qVar, uVar);
        }
        return aVarA;
    }

    public static Pair e(q qVar) throws ParserException {
        qVar.resetPeekPosition();
        a aVarD = d(1684108385, qVar, new u(8));
        qVar.skipFully(8);
        return Pair.create(Long.valueOf(qVar.getPosition()), Long.valueOf(aVarD.f55152b));
    }
}
