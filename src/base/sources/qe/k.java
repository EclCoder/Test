package qe;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class k implements pe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pe.e f50691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pe.e f50692b;

    private k(pe.e eVar, pe.e eVar2) {
        this.f50691a = eVar;
        this.f50692b = eVar2;
    }

    public static k a(pe.e eVar, pe.e eVar2) {
        return new k(eVar, eVar2);
    }

    public static j c(o oVar, o oVar2) {
        return new j(oVar, oVar2);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return c((o) this.f50691a.get(), (o) this.f50692b.get());
    }
}
