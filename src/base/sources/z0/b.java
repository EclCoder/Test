package z0;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f58213a;

    public b(int i10) {
        this.f58213a = new AtomicInteger(i10);
    }

    public final int a() {
        return this.f58213a.decrementAndGet();
    }

    public final int b() {
        return this.f58213a.get();
    }

    public final int c() {
        return this.f58213a.getAndIncrement();
    }

    public final int d() {
        return this.f58213a.incrementAndGet();
    }
}
