package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class zzeqw extends zzbvh {
    private final zzdcp zza;
    private final zzdkw zzb;
    private final zzddj zzc;
    private final zzddy zzd;
    private final zzded zze;
    private final zzdhv zzf;
    private final zzdfc zzg;
    private final zzdlu zzh;
    private final zzdhr zzi;
    private final zzdde zzj;

    public zzeqw(zzdcp zzdcpVar, zzdkw zzdkwVar, zzddj zzddjVar, zzddy zzddyVar, zzded zzdedVar, zzdhv zzdhvVar, zzdfc zzdfcVar, zzdlu zzdluVar, zzdhr zzdhrVar, zzdde zzddeVar) {
        this.zza = zzdcpVar;
        this.zzb = zzdkwVar;
        this.zzc = zzddjVar;
        this.zzd = zzddyVar;
        this.zze = zzdedVar;
        this.zzf = zzdhvVar;
        this.zzg = zzdfcVar;
        this.zzh = zzdluVar;
        this.zzi = zzdhrVar;
        this.zzj = zzddeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdu();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzf() {
        this.zzg.zzdU(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzh() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzi() {
        this.zzg.zzh();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzj() {
        this.zze.zzg();
    }

    public void zzk() {
        this.zzc.zza();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzl(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    public void zzn() {
        this.zzh.zzb();
    }

    public void zzo() {
        this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzq() {
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    @Deprecated
    public final void zzs(int i10) {
        zzy(new com.google.android.gms.ads.internal.client.zze(i10, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzu() {
        this.zzh.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzv(String str) {
        zzy(new com.google.android.gms.ads.internal.client.zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zzc(zzfma.zzc(8, zzeVar));
    }

    public void zzt() {
    }

    public void zzz() {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzg(int i10) {
    }

    public void zzp(zzccb zzccbVar) {
    }

    public void zzr(zzccf zzccfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzm(zzbmv zzbmvVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final void zzw(int i10, String str) {
    }
}
