package com.mbridge.msdk.dycreator.bus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class HandlerPoster extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f29943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventBus f29945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f29946d;

    HandlerPoster(EventBus eventBus, Looper looper, int i10) {
        super(looper);
        this.f29945c = eventBus;
        this.f29944b = i10;
        this.f29943a = new PendingPostQueue();
    }

    void a(Subscription subscription, Object obj) {
        PendingPost pendingPostA = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.f29943a.a(pendingPostA);
                if (!this.f29946d) {
                    this.f29946d = true;
                    if (!sendMessage(obtainMessage())) {
                        throw new EventBusException("Could not send handler message");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                PendingPost pendingPostA = this.f29943a.a();
                if (pendingPostA == null) {
                    synchronized (this) {
                        pendingPostA = this.f29943a.a();
                        if (pendingPostA == null) {
                            this.f29946d = false;
                            return;
                        }
                    }
                }
                this.f29945c.a(pendingPostA);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f29944b);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f29946d = true;
        } catch (Throwable th2) {
            this.f29946d = false;
            throw th2;
        }
    }
}
