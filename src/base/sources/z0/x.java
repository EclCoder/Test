package z0;

import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f58514a = new x();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.jvm.internal.t implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ em.o0 f58515a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(em.o0 o0Var) {
            super(1);
            this.f58515a = o0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s invoke(File it) {
            kotlin.jvm.internal.s.h(it, "it");
            return new w(this.f58515a.i0(), it);
        }
    }

    private x() {
    }

    public final h a(d0 serializer, a1.b bVar, List migrations, em.o0 scope, tl.a produceFile) {
        kotlin.jvm.internal.s.h(serializer, "serializer");
        kotlin.jvm.internal.s.h(migrations, "migrations");
        kotlin.jvm.internal.s.h(scope, "scope");
        kotlin.jvm.internal.s.h(produceFile, "produceFile");
        n nVar = new n(serializer, new a(scope), produceFile);
        List listE = gl.r.e(g.f58236a.b(migrations));
        d aVar = bVar;
        if (bVar == null) {
            aVar = new a1.a();
        }
        return new j(nVar, listE, aVar, scope);
    }
}
