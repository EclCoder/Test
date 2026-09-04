package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzejb implements zzdef, zzdcu {
    private static final Object zza = new Object();
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzejl zzd;

    public zzejb(zzejl zzejlVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzejlVar;
        this.zzc = zzgVar;
    }

    private final void zzb(boolean z10) {
        int i10;
        int iIntValue;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzhh)).booleanValue() && !this.zzc.zzx()) {
            Object obj = zza;
            synchronized (obj) {
                i10 = zzb;
                iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzhi)).intValue();
            }
            if (i10 < iIntValue) {
                this.zzd.zza(z10);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzg() {
        zzb(true);
    }
}
