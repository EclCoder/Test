package com.bytedance.sdk.openadsdk.component.hnj;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.hqh;
import com.bytedance.sdk.openadsdk.core.ojm.aq;
import com.bytedance.sdk.openadsdk.core.ojm.ojm;
import com.bytedance.sdk.openadsdk.core.qor.qor;
import com.bytedance.sdk.openadsdk.eum.hnj.hnj.gjv;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    public static aq hn(as asVar, Activity activity, final com.bytedance.sdk.openadsdk.component.aq.hnj hnjVar, com.bytedance.sdk.openadsdk.component.ojm.hn hnVar) {
        aq aqVar = new aq(activity.getApplicationContext(), asVar, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.hnj.hn.2
            @Override // com.bytedance.sdk.openadsdk.core.qor.hnj, com.bytedance.sdk.openadsdk.core.qor.hn, com.bytedance.sdk.openadsdk.core.qor.qor
            public void hnj(View view, float f10, float f11, float f12, float f13, SparseArray<qor.hnj> sparseArray, boolean z10) {
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(hnjVar.qor()));
                hnj(map);
                super.hnj(view, f10, f11, f12, f13, sparseArray, z10);
            }
        };
        aqVar.hn(hnVar);
        hnj(activity.getApplicationContext(), asVar, aqVar);
        hnj(aqVar, asVar);
        return aqVar;
    }

    public static hnj hnj(as asVar, Activity activity, com.bytedance.sdk.openadsdk.component.aq.hnj hnjVar) {
        hnj hnjVar2 = new hnj(activity.getApplicationContext(), asVar, "open_ad", 4, hnjVar);
        hnjVar2.hn(activity.findViewById(R.id.content));
        hnj(activity.getApplicationContext(), asVar, hnjVar2);
        hnj(hnjVar2, asVar);
        return hnjVar2;
    }

    public static ojm hnj(as asVar, Activity activity, final com.bytedance.sdk.openadsdk.component.aq.hnj hnjVar, com.bytedance.sdk.openadsdk.component.ojm.hn hnVar) {
        ojm ojmVar = new ojm(activity, asVar, "open_ad", 4) { // from class: com.bytedance.sdk.openadsdk.component.hnj.hn.1
            @Override // com.bytedance.sdk.openadsdk.core.qor.hn, com.bytedance.sdk.openadsdk.core.qor.qor
            public void hnj(View view, float f10, float f11, float f12, float f13, SparseArray<qor.hnj> sparseArray, boolean z10) {
                HashMap map = new HashMap();
                map.put("duration", Long.valueOf(hnjVar.qor()));
                hnj(map);
                super.hnj(view, f10, f11, f12, f13, sparseArray, z10);
            }
        };
        ojmVar.hn(hnVar);
        hnj(activity.getApplicationContext(), asVar, ojmVar);
        hnj(ojmVar, asVar);
        return ojmVar;
    }

    public static void hnj(com.bytedance.sdk.openadsdk.core.qor.hn hnVar, as asVar) {
        HashMap map = new HashMap();
        map.put("click_area", Integer.valueOf(asVar.ka()));
        map.put("openad_creative_type", as.sk(asVar) ? "video_normal_ad" : "image_normal_ad");
        map.put("click_scence", Integer.valueOf(hqh.qor(asVar) ? 3 : 1));
        hnVar.hnj(map);
    }

    private static void hnj(Context context, as asVar, com.bytedance.sdk.openadsdk.core.qor.hn hnVar) {
        if (asVar == null || asVar.rg() != 4) {
            return;
        }
        hnVar.hnj(gjv.hnj(context, "open_ad"));
    }
}
