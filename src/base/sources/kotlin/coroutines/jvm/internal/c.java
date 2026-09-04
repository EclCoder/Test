package kotlin.coroutines.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements kl.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f43563a = new c();

    private c() {
    }

    @Override // kl.f
    public kl.j getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // kl.f
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
