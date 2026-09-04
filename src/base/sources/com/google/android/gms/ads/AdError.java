package com.google.android.gms.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class AdError {
    public static final String UNDEFINED_DOMAIN = "undefined";
    private final int zza;
    private final String zzb;
    private final String zzc;
    private final AdError zzd;

    public AdError(int i10, String str, String str2, AdError adError) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = adError;
    }

    public AdError getCause() {
        return this.zzd;
    }

    public int getCode() {
        return this.zza;
    }

    public String getDomain() {
        return this.zzc;
    }

    public String getMessage() {
        return this.zzb;
    }

    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public final com.google.android.gms.ads.internal.client.zze zza() {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        AdError adError = this.zzd;
        if (adError == null) {
            zzeVar = null;
        } else {
            zzeVar = new com.google.android.gms.ads.internal.client.zze(adError.zza, adError.zzb, adError.zzc, null, null);
        }
        return new com.google.android.gms.ads.internal.client.zze(this.zza, this.zzb, this.zzc, zzeVar, null);
    }

    public JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.zza);
        jSONObject.put("Message", this.zzb);
        jSONObject.put("Domain", this.zzc);
        AdError adError = this.zzd;
        if (adError == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", adError.zzb());
        return jSONObject;
    }

    public AdError(int i10, String str, String str2) {
        this(i10, str, str2, null);
    }
}
