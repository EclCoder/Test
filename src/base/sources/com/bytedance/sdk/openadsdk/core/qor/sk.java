package com.bytedance.sdk.openadsdk.core.qor;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.as;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class sk extends hnj {
    public sk(Context context, as asVar, String str, int i10) {
        super(context, asVar, str, i10);
    }

    protected abstract void hnj(View view, float f10, float f11, float f12, float f13, SparseArray<qor.hnj> sparseArray, int i10, int i11, int i12, boolean z10);

    @Override // com.bytedance.sdk.openadsdk.core.qor.hnj, com.bytedance.sdk.openadsdk.core.qor.hn, com.bytedance.sdk.openadsdk.core.qor.qor
    public void hnj(View view, float f10, float f11, float f12, float f13, SparseArray<qor.hnj> sparseArray, boolean z10) {
        if (hnj(view, z10)) {
            hnj(view, f10, f11, f12, f13, sparseArray, this.f14172vf, this.tgn, this.xyo, z10);
        }
        super.hnj(view, f10, f11, f12, f13, sparseArray, z10);
    }
}
