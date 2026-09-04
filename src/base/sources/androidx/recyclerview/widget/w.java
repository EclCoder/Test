package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class w extends RecyclerView.n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f7058g = true;

    public final void A(RecyclerView.g0 g0Var) {
        I(g0Var);
        h(g0Var);
    }

    public final void B(RecyclerView.g0 g0Var) {
        J(g0Var);
    }

    public final void C(RecyclerView.g0 g0Var, boolean z10) {
        K(g0Var, z10);
        h(g0Var);
    }

    public final void D(RecyclerView.g0 g0Var, boolean z10) {
        L(g0Var, z10);
    }

    public final void E(RecyclerView.g0 g0Var) {
        M(g0Var);
        h(g0Var);
    }

    public final void F(RecyclerView.g0 g0Var) {
        N(g0Var);
    }

    public final void G(RecyclerView.g0 g0Var) {
        O(g0Var);
        h(g0Var);
    }

    public final void H(RecyclerView.g0 g0Var) {
        P(g0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean a(RecyclerView.g0 g0Var, RecyclerView.n.b bVar, RecyclerView.n.b bVar2) {
        int i10;
        int i11;
        return (bVar == null || ((i10 = bVar.f6735a) == (i11 = bVar2.f6735a) && bVar.f6736b == bVar2.f6736b)) ? w(g0Var) : y(g0Var, i10, bVar.f6736b, i11, bVar2.f6736b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean b(RecyclerView.g0 g0Var, RecyclerView.g0 g0Var2, RecyclerView.n.b bVar, RecyclerView.n.b bVar2) {
        int i10;
        int i11;
        int i12 = bVar.f6735a;
        int i13 = bVar.f6736b;
        if (g0Var2.shouldIgnore()) {
            int i14 = bVar.f6735a;
            i11 = bVar.f6736b;
            i10 = i14;
        } else {
            i10 = bVar2.f6735a;
            i11 = bVar2.f6736b;
        }
        return x(g0Var, g0Var2, i12, i13, i10, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean c(RecyclerView.g0 g0Var, RecyclerView.n.b bVar, RecyclerView.n.b bVar2) {
        int i10 = bVar.f6735a;
        int i11 = bVar.f6736b;
        View view = g0Var.itemView;
        int left = bVar2 == null ? view.getLeft() : bVar2.f6735a;
        int top = bVar2 == null ? view.getTop() : bVar2.f6736b;
        if (g0Var.isRemoved() || (i10 == left && i11 == top)) {
            return z(g0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(g0Var, i10, i11, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean d(RecyclerView.g0 g0Var, RecyclerView.n.b bVar, RecyclerView.n.b bVar2) {
        int i10 = bVar.f6735a;
        int i11 = bVar2.f6735a;
        if (i10 != i11 || bVar.f6736b != bVar2.f6736b) {
            return y(g0Var, i10, bVar.f6736b, i11, bVar2.f6736b);
        }
        E(g0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean f(RecyclerView.g0 g0Var) {
        return !this.f7058g || g0Var.isInvalid();
    }

    public abstract boolean w(RecyclerView.g0 g0Var);

    public abstract boolean x(RecyclerView.g0 g0Var, RecyclerView.g0 g0Var2, int i10, int i11, int i12, int i13);

    public abstract boolean y(RecyclerView.g0 g0Var, int i10, int i11, int i12, int i13);

    public abstract boolean z(RecyclerView.g0 g0Var);

    public void I(RecyclerView.g0 g0Var) {
    }

    public void J(RecyclerView.g0 g0Var) {
    }

    public void M(RecyclerView.g0 g0Var) {
    }

    public void N(RecyclerView.g0 g0Var) {
    }

    public void O(RecyclerView.g0 g0Var) {
    }

    public void P(RecyclerView.g0 g0Var) {
    }

    public void K(RecyclerView.g0 g0Var, boolean z10) {
    }

    public void L(RecyclerView.g0 g0Var, boolean z10) {
    }
}
