package em;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f38056c = AtomicIntegerFieldUpdater.newUpdater(t.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public t(kl.f fVar, Throwable th2, boolean z10) {
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + fVar + " was cancelled normally");
        }
        super(th2, z10);
    }

    public final boolean e() {
        return f38056c.compareAndSet(this, 0, 1);
    }
}
