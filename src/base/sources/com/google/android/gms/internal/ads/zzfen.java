package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfen implements zzfci {
    private final Bundle zza;

    public zzfen(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Bundle bundle = this.zza;
        if (bundle != null) {
            try {
                com.google.android.gms.ads.internal.util.zzbp.zzh(com.google.android.gms.ads.internal.util.zzbp.zzh(jSONObject, "device"), "play_store").put("parental_controls", com.google.android.gms.ads.internal.client.zzay.zza().zzo(bundle));
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed putting parental controls bundle.");
            }
        }
    }
}
