package com.bytedance.sdk.openadsdk.gjv.hnj;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm implements com.bytedance.sdk.openadsdk.jip.hn {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final boolean f14375hn;
    private final com.bytedance.sdk.component.dkl.hnj.dkl.gjv hnj;

    public ojm(boolean z10, com.bytedance.sdk.component.dkl.hnj.dkl.gjv gjvVar) {
        this.hnj = gjvVar;
        this.f14375hn = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.jip.hn
    public com.bytedance.sdk.openadsdk.jip.hnj.qor hnj() throws JSONException {
        int i10;
        if (this.hnj == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.f14375hn);
        jSONObject.put("url", this.hnj.hn());
        int iGjv = this.hnj.gjv();
        if (iGjv <= 0) {
            iGjv = 0;
        }
        jSONObject.put("retry_times", iGjv);
        jSONObject.put("ad_id", this.hnj.dkl());
        jSONObject.put("track_type", this.hnj.sk());
        if (!this.f14375hn) {
            i10 = 4;
        } else if (this.hnj.ta()) {
            i10 = 3;
        } else {
            i10 = this.hnj.gjv() <= 0 ? 1 : 2;
        }
        jSONObject.put("upload_scene", i10);
        String strDse = this.hnj.dse();
        if (!TextUtils.isEmpty(strDse)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : strDse.split(",")) {
                jSONArray.put(str);
            }
            jSONObject.put("error_code", jSONArray);
        }
        String strOjm = this.hnj.ojm();
        if (!TextUtils.isEmpty(strOjm)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : strOjm.split(",")) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        return com.bytedance.sdk.openadsdk.jip.hnj.gjv.hn().hnj("track_link_result").hn(jSONObject.toString());
    }
}
