package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    private String gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f13964hn;
    private String hnj;
    private String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f13965sk;

    public JSONObject dkl() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_PRIVACY_URL, this.qor);
            jSONObject.put("privacy_title", this.gjv);
            jSONObject.put("text", this.f13964hn);
            jSONObject.put(RewardPlus.ICON, this.hnj);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String gjv() {
        return this.gjv;
    }

    public String hn() {
        return this.f13964hn;
    }

    public void hnj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.hnj = jSONObject.optString(RewardPlus.ICON);
        this.f13964hn = jSONObject.optString("text");
        this.qor = jSONObject.optString(CampaignEx.JSON_KEY_PRIVACY_URL);
        this.gjv = jSONObject.optString("privacy_title");
    }

    public String qor() {
        return this.qor;
    }

    public boolean sk() {
        return this.f13965sk;
    }

    public String hnj() {
        return this.hnj;
    }

    public void hnj(boolean z10) {
        this.f13965sk = z10;
    }
}
