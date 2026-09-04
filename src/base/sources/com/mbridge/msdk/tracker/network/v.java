package com.mbridge.msdk.tracker.network;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class v<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f33898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.mbridge.msdk.tracker.network.b.a f33899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f33900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f33901d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void a(b0 b0Var);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b<T> {
        void a(T t10);
    }

    private v(T t10, com.mbridge.msdk.tracker.network.b.a aVar) {
        this.f33901d = false;
        this.f33898a = t10;
        this.f33899b = aVar;
        this.f33900c = null;
    }

    public static <T> v<T> a(T t10, com.mbridge.msdk.tracker.network.b.a aVar) {
        return new v<>(t10, aVar);
    }

    public static <T> v<T> a(b0 b0Var) {
        return new v<>(b0Var);
    }

    public boolean a() {
        return this.f33900c == null;
    }

    private v(b0 b0Var) {
        this.f33901d = false;
        this.f33898a = null;
        this.f33899b = null;
        this.f33900c = b0Var;
    }
}
