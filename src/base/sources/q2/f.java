package q2;

import com.google.common.collect.c0;
import com.google.common.collect.p1;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f50337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50338b;

    private f(int i10, c0 c0Var) {
        this.f50338b = i10;
        this.f50337a = c0Var;
    }

    private static a a(int i10, int i11, u uVar) {
        switch (i10) {
            case 1718776947:
                return g.d(i11, uVar);
            case 1751742049:
                return c.b(uVar);
            case 1752331379:
                return d.c(uVar);
            case 1852994675:
                return h.a(uVar);
            default:
                return null;
        }
    }

    public static f c(int i10, u uVar) {
        c0.a aVar = new c0.a();
        int iG = uVar.g();
        int iB = -2;
        while (uVar.a() > 8) {
            int iT = uVar.t();
            int iF = uVar.f() + uVar.t();
            uVar.S(iF);
            a aVarC = iT == 1414744396 ? c(uVar.t(), uVar) : a(iT, iB, uVar);
            if (aVarC != null) {
                if (aVarC.getType() == 1752331379) {
                    iB = ((d) aVarC).b();
                }
                aVar.a(aVarC);
            }
            uVar.T(iF);
            uVar.S(iG);
        }
        return new f(i10, aVar.m());
    }

    public a b(Class cls) {
        p1 it = this.f50337a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // q2.a
    public int getType() {
        return this.f50338b;
    }
}
