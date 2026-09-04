package com.bytedance.sdk.openadsdk.bug.hnj;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.fvt;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.ua;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class apu extends com.bytedance.sdk.component.hnj.oj<JSONObject, JSONObject> {
    public static final HashSet<String> hnj = new HashSet<>(Arrays.asList("closeWebview", "makeVisible", "getCurrentVisibleState"));
    private as gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private com.bytedance.sdk.component.ojm.dkl f13261hn;
    private ua qor;

    public apu(com.bytedance.sdk.component.ojm.dkl dklVar, ua uaVar, as asVar) {
        this.f13261hn = dklVar;
        this.qor = uaVar;
        this.gjv = asVar;
    }

    public static void hnj(com.bytedance.sdk.component.hnj.fc fcVar, com.bytedance.sdk.component.ojm.dkl dklVar, ua uaVar, as asVar) {
        fcVar.hnj(hnj, new apu(dklVar, uaVar, asVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.hnj.gjv
    public JSONObject hnj(String str, JSONObject jSONObject, com.bytedance.sdk.component.hnj.sk skVar) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        str.getClass();
        switch (str) {
            case "getCurrentVisibleState":
                as asVar = this.gjv;
                if (asVar != null) {
                    jSONObject2.put("visibleState", !fvt.hnj(this.f13261hn, 20, asVar.xf(), false) ? 1 : 0);
                }
                return jSONObject2;
            case "closeWebview":
                com.bytedance.sdk.openadsdk.utils.ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.bug.hnj.apu.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (apu.this.f13261hn != null) {
                            apu.this.f13261hn.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) apu.this.f13261hn.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(apu.this.f13261hn);
                            }
                        }
                    }
                });
                jSONObject2.put("success", true);
                return jSONObject2;
            case "makeVisible":
                if (this.f13261hn != null) {
                    jSONObject2.put("success", true);
                    com.bytedance.sdk.openadsdk.utils.ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.bug.hnj.apu.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (apu.this.f13261hn != null) {
                                apu.this.f13261hn.setVisibility(0);
                            }
                        }
                    });
                    return jSONObject2;
                }
                jSONObject2.put("success", false);
                return jSONObject2;
            default:
                return jSONObject2;
        }
    }
}
