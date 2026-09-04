package jm;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import em.m2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a0 extends c implements m2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f42635d = AtomicIntegerFieldUpdater.newUpdater(a0.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f42636c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public a0(long j10, a0 a0Var, int i10) {
        super(a0Var);
        this.f42636c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // jm.c
    public boolean k() {
        return f42635d.get(this) == r() && !l();
    }

    public final boolean p() {
        return f42635d.addAndGet(this, -65536) == r() && !l();
    }

    public abstract int r();

    public abstract void s(int i10, Throwable th2, kl.j jVar);

    public final void t() {
        if (f42635d.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f42635d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == r() && !l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, C.DEFAULT_BUFFER_SEGMENT_SIZE + i10));
        return true;
    }
}
