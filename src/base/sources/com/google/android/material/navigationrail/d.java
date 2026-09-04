package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import com.google.android.material.navigation.f;
import sb.i;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class d extends f {
    public d(Context context) {
        super(context);
    }

    @Override // com.google.android.material.navigation.f
    protected int getItemDefaultMarginResId() {
        return sb.e.Y0;
    }

    @Override // com.google.android.material.navigation.f
    protected int getItemLayoutResId() {
        return i.H;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i11) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i11)));
        }
    }
}
