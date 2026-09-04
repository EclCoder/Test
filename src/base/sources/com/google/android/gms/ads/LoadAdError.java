package com.google.android.gms.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LoadAdError extends AdError {
    private final ResponseInfo zza;

    public LoadAdError(int i10, String str, String str2, AdError adError, ResponseInfo responseInfo) {
        super(i10, str, str2, adError);
        this.zza = responseInfo;
    }

    public ResponseInfo getResponseInfo() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.AdError
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @Override // com.google.android.gms.ads.AdError
    public final JSONObject zzb() throws JSONException {
        JSONObject jSONObjectZzb = super.zzb();
        ResponseInfo responseInfo = getResponseInfo();
        if (responseInfo == null) {
            jSONObjectZzb.put("Response Info", "null");
            return jSONObjectZzb;
        }
        jSONObjectZzb.put("Response Info", responseInfo.zza());
        return jSONObjectZzb;
    }
}
