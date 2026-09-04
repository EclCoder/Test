package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dnm {
    private Map<String, Object> gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private JSONObject f12192hn;
    private Context hnj;
    private JSONObject qor;

    public void hn(JSONObject jSONObject) {
        this.qor = jSONObject;
    }

    public void hnj(Context context) {
        this.hnj = context;
    }

    public Map<String, Object> hn() {
        return this.gjv;
    }

    public void hnj(JSONObject jSONObject) {
        this.f12192hn = jSONObject;
    }

    public JSONObject hnj() {
        return this.qor;
    }

    public void hnj(Map<String, Object> map) {
        this.gjv = map;
    }
}
