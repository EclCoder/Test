package com.bytedance.sdk.openadsdk.bug.hnj;

import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.ua;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class mjg extends com.bytedance.sdk.component.hnj.qor<JSONObject, JSONObject> {
    private HashSet<Integer> gjv = new HashSet<>();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private as f13265hn;
    private WeakReference<ua> hnj;
    private long qor;

    public mjg(ua uaVar, as asVar) {
        this.hnj = new WeakReference<>(uaVar);
        this.f13265hn = asVar;
    }

    public static void hnj(com.bytedance.sdk.component.hnj.fc fcVar, final ua uaVar, final as asVar) {
        fcVar.hnj("requestDelayCallback", new com.bytedance.sdk.component.hnj.qor.hn() { // from class: com.bytedance.sdk.openadsdk.bug.hnj.mjg.1
            @Override // com.bytedance.sdk.component.hnj.qor.hn
            public com.bytedance.sdk.component.hnj.qor hnj() {
                return new mjg(uaVar, asVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.hnj.qor
    public void hnj(JSONObject jSONObject, com.bytedance.sdk.component.hnj.sk skVar) {
        ua uaVar = this.hnj.get();
        if (uaVar != null && jSONObject != null) {
            uaVar.hnj(new com.bytedance.sdk.openadsdk.orl.hn() { // from class: com.bytedance.sdk.openadsdk.bug.hnj.mjg.2
                @Override // com.bytedance.sdk.openadsdk.orl.hn
                public void hnj(int i10) {
                    mjg.this.gjv.add(Integer.valueOf(i10));
                    if (mjg.this.gjv.size() >= mjg.this.qor) {
                        try {
                            mjg.this.hnj(new JSONObject());
                            mjg.this.gjv.clear();
                        } catch (Exception e10) {
                            e10.getMessage();
                        }
                    }
                }
            });
            int iOptInt = jSONObject.optInt("delay", -1);
            if (iOptInt < 0) {
                return;
            }
            this.qor = iOptInt / 1000;
            return;
        }
        qor();
    }
}
