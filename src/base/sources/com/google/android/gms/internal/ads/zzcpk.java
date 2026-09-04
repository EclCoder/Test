package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcpk implements zzeav {
    private final zzcox zza;
    private final zzcpn zzb;
    private Long zzc;
    private String zzd;

    /* synthetic */ zzcpk(zzcox zzcoxVar, zzcpn zzcpnVar, byte[] bArr) {
        this.zza = zzcoxVar;
        this.zzb = zzcpnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeav
    public final zzeaw zza() {
        zzinc.zzc(this.zzc, Long.class);
        zzinc.zzc(this.zzd, String.class);
        return new zzcpl(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzeav
    public final /* bridge */ /* synthetic */ zzeav zzb(String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeav
    public final /* bridge */ /* synthetic */ zzeav zzc(long j10) {
        this.zzc = Long.valueOf(j10);
        return this;
    }
}
