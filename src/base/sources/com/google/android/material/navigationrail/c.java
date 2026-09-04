package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class c extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f20682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f20683b;

    public c(Context context) {
        super(context);
        this.f20682a = 0;
        this.f20683b = false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int childCount = getChildCount();
        int measuredHeight = this.f20682a;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int iMax = Math.max(measuredHeight, childAt.getTop()) + layoutParams.topMargin;
            childAt.layout(childAt.getLeft(), iMax, childAt.getRight(), childAt.getMeasuredHeight() + iMax);
            measuredHeight = iMax + childAt.getMeasuredHeight() + layoutParams.bottomMargin;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int childCount = getChildCount();
        int measuredHeight = 0;
        View childAt = getChildAt(0);
        int size = View.MeasureSpec.getSize(i11);
        if (childCount > 1) {
            View childAt2 = getChildAt(0);
            measureChild(childAt2, i10, i11);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt2.getLayoutParams();
            measuredHeight = layoutParams.topMargin + childAt2.getMeasuredHeight() + layoutParams.bottomMargin;
            int i12 = (size - measuredHeight) - this.f20682a;
            childAt = getChildAt(1);
            if (!this.f20683b) {
                i11 = View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
            }
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        measureChild(childAt, i10, i11);
        setMeasuredDimension(getMeasuredWidth(), Math.max(size, this.f20682a + measuredHeight + childAt.getMeasuredHeight() + layoutParams2.bottomMargin + layoutParams2.topMargin));
    }

    public void setPaddingTop(int i10) {
        this.f20682a = i10;
    }

    public void setScrollingEnabled(boolean z10) {
        this.f20683b = z10;
    }
}
