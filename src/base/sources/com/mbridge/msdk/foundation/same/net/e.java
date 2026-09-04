package com.mbridge.msdk.foundation.same.net;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.exception.a f30576a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.mbridge.msdk.foundation.same.net.toolbox.a f30577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f30578c;

    private e(T t10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        this.f30578c = t10;
        this.f30577b = aVar;
    }

    public static <T> e<T> a(T t10, com.mbridge.msdk.foundation.same.net.toolbox.a aVar) {
        return new e<>(t10, aVar);
    }
}
