package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.f;
import com.google.android.material.navigation.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class e extends j {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f20684b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f20685c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final FrameLayout.LayoutParams f20686d0;

    public e(Context context) {
        super(context);
        this.f20684b0 = -1;
        this.f20685c0 = 0;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f20686d0 = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    private int s(int i10, int i11, int i12) {
        int iMax = i11 / Math.max(1, i12);
        int size = this.f20684b0;
        if (size == -1) {
            size = View.MeasureSpec.getSize(i10);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, iMax), 0);
    }

    private int t(View view, int i10, int i11) {
        view.measure(i10, i11);
        if (view.getVisibility() != 8) {
            return view.getMeasuredHeight();
        }
        return 0;
    }

    private int u(int i10, int i11, int i12, View view) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 0);
        int childCount = getChildCount();
        int iT = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (!(childAt instanceof f)) {
                int iT2 = t(childAt, i10, iMakeMeasureSpec);
                i11 -= iT2;
                iT += iT2;
            }
        }
        int iS = view == null ? s(i10, Math.max(i11, 0), i12) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() == 0) {
                i14++;
            }
            if ((childAt2 instanceof f) && childAt2 != view) {
                iT += t(childAt2, i10, iS);
            }
        }
        return iT + (Math.max(0, i14 - 1) * this.f20685c0);
    }

    private int v(int i10, int i11, int i12) {
        int iT;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            iT = t(childAt, i10, s(i10, i11, i12));
            i11 -= iT;
            i12--;
        } else {
            iT = 0;
        }
        return iT + u(i10, i11, i12, childAt);
    }

    public int getItemMinimumHeight() {
        return this.f20684b0;
    }

    public int getItemSpacing() {
        return this.f20685c0;
    }

    int getMenuGravity() {
        return this.f20686d0.gravity;
    }

    @Override // com.google.android.material.navigation.j
    protected f h(Context context) {
        return new d(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = 0;
        int measuredHeight = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                measuredHeight += childAt.getMeasuredHeight();
                i15++;
            }
        }
        int iMax = i15 <= 1 ? 0 : Math.max(0, Math.min((getMeasuredHeight() - measuredHeight) / (i15 - 1), this.f20685c0));
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                int measuredHeight2 = childAt2.getMeasuredHeight();
                childAt2.layout(0, i17, i14, measuredHeight2 + i17);
                i17 += measuredHeight2 + iMax;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        int currentVisibleContentItemCount = getCurrentVisibleContentItemCount();
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.resolveSizeAndState((currentVisibleContentItemCount <= 1 || !j(getLabelVisibilityMode(), currentVisibleContentItemCount)) ? u(i10, size, currentVisibleContentItemCount, null) : v(i10, size, currentVisibleContentItemCount), i11, 0));
    }

    public void setItemMinimumHeight(int i10) {
        if (this.f20684b0 != i10) {
            this.f20684b0 = i10;
            requestLayout();
        }
    }

    public void setItemSpacing(int i10) {
        if (this.f20685c0 != i10) {
            this.f20685c0 = i10;
            requestLayout();
        }
    }

    void setMenuGravity(int i10) {
        FrameLayout.LayoutParams layoutParams = this.f20686d0;
        if (layoutParams.gravity != i10) {
            layoutParams.gravity = i10;
            setLayoutParams(layoutParams);
        }
    }
}
