package em;

import kotlinx.coroutines.DispatchException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m0 {
    public static final void a(kl.j jVar, Throwable th2) {
        if (th2 instanceof DispatchException) {
            th2 = ((DispatchException) th2).getCause();
        }
        try {
            l0 l0Var = (l0) jVar.get(l0.f38027w2);
            if (l0Var != null) {
                l0Var.handleException(jVar, th2);
            } else {
                jm.g.a(jVar, th2);
            }
        } catch (Throwable th3) {
            jm.g.a(jVar, b(th2, th3));
        }
    }

    public static final Throwable b(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        fl.e.a(runtimeException, th2);
        return runtimeException;
    }
}
