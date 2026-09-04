package qe;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements pe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pe.e f50670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pe.e f50671b;

    private f(pe.e eVar, pe.e eVar2) {
        this.f50670a = eVar;
        this.f50671b = eVar2;
    }

    public static f a(pe.e eVar, pe.e eVar2) {
        return new f(eVar, eVar2);
    }

    public static e c(ne.b bVar, kl.j jVar) {
        return new e(bVar, jVar);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c((ne.b) this.f50670a.get(), (kl.j) this.f50671b.get());
    }
}
