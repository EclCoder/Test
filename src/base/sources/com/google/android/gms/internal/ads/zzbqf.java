package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbqf implements zzbqg {
    final /* synthetic */ zzcfw zza;

    zzbqf(zzbqh zzbqhVar, zzcfw zzcfwVar) {
        this.zza = zzcfwVar;
        Objects.requireNonNull(zzbqhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final void zza(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbqg
    public final void zzb(String str) {
        this.zza.zzd(new zzbtx(str));
    }
}
