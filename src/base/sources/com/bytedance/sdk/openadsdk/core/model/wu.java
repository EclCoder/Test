package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class wu {
    private String hnj = "horizontal";

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f14011hn = 1;
    private int qor = 1;
    private int gjv = 0;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private int f14012sk = 0;
    private int dkl = 0;
    private int dse = 0;
    private int aq = 5000;
    private int ojm = 500;

    /* JADX INFO: renamed from: ta, reason: collision with root package name */
    private int f14013ta = 0;

    public int aq() {
        return this.aq;
    }

    public int dkl() {
        return this.dkl;
    }

    public int dse() {
        return this.dse;
    }

    public int gjv() {
        return this.gjv;
    }

    public int hn() {
        return this.f14011hn;
    }

    public String hnj() {
        return this.hnj;
    }

    public int ojm() {
        return this.ojm;
    }

    public int qor() {
        return this.qor;
    }

    public int sk() {
        return this.f14012sk;
    }

    public int ta() {
        return this.f14013ta;
    }

    public static wu hnj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new wu();
        }
        wu wuVar = new wu();
        wuVar.hnj = jSONObject.optString("direction", "horizontal");
        wuVar.f14011hn = jSONObject.optInt("auto_loop", 1);
        wuVar.qor = jSONObject.optInt("allow_manual_loop", 1);
        wuVar.gjv = jSONObject.optInt("unlimited_loop", 0);
        wuVar.f14012sk = jSONObject.optInt("left_margin", 0);
        wuVar.dkl = jSONObject.optInt("right_margin", 0);
        wuVar.dse = jSONObject.optInt("ad_margin", 0);
        wuVar.aq = jSONObject.optInt("loop_interval_time", 5000);
        wuVar.ojm = jSONObject.optInt("flip_speed", 500);
        wuVar.f14013ta = jSONObject.optInt("stop_auto_loop", 0);
        return wuVar;
    }
}
