package em;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d1 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Future f37974a;

    public d1(Future future) {
        this.f37974a = future;
    }

    @Override // em.e1
    public void d() {
        this.f37974a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f37974a + ']';
    }
}
