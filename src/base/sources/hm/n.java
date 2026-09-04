package hm;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Function1 f40566a = new Function1() { // from class: hm.l
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return n.d(obj);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final tl.o f40567b = new tl.o() { // from class: hm.m
        @Override // tl.o
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(n.c(obj, obj2));
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(Object obj, Object obj2) {
        return kotlin.jvm.internal.s.c(obj, obj2);
    }

    public static final e e(e eVar) {
        return eVar instanceof i0 ? eVar : f(eVar, f40566a, f40567b);
    }

    private static final e f(e eVar, Function1 function1, tl.o oVar) {
        if (eVar instanceof d) {
            d dVar = (d) eVar;
            if (dVar.f40504b == function1 && dVar.f40505c == oVar) {
                return eVar;
            }
        }
        return new d(eVar, function1, oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj) {
        return obj;
    }
}
