package gm;

import em.d3;
import java.util.concurrent.atomic.AtomicReferenceArray;
import jm.a0;
import jm.w;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends a0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f39395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f39396f;

    public l(long j10, l lVar, e eVar, int i10) {
        super(j10, lVar, i10);
        this.f39395e = eVar;
        this.f39396f = new AtomicReferenceArray(f.f39368b * 2);
    }

    private final void E(int i10, Object obj) {
        z().set(i10 * 2, obj);
    }

    private final /* synthetic */ AtomicReferenceArray z() {
        return this.f39396f;
    }

    public final Object A(int i10) {
        return z().get(i10 * 2);
    }

    public final Object B(int i10) {
        return z().get((i10 * 2) + 1);
    }

    public final void C(int i10, boolean z10) {
        if (z10) {
            y().c1((this.f42636c * ((long) f.f39368b)) + ((long) i10));
        }
        t();
    }

    public final Object D(int i10) {
        Object objA = A(i10);
        w(i10);
        return objA;
    }

    public final void F(int i10, Object obj) {
        z().set((i10 * 2) + 1, obj);
    }

    public final void G(int i10, Object obj) {
        E(i10, obj);
    }

    @Override // jm.a0
    public int r() {
        return f.f39368b;
    }

    @Override // jm.a0
    public void s(int i10, Throwable th2, kl.j jVar) {
        Function1 function1;
        Function1 function2;
        int i11 = f.f39368b;
        boolean z10 = i10 >= i11;
        if (z10) {
            i10 -= i11;
        }
        Object objA = A(i10);
        while (true) {
            Object objB = B(i10);
            if ((objB instanceof d3) || (objB instanceof v)) {
                if (v(i10, objB, z10 ? f.f39376j : f.f39377k)) {
                    w(i10);
                    C(i10, !z10);
                    if (!z10 || (function1 = y().f39362b) == null) {
                        return;
                    }
                    w.a(function1, objA, jVar);
                    return;
                }
            } else {
                if (objB == f.f39376j || objB == f.f39377k) {
                    break;
                }
                if (objB != f.f39373g && objB != f.f39372f) {
                    if (objB == f.f39375i || objB == f.f39370d || objB == f.z()) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objB).toString());
                }
            }
        }
        w(i10);
        if (!z10 || (function2 = y().f39362b) == null) {
            return;
        }
        w.a(function2, objA, jVar);
    }

    public final boolean v(int i10, Object obj, Object obj2) {
        return com.google.android.gms.internal.measurement.a.a(z(), (i10 * 2) + 1, obj, obj2);
    }

    public final void w(int i10) {
        E(i10, null);
    }

    public final Object x(int i10, Object obj) {
        return z().getAndSet((i10 * 2) + 1, obj);
    }

    public final e y() {
        e eVar = this.f39395e;
        kotlin.jvm.internal.s.e(eVar);
        return eVar;
    }
}
