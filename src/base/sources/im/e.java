package im;

import jm.k0;
import kotlin.jvm.internal.p0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends kotlin.coroutines.jvm.internal.d {
        int A;
        /* synthetic */ Object B;
        int C;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f41495r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f41496s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f41497t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f41498u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f41499v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f41500w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        Object f41501x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        Object f41502y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f41503z;

        a(kl.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.B = obj;
            this.C |= Integer.MIN_VALUE;
            return e.b(null, null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(kl.j jVar, Object obj, Object obj2, tl.o oVar, kl.f fVar) throws Throwable {
        a aVar;
        Object objI;
        Object objE;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.C = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        Object obj3 = aVar.B;
        Object objF = ll.b.f();
        int i11 = aVar.C;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj4 = aVar.f41501x;
            kl.j jVar2 = (kl.j) aVar.f41499v;
            try {
                fl.s.b(obj3);
                objI = obj4;
                jVar = jVar2;
                objE = obj3;
                k0.f(jVar, objI);
                return objE;
            } catch (Throwable th2) {
                th = th2;
                objI = obj4;
                jVar = jVar2;
                k0.f(jVar, objI);
                throw th;
            }
        }
        fl.s.b(obj3);
        objI = k0.i(jVar, obj2);
        try {
            aVar.f41495r = jVar;
            aVar.f41496s = obj;
            aVar.f41497t = kotlin.coroutines.jvm.internal.l.a(obj2);
            aVar.f41498u = oVar;
            aVar.f41499v = jVar;
            aVar.f41500w = kotlin.coroutines.jvm.internal.l.a(obj2);
            aVar.f41501x = objI;
            aVar.f41502y = aVar;
            aVar.f41503z = 0;
            aVar.A = 0;
            aVar.C = 1;
            u uVar = new u(aVar, jVar);
            objE = !(oVar instanceof kotlin.coroutines.jvm.internal.a) ? ll.b.e(oVar, obj, uVar) : ((tl.o) p0.e(oVar, 2)).invoke(obj, uVar);
            if (objE == ll.b.f()) {
                kotlin.coroutines.jvm.internal.h.c(aVar);
            }
            if (objE == objF) {
                return objF;
            }
            k0.f(jVar, objI);
            return objE;
        } catch (Throwable th3) {
            th = th3;
            k0.f(jVar, objI);
            throw th;
        }
    }

    public static /* synthetic */ Object c(kl.j jVar, Object obj, Object obj2, tl.o oVar, kl.f fVar, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = k0.g(jVar);
        }
        return b(jVar, obj, obj2, oVar, fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hm.f d(hm.f fVar, kl.j jVar) {
        return ((fVar instanceof t) || (fVar instanceof m)) ? fVar : new w(fVar, jVar);
    }
}
