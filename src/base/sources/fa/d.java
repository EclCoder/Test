package fa;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import ob.d0;
import ob.r0;
import ob.u;
import u9.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class d {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f38444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f38445b;

        private a(int i10, long j10) {
            this.f38444a = i10;
            this.f38445b = j10;
        }

        public static a a(l lVar, d0 d0Var) {
            lVar.peekFully(d0Var.e(), 0, 8);
            d0Var.U(0);
            return new a(d0Var.q(), d0Var.x());
        }
    }

    public static boolean a(l lVar) {
        d0 d0Var = new d0(8);
        int i10 = a.a(lVar, d0Var).f38444a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        lVar.peekFully(d0Var.e(), 0, 4);
        d0Var.U(0);
        int iQ = d0Var.q();
        if (iQ == 1463899717) {
            return true;
        }
        u.c("WavHeaderReader", "Unsupported form type: " + iQ);
        return false;
    }

    public static c b(l lVar) throws ParserException {
        byte[] bArr;
        d0 d0Var = new d0(16);
        a aVarD = d(1718449184, lVar, d0Var);
        ob.a.g(aVarD.f38445b >= 16);
        lVar.peekFully(d0Var.e(), 0, 16);
        d0Var.U(0);
        int iZ = d0Var.z();
        int iZ2 = d0Var.z();
        int iY = d0Var.y();
        int iY2 = d0Var.y();
        int iZ3 = d0Var.z();
        int iZ4 = d0Var.z();
        int i10 = ((int) aVarD.f38445b) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            lVar.peekFully(bArr, 0, i10);
        } else {
            bArr = r0.f48430f;
        }
        byte[] bArr2 = bArr;
        lVar.skipFully((int) (lVar.getPeekPosition() - lVar.getPosition()));
        return new c(iZ, iZ2, iY, iY2, iZ3, iZ4, bArr2);
    }

    public static long c(l lVar) {
        d0 d0Var = new d0(8);
        a aVarA = a.a(lVar, d0Var);
        if (aVarA.f38444a != 1685272116) {
            lVar.resetPeekPosition();
            return -1L;
        }
        lVar.advancePeekPosition(8);
        d0Var.U(0);
        lVar.peekFully(d0Var.e(), 0, 8);
        long jV = d0Var.v();
        lVar.skipFully(((int) aVarA.f38445b) + 8);
        return jV;
    }

    private static a d(int i10, l lVar, d0 d0Var) throws ParserException {
        a aVarA = a.a(lVar, d0Var);
        while (aVarA.f38444a != i10) {
            u.i("WavHeaderReader", "Ignoring unknown WAV chunk: " + aVarA.f38444a);
            long j10 = aVarA.f38445b + 8;
            if (j10 > 2147483647L) {
                throw ParserException.e("Chunk is too large (~2GB+) to skip; id: " + aVarA.f38444a);
            }
            lVar.skipFully((int) j10);
            aVarA = a.a(lVar, d0Var);
        }
        return aVarA;
    }

    public static Pair e(l lVar) throws ParserException {
        lVar.resetPeekPosition();
        a aVarD = d(1684108385, lVar, new d0(8));
        lVar.skipFully(8);
        return Pair.create(Long.valueOf(lVar.getPosition()), Long.valueOf(aVarD.f38445b));
    }
}
