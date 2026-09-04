package hm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class l0 extends im.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f40564a = new AtomicReference(null);

    @Override // im.c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(j0 j0Var) {
        if (jm.d.a(this.f40564a) != null) {
            return false;
        }
        jm.d.b(this.f40564a, k0.f40562a);
        return true;
    }

    public final Object e(kl.f fVar) {
        em.q qVar = new em.q(ll.b.c(fVar), 1);
        qVar.H();
        if (!androidx.lifecycle.b.a(this.f40564a, k0.f40562a, qVar)) {
            fl.r.a aVar = fl.r.f38769b;
            qVar.resumeWith(fl.r.b(fl.g0.f38750a));
        }
        Object objB = qVar.B();
        if (objB == ll.b.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objB == ll.b.f() ? objB : fl.g0.f38750a;
    }

    @Override // im.c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public kl.f[] b(j0 j0Var) {
        jm.d.b(this.f40564a, null);
        return im.b.f41484a;
    }

    public final void g() {
        AtomicReference atomicReference = this.f40564a;
        while (true) {
            Object objA = jm.d.a(atomicReference);
            if (objA == null || objA == k0.f40563b) {
                return;
            }
            if (objA == k0.f40562a) {
                if (androidx.lifecycle.b.a(this.f40564a, objA, k0.f40563b)) {
                    return;
                }
            } else if (androidx.lifecycle.b.a(this.f40564a, objA, k0.f40562a)) {
                ((em.q) objA).resumeWith(fl.r.b(fl.g0.f38750a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = this.f40564a.getAndSet(k0.f40562a);
        kotlin.jvm.internal.s.e(andSet);
        return andSet == k0.f40563b;
    }
}
