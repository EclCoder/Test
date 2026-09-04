package com.bytedance.sdk.openadsdk.p000do.hn;

import com.bytedance.sdk.component.aq.hn.qor;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.jip.hn.hnj;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.bytedance.sdk.openadsdk.utils.ua;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {
    public static void hnj(final as asVar, final hnj hnjVar, final sk.hnj hnjVar2) {
        asVar.rw();
        ua.hn(new qor("mrc_report") { // from class: com.bytedance.sdk.openadsdk.do.hn.gjv.1
            @Override // java.lang.Runnable
            public void run() {
                if (asVar.sz()) {
                    if (asVar.ouk()) {
                        com.bytedance.sdk.openadsdk.core.orl.hn.qor.hnj(asVar.sl(), new com.bytedance.sdk.openadsdk.core.orl.hn.qor.hn("show_urls", asVar));
                    } else {
                        com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar);
                    }
                }
                String strHnj = orp.hnj(asVar);
                final JSONObject jSONObject = new JSONObject();
                hnj hnjVar3 = hnjVar;
                JSONObject jSONObjectHnj = null;
                if (hnjVar3 != null) {
                    try {
                        jSONObject.put("root_view", hnj.hnj(hnjVar3));
                        sk.hnj hnjVar4 = hnjVar2;
                        if (hnjVar4 != null) {
                            int i10 = hnjVar4.hnj;
                            if (i10 != -1) {
                                jSONObject.put("dynamic_show_type", i10);
                            }
                            int i11 = hnjVar2.f14326hn;
                            if (i11 != -1) {
                                jSONObjectHnj = com.bytedance.sdk.openadsdk.gjv.qor.hnj(i11 + 1);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                final JSONObject jSONObject2 = jSONObjectHnj;
                com.bytedance.sdk.openadsdk.gjv.qor.hnj(System.currentTimeMillis(), asVar, strHnj, "mrc_show", new hnj() { // from class: com.bytedance.sdk.openadsdk.do.hn.gjv.1.1
                    @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                    public JSONObject hnj() {
                        return jSONObject2;
                    }

                    @Override // com.bytedance.sdk.openadsdk.jip.hn.hnj, com.bytedance.sdk.openadsdk.jip.hn.hn
                    public JSONObject qor() {
                        return jSONObject;
                    }
                });
            }
        });
    }
}
