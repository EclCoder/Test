package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class y0 {
    public static final Object a(long j10, kl.f fVar) {
        if (j10 <= 0) {
            return fl.g0.f38750a;
        }
        q qVar = new q(ll.b.c(fVar), 1);
        qVar.H();
        if (j10 < Long.MAX_VALUE) {
            b(qVar.getContext()).i0(j10, qVar);
        }
        Object objB = qVar.B();
        if (objB == ll.b.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objB == ll.b.f() ? objB : fl.g0.f38750a;
    }

    public static final x0 b(kl.j jVar) {
        kl.j.b bVar = jVar.get(kl.g.f43529z2);
        x0 x0Var = bVar instanceof x0 ? (x0) bVar : null;
        return x0Var == null ? u0.a() : x0Var;
    }
}
