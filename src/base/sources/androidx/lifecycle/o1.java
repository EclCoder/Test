package androidx.lifecycle;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class o1 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a implements q0, kotlin.jvm.internal.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f4460a;

        a(Function1 function) {
            kotlin.jvm.internal.s.h(function, "function");
            this.f4460a = function;
        }

        @Override // kotlin.jvm.internal.m
        public final fl.g a() {
            return this.f4460a;
        }

        @Override // androidx.lifecycle.q0
        public final /* synthetic */ void d(Object obj) {
            this.f4460a.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof q0) && (obj instanceof kotlin.jvm.internal.m)) {
                return kotlin.jvm.internal.s.c(a(), ((kotlin.jvm.internal.m) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return a().hashCode();
        }
    }

    public static final k0 d(k0 k0Var, final Function1 transform) {
        kotlin.jvm.internal.s.h(k0Var, "<this>");
        kotlin.jvm.internal.s.h(transform, "transform");
        final n0 n0Var = k0Var.i() ? new n0(transform.invoke(k0Var.f())) : new n0();
        n0Var.r(k0Var, new a(new Function1() { // from class: androidx.lifecycle.l1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o1.e(n0Var, transform, obj);
            }
        }));
        return n0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 e(n0 n0Var, Function1 function1, Object obj) {
        n0Var.q(function1.invoke(obj));
        return fl.g0.f38750a;
    }

    public static final k0 f(k0 k0Var, final Function1 transform) {
        k0 k0Var2;
        kotlin.jvm.internal.s.h(k0Var, "<this>");
        kotlin.jvm.internal.s.h(transform, "transform");
        final kotlin.jvm.internal.k0 k0Var3 = new kotlin.jvm.internal.k0();
        final n0 n0Var = (k0Var.i() && (k0Var2 = (k0) transform.invoke(k0Var.f())) != null && k0Var2.i()) ? new n0(k0Var2.f()) : new n0();
        n0Var.r(k0Var, new a(new Function1() { // from class: androidx.lifecycle.m1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o1.g(transform, k0Var3, n0Var, obj);
            }
        }));
        return n0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 g(Function1 function1, kotlin.jvm.internal.k0 k0Var, final n0 n0Var, Object obj) {
        k0 k0Var2 = (k0) function1.invoke(obj);
        Object obj2 = k0Var.f43597a;
        if (obj2 != k0Var2) {
            if (obj2 != null) {
                kotlin.jvm.internal.s.e(obj2);
                n0Var.s((k0) obj2);
            }
            k0Var.f43597a = k0Var2;
            if (k0Var2 != null) {
                kotlin.jvm.internal.s.e(k0Var2);
                n0Var.r(k0Var2, new a(new Function1() { // from class: androidx.lifecycle.n1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return o1.h(n0Var, obj3);
                    }
                }));
            }
        }
        return fl.g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fl.g0 h(n0 n0Var, Object obj) {
        n0Var.q(obj);
        return fl.g0.f38750a;
    }
}
