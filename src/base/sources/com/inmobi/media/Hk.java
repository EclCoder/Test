package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class Hk {
    public static JSONObject a(int i10, int i11, String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, i10);
        jSONObject.put(str2, i11);
        return jSONObject;
    }
}
