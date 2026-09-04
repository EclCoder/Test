package qe;

import ne.x0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements pe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final pe.e f50672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pe.e f50673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final pe.e f50674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final pe.e f50675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final pe.e f50676e;

    private g(pe.e eVar, pe.e eVar2, pe.e eVar3, pe.e eVar4, pe.e eVar5) {
        this.f50672a = eVar;
        this.f50673b = eVar2;
        this.f50674c = eVar3;
        this.f50675d = eVar4;
        this.f50676e = eVar5;
    }

    public static g a(pe.e eVar, pe.e eVar2, pe.e eVar3, pe.e eVar4, pe.e eVar5) {
        return new g(eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static d c(x0 x0Var, de.e eVar, ne.b bVar, a aVar, l lVar) {
        return new d(x0Var, eVar, bVar, aVar, lVar);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c((x0) this.f50672a.get(), (de.e) this.f50673b.get(), (ne.b) this.f50674c.get(), (a) this.f50675d.get(), (l) this.f50676e.get());
    }
}
