package com.bytedance.sdk.openadsdk.dnm;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.model.dkl;
import com.bytedance.sdk.openadsdk.core.sk;
import com.bytedance.sdk.openadsdk.utils.orp;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj implements qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final hn f14319hn;
    private final as hnj;
    private final Map<String, com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor> qor = new HashMap();

    private hnj(hn hnVar, as asVar) {
        this.f14319hn = hnVar;
        this.hnj = asVar;
    }

    public static hnj hnj(hn hnVar, as asVar) {
        return new hnj(hnVar, asVar);
    }

    @Override // com.bytedance.sdk.openadsdk.dnm.qor
    public void hnj() {
        this.qor.clear();
    }

    private as hnj(JSONObject jSONObject, String str) {
        String strHnj;
        if (jSONObject == null) {
            return null;
        }
        as asVar = new as();
        asVar.sk(jSONObject);
        if (!TextUtils.isEmpty(str)) {
            asVar.tgn(str);
        }
        if (this.hnj != null) {
            String strHnj2 = asVar.zyh() != null ? asVar.zyh().hnj() : null;
            if (TextUtils.isEmpty(strHnj2)) {
                return this.hnj;
            }
            dkl dklVarZyh = this.hnj.zyh();
            if (dklVarZyh != null && strHnj2.equals(dklVarZyh.hnj())) {
                return this.hnj;
            }
            JSONObject jSONObject2 = new JSONObject();
            if (dklVarZyh != null) {
                try {
                    strHnj = dklVarZyh.hnj();
                } catch (JSONException unused) {
                }
            } else {
                strHnj = "null";
            }
            jSONObject2.put("lu", strHnj);
            jSONObject2.put("ju", strHnj2);
            as asVar2 = this.hnj;
            sk.hnj(asVar2, orp.hnj(asVar2), -5, jSONObject2);
            if (dklVarZyh != null && strHnj2.contains("play.google.com/store") && !strHnj2.contains("referrer")) {
                asVar.zyh().hnj(dklVarZyh.hnj());
            }
        }
        return asVar;
    }

    @Override // com.bytedance.sdk.openadsdk.dnm.qor
    public void hnj(Context context, JSONObject jSONObject, String str, int i10, boolean z10) {
        JSONObject jSONObjectOptJSONObject;
        if (context == null || jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA)) == null) {
            return;
        }
        hnj(context, hnj(jSONObjectOptJSONObject, str), jSONObjectOptJSONObject, i10, z10);
    }

    private void hnj(Context context, as asVar, JSONObject jSONObject, int i10, boolean z10) {
        if (context == null || asVar == null || asVar.zyh() == null || jSONObject == null || this.f14319hn == null || this.qor.get(asVar.zyh().hnj()) != null) {
            return;
        }
        String strHn = orp.hn(i10);
        if (TextUtils.isEmpty(strHn)) {
            return;
        }
        this.qor.put(asVar.zyh().hnj(), hnj(context, strHn));
    }

    @Override // com.bytedance.sdk.openadsdk.dnm.qor
    public void hnj(Context context, JSONObject jSONObject, String str) {
        if (context == null || this.hnj == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.eum.hnj.hnj.gjv.hnj(context, str).hnj(this.hnj);
    }

    @Override // com.bytedance.sdk.openadsdk.dnm.qor
    public void hnj(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA)) == null) {
            return;
        }
        hnj(hnj(jSONObjectOptJSONObject, (String) null), jSONObjectOptJSONObject);
    }

    private void hnj(as asVar, JSONObject jSONObject) {
        if (this.f14319hn == null || asVar == null || asVar.zyh() == null) {
            return;
        }
        String strHnj = asVar.zyh().hnj();
        if (this.qor.containsKey(strHnj)) {
            this.qor.remove(strHnj);
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(PglCryptUtils.KEY_MESSAGE, "success");
                jSONObject2.put(NotificationCompat.CATEGORY_STATUS, "unsubscribed");
                jSONObject2.put("appad", jSONObject);
                this.f14319hn.hnj("app_ad_event", jSONObject2);
            } catch (JSONException e10) {
                apu.qor("JsAppAdDownloadManager", e10.getMessage());
            }
        }
    }

    private com.bytedance.sdk.openadsdk.eum.hnj.hnj.qor hnj(Context context, String str) {
        return com.bytedance.sdk.openadsdk.eum.hnj.hnj.gjv.hnj(context, str);
    }
}
