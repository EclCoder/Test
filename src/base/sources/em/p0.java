package em;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p0 {
    public static final o0 a(kl.j jVar) {
        if (jVar.get(z1.f38078x2) == null) {
            jVar = jVar.plus(c2.b(null, 1, null));
        }
        return new jm.e(jVar);
    }

    public static final void b(o0 o0Var, CancellationException cancellationException) {
        z1 z1Var = (z1) o0Var.i0().get(z1.f38078x2);
        if (z1Var != null) {
            z1Var.a(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + o0Var).toString());
    }

    public static /* synthetic */ void c(o0 o0Var, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        b(o0Var, cancellationException);
    }

    public static final Object d(tl.o oVar, kl.f fVar) {
        jm.z zVar = new jm.z(fVar.getContext(), fVar);
        Object objE = km.b.e(zVar, zVar, oVar);
        if (objE == ll.b.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objE;
    }

    public static final void e(o0 o0Var) {
        b2.h(o0Var.i0());
    }

    public static final boolean f(o0 o0Var) {
        z1 z1Var = (z1) o0Var.i0().get(z1.f38078x2);
        if (z1Var != null) {
            return z1Var.isActive();
        }
        return true;
    }
}
