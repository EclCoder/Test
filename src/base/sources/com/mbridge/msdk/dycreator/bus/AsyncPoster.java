package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class AsyncPoster implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f29918a = new PendingPostQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EventBus f29919b;

    AsyncPoster(EventBus eventBus) {
        this.f29919b = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        this.f29918a.a(PendingPost.a(subscription, obj));
        EventBus.f29923n.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost pendingPostA = this.f29918a.a();
        if (pendingPostA == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f29919b.a(pendingPostA);
    }
}
