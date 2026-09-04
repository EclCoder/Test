package com.bytedance.sdk.openadsdk.bug.hnj;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.fvt;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.ua;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class xn extends com.bytedance.sdk.component.hnj.gjv<JSONObject, JSONObject> {
    private String gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private ua f13270hn;
    private com.bytedance.sdk.component.ojm.dkl hnj;
    private as qor;

    public xn(com.bytedance.sdk.component.ojm.dkl dklVar, String str, ua uaVar, as asVar) {
        this.hnj = dklVar;
        this.gjv = str;
        this.f13270hn = uaVar;
        this.qor = asVar;
    }

    public static void hnj(com.bytedance.sdk.component.hnj.fc fcVar, com.bytedance.sdk.component.ojm.dkl dklVar, ua uaVar, as asVar) {
        fcVar.hnj("closeWebview", new xn(dklVar, "closeWebview", uaVar, asVar));
        fcVar.hnj("makeVisible", new xn(dklVar, "makeVisible", uaVar, asVar));
        fcVar.hnj("getCurrentVisibleState", new xn(dklVar, "getCurrentVisibleState", uaVar, asVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.hnj.gjv
    public JSONObject hnj(String str, JSONObject jSONObject, com.bytedance.sdk.component.hnj.sk skVar) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        String str2 = this.gjv;
        str2.getClass();
        switch (str2) {
            case "getCurrentVisibleState":
                as asVar = this.qor;
                if (asVar != null) {
                    jSONObject2.put("visibleState", !fvt.hnj(this.hnj, 20, asVar.xf(), false) ? 1 : 0);
                }
                return jSONObject2;
            case "closeWebview":
                com.bytedance.sdk.openadsdk.utils.ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.bug.hnj.xn.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (xn.this.hnj != null) {
                            xn.this.hnj.setVisibility(8);
                            ViewGroup viewGroup = (ViewGroup) xn.this.hnj.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(xn.this.hnj);
                            }
                        }
                    }
                });
                jSONObject2.put("success", true);
                return jSONObject2;
            case "makeVisible":
                if (this.hnj != null) {
                    jSONObject2.put("success", true);
                    com.bytedance.sdk.openadsdk.utils.ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.bug.hnj.xn.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (xn.this.hnj != null) {
                                xn.this.hnj.setVisibility(0);
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
