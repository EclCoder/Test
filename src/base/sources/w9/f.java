package w9;

import com.google.common.collect.c0;
import com.google.common.collect.p1;
import ob.d0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f56011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f56012b;

    private f(int i10, c0 c0Var) {
        this.f56012b = i10;
        this.f56011a = c0Var;
    }

    private static a a(int i10, int i11, d0 d0Var) {
        switch (i10) {
            case 1718776947:
                return g.d(i11, d0Var);
            case 1751742049:
                return c.b(d0Var);
            case 1752331379:
                return d.c(d0Var);
            case 1852994675:
                return h.a(d0Var);
            default:
                return null;
        }
    }

    public static f c(int i10, d0 d0Var) {
        c0.a aVar = new c0.a();
        int iG = d0Var.g();
        int iB = -2;
        while (d0Var.a() > 8) {
            int iU = d0Var.u();
            int iF = d0Var.f() + d0Var.u();
            d0Var.T(iF);
            a aVarC = iU == 1414744396 ? c(d0Var.u(), d0Var) : a(iU, iB, d0Var);
            if (aVarC != null) {
                if (aVarC.getType() == 1752331379) {
                    iB = ((d) aVarC).b();
                }
                aVar.a(aVarC);
            }
            d0Var.U(iF);
            d0Var.T(iG);
        }
        return new f(i10, aVar.m());
    }

    public a b(Class cls) {
        p1 it = this.f56011a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // w9.a
    public int getType() {
        return this.f56012b;
    }
}
