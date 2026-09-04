package com.inmobi.media;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class K6 {
    public static final JSONObject a(J6 j10) throws JSONException {
        kotlin.jvm.internal.s.h(j10, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("x", Float.valueOf(J3.a(j10.f25047a)));
        jSONObject.put("y", Float.valueOf(J3.a(j10.f25048b)));
        jSONObject.put("width", j10.f25049c);
        jSONObject.put("height", j10.f25050d);
        return jSONObject;
    }
}
