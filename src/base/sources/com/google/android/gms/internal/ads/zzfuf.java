package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzfuf extends zzcco {
    private zzcci zza;
    private zzfsp zzb;
    private String zzc;

    zzfuf(zzcci zzcciVar, zzfsp zzfspVar, String str) {
        this.zza = zzcciVar;
        this.zzb = zzfspVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zze() {
        zzfsp zzfspVar = this.zzb;
        zzcci zzcciVar = this.zza;
        if (zzcciVar == null || zzfspVar == null) {
            return;
        }
        zzfspVar.zza(zzcciVar);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzf(int i10) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzccp
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzfsp zzfspVar = this.zzb;
        if (this.zza == null || zzfspVar == null) {
            return;
        }
        String string = zzeVar.zzb().toString();
        String str = this.zzc;
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 51 + String.valueOf(str).length());
        sb2.append("Failed to load rewarded ad with error: ");
        sb2.append(string);
        sb2.append(", adUnitId: ");
        sb2.append(str);
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2.toString());
        ((zzfto) zzfspVar).zza.zzI(zzeVar);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }
}
