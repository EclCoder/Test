package pm;

import java.util.List;
import kotlin.jvm.functions.Function1;
import tm.r2;
import tm.y1;
import tm.z1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r2 f50262a = tm.o.a(new Function1() { // from class: pm.m
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return s.k((zl.c) obj);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final r2 f50263b = tm.o.a(new Function1() { // from class: pm.n
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return s.l((zl.c) obj);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final y1 f50264c = tm.o.b(new tl.o() { // from class: pm.o
        @Override // tl.o
        public final Object invoke(Object obj, Object obj2) {
            return s.g((zl.c) obj, (List) obj2);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final y1 f50265d = tm.o.b(new tl.o() { // from class: pm.p
        @Override // tl.o
        public final Object invoke(Object obj, Object obj2) {
            return s.i((zl.c) obj, (List) obj2);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final d g(zl.c clazz, final List types) {
        kotlin.jvm.internal.s.h(clazz, "clazz");
        kotlin.jvm.internal.s.h(types, "types");
        List listF = t.f(vm.c.a(), types, true);
        kotlin.jvm.internal.s.e(listF);
        return t.a(clazz, listF, new tl.a() { // from class: pm.q
            @Override // tl.a
            public final Object invoke() {
                return s.h(types);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zl.d h(List list) {
        return ((zl.l) list.get(0)).i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d i(zl.c clazz, final List types) {
        d dVarT;
        kotlin.jvm.internal.s.h(clazz, "clazz");
        kotlin.jvm.internal.s.h(types, "types");
        List listF = t.f(vm.c.a(), types, true);
        kotlin.jvm.internal.s.e(listF);
        d dVarA = t.a(clazz, listF, new tl.a() { // from class: pm.r
            @Override // tl.a
            public final Object invoke() {
                return s.j(types);
            }
        });
        if (dVarA == null || (dVarT = qm.a.t(dVarA)) == null) {
            return null;
        }
        return dVarT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zl.d j(List list) {
        return ((zl.l) list.get(0)).i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d k(zl.c it) {
        kotlin.jvm.internal.s.h(it, "it");
        d dVarE = t.e(it);
        if (dVarE != null) {
            return dVarE;
        }
        if (z1.l(it)) {
            return new h(it);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d l(zl.c it) {
        d dVarT;
        kotlin.jvm.internal.s.h(it, "it");
        d dVarE = t.e(it);
        if (dVarE == null) {
            dVarE = z1.l(it) ? new h(it) : null;
        }
        if (dVarE == null || (dVarT = qm.a.t(dVarE)) == null) {
            return null;
        }
        return dVarT;
    }

    public static final d m(zl.c clazz, boolean z10) {
        kotlin.jvm.internal.s.h(clazz, "clazz");
        if (z10) {
            return f50263b.a(clazz);
        }
        d dVarA = f50262a.a(clazz);
        if (dVarA != null) {
            return dVarA;
        }
        return null;
    }

    public static final Object n(zl.c clazz, List types, boolean z10) {
        kotlin.jvm.internal.s.h(clazz, "clazz");
        kotlin.jvm.internal.s.h(types, "types");
        return !z10 ? f50264c.a(clazz, types) : f50265d.a(clazz, types);
    }
}
