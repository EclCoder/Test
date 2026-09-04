package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class orl {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private String f13985hn;
    private String hnj;
    private int qor;

    public JSONObject gjv() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("u", this.hnj);
            jSONObject.put("ft", this.qor);
            jSONObject.put("fu", this.f13985hn);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public String hn() {
        return this.f13985hn;
    }

    public String hnj() {
        return this.hnj;
    }

    public int qor() {
        return this.qor;
    }

    public void hn(String str) {
        this.f13985hn = str;
    }

    public void hnj(String str) {
        this.hnj = str;
    }

    public void hnj(int i10) {
        this.qor = i10;
    }
}
