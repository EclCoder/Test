package u9;

import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t f54307a;

        public a(t tVar) {
            this.f54307a = tVar;
        }
    }

    public static boolean a(l lVar) {
        ob.d0 d0Var = new ob.d0(4);
        lVar.peekFully(d0Var.e(), 0, 4);
        return d0Var.J() == 1716281667;
    }

    public static int b(l lVar) throws ParserException {
        lVar.resetPeekPosition();
        ob.d0 d0Var = new ob.d0(2);
        lVar.peekFully(d0Var.e(), 0, 2);
        int iN = d0Var.N();
        if ((iN >> 2) == 16382) {
            lVar.resetPeekPosition();
            return iN;
        }
        lVar.resetPeekPosition();
        throw ParserException.a("First frame does not start with sync code.", null);
    }

    public static ha.a c(l lVar, boolean z10) throws Throwable {
        ha.a aVarA = new w().a(lVar, z10 ? null : ma.h.f45388b);
        if (aVarA == null || aVarA.f() == 0) {
            return null;
        }
        return aVarA;
    }

    public static ha.a d(l lVar, boolean z10) throws Throwable {
        lVar.resetPeekPosition();
        long peekPosition = lVar.getPeekPosition();
        ha.a aVarC = c(lVar, z10);
        lVar.skipFully((int) (lVar.getPeekPosition() - peekPosition));
        return aVarC;
    }

    public static boolean e(l lVar, a aVar) {
        lVar.resetPeekPosition();
        ob.c0 c0Var = new ob.c0(new byte[4]);
        lVar.peekFully(c0Var.f48353a, 0, 4);
        boolean zG = c0Var.g();
        int iH = c0Var.h(7);
        int iH2 = c0Var.h(24) + 4;
        if (iH == 0) {
            aVar.f54307a = h(lVar);
            return zG;
        }
        t tVar = aVar.f54307a;
        if (tVar == null) {
            throw new IllegalArgumentException();
        }
        if (iH == 3) {
            aVar.f54307a = tVar.b(g(lVar, iH2));
            return zG;
        }
        if (iH == 4) {
            aVar.f54307a = tVar.c(j(lVar, iH2));
            return zG;
        }
        if (iH != 6) {
            lVar.skipFully(iH2);
            return zG;
        }
        ob.d0 d0Var = new ob.d0(iH2);
        lVar.readFully(d0Var.e(), 0, iH2);
        d0Var.V(4);
        aVar.f54307a = tVar.a(com.google.common.collect.c0.D(ka.a.a(d0Var)));
        return zG;
    }

    public static t.a f(ob.d0 d0Var) {
        d0Var.V(1);
        int iK = d0Var.K();
        long jF = ((long) d0Var.f()) + ((long) iK);
        int i10 = iK / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            long jA = d0Var.A();
            if (jA == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jA;
            jArrCopyOf2[i11] = d0Var.A();
            d0Var.V(2);
        }
        d0Var.V((int) (jF - ((long) d0Var.f())));
        return new t.a(jArrCopyOf, jArrCopyOf2);
    }

    private static t.a g(l lVar, int i10) {
        ob.d0 d0Var = new ob.d0(i10);
        lVar.readFully(d0Var.e(), 0, i10);
        return f(d0Var);
    }

    private static t h(l lVar) {
        byte[] bArr = new byte[38];
        lVar.readFully(bArr, 0, 38);
        return new t(bArr, 4);
    }

    public static void i(l lVar) throws ParserException {
        ob.d0 d0Var = new ob.d0(4);
        lVar.readFully(d0Var.e(), 0, 4);
        if (d0Var.J() != 1716281667) {
            throw ParserException.a("Failed to read FLAC stream marker.", null);
        }
    }

    private static List j(l lVar, int i10) {
        ob.d0 d0Var = new ob.d0(i10);
        lVar.readFully(d0Var.e(), 0, i10);
        d0Var.V(4);
        return Arrays.asList(e0.i(d0Var, false, false).f54269b);
    }
}
