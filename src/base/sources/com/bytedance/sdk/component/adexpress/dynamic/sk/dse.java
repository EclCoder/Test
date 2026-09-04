package com.bytedance.sdk.component.adexpress.dynamic.sk;

import com.bytedance.sdk.component.adexpress.hn.orl;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse implements aq {
    private com.bytedance.sdk.component.adexpress.dynamic.dkl.hn hnj;

    /* JADX INFO: Access modifiers changed from: private */
    public void hn(orl orlVar) {
        try {
            JSONObject jSONObjectQor = orlVar.qor();
            JSONObject jSONObject = new JSONObject(jSONObjectQor.optString("template_Plugin"));
            JSONObject jSONObjectOptJSONObject = jSONObjectQor.optJSONObject("creative");
            com.bytedance.sdk.component.adexpress.dynamic.gjv.aq aqVarHnj = new dkl(jSONObject, jSONObjectOptJSONObject, jSONObjectQor.optJSONObject("AdSize"), new JSONObject(jSONObjectQor.optString("diff_template_Plugin"))).hnj(orlVar.hn(), orlVar.ta(), jSONObjectOptJSONObject.optDouble("score_exact_i18n"), jSONObjectOptJSONObject.optString("comment_num_i18n"), orlVar);
            try {
                JSONObject jSONObject2 = new JSONObject(jSONObjectOptJSONObject.optString("dynamic_creative"));
                aqVarHnj.hnj(jSONObject2.optString(TtmlNode.ATTR_TTS_COLOR));
                aqVarHnj.hnj(jSONObject2.optJSONArray("material_center"));
            } catch (Throwable unused) {
            }
            this.hnj.hnj(aqVarHnj);
        } catch (Exception unused2) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sk.aq
    public void hnj(com.bytedance.sdk.component.adexpress.dynamic.dkl.hn hnVar) {
        this.hnj = hnVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.sk.aq
    public void hnj(final orl orlVar) {
        if (orlVar.bug() == 1) {
            hn(orlVar);
        } else {
            com.bytedance.sdk.component.adexpress.gjv.gjv.hnj(new com.bytedance.sdk.component.aq.hn.qor("dynamicparse") { // from class: com.bytedance.sdk.component.adexpress.dynamic.sk.dse.1
                @Override // java.lang.Runnable
                public void run() {
                    dse.this.hn(orlVar);
                }
            }, 5);
        }
    }
}
