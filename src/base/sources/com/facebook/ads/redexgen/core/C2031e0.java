package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2031e0 {
    public final int[] A00(View view, int i10, int i11) {
        R3 r10 = (R3) view.getLayoutParams();
        int childHeightSpec = ViewGroup.getChildMeasureSpec(i10, view.getPaddingLeft() + view.getPaddingRight(), r10.width);
        int childWidthSpec = view.getPaddingTop();
        view.measure(childHeightSpec, ViewGroup.getChildMeasureSpec(i11, childWidthSpec + view.getPaddingBottom(), r10.height));
        int childWidthSpec2 = view.getMeasuredWidth();
        int childWidthSpec3 = view.getMeasuredHeight();
        return new int[]{childWidthSpec2 + r10.leftMargin + r10.rightMargin, childWidthSpec3 + r10.bottomMargin + r10.topMargin};
    }
}
