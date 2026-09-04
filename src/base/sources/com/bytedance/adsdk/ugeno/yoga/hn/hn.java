package com.bytedance.adsdk.ugeno.yoga.hn;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.yoga.dnm;
import com.bytedance.adsdk.ugeno.yoga.dse;
import com.bytedance.adsdk.ugeno.yoga.ta;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn extends ViewGroup {
    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof hn) {
            throw null;
        }
        ta taVarHnj = dnm.hnj();
        qor.hnj(new qor.hnj(layoutParams), taVarHnj, view);
        taVarHnj.hnj(view);
        taVarHnj.hnj((dse) new qor.hn());
        throw null;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof qor.hnj;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new qor.hnj(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new qor.hnj(layoutParams);
    }

    public ta getYogaNode() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        throw new RuntimeException("Attempting to layout a VirtualYogaLayout");
    }
}
