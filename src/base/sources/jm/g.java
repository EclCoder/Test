package jm;

import java.util.Iterator;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    public static final void a(kl.j jVar, Throwable th2) {
        Iterator it = f.a().iterator();
        while (it.hasNext()) {
            try {
                ((em.l0) it.next()).handleException(jVar, th2);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th3) {
                f.b(em.m0.b(th2, th3));
            }
        }
        try {
            fl.e.a(th2, new DiagnosticCoroutineContextException(jVar));
        } catch (Throwable unused2) {
        }
        f.b(th2);
    }
}
