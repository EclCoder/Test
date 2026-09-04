package com.bytedance.sdk.openadsdk.xn.qor;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    public long dkl;
    public long dse;
    public boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    public boolean f14812hn;
    public boolean hnj;
    public boolean qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    public long f14813sk;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.xn.qor.hnj$hnj, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface InterfaceC0258hnj {
        hnj dkl();
    }

    public hnj gjv(boolean z10) {
        this.qor = z10;
        return this;
    }

    public hnj hn(boolean z10) {
        this.hnj = z10;
        return this;
    }

    public hnj hnj(boolean z10) {
        this.gjv = z10;
        return this;
    }

    public hnj qor(boolean z10) {
        this.f14812hn = z10;
        return this;
    }

    public hnj hn(long j10) {
        this.dkl = j10;
        return this;
    }

    public hnj hnj(long j10) {
        this.f14813sk = j10;
        return this;
    }

    public hnj qor(long j10) {
        this.dse = j10;
        return this;
    }

    public JSONObject hnj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.hnj);
            jSONObject.put("isFromVideoDetailPage", this.f14812hn);
            jSONObject.put("isFromDetailPage", this.qor);
            jSONObject.put("duration", this.f14813sk);
            jSONObject.put("totalPlayDuration", this.dkl);
            jSONObject.put("currentPlayPosition", this.dse);
            jSONObject.put("isAutoPlay", this.gjv);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static hnj hnj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        hnj hnjVar = new hnj();
        hnjVar.hn(jSONObject.optBoolean("isCompleted"));
        hnjVar.qor(jSONObject.optBoolean("isFromVideoDetailPage"));
        hnjVar.gjv(jSONObject.optBoolean("isFromDetailPage"));
        hnjVar.hnj(jSONObject.optLong("duration"));
        hnjVar.hn(jSONObject.optLong("totalPlayDuration"));
        hnjVar.qor(jSONObject.optLong("currentPlayPosition"));
        hnjVar.hnj(jSONObject.optBoolean("isAutoPlay"));
        return hnjVar;
    }
}
