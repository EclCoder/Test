package jm;

import em.b3;
import em.i1;
import em.w2;
import em.z1;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d0 f42652a = new d0("UNDEFINED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f42653b = new d0("REUSABLE_CLAIMED");

    public static final void b(kl.f fVar, Object obj) throws DispatchException {
        if (!(fVar instanceof h)) {
            fVar.resumeWith(obj);
            return;
        }
        h hVar = (h) fVar;
        Object objB = em.e0.b(obj);
        if (d(hVar.f42648d, hVar.getContext())) {
            hVar.f42650f = objB;
            hVar.f37958c = 1;
            c(hVar.f42648d, hVar.getContext(), hVar);
            return;
        }
        i1 i1VarB = w2.f38068a.b();
        if (i1VarB.e1()) {
            hVar.f42650f = objB;
            hVar.f37958c = 1;
            i1VarB.a1(hVar);
            return;
        }
        i1VarB.c1(true);
        try {
            z1 z1Var = (z1) hVar.getContext().get(z1.f38078x2);
            if (z1Var == null || z1Var.isActive()) {
                kl.f fVar2 = hVar.f42649e;
                Object obj2 = hVar.f42651g;
                kl.j context = fVar2.getContext();
                Object objI = k0.i(context, obj2);
                b3 b3VarM = objI != k0.f42663a ? em.i0.m(fVar2, context, objI) : null;
                try {
                    hVar.f42649e.resumeWith(obj);
                    fl.g0 g0Var = fl.g0.f38750a;
                    if (b3VarM == null || b3VarM.V0()) {
                        k0.f(context, objI);
                    }
                } catch (Throwable th2) {
                    if (b3VarM == null || b3VarM.V0()) {
                        k0.f(context, objI);
                    }
                    throw th2;
                }
            } else {
                CancellationException cancellationExceptionL = z1Var.l();
                hVar.b(objB, cancellationExceptionL);
                fl.r.a aVar = fl.r.f38769b;
                hVar.resumeWith(fl.r.b(fl.s.a(cancellationExceptionL)));
            }
            while (i1VarB.h1()) {
            }
        } catch (Throwable th3) {
            try {
                hVar.f(th3);
            } finally {
                i1VarB.X0(true);
            }
        }
    }

    public static final void c(em.k0 k0Var, kl.j jVar, Runnable runnable) throws DispatchException {
        try {
            k0Var.T0(jVar, runnable);
        } catch (Throwable th2) {
            throw new DispatchException(th2, k0Var, jVar);
        }
    }

    public static final boolean d(em.k0 k0Var, kl.j jVar) throws DispatchException {
        try {
            return k0Var.U0(jVar);
        } catch (Throwable th2) {
            throw new DispatchException(th2, k0Var, jVar);
        }
    }
}
