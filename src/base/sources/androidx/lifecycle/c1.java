package androidx.lifecycle;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q1.a.c f4341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q1.a.c f4342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q1.a.c f4343c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements s1.c {
        a() {
        }

        @Override // androidx.lifecycle.s1.c
        public p1 c(zl.c modelClass, q1.a extras) {
            kotlin.jvm.internal.s.h(modelClass, "modelClass");
            kotlin.jvm.internal.s.h(extras, "extras");
            return new g1();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b implements q1.a.c {
        public String toString() {
            String string = Integer.toString(hashCode(), bm.a.a(16));
            kotlin.jvm.internal.s.g(string, "toString(...)");
            return "CreationExtras.Key@" + string + "<" + kotlin.jvm.internal.l0.b(n4.j.class).k() + ">";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements q1.a.c {
        public String toString() {
            String string = Integer.toString(hashCode(), bm.a.a(16));
            kotlin.jvm.internal.s.g(string, "toString(...)");
            return "CreationExtras.Key@" + string + "<" + kotlin.jvm.internal.l0.b(u1.class).k() + ">";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d implements q1.a.c {
        public String toString() {
            String string = Integer.toString(hashCode(), bm.a.a(16));
            kotlin.jvm.internal.s.g(string, "toString(...)");
            return "CreationExtras.Key@" + string + "<" + kotlin.jvm.internal.l0.b(Bundle.class).k() + ">";
        }
    }

    static {
        q1.a.C0771a c0771a = q1.a.f50286b;
        f4341a = new b();
        f4342b = new c();
        f4343c = new d();
    }

    private static final z0 a(n4.j jVar, u1 u1Var, String str, Bundle bundle) {
        f1 f1VarD = d(jVar);
        g1 g1VarE = e(u1Var);
        z0 z0Var = (z0) g1VarE.j().get(str);
        if (z0Var != null) {
            return z0Var;
        }
        z0 z0VarA = z0.f4563c.a(f1VarD.c(str), bundle);
        g1VarE.j().put(str, z0VarA);
        return z0VarA;
    }

    public static final z0 b(q1.a aVar) {
        kotlin.jvm.internal.s.h(aVar, "<this>");
        n4.j jVar = (n4.j) aVar.a(f4341a);
        if (jVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        u1 u1Var = (u1) aVar.a(f4342b);
        if (u1Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f4343c);
        String str = (String) aVar.a(s1.f4483c);
        if (str != null) {
            return a(jVar, u1Var, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    public static final void c(n4.j jVar) {
        kotlin.jvm.internal.s.h(jVar, "<this>");
        s.b bVarB = jVar.getLifecycle().b();
        if (bVarB == s.b.INITIALIZED || bVarB == s.b.CREATED) {
            if (jVar.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
                f1 f1Var = new f1(jVar.getSavedStateRegistry(), (u1) jVar);
                jVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", f1Var);
                jVar.getLifecycle().a(new a1(f1Var));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Failed to enable `SavedStateHandle` for `" + jVar + "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `" + bVarB + "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.").toString());
    }

    public static final f1 d(n4.j jVar) {
        kotlin.jvm.internal.s.h(jVar, "<this>");
        n4.g.b bVarB = jVar.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        f1 f1Var = bVarB instanceof f1 ? (f1) bVarB : null;
        if (f1Var != null) {
            return f1Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final g1 e(u1 u1Var) {
        kotlin.jvm.internal.s.h(u1Var, "<this>");
        return (g1) s1.b.d(s1.f4482b, u1Var, new a(), null, 4, null).b("androidx.lifecycle.internal.SavedStateHandlesVM", kotlin.jvm.internal.l0.b(g1.class));
    }
}
