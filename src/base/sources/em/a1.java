package em;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a1 extends lm.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37958c;

    public a1(int i10) {
        this.f37958c = i10;
    }

    public abstract kl.f c();

    public Throwable d(Object obj) {
        d0 d0Var = obj instanceof d0 ? (d0) obj : null;
        if (d0Var != null) {
            return d0Var.f37973a;
        }
        return null;
    }

    public final void f(Throwable th2) {
        m0.a(c().getContext(), new r0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    public abstract Object g();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            kl.f fVarC = c();
            kotlin.jvm.internal.s.f(fVarC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            jm.h hVar = (jm.h) fVarC;
            kl.f fVar = hVar.f42649e;
            Object obj = hVar.f42651g;
            kl.j context = fVar.getContext();
            Object objI = jm.k0.i(context, obj);
            z1 z1Var = null;
            b3 b3VarM = objI != jm.k0.f42663a ? i0.m(fVar, context, objI) : null;
            try {
                kl.j context2 = fVar.getContext();
                Object objG = g();
                Throwable thD = d(objG);
                if (thD == null && b1.b(this.f37958c)) {
                    z1Var = (z1) context2.get(z1.f38078x2);
                }
                if (z1Var != null && !z1Var.isActive()) {
                    CancellationException cancellationExceptionL = z1Var.l();
                    b(objG, cancellationExceptionL);
                    fl.r.a aVar = fl.r.f38769b;
                    fVar.resumeWith(fl.r.b(fl.s.a(cancellationExceptionL)));
                } else if (thD != null) {
                    fl.r.a aVar2 = fl.r.f38769b;
                    fVar.resumeWith(fl.r.b(fl.s.a(thD)));
                } else {
                    fl.r.a aVar3 = fl.r.f38769b;
                    fVar.resumeWith(fl.r.b(e(objG)));
                }
                fl.g0 g0Var = fl.g0.f38750a;
            } finally {
                if (b3VarM == null || b3VarM.V0()) {
                    jm.k0.f(context, objI);
                }
            }
        } catch (DispatchException e10) {
            m0.a(c().getContext(), e10.getCause());
        } catch (Throwable th2) {
            f(th2);
        }
    }

    public Object e(Object obj) {
        return obj;
    }

    public void b(Object obj, Throwable th2) {
    }
}
