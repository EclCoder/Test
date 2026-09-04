package hm;

import em.o0;
import em.z1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class j {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.m implements tl.o {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f40550r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ e f40551s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e eVar, kl.f fVar) {
            super(2, fVar);
            this.f40551s = eVar;
        }

        @Override // tl.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o0 o0Var, kl.f fVar) {
            return ((a) create(o0Var, fVar)).invokeSuspend(fl.g0.f38750a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kl.f create(Object obj, kl.f fVar) {
            return new a(this.f40551s, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = ll.b.f();
            int i10 = this.f40550r;
            if (i10 == 0) {
                fl.s.b(obj);
                e eVar = this.f40551s;
                this.f40550r = 1;
                if (g.h(eVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
            return fl.g0.f38750a;
        }
    }

    public static final Object a(e eVar, kl.f fVar) {
        Object objCollect = eVar.collect(im.m.f41533a, fVar);
        return objCollect == ll.b.f() ? objCollect : fl.g0.f38750a;
    }

    public static final Object b(e eVar, tl.o oVar, kl.f fVar) {
        Object objH = g.h(k.b(g.w(eVar, oVar), 0, null, 2, null), fVar);
        return objH == ll.b.f() ? objH : fl.g0.f38750a;
    }

    public static final Object c(f fVar, e eVar, kl.f fVar2) {
        g.o(fVar);
        Object objCollect = eVar.collect(fVar, fVar2);
        return objCollect == ll.b.f() ? objCollect : fl.g0.f38750a;
    }

    public static final z1 d(e eVar, o0 o0Var) {
        return em.k.d(o0Var, null, null, new a(eVar, null), 3, null);
    }
}
