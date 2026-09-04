package ag;

import em.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class n implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f287b;

    public n(el.a aVar, el.a aVar2) {
        this.f286a = aVar;
        this.f287b = aVar2;
    }

    public static n a(el.a aVar, el.a aVar2) {
        return new n(aVar, aVar2);
    }

    public static m c(rf.b bVar, k0 k0Var) {
        return new m(bVar, k0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m get() {
        return c((rf.b) this.f286a.get(), (k0) this.f287b.get());
    }
}
