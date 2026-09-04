package com.mbridge.msdk.videocommon.entity;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f35163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35164b;

    public a(String str, String str2) {
        this.f35163a = str;
        this.f35164b = str2;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                return new a(jSONObject.optString("appId"), jSONObject.optString("placementId"));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }
}
