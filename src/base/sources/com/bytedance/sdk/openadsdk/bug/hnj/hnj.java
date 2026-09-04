package com.bytedance.sdk.openadsdk.bug.hnj;

import com.bytedance.sdk.openadsdk.core.ua;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends com.bytedance.sdk.component.hnj.qor<JSONObject, JSONObject> {
    private final WeakReference<ua> hnj;

    public hnj(ua uaVar) {
        this.hnj = new WeakReference<>(uaVar);
    }

    public static void hnj(com.bytedance.sdk.component.hnj.fc fcVar, final ua uaVar) {
        fcVar.hnj("getNetworkData", new com.bytedance.sdk.component.hnj.qor.hn() { // from class: com.bytedance.sdk.openadsdk.bug.hnj.hnj.1
            @Override // com.bytedance.sdk.component.hnj.qor.hn
            public com.bytedance.sdk.component.hnj.qor hnj() {
                return new hnj(uaVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.hnj.qor
    public void hnj(JSONObject jSONObject, com.bytedance.sdk.component.hnj.sk skVar) {
        ua uaVar = this.hnj.get();
        if (uaVar == null) {
            qor();
        } else {
            uaVar.hnj(jSONObject, new com.bytedance.sdk.openadsdk.orl.gjv() { // from class: com.bytedance.sdk.openadsdk.bug.hnj.hnj.2
                @Override // com.bytedance.sdk.openadsdk.orl.gjv
                public void hnj(boolean z10, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        if (!z10) {
                            hnj.this.hnj(jSONObject2);
                        } else {
                            jSONObject2.put("creatives", ua.hnj(hnjVar));
                            hnj.this.hnj(jSONObject2);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
