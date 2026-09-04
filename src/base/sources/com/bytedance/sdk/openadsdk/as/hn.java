package com.bytedance.sdk.openadsdk.as;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public interface hn {
    public static final hnj<JSONObject> hnj = new hnj<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.as.hn.1
        @Override // com.bytedance.sdk.openadsdk.as.hn.hnj
        /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
        public JSONObject hn(String str) {
            try {
                return new JSONObject(str);
            } catch (Exception unused) {
                return null;
            }
        }
    };

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hnj<T> {
        T hn(String str);
    }
}
