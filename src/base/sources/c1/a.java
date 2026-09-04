package c1;

import android.content.Context;
import em.c1;
import em.o0;
import em.p0;
import em.u2;
import gl.r;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: c1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0123a extends t implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0123a f9248a = new C0123a();

        C0123a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(Context it) {
            s.h(it, "it");
            return r.l();
        }
    }

    public static final kotlin.properties.c a(String name, a1.b bVar, Function1 produceMigrations, o0 scope) {
        s.h(name, "name");
        s.h(produceMigrations, "produceMigrations");
        s.h(scope, "scope");
        return new c(name, bVar, produceMigrations, scope);
    }

    public static /* synthetic */ kotlin.properties.c b(String str, a1.b bVar, Function1 function1, o0 o0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            function1 = C0123a.f9248a;
        }
        if ((i10 & 8) != 0) {
            o0Var = p0.a(c1.b().plus(u2.b(null, 1, null)));
        }
        return a(str, bVar, function1, o0Var);
    }
}
