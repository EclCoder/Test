package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a1 implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f1 f4336a;

    public a1(f1 provider) {
        kotlin.jvm.internal.s.h(provider, "provider");
        this.f4336a = provider;
    }

    @Override // androidx.lifecycle.y
    public void c(b0 source, s.a event) {
        kotlin.jvm.internal.s.h(source, "source");
        kotlin.jvm.internal.s.h(event, "event");
        if (event == s.a.ON_CREATE) {
            source.getLifecycle().d(this);
            this.f4336a.e();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
