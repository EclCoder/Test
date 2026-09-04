package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface as<T> {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hn {
        void hnj(int i10, String str);

        void hnj(Cdo.hn hnVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj {
        void hnj(int i10, String str);

        void hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar, com.bytedance.sdk.openadsdk.core.model.qor qorVar);
    }

    com.bytedance.sdk.openadsdk.gjv.sk hn(JSONObject jSONObject);

    com.bytedance.sdk.component.adexpress.hnj.qor.hnj hnj();

    com.bytedance.sdk.openadsdk.gjv.sk hnj(JSONObject jSONObject, String str, List<String> list);

    JSONObject hnj(JSONObject jSONObject);

    void hnj(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.xyo xyoVar, int i10, eum eumVar);

    void hnj(String str);

    void hnj(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3);

    void hnj(JSONObject jSONObject, hn hnVar);

    void hnj(JSONObject jSONObject, String str);
}
