package ne;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements pe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pe.e f47233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pe.e f47234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pe.e f47235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final pe.e f47236d;

    private s(pe.e eVar, pe.e eVar2, pe.e eVar3, pe.e eVar4) {
        this.f47233a = eVar;
        this.f47234b = eVar2;
        this.f47235c = eVar3;
        this.f47236d = eVar4;
    }

    public static s a(pe.e eVar, pe.e eVar2, pe.e eVar3, pe.e eVar4) {
        return new s(eVar, eVar2, eVar3, eVar4);
    }

    public static l c(com.google.firebase.f fVar, qe.j jVar, kl.j jVar2, r0 r0Var) {
        return new l(fVar, jVar, jVar2, r0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        return c((com.google.firebase.f) this.f47233a.get(), (qe.j) this.f47234b.get(), (kl.j) this.f47235c.get(), (r0) this.f47236d.get());
    }
}
