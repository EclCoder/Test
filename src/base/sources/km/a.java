package km;

import fl.g0;
import fl.r;
import fl.s;
import jm.i;
import kl.f;
import kotlinx.coroutines.DispatchException;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    private static final void a(f fVar, Throwable th2) throws Throwable {
        if (th2 instanceof DispatchException) {
            th2 = ((DispatchException) th2).getCause();
        }
        r.a aVar = r.f38769b;
        fVar.resumeWith(r.b(s.a(th2)));
        throw th2;
    }

    public static final void b(f fVar, f fVar2) throws Throwable {
        try {
            f fVarC = ll.b.c(fVar);
            r.a aVar = r.f38769b;
            i.b(fVarC, r.b(g0.f38750a));
        } catch (Throwable th2) {
            a(fVar2, th2);
        }
    }

    public static final void c(o oVar, Object obj, f fVar) {
        try {
            f fVarC = ll.b.c(ll.b.a(oVar, obj, fVar));
            r.a aVar = r.f38769b;
            i.b(fVarC, r.b(g0.f38750a));
        } catch (Throwable th2) {
            a(fVar, th2);
        }
    }
}
