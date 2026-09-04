package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzdpe implements zzhbt {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdpo zzb;

    zzdpe(zzdpo zzdpoVar, String str, boolean z10) {
        Objects.requireNonNull(zzdpoVar);
        this.zzb = zzdpoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgs)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdpo zzdpoVar = this.zzb;
        zzdpoVar.zzZ().zzo((zzcku) obj);
        String str = this.zza;
        zzcfw zzcfwVarZzY = zzdpoVar.zzZ().zzY();
        zzeln zzelnVarZzL = zzdpoVar.zzL(str, true);
        if (zzelnVarZzL != null && zzcfwVarZzY != null) {
            zzcfwVarZzY.zzc(zzelnVarZzL);
        } else if (zzcfwVarZzY != null) {
            zzcfwVarZzY.cancel(false);
        }
    }
}
