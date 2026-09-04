package com.bytedance.adsdk.ugeno.core;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class orl {
    private orl gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f12220hn;
    private com.bytedance.adsdk.ugeno.hn.qor hnj;
    private JSONObject qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private orl f12221sk;

    public orl gjv() {
        return this.gjv;
    }

    public int hn() {
        return this.f12220hn;
    }

    public com.bytedance.adsdk.ugeno.hn.qor hnj() {
        return this.hnj;
    }

    public JSONObject qor() {
        return this.qor;
    }

    public String toString() {
        return "UGenEvent{mWidget=" + this.hnj + ", mEventType=" + this.f12220hn + ", mEvent=" + this.qor + '}';
    }

    public void hn(orl orlVar) {
        this.f12221sk = orlVar;
    }

    public void hnj(com.bytedance.adsdk.ugeno.hn.qor qorVar) {
        this.hnj = qorVar;
    }

    public void hnj(int i10) {
        this.f12220hn = i10;
    }

    public void hnj(JSONObject jSONObject) {
        this.qor = jSONObject;
    }

    public void hnj(orl orlVar) {
        this.gjv = orlVar;
    }
}
