package jd;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f42385a = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f42386b = new AtomicInteger();

    public void a() {
        this.f42386b.getAndIncrement();
    }

    public void b() {
        this.f42385a.getAndIncrement();
    }

    public void c() {
        this.f42386b.set(0);
    }
}
