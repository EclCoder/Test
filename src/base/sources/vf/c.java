package vf;

import em.k0;
import em.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c implements ek.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f55420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final el.a f55421b;

    public c(b bVar, el.a aVar) {
        this.f55420a = bVar;
        this.f55421b = aVar;
    }

    public static c a(b bVar, el.a aVar) {
        return new c(bVar, aVar);
    }

    public static o0 c(b bVar, k0 k0Var) {
        return (o0) ek.e.c(bVar.a(k0Var));
    }

    @Override // el.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public o0 get() {
        return c(this.f55420a, (k0) this.f55421b.get());
    }
}
