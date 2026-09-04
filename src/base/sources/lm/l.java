package lm;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.k0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f44699b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f44700c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f44701d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f44702e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray f44703a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    private final h b(h hVar) {
        if (e() == 127) {
            return hVar;
        }
        if (hVar.f44690b) {
            f44702e.incrementAndGet(this);
        }
        int i10 = f44700c.get(this) & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        while (this.f44703a.get(i10) != null) {
            Thread.yield();
        }
        this.f44703a.lazySet(i10, hVar);
        f44700c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar == null || !hVar.f44690b) {
            return;
        }
        f44702e.decrementAndGet(this);
    }

    private final int e() {
        return f44700c.get(this) - f44701d.get(this);
    }

    private final h m() {
        h hVar;
        while (true) {
            int i10 = f44701d.get(this);
            if (i10 - f44700c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
            if (f44701d.compareAndSet(this, i10, i10 + 1) && (hVar = (h) this.f44703a.getAndSet(i11, null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    private final boolean n(d dVar) {
        h hVarM = m();
        if (hVarM == null) {
            return false;
        }
        dVar.a(hVarM);
        return true;
    }

    private final h o(boolean z10) {
        h hVar;
        do {
            hVar = (h) f44699b.get(this);
            if (hVar == null || hVar.f44690b != z10) {
                int i10 = f44701d.get(this);
                int i11 = f44700c.get(this);
                while (i10 != i11) {
                    if (z10 && f44702e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    h hVarQ = q(i11, z10);
                    if (hVarQ != null) {
                        return hVarQ;
                    }
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f44699b, this, hVar, null));
        return hVar;
    }

    private final h p(boolean z10) {
        int i10 = f44701d.get(this);
        int i11 = f44700c.get(this);
        while (i10 != i11) {
            if (z10 && f44702e.get(this) == 0) {
                return null;
            }
            int i12 = i10 + 1;
            h hVarQ = q(i10, z10);
            if (hVarQ != null) {
                return hVarQ;
            }
            i10 = i12;
        }
        return null;
    }

    private final h q(int i10, boolean z10) {
        int i11 = i10 & Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        h hVar = (h) this.f44703a.get(i11);
        if (hVar == null || hVar.f44690b != z10 || !com.google.android.gms.internal.measurement.a.a(this.f44703a, i11, hVar, null)) {
            return null;
        }
        if (z10) {
            f44702e.decrementAndGet(this);
        }
        return hVar;
    }

    private final long s(int i10, k0 k0Var) {
        h hVar;
        do {
            hVar = (h) f44699b.get(this);
            if (hVar == null) {
                return -2L;
            }
            if (((hVar.f44690b ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long jA = j.f44697f.a() - hVar.f44689a;
            long j10 = j.f44693b;
            if (jA < j10) {
                return j10 - jA;
            }
        } while (!androidx.concurrent.futures.b.a(f44699b, this, hVar, null));
        k0Var.f43597a = hVar;
        return -1L;
    }

    public final h a(h hVar, boolean z10) {
        if (z10) {
            return b(hVar);
        }
        h hVar2 = (h) f44699b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int i() {
        return f44699b.get(this) != null ? e() + 1 : e();
    }

    public final void j(d dVar) {
        h hVar = (h) f44699b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (n(dVar)) {
        }
    }

    public final h k() {
        h hVar = (h) f44699b.getAndSet(this, null);
        return hVar == null ? m() : hVar;
    }

    public final h l() {
        return o(true);
    }

    public final long r(int i10, k0 k0Var) {
        h hVarP;
        if (i10 == 3) {
            hVarP = m();
        } else {
            hVarP = p(i10 == 1);
        }
        if (hVarP == null) {
            return s(i10, k0Var);
        }
        k0Var.f43597a = hVarP;
        return -1L;
    }
}
