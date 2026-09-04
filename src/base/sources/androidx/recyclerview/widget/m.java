package androidx.recyclerview.widget;

import android.view.View;
import v7.XOSD.qnwOeeQSSWa;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f7029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f7030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f7031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f7032e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f7035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f7036i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f7028a = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f7033f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f7034g = 0;

    m() {
    }

    boolean a(RecyclerView.c0 c0Var) {
        int i10 = this.f7030c;
        return i10 >= 0 && i10 < c0Var.b();
    }

    View b(RecyclerView.x xVar) {
        View viewO = xVar.o(this.f7030c);
        this.f7030c += this.f7031d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f7029b + ", mCurrentPosition=" + this.f7030c + ", mItemDirection=" + this.f7031d + ", mLayoutDirection=" + this.f7032e + ", mStartLine=" + this.f7033f + qnwOeeQSSWa.ilycCyITXgEBeYL + this.f7034g + '}';
    }
}
