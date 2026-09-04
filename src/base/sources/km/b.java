package km;

import em.d0;
import em.f2;
import fl.r;
import fl.s;
import jm.k0;
import jm.z;
import kl.f;
import kl.j;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.p0;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    private static final Void a(z zVar, DispatchException dispatchException) throws Throwable {
        zVar.q0(new d0(dispatchException.getCause(), false, 2, null));
        throw dispatchException.getCause();
    }

    private static final boolean b(z zVar, Throwable th2) {
        return ((th2 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th2).coroutine == zVar) ? false : true;
    }

    public static final void c(o oVar, Object obj, f fVar) {
        f fVarA = h.a(fVar);
        try {
            j context = fVarA.getContext();
            Object objI = k0.i(context, null);
            try {
                h.b(fVarA);
                Object objE = !(oVar instanceof kotlin.coroutines.jvm.internal.a) ? ll.b.e(oVar, obj, fVarA) : ((o) p0.e(oVar, 2)).invoke(obj, fVarA);
                k0.f(context, objI);
                if (objE != ll.b.f()) {
                    fVarA.resumeWith(r.b(objE));
                }
            } catch (Throwable th2) {
                k0.f(context, objI);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            r.a aVar = r.f38769b;
            fVarA.resumeWith(r.b(s.a(th)));
        }
    }

    private static final Object d(z zVar, boolean z10, Object obj, o oVar) throws Throwable {
        Object d0Var;
        try {
            d0Var = !(oVar instanceof kotlin.coroutines.jvm.internal.a) ? ll.b.e(oVar, obj, zVar) : ((o) p0.e(oVar, 2)).invoke(obj, zVar);
        } catch (DispatchException e10) {
            a(zVar, e10);
            throw new KotlinNothingValueException();
        } catch (Throwable th2) {
            d0Var = new d0(th2, false, 2, null);
        }
        if (d0Var == ll.b.f()) {
            return ll.b.f();
        }
        Object objR0 = zVar.r0(d0Var);
        if (objR0 == f2.f37998b) {
            return ll.b.f();
        }
        zVar.U0();
        if (!(objR0 instanceof d0)) {
            return f2.h(objR0);
        }
        if (z10 || b(zVar, ((d0) objR0).f37973a)) {
            throw ((d0) objR0).f37973a;
        }
        if (d0Var instanceof d0) {
            throw ((d0) d0Var).f37973a;
        }
        return d0Var;
    }

    public static final Object e(z zVar, Object obj, o oVar) {
        return d(zVar, true, obj, oVar);
    }

    public static final Object f(z zVar, Object obj, o oVar) {
        return d(zVar, false, obj, oVar);
    }
}
