package kotlin.coroutines.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j extends a {
    public j(kl.f fVar) {
        super(fVar);
        if (fVar != null && fVar.getContext() != kl.k.f43531a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // kl.f
    public kl.j getContext() {
        return kl.k.f43531a;
    }
}
