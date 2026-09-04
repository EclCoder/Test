package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdop {
    private final JSONObject zza;
    private final zzdux zzb;
    private final com.google.android.gms.ads.internal.zzb zzc;
    private final zzcdn zzd;

    public zzdop(JSONObject jSONObject, zzdux zzduxVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcdn zzcdnVar) {
        this.zza = jSONObject;
        this.zzb = zzduxVar;
        this.zzc = zzbVar;
        this.zzd = zzcdnVar;
    }

    final com.google.android.gms.ads.internal.zzb zza() {
        return this.zzc;
    }

    final zzcdn zzb() {
        return this.zzd;
    }

    public final JSONObject zzc() {
        return this.zza;
    }

    public final zzdux zzd() {
        return this.zzb;
    }
}
