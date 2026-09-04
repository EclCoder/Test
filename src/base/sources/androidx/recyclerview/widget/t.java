package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class t extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s f7051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private s f7052b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends n {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.n
        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.n
        protected int calculateTimeForScrolling(int i10) {
            return Math.min(100, super.calculateTimeForScrolling(i10));
        }

        @Override // androidx.recyclerview.widget.n, androidx.recyclerview.widget.RecyclerView.b0
        protected void onTargetFound(View view, RecyclerView.c0 c0Var, RecyclerView.b0.a aVar) {
            t tVar = t.this;
            int[] iArrCalculateDistanceToFinalSnap = tVar.calculateDistanceToFinalSnap(tVar.mRecyclerView.getLayoutManager(), view);
            int i10 = iArrCalculateDistanceToFinalSnap[0];
            int i11 = iArrCalculateDistanceToFinalSnap[1];
            int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
            if (iCalculateTimeForDeceleration > 0) {
                aVar.d(i10, i11, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    private int d(View view, s sVar) {
        return (sVar.g(view) + (sVar.e(view) / 2)) - (sVar.n() + (sVar.o() / 2));
    }

    private View e(RecyclerView.q qVar, s sVar) {
        int childCount = qVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iN = sVar.n() + (sVar.o() / 2);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = qVar.getChildAt(i11);
            int iAbs = Math.abs((sVar.g(childAt) + (sVar.e(childAt) / 2)) - iN);
            if (iAbs < i10) {
                view = childAt;
                i10 = iAbs;
            }
        }
        return view;
    }

    private s f(RecyclerView.q qVar) {
        s sVar = this.f7052b;
        if (sVar == null || sVar.f7048a != qVar) {
            this.f7052b = s.a(qVar);
        }
        return this.f7052b;
    }

    private s g(RecyclerView.q qVar) {
        if (qVar.canScrollVertically()) {
            return h(qVar);
        }
        if (qVar.canScrollHorizontally()) {
            return f(qVar);
        }
        return null;
    }

    private s h(RecyclerView.q qVar) {
        s sVar = this.f7051a;
        if (sVar == null || sVar.f7048a != qVar) {
            this.f7051a = s.c(qVar);
        }
        return this.f7051a;
    }

    private boolean i(RecyclerView.q qVar, int i10, int i11) {
        if (qVar.canScrollHorizontally()) {
            return i10 > 0;
        }
        return i11 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean j(RecyclerView.q qVar) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = qVar.getItemCount();
        if (!(qVar instanceof RecyclerView.b0.b) || (pointFComputeScrollVectorForPosition = ((RecyclerView.b0.b) qVar).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.x
    public int[] calculateDistanceToFinalSnap(RecyclerView.q qVar, View view) {
        int[] iArr = new int[2];
        if (qVar.canScrollHorizontally()) {
            iArr[0] = d(view, f(qVar));
        } else {
            iArr[0] = 0;
        }
        if (qVar.canScrollVertically()) {
            iArr[1] = d(view, h(qVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.x
    protected RecyclerView.b0 createScroller(RecyclerView.q qVar) {
        if (qVar instanceof RecyclerView.b0.b) {
            return new a(this.mRecyclerView.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.x
    public View findSnapView(RecyclerView.q qVar) {
        if (qVar.canScrollVertically()) {
            return e(qVar, h(qVar));
        }
        if (qVar.canScrollHorizontally()) {
            return e(qVar, f(qVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.x
    public int findTargetSnapPosition(RecyclerView.q qVar, int i10, int i11) {
        s sVarG;
        int itemCount = qVar.getItemCount();
        if (itemCount == 0 || (sVarG = g(qVar)) == null) {
            return -1;
        }
        int childCount = qVar.getChildCount();
        View view = null;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = qVar.getChildAt(i14);
            if (childAt != null) {
                int iD = d(childAt, sVarG);
                if (iD <= 0 && iD > i13) {
                    view2 = childAt;
                    i13 = iD;
                }
                if (iD >= 0 && iD < i12) {
                    view = childAt;
                    i12 = iD;
                }
            }
        }
        boolean zI = i(qVar, i10, i11);
        if (zI && view != null) {
            return qVar.getPosition(view);
        }
        if (!zI && view2 != null) {
            return qVar.getPosition(view2);
        }
        if (zI) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = qVar.getPosition(view) + (j(qVar) == zI ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }
}
