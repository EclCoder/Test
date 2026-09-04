package com.mbridge.msdk.dycreator.bus;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class BackgroundPoster implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f29920a = new PendingPostQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f29921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventBus f29922c;

    BackgroundPoster(EventBus eventBus) {
        this.f29922c = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        PendingPost pendingPostA = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.f29920a.a(pendingPostA);
                if (!this.f29921b) {
                    this.f29921b = true;
                    EventBus.f29923n.execute(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                try {
                    PendingPost pendingPostA = this.f29920a.a(1000);
                    if (pendingPostA == null) {
                        synchronized (this) {
                            pendingPostA = this.f29920a.a();
                            if (pendingPostA == null) {
                                this.f29921b = false;
                                this.f29921b = false;
                                return;
                            }
                        }
                    }
                    this.f29922c.a(pendingPostA);
                } catch (InterruptedException e10) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e10);
                    this.f29921b = false;
                    return;
                }
            } catch (Throwable th2) {
                this.f29921b = false;
                throw th2;
            }
        }
    }
}
