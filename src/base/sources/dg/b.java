package dg;

import em.k0;
import em.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f36749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f36750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final el.a f36751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final el.a f36752d;

    public b(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4) {
        this.f36749a = aVar;
        this.f36750b = aVar2;
        this.f36751c = aVar3;
        this.f36752d = aVar4;
    }

    public static b a(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4) {
        return new b(aVar, aVar2, aVar3, aVar4);
    }

    public static a c(zg.p pVar, dk.a aVar, o0 o0Var, k0 k0Var) {
        return new a(pVar, aVar, o0Var, k0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return c((zg.p) this.f36749a.get(), ek.b.a(this.f36750b), (o0) this.f36751c.get(), (k0) this.f36752d.get());
    }
}
