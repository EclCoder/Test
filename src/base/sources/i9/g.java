package i9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements e9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f41242a;

    public g(el.a aVar) {
        this.f41242a = aVar;
    }

    public static j9.f a(m9.a aVar) {
        return (j9.f) e9.d.d(f.a(aVar));
    }

    public static g b(el.a aVar) {
        return new g(aVar);
    }

    @Override // el.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public j9.f get() {
        return a((m9.a) this.f41242a.get());
    }
}
