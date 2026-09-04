package com.bytedance.sdk.openadsdk.bug.hnj;

import com.bytedance.sdk.openadsdk.core.ua;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class fc extends com.bytedance.sdk.component.hnj.gjv<JSONObject, JSONObject> {
    private final ua hnj;

    public fc(ua uaVar) {
        this.hnj = uaVar;
    }

    public static void hnj(com.bytedance.sdk.component.hnj.fc fcVar, ua uaVar) {
        fcVar.hnj("commonConvert", new fc(uaVar));
    }

    @Override // com.bytedance.sdk.component.hnj.gjv
    public JSONObject hnj(String str, JSONObject jSONObject, com.bytedance.sdk.component.hnj.sk skVar) {
        this.hnj.dkl(jSONObject);
        return null;
    }
}
