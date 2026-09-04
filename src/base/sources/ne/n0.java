package ne;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 implements pe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pe.e f47213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pe.e f47214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pe.e f47215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final pe.e f47216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final pe.e f47217e;

    private n0(pe.e eVar, pe.e eVar2, pe.e eVar3, pe.e eVar4, pe.e eVar5) {
        this.f47213a = eVar;
        this.f47214b = eVar2;
        this.f47215c = eVar3;
        this.f47216d = eVar4;
        this.f47217e = eVar5;
    }

    public static n0 a(pe.e eVar, pe.e eVar2, pe.e eVar3, pe.e eVar4, pe.e eVar5) {
        return new n0(eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static m0 c(com.google.firebase.f fVar, de.e eVar, qe.j jVar, h hVar, kl.j jVar2) {
        return new m0(fVar, eVar, jVar, hVar, jVar2);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c((com.google.firebase.f) this.f47213a.get(), (de.e) this.f47214b.get(), (qe.j) this.f47215c.get(), (h) this.f47216d.get(), (kl.j) this.f47217e.get());
    }
}
