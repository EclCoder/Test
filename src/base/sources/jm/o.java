package jm;

import com.bytedance.sdk.openadsdk.LXL.vHmGJpUTWNVV;
import em.s0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f42670a = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f42671b = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f42672c = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    private final o h() {
        o oVar;
        Object obj;
        while (true) {
            o oVar2 = (o) f42671b.get(this);
            oVar = oVar2;
            while (true) {
                o oVar3 = null;
                while (true) {
                    obj = f42670a.get(oVar);
                    if (obj == this) {
                        if (oVar2 != oVar && !androidx.concurrent.futures.b.a(f42671b, this, oVar2, oVar)) {
                            break;
                        }
                        break;
                    }
                    if (q()) {
                        return null;
                    }
                    if (!(obj instanceof x)) {
                        kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        oVar3 = oVar;
                        oVar = (o) obj;
                    } else {
                        if (oVar3 != null) {
                            break;
                        }
                        oVar = (o) f42671b.get(oVar);
                    }
                }
                if (!androidx.concurrent.futures.b.a(f42670a, oVar3, oVar, ((x) obj).f42692a)) {
                    break;
                }
                oVar = oVar3;
            }
        }
        return oVar;
    }

    private final o i(o oVar) {
        while (oVar.q()) {
            oVar = (o) f42671b.get(oVar);
        }
        return oVar;
    }

    private final void j(o oVar) {
        o oVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42671b;
        do {
            oVar2 = (o) atomicReferenceFieldUpdater.get(oVar);
            if (k() != oVar) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f42671b, oVar, oVar2, this));
        if (q()) {
            oVar.h();
        }
    }

    private final x t() {
        x xVar = (x) f42672c.get(this);
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x(this);
        f42672c.set(this, xVar2);
        return xVar2;
    }

    public final boolean c(o oVar, int i10) {
        o oVarM;
        do {
            oVarM = m();
            if (oVarM instanceof m) {
                return (((m) oVarM).f42667d & i10) == 0 && oVarM.c(oVar, i10);
            }
        } while (!oVarM.e(oVar, this));
        return true;
    }

    public final boolean e(o oVar, o oVar2) {
        f42671b.set(oVar, this);
        f42670a.set(oVar, oVar2);
        if (!androidx.concurrent.futures.b.a(f42670a, this, oVar2, oVar)) {
            return false;
        }
        oVar.j(oVar2);
        return true;
    }

    public final boolean f(o oVar) {
        f42671b.set(oVar, this);
        f42670a.set(oVar, this);
        while (k() == this) {
            if (androidx.concurrent.futures.b.a(f42670a, this, this, oVar)) {
                oVar.j(this);
                return true;
            }
        }
        return false;
    }

    public final void g(int i10) {
        c(new m(i10), i10);
    }

    public final Object k() {
        return f42670a.get(this);
    }

    public final o l() {
        o oVar;
        Object objK = k();
        x xVar = objK instanceof x ? (x) objK : null;
        if (xVar != null && (oVar = xVar.f42692a) != null) {
            return oVar;
        }
        kotlin.jvm.internal.s.f(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (o) objK;
    }

    public final o m() {
        o oVarH = h();
        return oVarH == null ? i((o) f42671b.get(this)) : oVarH;
    }

    public boolean q() {
        return k() instanceof x;
    }

    public boolean r() {
        return s() == null;
    }

    public final o s() {
        Object objK;
        o oVar;
        do {
            objK = k();
            if (objK instanceof x) {
                return ((x) objK).f42692a;
            }
            if (objK == this) {
                return (o) objK;
            }
            kotlin.jvm.internal.s.f(objK, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            oVar = (o) objK;
        } while (!androidx.concurrent.futures.b.a(f42670a, this, objK, oVar.t()));
        oVar.h();
        return null;
    }

    public String toString() {
        return new kotlin.jvm.internal.a0(this) { // from class: jm.o.a
            @Override // zl.h
            public Object get() {
                return s0.a(this.receiver);
            }

            {
                String str = vHmGJpUTWNVV.nVGZziIuLsqtzl;
            }
        } + '@' + s0.b(this);
    }
}
