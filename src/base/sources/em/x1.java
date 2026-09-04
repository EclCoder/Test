package em;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class x1 extends d2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f38070f = AtomicIntegerFieldUpdater.newUpdater(x1.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Function1 f38071e;

    public x1(Function1 function1) {
        this.f38071e = function1;
    }

    @Override // em.d2
    public boolean v() {
        return true;
    }

    @Override // em.d2
    public void w(Throwable th2) {
        if (f38070f.compareAndSet(this, 0, 1)) {
            this.f38071e.invoke(th2);
        }
    }
}
