package androidx.recyclerview.widget;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class h implements q.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f6895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0 f6896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f6897c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IdentityHashMap f6898d = new IdentityHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f6899e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f6900f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g.a.EnumC0079a f6901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final y f6902h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        q f6903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f6904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f6905c;

        a() {
        }
    }

    h(g gVar, g.a aVar) {
        this.f6895a = gVar;
        if (aVar.f6889a) {
            this.f6896b = new b0.a();
        } else {
            this.f6896b = new b0.b();
        }
        g.a.EnumC0079a enumC0079a = aVar.f6890b;
        this.f6901g = enumC0079a;
        if (enumC0079a == g.a.EnumC0079a.NO_STABLE_IDS) {
            this.f6902h = new y.b();
        } else if (enumC0079a == g.a.EnumC0079a.ISOLATED_STABLE_IDS) {
            this.f6902h = new y.a();
        } else {
            if (enumC0079a != g.a.EnumC0079a.SHARED_STABLE_IDS) {
                throw new IllegalArgumentException("unknown stable id mode");
            }
            this.f6902h = new y.c();
        }
    }

    private void D(a aVar) {
        aVar.f6905c = false;
        aVar.f6903a = null;
        aVar.f6904b = -1;
        this.f6900f = aVar;
    }

    private void i() {
        RecyclerView.h.a aVarJ = j();
        if (aVarJ != this.f6895a.getStateRestorationPolicy()) {
            this.f6895a.g(aVarJ);
        }
    }

    private RecyclerView.h.a j() {
        for (q qVar : this.f6899e) {
            RecyclerView.h.a stateRestorationPolicy = qVar.f7042c.getStateRestorationPolicy();
            RecyclerView.h.a aVar = RecyclerView.h.a.f6727c;
            if (stateRestorationPolicy == aVar || (stateRestorationPolicy == RecyclerView.h.a.PREVENT_WHEN_EMPTY && qVar.b() == 0)) {
                return aVar;
            }
        }
        return RecyclerView.h.a.ALLOW;
    }

    private int k(q qVar) {
        q qVar2;
        Iterator it = this.f6899e.iterator();
        int iB = 0;
        while (it.hasNext() && (qVar2 = (q) it.next()) != qVar) {
            iB += qVar2.b();
        }
        return iB;
    }

    private a l(int i10) {
        a aVar = this.f6900f;
        if (aVar.f6905c) {
            aVar = new a();
        } else {
            aVar.f6905c = true;
        }
        int iB = i10;
        for (q qVar : this.f6899e) {
            if (qVar.b() > iB) {
                aVar.f6903a = qVar;
                aVar.f6904b = iB;
                break;
            }
            iB -= qVar.b();
        }
        if (aVar.f6903a != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Cannot find wrapper for " + i10);
    }

    private q m(RecyclerView.h hVar) {
        int iT = t(hVar);
        if (iT == -1) {
            return null;
        }
        return (q) this.f6899e.get(iT);
    }

    private q r(RecyclerView.g0 g0Var) {
        q qVar = (q) this.f6898d.get(g0Var);
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + g0Var + ", seems like it is not bound by this adapter: " + this);
    }

    private int t(RecyclerView.h hVar) {
        int size = this.f6899e.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((q) this.f6899e.get(i10)).f7042c == hVar) {
                return i10;
            }
        }
        return -1;
    }

    private boolean u(RecyclerView recyclerView) {
        Iterator it = this.f6897c.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    public void A(RecyclerView.g0 g0Var) {
        r(g0Var).f7042c.onViewAttachedToWindow(g0Var);
    }

    public void B(RecyclerView.g0 g0Var) {
        r(g0Var).f7042c.onViewDetachedFromWindow(g0Var);
    }

    public void C(RecyclerView.g0 g0Var) {
        q qVar = (q) this.f6898d.get(g0Var);
        if (qVar != null) {
            qVar.f7042c.onViewRecycled(g0Var);
            this.f6898d.remove(g0Var);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + g0Var + ", seems like it is not bound by this adapter: " + this);
    }

    boolean E(RecyclerView.h hVar) {
        int iT = t(hVar);
        if (iT == -1) {
            return false;
        }
        q qVar = (q) this.f6899e.get(iT);
        int iK = k(qVar);
        this.f6899e.remove(iT);
        this.f6895a.notifyItemRangeRemoved(iK, qVar.b());
        Iterator it = this.f6897c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                hVar.onDetachedFromRecyclerView(recyclerView);
            }
        }
        qVar.a();
        i();
        return true;
    }

    @Override // androidx.recyclerview.widget.q.b
    public void a(q qVar, int i10, int i11, Object obj) {
        this.f6895a.notifyItemRangeChanged(i10 + k(qVar), i11, obj);
    }

    @Override // androidx.recyclerview.widget.q.b
    public void b(q qVar, int i10, int i11) {
        this.f6895a.notifyItemRangeInserted(i10 + k(qVar), i11);
    }

    @Override // androidx.recyclerview.widget.q.b
    public void c(q qVar, int i10, int i11) {
        int iK = k(qVar);
        this.f6895a.notifyItemMoved(i10 + iK, i11 + iK);
    }

    @Override // androidx.recyclerview.widget.q.b
    public void d(q qVar) {
        i();
    }

    @Override // androidx.recyclerview.widget.q.b
    public void e(q qVar) {
        this.f6895a.notifyDataSetChanged();
        i();
    }

    @Override // androidx.recyclerview.widget.q.b
    public void f(q qVar, int i10, int i11) {
        this.f6895a.notifyItemRangeRemoved(i10 + k(qVar), i11);
    }

    boolean g(int i10, RecyclerView.h hVar) {
        if (i10 < 0 || i10 > this.f6899e.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + this.f6899e.size() + ". Given:" + i10);
        }
        if (s()) {
            m0.g.b(hVar.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else if (hVar.hasStableIds()) {
            Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
        }
        if (m(hVar) != null) {
            return false;
        }
        q qVar = new q(hVar, this, this.f6896b, this.f6902h.a());
        this.f6899e.add(i10, qVar);
        Iterator it = this.f6897c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                hVar.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (qVar.b() > 0) {
            this.f6895a.notifyItemRangeInserted(k(qVar), qVar.b());
        }
        i();
        return true;
    }

    boolean h(RecyclerView.h hVar) {
        return g(this.f6899e.size(), hVar);
    }

    public long n(int i10) {
        a aVarL = l(i10);
        long jC = aVarL.f6903a.c(aVarL.f6904b);
        D(aVarL);
        return jC;
    }

    public int o(int i10) {
        a aVarL = l(i10);
        int iD = aVarL.f6903a.d(aVarL.f6904b);
        D(aVarL);
        return iD;
    }

    public int p(RecyclerView.h hVar, RecyclerView.g0 g0Var, int i10) {
        q qVar = (q) this.f6898d.get(g0Var);
        if (qVar == null) {
            return -1;
        }
        int iK = i10 - k(qVar);
        int itemCount = qVar.f7042c.getItemCount();
        if (iK >= 0 && iK < itemCount) {
            return qVar.f7042c.findRelativeAdapterPositionIn(hVar, g0Var, iK);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + iK + " which is out of bounds for the adapter with size " + itemCount + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + g0Var + "adapter:" + hVar);
    }

    public int q() {
        Iterator it = this.f6899e.iterator();
        int iB = 0;
        while (it.hasNext()) {
            iB += ((q) it.next()).b();
        }
        return iB;
    }

    public boolean s() {
        return this.f6901g != g.a.EnumC0079a.NO_STABLE_IDS;
    }

    public void v(RecyclerView recyclerView) {
        if (u(recyclerView)) {
            return;
        }
        this.f6897c.add(new WeakReference(recyclerView));
        Iterator it = this.f6899e.iterator();
        while (it.hasNext()) {
            ((q) it.next()).f7042c.onAttachedToRecyclerView(recyclerView);
        }
    }

    public void w(RecyclerView.g0 g0Var, int i10) {
        a aVarL = l(i10);
        this.f6898d.put(g0Var, aVarL.f6903a);
        aVarL.f6903a.e(g0Var, aVarL.f6904b);
        D(aVarL);
    }

    public RecyclerView.g0 x(ViewGroup viewGroup, int i10) {
        return this.f6896b.a(i10).f(viewGroup, i10);
    }

    public void y(RecyclerView recyclerView) {
        for (int size = this.f6897c.size() - 1; size >= 0; size--) {
            WeakReference weakReference = (WeakReference) this.f6897c.get(size);
            if (weakReference.get() != null) {
                if (weakReference.get() == recyclerView) {
                    this.f6897c.remove(size);
                    break;
                }
            } else {
                this.f6897c.remove(size);
            }
        }
        Iterator it = this.f6899e.iterator();
        while (it.hasNext()) {
            ((q) it.next()).f7042c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    public boolean z(RecyclerView.g0 g0Var) {
        q qVar = (q) this.f6898d.get(g0Var);
        if (qVar != null) {
            boolean zOnFailedToRecycleView = qVar.f7042c.onFailedToRecycleView(g0Var);
            this.f6898d.remove(g0Var);
            return zOnFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + g0Var + ", seems like it is not bound by this adapter: " + this);
    }
}
