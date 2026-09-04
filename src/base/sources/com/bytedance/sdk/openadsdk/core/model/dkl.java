package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl {
    private int dse;
    private String hnj = "";

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f13951hn = "";
    private String qor = "";
    private String gjv = "";

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private double f13952sk = -1.0d;
    private int dkl = -1;

    public JSONObject aq() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", hn());
            jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, dkl());
            jSONObject.put("comment_num", sk());
            jSONObject.put(DownloadModel.DOWNLOAD_URL, hnj());
            jSONObject.put(CampaignEx.JSON_KEY_PACKAGE_NAME, qor());
            jSONObject.put("score", gjv());
            jSONObject.put("app_category", dse());
            return jSONObject;
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.apu.qor(e10.toString(), new Object[0]);
            return jSONObject;
        }
    }

    public int dkl() {
        return this.dse;
    }

    public String dse() {
        return this.gjv;
    }

    public double gjv() {
        return this.f13952sk;
    }

    public String hn() {
        return this.f13951hn;
    }

    public String hnj() {
        return this.hnj;
    }

    public String qor() {
        return this.qor;
    }

    public int sk() {
        return this.dkl;
    }

    public void gjv(String str) {
        this.gjv = str;
    }

    public void hn(String str) {
        this.f13951hn = str;
    }

    public void hnj(String str) {
        this.hnj = str;
    }

    public void qor(String str) {
        this.qor = str;
    }

    public void hn(int i10) {
        this.dse = i10;
    }

    public void hnj(double d10) {
        if (d10 >= 1.0d && d10 <= 5.0d) {
            this.f13952sk = d10;
        } else {
            this.f13952sk = -1.0d;
        }
    }

    public void hnj(int i10) {
        if (i10 <= 0) {
            this.dkl = -1;
        } else {
            this.dkl = i10;
        }
    }
}
