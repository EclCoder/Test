package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.adsdk.ugeno.ojm.hnj.mzIi.obFGmWgqyy;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class tgn {
    private String gjv = "Next Ad";

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f13994hn;
    private int hnj;
    private int qor;

    public int gjv() {
        return this.hnj;
    }

    public int hn() {
        return this.f13994hn;
    }

    public int hnj() {
        return this.qor;
    }

    public String qor() {
        return this.gjv;
    }

    public void hn(int i10) {
        this.f13994hn = i10;
    }

    public void hnj(int i10) {
        this.qor = i10;
    }

    public void qor(int i10) {
        this.hnj = i10;
    }

    public void hnj(String str) {
        this.gjv = str;
    }

    public static tgn hnj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        tgn tgnVar = new tgn();
        try {
            int iMax = Math.max(jSONObject.optInt("endcard_show_time", 0), 0);
            int iOptInt = jSONObject.optInt("is_allow_pause", 0);
            int iOptInt2 = jSONObject.optInt(CampaignEx.JSON_KEY_LANDING_TYPE, 0);
            String strOptString = jSONObject.optString("endcard_next_ad_text", obFGmWgqyy.lekmXlUWwbwdFTZ);
            tgnVar.qor(iMax);
            tgnVar.hn(iOptInt);
            tgnVar.hnj(strOptString);
            tgnVar.hnj(iOptInt2);
        } catch (Throwable unused) {
        }
        return tgnVar;
    }
}
