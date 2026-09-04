package ne;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements pe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pe.e f47237a;

    private s0(pe.e eVar) {
        this.f47237a = eVar;
    }

    public static s0 a(pe.e eVar) {
        return new s0(eVar);
    }

    public static r0 c(t0 t0Var) {
        return new r0(t0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r0 get() {
        return c((t0) this.f47237a.get());
    }
}
