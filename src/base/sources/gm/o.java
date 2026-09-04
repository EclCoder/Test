package gm;

import em.n1;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract /* synthetic */ class o {
    public static final void a(t tVar, Throwable th2) {
        CancellationException cancellationExceptionA = null;
        if (th2 != null) {
            cancellationExceptionA = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (cancellationExceptionA == null) {
                cancellationExceptionA = n1.a("Channel was consumed, consumer had failed", th2);
            }
        }
        tVar.a(cancellationExceptionA);
    }
}
