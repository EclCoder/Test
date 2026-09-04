package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdhx implements zzdfx {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzbS)).intValue();
    private int zzb = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzor)).intValue();

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final synchronized void zzdQ(zzfkq zzfkqVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzbT)).booleanValue()) {
            try {
                zzfki zzfkiVar = zzfkqVar.zzb.zzb;
                this.zza = zzfkiVar.zzc;
                this.zzb = zzfkiVar.zzd;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdP(zzcbd zzcbdVar) {
    }
}
