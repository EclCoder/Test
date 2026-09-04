package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcpl implements zzeaw {
    private final Long zza;
    private final String zzb;
    private final zzcox zzc;
    private final zzcpn zzd;

    zzcpl(zzcox zzcoxVar, zzcpn zzcpnVar, Long l10, String str) {
        this.zzc = zzcoxVar;
        this.zzd = zzcpnVar;
        this.zza = l10;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final zzebf zza() {
        long jLongValue = this.zza.longValue();
        zzcpn zzcpnVar = this.zzd;
        return zzebg.zza(jLongValue, zzcpnVar.zzd(), zzcpnVar.zza(), this.zzc, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzeaw
    public final zzebj zzb() {
        long jLongValue = this.zza.longValue();
        zzcpn zzcpnVar = this.zzd;
        return zzebk.zza(jLongValue, zzcpnVar.zzd(), zzcpnVar.zza(), this.zzc, this.zzb);
    }
}
