package jm;

import em.v2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f42663a = new d0("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final tl.o f42664b = new tl.o() { // from class: jm.h0
        @Override // tl.o
        public final Object invoke(Object obj, Object obj2) {
            return k0.d(obj, (kl.j.b) obj2);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final tl.o f42665c = new tl.o() { // from class: jm.i0
        @Override // tl.o
        public final Object invoke(Object obj, Object obj2) {
            return k0.e((v2) obj, (kl.j.b) obj2);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final tl.o f42666d = new tl.o() { // from class: jm.j0
        @Override // tl.o
        public final Object invoke(Object obj, Object obj2) {
            return k0.h((o0) obj, (kl.j.b) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj, kl.j.b bVar) {
        if (!(bVar instanceof v2)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v2 e(v2 v2Var, kl.j.b bVar) {
        if (v2Var != null) {
            return v2Var;
        }
        if (bVar instanceof v2) {
            return (v2) bVar;
        }
        return null;
    }

    public static final void f(kl.j jVar, Object obj) {
        if (obj == f42663a) {
            return;
        }
        if (obj instanceof o0) {
            ((o0) obj).b(jVar);
            return;
        }
        Object objFold = jVar.fold(null, f42665c);
        kotlin.jvm.internal.s.f(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((v2) objFold).m0(jVar, obj);
    }

    public static final Object g(kl.j jVar) {
        Object objFold = jVar.fold(0, f42664b);
        kotlin.jvm.internal.s.e(objFold);
        return objFold;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o0 h(o0 o0Var, kl.j.b bVar) {
        if (bVar instanceof v2) {
            v2 v2Var = (v2) bVar;
            o0Var.a(v2Var, v2Var.F0(o0Var.f42673a));
        }
        return o0Var;
    }

    public static final Object i(kl.j jVar, Object obj) {
        if (obj == null) {
            obj = g(jVar);
        }
        if (obj == 0) {
            return f42663a;
        }
        if (obj instanceof Integer) {
            return jVar.fold(new o0(jVar, ((Number) obj).intValue()), f42666d);
        }
        kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((v2) obj).F0(jVar);
    }
}
