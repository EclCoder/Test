package ne;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements pe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pe.e f47170a;

    private i(pe.e eVar) {
        this.f47170a = eVar;
    }

    public static i a(pe.e eVar) {
        return new i(eVar);
    }

    public static g c(ce.b bVar) {
        return new g(bVar);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c((ce.b) this.f47170a.get());
    }
}
