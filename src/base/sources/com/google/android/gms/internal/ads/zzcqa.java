package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcqa implements zzdvq {
    private final zzcox zza;
    private zzfia zzb;
    private zzfhe zzc;
    private zzdir zzd;
    private zzdcb zze;

    /* synthetic */ zzcqa(zzcox zzcoxVar, byte[] bArr) {
        this.zza = zzcoxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdvq, com.google.android.gms.internal.ads.zzdby
    /* JADX INFO: renamed from: zza */
    public final zzdvr zzh() {
        zzinc.zzc(this.zzd, zzdir.class);
        zzinc.zzc(this.zze, zzdcb.class);
        return new zzcqb(this.zza, new zzcyz(), new zzfme(), new zzdba(), new zzeaa(), this.zzd, this.zze, zzepo.zza(), null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdvq
    public final /* synthetic */ zzdvq zzb(zzfhe zzfheVar) {
        this.zzc = zzfheVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdvq
    public final /* synthetic */ zzdvq zzc(zzfia zzfiaVar) {
        this.zzb = zzfiaVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdvq
    public final /* bridge */ /* synthetic */ zzdvq zzd(zzdcb zzdcbVar) {
        this.zze = zzdcbVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdvq
    public final /* bridge */ /* synthetic */ zzdvq zze(zzdir zzdirVar) {
        this.zzd = zzdirVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdvq, com.google.android.gms.internal.ads.zzdby
    public final /* synthetic */ zzdby zzi(zzfhe zzfheVar) {
        this.zzc = zzfheVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdvq, com.google.android.gms.internal.ads.zzdby
    public final /* synthetic */ zzdby zzj(zzfia zzfiaVar) {
        this.zzb = zzfiaVar;
        return this;
    }
}
