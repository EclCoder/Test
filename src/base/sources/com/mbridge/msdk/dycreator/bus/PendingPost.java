package com.mbridge.msdk.dycreator.bus;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
final class PendingPost {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<PendingPost> f29947d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f29948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Subscription f29949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    PendingPost f29950c;

    private PendingPost(Object obj, Subscription subscription) {
        this.f29948a = obj;
        this.f29949b = subscription;
    }

    static PendingPost a(Subscription subscription, Object obj) {
        List<PendingPost> list = f29947d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new PendingPost(obj, subscription);
                }
                PendingPost pendingPostRemove = list.remove(size - 1);
                pendingPostRemove.f29948a = obj;
                pendingPostRemove.f29949b = subscription;
                pendingPostRemove.f29950c = null;
                return pendingPostRemove;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static void a(PendingPost pendingPost) {
        pendingPost.f29948a = null;
        pendingPost.f29949b = null;
        pendingPost.f29950c = null;
        List<PendingPost> list = f29947d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(pendingPost);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
