package gm;

import em.i0;
import em.o0;
import em.q0;
import em.z1;
import fl.g0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f39405r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f39406s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f39407t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f39408u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f39409v;

        a(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f39408u = obj;
            this.f39409v |= Integer.MIN_VALUE;
            return q.a(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ em.o f39410a;

        b(em.o oVar) {
            this.f39410a = oVar;
        }

        public final void a(Throwable th2) {
            em.o oVar = this.f39410a;
            fl.r.a aVar = fl.r.f38769b;
            oVar.resumeWith(fl.r.b(g0.f38750a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return g0.f38750a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(s sVar, tl.a aVar, kl.f fVar) {
        a aVar2;
        if (fVar instanceof a) {
            aVar2 = (a) fVar;
            int i10 = aVar2.f39409v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar2.f39409v = i10 - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(fVar);
            }
        } else {
            aVar2 = new a(fVar);
        }
        Object obj = aVar2.f39408u;
        Object objF = ll.b.f();
        int i11 = aVar2.f39409v;
        try {
            if (i11 == 0) {
                fl.s.b(obj);
                if (aVar2.getContext().get(z1.f38078x2) != sVar) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                aVar2.f39405r = sVar;
                aVar2.f39406s = aVar;
                aVar2.f39407t = 0;
                aVar2.f39409v = 1;
                em.q qVar = new em.q(ll.b.c(aVar2), 1);
                qVar.H();
                sVar.d(new b(qVar));
                Object objB = qVar.B();
                if (objB == ll.b.f()) {
                    kotlin.coroutines.jvm.internal.h.c(aVar2);
                }
                if (objB == objF) {
                    return objF;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (tl.a) aVar2.f39406s;
                fl.s.b(obj);
            }
            aVar.invoke();
            return g0.f38750a;
        } catch (Throwable th2) {
            aVar.invoke();
            throw th2;
        }
    }

    public static final t b(o0 o0Var, kl.j jVar, int i10, gm.a aVar, q0 q0Var, Function1 function1, tl.o oVar) {
        r rVar = new r(i0.j(o0Var, jVar), j.b(i10, aVar, null, 4, null));
        if (function1 != null) {
            rVar.q(function1);
        }
        rVar.T0(q0Var, rVar, oVar);
        return rVar;
    }

    public static /* synthetic */ t c(o0 o0Var, kl.j jVar, int i10, gm.a aVar, q0 q0Var, Function1 function1, tl.o oVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jVar = kl.k.f43531a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            aVar = gm.a.SUSPEND;
        }
        if ((i11 & 8) != 0) {
            q0Var = q0.DEFAULT;
        }
        if ((i11 & 16) != 0) {
            function1 = null;
        }
        Function1 function2 = function1;
        return b(o0Var, jVar, i10, aVar, q0Var, function2, oVar);
    }
}
