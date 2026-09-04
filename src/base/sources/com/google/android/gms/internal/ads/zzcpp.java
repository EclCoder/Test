package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcpp implements zzdnf {
    private final zzcox zza;
    private zzfia zzb;
    private zzfhe zzc;
    private zzdir zzd;
    private zzdcb zze;
    private zzeri zzf;

    /* synthetic */ zzcpp(zzcox zzcoxVar, byte[] bArr) {
        this.zza = zzcoxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdnf, com.google.android.gms.internal.ads.zzdby
    /* JADX INFO: renamed from: zza */
    public final zzdng zzh() {
        zzinc.zzc(this.zzd, zzdir.class);
        zzinc.zzc(this.zze, zzdcb.class);
        zzinc.zzc(this.zzf, zzeri.class);
        return new zzcpq(this.zza, new zzcyz(), new zzfme(), new zzdba(), new zzeaa(), this.zzd, this.zze, zzepo.zza(), this.zzf, null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdnf
    public final /* synthetic */ zzdnf zzb(zzfhe zzfheVar) {
        this.zzc = zzfheVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdnf
    public final /* synthetic */ zzdnf zzc(zzfia zzfiaVar) {
        this.zzb = zzfiaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdnf
    public final /* bridge */ /* synthetic */ zzdnf zzd(zzeri zzeriVar) {
        this.zzf = zzeriVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdnf
    public final /* bridge */ /* synthetic */ zzdnf zze(zzdcb zzdcbVar) {
        this.zze = zzdcbVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdnf
    public final /* bridge */ /* synthetic */ zzdnf zzf(zzdir zzdirVar) {
        this.zzd = zzdirVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdnf, com.google.android.gms.internal.ads.zzdby
    public final /* synthetic */ zzdby zzi(zzfhe zzfheVar) {
        this.zzc = zzfheVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdnf, com.google.android.gms.internal.ads.zzdby
    public final /* synthetic */ zzdby zzj(zzfia zzfiaVar) {
        this.zzb = zzfiaVar;
        return this;
    }
}
