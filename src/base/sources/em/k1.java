package em;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k1 extends i1 {
    protected abstract Thread i1();

    protected void j1(long j10, j1.c cVar) {
        t0.f38057i.x1(j10, cVar);
    }

    protected final void k1() {
        Thread threadI1 = i1();
        if (Thread.currentThread() != threadI1) {
            c.a();
            LockSupport.unpark(threadI1);
        }
    }
}
