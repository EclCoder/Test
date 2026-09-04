package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class zzepv extends zzeqw {
    private final zzdlh zza;

    public zzepv(zzdcp zzdcpVar, zzdkw zzdkwVar, zzddj zzddjVar, zzddy zzddyVar, zzded zzdedVar, zzdde zzddeVar, zzdhv zzdhvVar, zzdlu zzdluVar, zzdfc zzdfcVar, zzdlh zzdlhVar, zzdhr zzdhrVar) {
        super(zzdcpVar, zzdkwVar, zzddjVar, zzddyVar, zzdedVar, zzdhvVar, zzdfcVar, zzdluVar, zzdhrVar, zzddeVar);
        this.zza = zzdlhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqw, com.google.android.gms.internal.ads.zzbvi
    public final void zzn() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzeqw, com.google.android.gms.internal.ads.zzbvi
    public final void zzo() {
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeqw, com.google.android.gms.internal.ads.zzbvi
    public final void zzp(zzccb zzccbVar) {
        this.zza.zzb(zzccbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeqw, com.google.android.gms.internal.ads.zzbvi
    public final void zzr(zzccf zzccfVar) {
        this.zza.zzb(new zzccb(zzccfVar.zze(), zzccfVar.zzf()));
    }

    @Override // com.google.android.gms.internal.ads.zzeqw, com.google.android.gms.internal.ads.zzbvi
    public final void zzt() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzeqw, com.google.android.gms.internal.ads.zzbvi
    public final void zzz() {
        this.zza.zzb(null);
    }
}
