package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfec implements zzfck {
    private final JSONObject zza;

    zzfec(Context context) {
        this.zza = zzcaz.zzc(context, VersionInfoParcel.forPackage());
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zznu)).booleanValue() ? zzhbw.zza(zzfea.zza) : zzhbw.zza(new zzfci() { // from class: com.google.android.gms.internal.ads.zzfeb
            @Override // com.google.android.gms.internal.ads.zzfci
            public final /* synthetic */ void zza(Object obj) {
                this.zza.zzc((JSONObject) obj);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 46;
    }

    final /* synthetic */ void zzc(JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", this.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }
}
