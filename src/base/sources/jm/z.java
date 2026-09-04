package jm;

import kotlinx.coroutines.DispatchException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class z extends em.a implements kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kl.f f42693d;

    public z(kl.j jVar, kl.f fVar) {
        super(jVar, true, true);
        this.f42693d = fVar;
    }

    @Override // em.e2
    protected void D(Object obj) throws DispatchException {
        i.b(ll.b.c(this.f42693d), em.e0.a(obj, this.f42693d));
    }

    @Override // em.a
    protected void Q0(Object obj) {
        kl.f fVar = this.f42693d;
        fVar.resumeWith(em.e0.a(obj, fVar));
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public final kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kl.f fVar = this.f42693d;
        if (fVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) fVar;
        }
        return null;
    }

    @Override // em.e2
    protected final boolean k0() {
        return true;
    }

    public void U0() {
    }
}
