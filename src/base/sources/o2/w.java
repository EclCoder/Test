package o2;

import androidx.media3.common.ParserException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public y f48168a;

        public a(y yVar) {
            this.f48168a = yVar;
        }
    }

    public static boolean a(q qVar) {
        w1.u uVar = new w1.u(4);
        qVar.peekFully(uVar.e(), 0, 4);
        return uVar.I() == 1716281667;
    }

    public static int b(q qVar) throws ParserException {
        qVar.resetPeekPosition();
        w1.u uVar = new w1.u(2);
        qVar.peekFully(uVar.e(), 0, 2);
        int iM = uVar.M();
        if ((iM >> 2) == 16382) {
            qVar.resetPeekPosition();
            return iM;
        }
        qVar.resetPeekPosition();
        throw ParserException.a("First frame does not start with sync code.", null);
    }

    public static t1.u c(q qVar, boolean z10) throws Throwable {
        t1.u uVarA = new d0().a(qVar, z10 ? null : c3.h.f9521b);
        if (uVarA == null || uVarA.f() == 0) {
            return null;
        }
        return uVarA;
    }

    public static t1.u d(q qVar, boolean z10) throws Throwable {
        qVar.resetPeekPosition();
        long peekPosition = qVar.getPeekPosition();
        t1.u uVarC = c(qVar, z10);
        qVar.skipFully((int) (qVar.getPeekPosition() - peekPosition));
        return uVarC;
    }

    public static boolean e(q qVar, a aVar) {
        qVar.resetPeekPosition();
        w1.t tVar = new w1.t(new byte[4]);
        qVar.peekFully(tVar.f55837a, 0, 4);
        boolean zG = tVar.g();
        int iH = tVar.h(7);
        int iH2 = tVar.h(24) + 4;
        if (iH == 0) {
            aVar.f48168a = h(qVar);
            return zG;
        }
        y yVar = aVar.f48168a;
        if (yVar == null) {
            throw new IllegalArgumentException();
        }
        if (iH == 3) {
            aVar.f48168a = yVar.b(f(qVar, iH2));
            return zG;
        }
        if (iH == 4) {
            aVar.f48168a = yVar.c(j(qVar, iH2));
            return zG;
        }
        if (iH != 6) {
            qVar.skipFully(iH2);
            return zG;
        }
        w1.u uVar = new w1.u(iH2);
        qVar.readFully(uVar.e(), 0, iH2);
        uVar.U(4);
        aVar.f48168a = yVar.a(com.google.common.collect.c0.D(a3.a.a(uVar)));
        return zG;
    }

    private static y.a f(q qVar, int i10) {
        w1.u uVar = new w1.u(i10);
        qVar.readFully(uVar.e(), 0, i10);
        return g(uVar);
    }

    public static y.a g(w1.u uVar) {
        uVar.U(1);
        int iJ = uVar.J();
        long jF = ((long) uVar.f()) + ((long) iJ);
        int i10 = iJ / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            long jZ = uVar.z();
            if (jZ == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jZ;
            jArrCopyOf2[i11] = uVar.z();
            uVar.U(2);
        }
        uVar.U((int) (jF - ((long) uVar.f())));
        return new y.a(jArrCopyOf, jArrCopyOf2);
    }

    private static y h(q qVar) {
        byte[] bArr = new byte[38];
        qVar.readFully(bArr, 0, 38);
        return new y(bArr, 4);
    }

    public static void i(q qVar) throws ParserException {
        w1.u uVar = new w1.u(4);
        qVar.readFully(uVar.e(), 0, 4);
        if (uVar.I() != 1716281667) {
            throw ParserException.a("Failed to read FLAC stream marker.", null);
        }
    }

    private static List j(q qVar, int i10) {
        w1.u uVar = new w1.u(i10);
        qVar.readFully(uVar.e(), 0, i10);
        uVar.U(4);
        return Arrays.asList(r0.k(uVar, false, false).f48150b);
    }
}
