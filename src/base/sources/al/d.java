package al;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends ok.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f381c = new f("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadFactory f382b;

    public d() {
        this(f381c);
    }

    @Override // ok.h
    public ok.h.b a() {
        return new e(this.f382b);
    }

    public d(ThreadFactory threadFactory) {
        this.f382b = threadFactory;
    }
}
