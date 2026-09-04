package kotlin.jvm.internal;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class m0 {
    public zl.c b(Class cls) {
        return new i(cls);
    }

    public zl.e c(Class cls, String str) {
        return new y(cls, str);
    }

    public zl.l d(zl.l lVar) {
        r0 r0Var = (r0) lVar;
        return new r0(lVar.i(), lVar.g(), r0Var.o(), r0Var.n() | 2);
    }

    public String i(n nVar) {
        String string = nVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String j(t tVar) {
        return i(tVar);
    }

    public zl.l k(zl.d dVar, List list, boolean z10) {
        return new r0(dVar, list, z10);
    }

    public zl.f a(o oVar) {
        return oVar;
    }

    public zl.g e(v vVar) {
        return vVar;
    }

    public zl.h f(z zVar) {
        return zVar;
    }

    public zl.i g(b0 b0Var) {
        return b0Var;
    }

    public zl.j h(d0 d0Var) {
        return d0Var;
    }
}
