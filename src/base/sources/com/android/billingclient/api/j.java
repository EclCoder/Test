package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f10358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f10360e;

    j(String str) {
        this.f10356a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f10357b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.f10358c = strOptString;
        this.f10359d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f10360e = jSONObject.optString("serializedDocid");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return TextUtils.equals(this.f10356a, ((j) obj).f10356a);
        }
        return false;
    }

    public int hashCode() {
        return this.f10356a.hashCode();
    }

    public String toString() {
        return "UnfetchedProduct{productId='" + this.f10357b + "', productType='" + this.f10358c + "', statusCode=" + this.f10359d + "}";
    }
}
