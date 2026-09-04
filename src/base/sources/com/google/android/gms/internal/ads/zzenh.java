package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzenh extends zzbvh implements zzdeb {
    private zzbvi zza;
    private zzdea zzb;

    @Override // com.google.android.gms.internal.ads.zzdeb
    public final synchronized void zza(zzdea zzdeaVar) {
        this.zzb = zzdeaVar;
    }

    public final synchronized void zzc(zzbvi zzbviVar) {
        this.zza = zzbviVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zze() {
        zzbvi zzbviVar = this.zza;
        if (zzbviVar != null) {
            zzbviVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzf() {
        zzbvi zzbviVar = this.zza;
        if (zzbviVar != null) {
            zzbviVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzg(int i10) {
        zzdea zzdeaVar = this.zzb;
        if (zzdeaVar != null) {
            zzdeaVar.zzb(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzh() {
        zzbvi zzbviVar = this.zza;
        if (zzbviVar != null) {
            zzbviVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzi() {
        zzbvi zzbviVar = this.zza;
        if (zzbviVar != null) {
            zzbviVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzj() {
        try {
            zzbvi zzbviVar = this.zza;
            if (zzbviVar != null) {
                zzbviVar.zzj();
            }
            zzdea zzdeaVar = this.zzb;
            if (zzdeaVar != null) {
                zzdeaVar.zza();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzk() {
        zzbvi zzbviVar = this.zza;
        if (zzbviVar != null) {
            zzbviVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzl(String str, String str2) {
        zzbvi zzbviVar = this.zza;
        if (zzbviVar != null) {
            zzbviVar.zzl(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzm(zzbmv zzbmvVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzn() {
        zzbvi zzbviVar = this.zza;
        if (zzbviVar != null) {
            zzbviVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzo() {
        zzbvi zzbviVar = this.zza;
        if (zzbviVar != null) {
            zzbviVar.zzo();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzp(zzccb zzccbVar) {
        zzbvi zzbviVar = this.zza;
        if (zzbviVar != null) {
            zzbviVar.zzp(zzccbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzq() {
        zzbvi zzbviVar = this.zza;
        if (zzbviVar != null) {
            zzbviVar.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzr(zzccf zzccfVar) {
        zzbvi zzbviVar = this.zza;
        if (zzbviVar != null) {
            zzbviVar.zzr(zzccfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzs(int i10) {
        zzbvi zzbviVar = this.zza;
        if (zzbviVar != null) {
            zzbviVar.zzs(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzt() {
        zzbvi zzbviVar = this.zza;
        if (zzbviVar != null) {
            zzbviVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzu() {
        zzbvi zzbviVar = this.zza;
        if (zzbviVar != null) {
            zzbviVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzv(String str) {
        zzbvi zzbviVar = this.zza;
        if (zzbviVar != null) {
            zzbviVar.zzv(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzw(int i10, String str) {
        zzdea zzdeaVar = this.zzb;
        if (zzdeaVar != null) {
            zzdeaVar.zzc(i10, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzx(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzdea zzdeaVar = this.zzb;
        if (zzdeaVar != null) {
            zzdeaVar.zzd(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzy(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzbvi zzbviVar = this.zza;
        if (zzbviVar != null) {
            zzbviVar.zzy(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvi
    public final synchronized void zzz() {
        zzbvi zzbviVar = this.zza;
        if (zzbviVar != null) {
            zzbviVar.zzz();
        }
    }
}
