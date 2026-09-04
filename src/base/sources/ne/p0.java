package ne;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class p0 implements pe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pe.e f47222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pe.e f47223b;

    private p0(pe.e eVar, pe.e eVar2) {
        this.f47222a = eVar;
        this.f47223b = eVar2;
    }

    public static p0 a(pe.e eVar, pe.e eVar2) {
        return new p0(eVar, eVar2);
    }

    public static o0 c(x0 x0Var, z0 z0Var) {
        return new o0(x0Var, z0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o0 get() {
        return c((x0) this.f47222a.get(), (z0) this.f47223b.get());
    }
}
