package em;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class x2 extends d2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f38072g = AtomicIntegerFieldUpdater.newUpdater(x2.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Thread f38073e = Thread.currentThread();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e1 f38074f;

    private final Void A(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    public final void B(z1 z1Var) {
        int i10;
        this.f38074f = c2.k(z1Var, false, this, 1, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f38072g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2 || i10 == 3) {
                    return;
                }
                A(i10);
                throw new KotlinNothingValueException();
            }
        } while (!f38072g.compareAndSet(this, i10, 0));
    }

    @Override // em.d2
    public boolean v() {
        return true;
    }

    @Override // em.d2
    public void w(Throwable th2) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f38072g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                A(i10);
                throw new KotlinNothingValueException();
            }
        } while (!f38072g.compareAndSet(this, i10, 2));
        this.f38073e.interrupt();
        f38072g.set(this, 3);
    }

    public final void y() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f38072g;
        while (true) {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        A(i10);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f38072g.compareAndSet(this, i10, 1)) {
                e1 e1Var = this.f38074f;
                if (e1Var != null) {
                    e1Var.d();
                    return;
                }
                return;
            }
        }
    }
}
