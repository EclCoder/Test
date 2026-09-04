package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.z9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3476z9 {
    public static B9 a(gn.z[] interceptors, gn.q dispatcher, gn.z[] networkInterceptors, Gk timeoutConfig, int i10) {
        if ((i10 & 1) != 0) {
            interceptors = new gn.z[0];
        }
        if ((i10 & 2) != 0) {
            dispatcher = H9.f24929b;
        }
        if ((i10 & 4) != 0) {
            networkInterceptors = new gn.z[0];
        }
        if ((i10 & 8) != 0) {
            timeoutConfig = new Gk(60L, 60L, 60L);
        }
        kotlin.jvm.internal.s.h(interceptors, "interceptors");
        kotlin.jvm.internal.s.h(dispatcher, "dispatcher");
        kotlin.jvm.internal.s.h(networkInterceptors, "networkInterceptors");
        kotlin.jvm.internal.s.h(timeoutConfig, "timeoutConfig");
        return new B9(interceptors, networkInterceptors, dispatcher, timeoutConfig);
    }
}
