package com.bytedance.sdk.openadsdk.bug.hnj;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk extends com.bytedance.sdk.component.hnj.gjv<JSONObject, JSONObject> {
    private JSONObject hnj;

    public sk(JSONObject jSONObject) {
        this.hnj = jSONObject;
    }

    public static void hnj(com.bytedance.sdk.component.hnj.fc fcVar, JSONObject jSONObject) {
        fcVar.hnj("getData", new sk(jSONObject));
    }

    @Override // com.bytedance.sdk.component.hnj.gjv
    public JSONObject hnj(String str, JSONObject jSONObject, com.bytedance.sdk.component.hnj.sk skVar) {
        return com.bytedance.sdk.openadsdk.core.ojm.hnj.hn.hnj(this.hnj, jSONObject);
    }
}
