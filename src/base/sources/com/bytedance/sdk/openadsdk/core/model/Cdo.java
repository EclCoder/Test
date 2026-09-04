package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.model.do, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class Cdo {
    private final int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final int f13955hn;
    private final int hnj;
    private final int qor;

    public Cdo(JSONObject jSONObject) {
        this.hnj = jSONObject.optInt("max_time", 0);
        this.f13955hn = jSONObject.optInt("auto_skip_time", -1);
        this.qor = jSONObject.optInt("show_after_inactivity", 10);
        this.gjv = jSONObject.optInt("user_wait_time", 10);
    }

    public int hn() {
        return this.qor;
    }

    public int hnj() {
        return this.hnj;
    }

    public int qor() {
        return this.gjv;
    }
}
