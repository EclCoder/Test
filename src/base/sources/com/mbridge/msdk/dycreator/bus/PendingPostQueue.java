package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class PendingPostQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PendingPost f29951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PendingPost f29952b;

    PendingPostQueue() {
    }

    synchronized void a(PendingPost pendingPost) {
        try {
            if (pendingPost == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            PendingPost pendingPost2 = this.f29952b;
            if (pendingPost2 != null) {
                pendingPost2.f29950c = pendingPost;
                this.f29952b = pendingPost;
            } else {
                if (this.f29951a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f29952b = pendingPost;
                this.f29951a = pendingPost;
            }
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized PendingPost a() {
        PendingPost pendingPost;
        pendingPost = this.f29951a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.f29950c;
            this.f29951a = pendingPost2;
            if (pendingPost2 == null) {
                this.f29952b = null;
            }
        }
        return pendingPost;
    }

    synchronized PendingPost a(int i10) {
        try {
            if (this.f29951a == null) {
                wait(i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return a();
    }
}
