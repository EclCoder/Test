package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzese extends com.google.android.gms.ads.internal.client.zzbm {
    private final zzetn zza;

    public zzese(Context context, zzcnj zzcnjVar, zzfkx zzfkxVar, zzdqd zzdqdVar, com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        zzetp zzetpVar = new zzetp(zzdqdVar, zzcnjVar.zzD());
        zzetpVar.zza(zzbhVar);
        this.zza = new zzetn(new zzetz(zzcnjVar, context, zzetpVar, zzfkxVar), zzfkxVar.zzh());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zze(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.zza.zzb(zzmVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zzf() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized boolean zzg() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zzh() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized void zzi(com.google.android.gms.ads.internal.client.zzm zzmVar, int i10) {
        this.zza.zzb(zzmVar, i10);
    }
}
