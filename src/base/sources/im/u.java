package im;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class u implements kl.f, kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kl.f f41546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kl.j f41547b;

    public u(kl.f fVar, kl.j jVar) {
        this.f41546a = fVar;
        this.f41547b = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kl.f fVar = this.f41546a;
        if (fVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) fVar;
        }
        return null;
    }

    @Override // kl.f
    public kl.j getContext() {
        return this.f41547b;
    }

    @Override // kl.f
    public void resumeWith(Object obj) {
        this.f41546a.resumeWith(obj);
    }
}
