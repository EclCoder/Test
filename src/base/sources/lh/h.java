package lh;

import bg.o;
import bg.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class h implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f44577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f44578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final el.a f44579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final el.a f44580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final el.a f44581e;

    public h(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4, el.a aVar5) {
        this.f44577a = aVar;
        this.f44578b = aVar2;
        this.f44579c = aVar3;
        this.f44580d = aVar4;
        this.f44581e = aVar5;
    }

    public static h a(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4, el.a aVar5) {
        return new h(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static g c(bg.g gVar, s sVar, o oVar, rf.d dVar, xf.a aVar) {
        return new g(gVar, sVar, oVar, dVar, aVar);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c((bg.g) this.f44577a.get(), (s) this.f44578b.get(), (o) this.f44579c.get(), (rf.d) this.f44580d.get(), (xf.a) this.f44581e.get());
    }
}
