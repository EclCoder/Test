package com.bytedance.sdk.openadsdk.component.reward.view;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.x;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends x {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private s f13558hn;
    private s hnj;
    private RecyclerView qor;

    private s hn(RecyclerView.q qVar) {
        s sVar = this.f13558hn;
        if (sVar == null || sVar.k() != qVar) {
            this.f13558hn = s.a(qVar);
        }
        return this.f13558hn;
    }

    @Override // androidx.recyclerview.widget.x
    public void attachToRecyclerView(RecyclerView recyclerView) {
        this.qor = recyclerView;
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.x
    public int[] calculateDistanceToFinalSnap(RecyclerView.q qVar, View view) {
        int[] iArr = {0, 0};
        if (qVar.canScrollHorizontally()) {
            iArr[0] = hnj(view, hn(qVar));
            return iArr;
        }
        if (qVar.canScrollVertically()) {
            iArr[1] = hnj(view, hnj(qVar));
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.x
    public RecyclerView.b0 createScroller(RecyclerView.q qVar) {
        if (qVar instanceof RecyclerView.b0.b) {
            return new n(this.qor.getContext()) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.hnj.1
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
                    hnj hnjVar = hnj.this;
                    int[] iArrCalculateDistanceToFinalSnap = hnjVar.calculateDistanceToFinalSnap(hnjVar.qor.getLayoutManager(), view);
                    int i10 = iArrCalculateDistanceToFinalSnap[0];
                    int i11 = iArrCalculateDistanceToFinalSnap[1];
                    int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
                    if (iCalculateTimeForDeceleration > 0) {
                        aVar.d(i10, i11, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                    }
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.x
    public View findSnapView(RecyclerView.q qVar) {
        int childCount = qVar.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) qVar;
        if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1) {
            return null;
        }
        s sVarHnj = hnj(qVar);
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayoutManager.getChildAt(i11);
            int iAbs = Math.abs(sVarHnj.g(childAt));
            if (iAbs < i10) {
                view = childAt;
                i10 = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.x
    public int findTargetSnapPosition(RecyclerView.q qVar, int i10, int i11) {
        View viewFindSnapView = findSnapView(qVar);
        int i12 = -1;
        if (viewFindSnapView == null) {
            return -1;
        }
        int position = qVar.getPosition(viewFindSnapView);
        if (qVar.canScrollVertically()) {
            i12 = i11 < 0 ? position - 1 : position + 1;
        }
        return Math.min(qVar.getItemCount() - 1, Math.max(i12, 0));
    }

    private int hnj(View view, s sVar) {
        int iG = sVar.g(view);
        return iG >= sVar.n() / 2 ? iG - sVar.n() : iG;
    }

    private s hnj(RecyclerView.q qVar) {
        s sVar = this.hnj;
        if (sVar == null || sVar.k() != qVar) {
            this.hnj = s.c(qVar);
        }
        return this.hnj;
    }
}
