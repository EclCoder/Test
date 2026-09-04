package ne;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class v0 implements pe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pe.e f47297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pe.e f47298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pe.e f47299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final pe.e f47300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final pe.e f47301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final pe.e f47302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final pe.e f47303g;

    private v0(pe.e eVar, pe.e eVar2, pe.e eVar3, pe.e eVar4, pe.e eVar5, pe.e eVar6, pe.e eVar7) {
        this.f47297a = eVar;
        this.f47298b = eVar2;
        this.f47299c = eVar3;
        this.f47300d = eVar4;
        this.f47301e = eVar5;
        this.f47302f = eVar6;
        this.f47303g = eVar7;
    }

    public static v0 a(pe.e eVar, pe.e eVar2, pe.e eVar3, pe.e eVar4, pe.e eVar5, pe.e eVar6, pe.e eVar7) {
        return new v0(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7);
    }

    public static u0 c(qe.j jVar, o0 o0Var, l0 l0Var, x0 x0Var, z0.h hVar, w wVar, kl.j jVar2) {
        return new u0(jVar, o0Var, l0Var, x0Var, hVar, wVar, jVar2);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u0 get() {
        return c((qe.j) this.f47297a.get(), (o0) this.f47298b.get(), (l0) this.f47299c.get(), (x0) this.f47300d.get(), (z0.h) this.f47301e.get(), (w) this.f47302f.get(), (kl.j) this.f47303g.get());
    }
}
