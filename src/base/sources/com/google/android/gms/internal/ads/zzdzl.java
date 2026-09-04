package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdzl {
    private final zzdzq zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdzl(zzdzq zzdzqVar, Executor executor) {
        this.zza = zzdzqVar;
        this.zzc = zzdzqVar.zza();
        this.zzb = executor;
    }

    public final zzdzk zza() {
        zzdzk zzdzkVar = new zzdzk(this);
        zzdzkVar.zzj();
        return zzdzkVar;
    }

    public final void zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zznc)).booleanValue()) {
            zzdzk zzdzkVarZza = zza();
            zzdzkVarZza.zzc("action", "pecr");
            zzdzkVarZza.zzd();
        }
    }

    final /* synthetic */ zzdzq zzc() {
        return this.zza;
    }

    final /* synthetic */ Executor zzd() {
        return this.zzb;
    }

    final /* synthetic */ Map zze() {
        return this.zzc;
    }
}
