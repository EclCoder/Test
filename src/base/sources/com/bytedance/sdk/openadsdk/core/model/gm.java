package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gm {
    private hnj dkl;
    private String gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f13961hn;
    private String hnj;
    private String qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private JSONObject f13962sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private JSONArray f13963hn;
        private JSONArray hnj;
        private JSONArray qor;

        public JSONArray hn() {
            return this.f13963hn;
        }

        public JSONArray hnj() {
            return this.hnj;
        }

        public JSONArray qor() {
            return this.qor;
        }

        public void hn(JSONArray jSONArray) {
            this.f13963hn = jSONArray;
        }

        public void hnj(JSONArray jSONArray) {
            this.hnj = jSONArray;
        }

        public void qor(JSONArray jSONArray) {
            this.qor = jSONArray;
        }

        public static hnj hnj(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image");
            hnj hnjVar = new hnj();
            hnjVar.hnj(jSONArrayOptJSONArray);
            hnjVar.hn(jSONObject.optJSONArray("fetch"));
            hnjVar.qor(jSONObject.optJSONArray("script"));
            return hnjVar;
        }
    }

    public hnj dkl() {
        return this.dkl;
    }

    public String gjv() {
        return this.gjv;
    }

    public String hn() {
        return this.f13961hn;
    }

    public String hnj() {
        return this.hnj;
    }

    public String qor() {
        return this.qor;
    }

    public JSONObject sk() {
        return this.f13962sk;
    }

    public static gm hnj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        gm gmVar = new gm();
        gmVar.hnj = jSONObject.optString("id");
        gmVar.gjv = jSONObject.optString(DataSchemeDataSource.SCHEME_DATA);
        gmVar.qor = jSONObject.optString("url");
        gmVar.f13961hn = jSONObject.optString("md5");
        gmVar.f13962sk = jSONObject.optJSONObject("custom_components");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preload");
        if (jSONObjectOptJSONObject != null) {
            gmVar.dkl = hnj.hnj(jSONObjectOptJSONObject);
        }
        return gmVar;
    }
}
