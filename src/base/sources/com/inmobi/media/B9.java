package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class B9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B4 f24525a;

    public B9(gn.z[] interceptors, gn.z[] networkInterceptors, gn.q dispatcher, Gk timeoutConfig) {
        kotlin.jvm.internal.s.h(interceptors, "interceptors");
        kotlin.jvm.internal.s.h(networkInterceptors, "networkInterceptors");
        kotlin.jvm.internal.s.h(dispatcher, "dispatcher");
        kotlin.jvm.internal.s.h(timeoutConfig, "timeoutConfig");
        this.f24525a = new B4(interceptors, networkInterceptors, dispatcher, timeoutConfig);
    }

    public final em.v0 a(Ue request) {
        kotlin.jvm.internal.s.h(request, "request");
        return em.k.b(H9.f24930c, null, null, new A9(this, request, null), 3, null);
    }
}
