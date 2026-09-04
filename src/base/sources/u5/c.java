package u5;

import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue f54139a = m6.l.f(20);

    c() {
    }

    abstract m a();

    m b() {
        m mVar = (m) this.f54139a.poll();
        return mVar == null ? a() : mVar;
    }

    public void c(m mVar) {
        if (this.f54139a.size() < 20) {
            this.f54139a.offer(mVar);
        }
    }
}
