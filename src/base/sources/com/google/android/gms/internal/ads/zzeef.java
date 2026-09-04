package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeef implements zzdfx, zzdlk, zzdef {
    private final Context zza;
    private final zzdzl zzb;

    zzeef(Context context, zzdzl zzdzlVar) {
        this.zza = context;
        this.zzb = zzdzlVar;
    }

    private final void zzf(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzfA)).booleanValue()) {
            zzcfr.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeee
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc(context);
                }
            });
        }
    }

    final /* synthetic */ void zzc(Context context) {
        com.google.android.gms.ads.internal.zzt.zzn().zza(context, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final void zzd(com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzfD)).booleanValue()) {
            zzf(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdP(zzcbd zzcbdVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzfC)).booleanValue()) {
            zzf(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzg() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzfE)).booleanValue()) {
            zzf(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdQ(zzfkq zzfkqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdlk
    public final void zze(String str) {
    }
}
