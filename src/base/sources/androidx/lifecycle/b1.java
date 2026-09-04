package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements y, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z0 f4338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4339c;

    public b1(String key, z0 handle) {
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(handle, "handle");
        this.f4337a = key;
        this.f4338b = handle;
    }

    @Override // androidx.lifecycle.y
    public void c(b0 source, s.a event) {
        kotlin.jvm.internal.s.h(source, "source");
        kotlin.jvm.internal.s.h(event, "event");
        if (event == s.a.ON_DESTROY) {
            this.f4339c = false;
            source.getLifecycle().d(this);
        }
    }

    public final void d(n4.g registry, s lifecycle) {
        kotlin.jvm.internal.s.h(registry, "registry");
        kotlin.jvm.internal.s.h(lifecycle, "lifecycle");
        if (this.f4339c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f4339c = true;
        lifecycle.a(this);
        registry.c(this.f4337a, this.f4338b.e());
    }

    public final z0 k() {
        return this.f4338b;
    }

    public final boolean l() {
        return this.f4339c;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }
}
