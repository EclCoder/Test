package em;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class z0 extends jm.z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f38077e = AtomicIntegerFieldUpdater.newUpdater(z0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public z0(kl.j jVar, kl.f fVar) {
        super(jVar, fVar);
    }

    private final boolean X0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f38077e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f38077e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean Y0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f38077e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f38077e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // jm.z, em.e2
    protected void D(Object obj) throws DispatchException {
        Q0(obj);
    }

    @Override // jm.z, em.a
    protected void Q0(Object obj) throws DispatchException {
        if (X0()) {
            return;
        }
        jm.i.b(ll.b.c(this.f42693d), e0.a(obj, this.f42693d));
    }

    public final Object V0() {
        if (Y0()) {
            return ll.b.f();
        }
        Object objH = f2.h(Z());
        if (objH instanceof d0) {
            throw ((d0) objH).f37973a;
        }
        return objH;
    }
}
