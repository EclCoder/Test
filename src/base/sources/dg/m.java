package dg;

import com.google.firebase.analytics.FirebaseAnalytics;
import em.k0;
import em.o0;
import lg.x;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class m implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f36798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f36799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final el.a f36800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final el.a f36801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final el.a f36802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final el.a f36803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final el.a f36804g;

    public m(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4, el.a aVar5, el.a aVar6, el.a aVar7) {
        this.f36798a = aVar;
        this.f36799b = aVar2;
        this.f36800c = aVar3;
        this.f36801d = aVar4;
        this.f36802e = aVar5;
        this.f36803f = aVar6;
        this.f36804g = aVar7;
    }

    public static m a(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4, el.a aVar5, el.a aVar6, el.a aVar7) {
        return new m(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static l c(k0 k0Var, o0 o0Var) {
        return new l(k0Var, o0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l get() {
        l lVarC = c((k0) this.f36798a.get(), (o0) this.f36799b.get());
        n.a(lVarC, (FirebaseAnalytics) this.f36800c.get());
        n.c(lVarC, (lg.a) this.f36801d.get());
        n.d(lVarC, (dh.f) this.f36802e.get());
        n.e(lVarC, (x) this.f36803f.get());
        n.b(lVarC, (zg.p) this.f36804g.get());
        return lVarC;
    }
}
