package ne;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 implements pe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pe.e f47169a;

    private h0(pe.e eVar) {
        this.f47169a = eVar;
    }

    public static h0 a(pe.e eVar) {
        return new h0(eVar);
    }

    public static g0 c(o0 o0Var) {
        return new g0(o0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g0 get() {
        return c((o0) this.f47169a.get());
    }
}
