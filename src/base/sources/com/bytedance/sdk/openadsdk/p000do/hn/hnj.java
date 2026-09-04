package com.bytedance.sdk.openadsdk.p000do.hn;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final int f14325hn;
    private final int hnj;
    private final float qor;

    public hnj(int i10, int i11, float f10) {
        this.hnj = i10;
        this.f14325hn = i11;
        this.qor = f10;
    }

    public static JSONObject hnj(hnj hnjVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", hnjVar.hnj);
        jSONObject.put("height", hnjVar.f14325hn);
        jSONObject.put("alpha", hnjVar.qor);
        return jSONObject;
    }
}
