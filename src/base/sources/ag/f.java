package ag;

import em.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class f implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final el.a f271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f272b;

    public f(el.a aVar, el.a aVar2) {
        this.f271a = aVar;
        this.f272b = aVar2;
    }

    public static f a(el.a aVar, el.a aVar2) {
        return new f(aVar, aVar2);
    }

    public static e c(rf.b bVar, k0 k0Var) {
        return new e(bVar, k0Var);
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c((rf.b) this.f271a.get(), (k0) this.f272b.get());
    }
}
