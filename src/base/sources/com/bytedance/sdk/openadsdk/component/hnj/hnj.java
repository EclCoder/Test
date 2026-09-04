package com.bytedance.sdk.openadsdk.component.hnj;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.qor.qor;
import com.bytedance.sdk.openadsdk.p000do.hn.sk;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends com.bytedance.sdk.openadsdk.core.qor.hnj {
    private final com.bytedance.sdk.openadsdk.component.aq.hnj hnj;

    public hnj(Context context, as asVar, String str, int i10, com.bytedance.sdk.openadsdk.component.aq.hnj hnjVar) {
        super(context, asVar, str, i10);
        this.hnj = hnjVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.qor.hnj, com.bytedance.sdk.openadsdk.core.qor.hn, com.bytedance.sdk.openadsdk.core.qor.qor
    public void hnj(View view, float f10, float f11, float f12, float f13, SparseArray<qor.hnj> sparseArray, boolean z10) {
        if (view.getTag() == "open_ad_click_button_tag") {
            hnj("click_bar");
        } else {
            hnj("click_material");
        }
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(this.hnj.qor()));
        hnj(map);
        super.hnj(view, f10, f11, f12, f13, sparseArray, z10);
        sk.hnj(((com.bytedance.sdk.openadsdk.core.qor.hn) this).dkl, 9);
    }
}
