package ih;

import ag.i;
import ag.o;
import ag.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class g implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f41457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f41458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final el.a f41459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final el.a f41460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final el.a f41461e;

    public g(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4, el.a aVar5) {
        this.f41457a = aVar;
        this.f41458b = aVar2;
        this.f41459c = aVar3;
        this.f41460d = aVar4;
        this.f41461e = aVar5;
    }

    public static g a(el.a aVar, el.a aVar2, el.a aVar3, el.a aVar4, el.a aVar5) {
        return new g(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static f c(i iVar, s sVar, xf.a aVar, rf.b bVar, o oVar) {
        return new f(iVar, sVar, aVar, bVar, oVar);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public f get() {
        return c((i) this.f41457a.get(), (s) this.f41458b.get(), (xf.a) this.f41459c.get(), (rf.b) this.f41460d.get(), (o) this.f41461e.get());
    }
}
