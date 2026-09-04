package em;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Future f38030a;

    public m(Future future) {
        this.f38030a = future;
    }

    @Override // em.n
    public void a(Throwable th2) {
        this.f38030a.cancel(false);
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f38030a + ']';
    }
}
