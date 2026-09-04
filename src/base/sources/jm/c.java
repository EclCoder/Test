package jm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f42638a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f42639b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public c(c cVar) {
        this._prev$volatile = cVar;
    }

    private final c d() {
        c cVarH = h();
        while (cVarH != null && cVarH.k()) {
            cVarH = (c) f42639b.get(cVarH);
        }
        return cVarH;
    }

    private final c e() {
        c cVarF;
        c cVarF2 = f();
        kotlin.jvm.internal.s.e(cVarF2);
        while (cVarF2.k() && (cVarF = cVarF2.f()) != null) {
            cVarF2 = cVarF;
        }
        return cVarF2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g() {
        return f42638a.get(this);
    }

    public final void c() {
        f42639b.set(this, null);
    }

    public final c f() {
        Object objG = g();
        if (objG == b.f42637a) {
            return null;
        }
        return (c) objG;
    }

    public final c h() {
        return (c) f42639b.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return androidx.concurrent.futures.b.a(f42638a, this, null, b.f42637a);
    }

    public final void n() {
        Object obj;
        if (l()) {
            return;
        }
        while (true) {
            c cVarD = d();
            c cVarE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42639b;
            do {
                obj = atomicReferenceFieldUpdater.get(cVarE);
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, cVarE, obj, ((c) obj) == null ? null : cVarD));
            if (cVarD != null) {
                f42638a.set(cVarD, cVarE);
            }
            if (!cVarE.k() || cVarE.l()) {
                if (cVarD == null || !cVarD.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(c cVar) {
        return androidx.concurrent.futures.b.a(f42638a, this, null, cVar);
    }
}
