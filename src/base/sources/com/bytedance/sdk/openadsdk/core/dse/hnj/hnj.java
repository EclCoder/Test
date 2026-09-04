package com.bytedance.sdk.openadsdk.core.dse.hnj;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.hn.dnm;
import com.bytedance.sdk.openadsdk.core.model.jip;
import com.bytedance.sdk.openadsdk.core.qor.qor;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends qor implements com.bytedance.sdk.component.adexpress.dynamic.dkl.hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private dnm f13726hn;
    protected WeakReference<View> hnj;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dkl.hnj
    public void hnj(dnm dnmVar) {
        this.f13726hn = dnmVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dkl.hnj
    public void hnj(View view) {
        this.hnj = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.qor.qor
    public void hnj(View view, float f10, float f11, float f12, float f13, SparseArray<qor.hnj> sparseArray, boolean z10) {
        hnj(view, ((Integer) view.getTag()).intValue(), f10, f11, f12, f13, sparseArray);
    }

    private void hnj(View view, int i10, float f10, float f11, float f12, float f13, SparseArray<qor.hnj> sparseArray) {
        if (this.f13726hn != null) {
            String strValueOf = "";
            try {
                int i11 = com.bytedance.sdk.component.adexpress.dynamic.hnj.eum;
                if (view.getTag(i11) != null) {
                    strValueOf = String.valueOf(view.getTag(i11));
                }
            } catch (Exception unused) {
            }
            this.f13726hn.hnj(view, i10, new jip.hnj().gjv(f10).qor(f11).hn(f12).hnj(f13).hn(this.f44do).hnj(this.tu).hnj(sparseArray).hnj(this.nyv).hnj(strValueOf).hnj());
        }
    }
}
