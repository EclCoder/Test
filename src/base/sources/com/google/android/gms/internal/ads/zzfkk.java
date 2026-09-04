package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfkk {
    public final String zza;
    public final String zzb;
    public final JSONObject zzc;
    public final JSONObject zzd;

    zzfkk(JsonReader jsonReader) {
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
        this.zzd = jSONObjectZzd;
        this.zza = jSONObjectZzd.optString(CampaignEx.JSON_KEY_AD_HTML, null);
        this.zzb = jSONObjectZzd.optString("ad_base_url", null);
        this.zzc = jSONObjectZzd.optJSONObject("ad_json");
    }
}
