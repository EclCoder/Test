package z0;

import em.c1;
import em.p0;
import em.u2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f58270a = new i();

    private i() {
    }

    public static /* synthetic */ h c(i iVar, d0 d0Var, a1.b bVar, List list, em.o0 o0Var, tl.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            list = gl.r.l();
        }
        if ((i10 & 8) != 0) {
            o0Var = p0.a(c1.b().plus(u2.b(null, 1, null)));
        }
        return iVar.a(d0Var, bVar, list, o0Var, aVar);
    }

    public final h a(d0 serializer, a1.b bVar, List migrations, em.o0 scope, tl.a produceFile) {
        kotlin.jvm.internal.s.h(serializer, "serializer");
        kotlin.jvm.internal.s.h(migrations, "migrations");
        kotlin.jvm.internal.s.h(scope, "scope");
        kotlin.jvm.internal.s.h(produceFile, "produceFile");
        return b(new n(serializer, null, produceFile, 2, null), bVar, migrations, scope);
    }

    public final h b(i0 storage, a1.b bVar, List migrations, em.o0 scope) {
        kotlin.jvm.internal.s.h(storage, "storage");
        kotlin.jvm.internal.s.h(migrations, "migrations");
        kotlin.jvm.internal.s.h(scope, "scope");
        d aVar = bVar;
        if (bVar == null) {
            aVar = new a1.a();
        }
        return new j(storage, gl.r.e(g.f58236a.b(migrations)), aVar, scope);
    }
}
