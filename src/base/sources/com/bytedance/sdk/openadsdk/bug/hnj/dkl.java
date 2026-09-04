package com.bytedance.sdk.openadsdk.bug.hnj;

import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.ua;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl extends com.bytedance.sdk.component.hnj.gjv<JSONObject, JSONObject> {
    private final WeakReference<ua> hnj;

    public dkl(ua uaVar) {
        this.hnj = new WeakReference<>(uaVar);
    }

    public static void hnj(com.bytedance.sdk.component.hnj.fc fcVar, ua uaVar) {
        fcVar.hnj("interactiveFinish", new dkl(uaVar));
    }

    @Override // com.bytedance.sdk.component.hnj.gjv
    public JSONObject hnj(String str, JSONObject jSONObject, com.bytedance.sdk.component.hnj.sk skVar) {
        JSONObject jSONObject2 = new JSONObject();
        WeakReference<ua> weakReference = this.hnj;
        if (weakReference != null && weakReference.get() != null) {
            ua uaVar = this.hnj.get();
            as asVarGjv = uaVar.gjv();
            try {
                boolean z10 = true;
                int i10 = 0;
                if (jSONObject.optInt("finish", 1) != 1) {
                    z10 = false;
                }
                int iOptInt = jSONObject.optInt("reduce_duration", -1);
                int iXyb = asVarGjv != null ? asVarGjv.xyb() : 0;
                if (iOptInt >= 0 && iXyb >= 0) {
                    iOptInt = Math.min(iOptInt, iXyb);
                } else if (iOptInt < 0) {
                    iOptInt = iXyb >= 0 ? iXyb : 0;
                }
                if (z10) {
                    uaVar.qor(iOptInt);
                } else {
                    i10 = -1;
                }
                jSONObject2.put("code", i10);
                jSONObject2.put("reduce_duration", iOptInt);
                return jSONObject2;
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.apu.qor("InteractiveFinishMethod", e10.getMessage());
            }
        }
        return jSONObject2;
    }
}
