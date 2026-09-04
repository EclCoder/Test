package jm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f42677a = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public p(boolean z10) {
        this._cur$volatile = new q(8, z10);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42677a;
        while (true) {
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            int iA = qVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                androidx.concurrent.futures.b.a(f42677a, this, qVar, qVar.l());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42677a;
        while (true) {
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            if (qVar.d()) {
                return;
            } else {
                androidx.concurrent.futures.b.a(f42677a, this, qVar, qVar.l());
            }
        }
    }

    public final int c() {
        return ((q) f42677a.get(this)).g();
    }

    public final Object e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f42677a;
        while (true) {
            q qVar = (q) atomicReferenceFieldUpdater.get(this);
            Object objM = qVar.m();
            if (objM != q.f42681h) {
                return objM;
            }
            androidx.concurrent.futures.b.a(f42677a, this, qVar, qVar.l());
        }
    }
}
