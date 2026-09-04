package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class fc {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final int f13959hn;
    private final int hnj;

    public fc(JSONObject jSONObject) {
        this.hnj = jSONObject.optInt("auto_click", 0);
        this.f13959hn = jSONObject.optInt("hidden_bar", 0);
    }

    public boolean hn() {
        return this.f13959hn == 1;
    }

    public int hnj() {
        return this.hnj;
    }

    public static boolean hnj(as asVar) {
        if (asVar == null || !asVar.qs() || asVar.bpy() == null) {
            return false;
        }
        return asVar.bpy().hn();
    }
}
