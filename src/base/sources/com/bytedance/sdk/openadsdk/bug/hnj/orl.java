package com.bytedance.sdk.openadsdk.bug.hnj;

import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class orl extends com.bytedance.sdk.component.hnj.gjv<JSONObject, JSONObject> {
    private WeakReference<com.bytedance.sdk.component.ojm.dkl> hnj;

    public orl(com.bytedance.sdk.component.ojm.dkl dklVar) {
        this.hnj = new WeakReference<>(dklVar);
    }

    public static void hnj(com.bytedance.sdk.component.hnj.fc fcVar, com.bytedance.sdk.component.ojm.dkl dklVar) {
        fcVar.hnj("preventTouchEvent", new orl(dklVar));
    }

    @Override // com.bytedance.sdk.component.hnj.gjv
    public JSONObject hnj(String str, JSONObject jSONObject, com.bytedance.sdk.component.hnj.sk skVar) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isPrevent", false);
            com.bytedance.sdk.component.ojm.dkl dklVar = this.hnj.get();
            if (dklVar != null) {
                dklVar.setIsPreventTouchEvent(zOptBoolean);
                jSONObject2.put("success", true);
                return jSONObject2;
            }
            jSONObject2.put("success", false);
            return jSONObject2;
        } catch (Throwable unused) {
            jSONObject2.put("success", false);
            return jSONObject2;
        }
    }
}
