package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeni extends zzcbz implements zzdeb {
    private zzcca zza;
    private zzdea zzb;
    private zzdlj zzc;

    @Override // com.google.android.gms.internal.ads.zzdeb
    public final synchronized void zza(zzdea zzdeaVar) {
        this.zzb = zzdeaVar;
    }

    public final synchronized void zzc(zzcca zzccaVar) {
        this.zza = zzccaVar;
    }

    public final synchronized void zzd(zzdlj zzdljVar) {
        this.zzc = zzdljVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zze(IObjectWrapper iObjectWrapper) {
        zzdlj zzdljVar = this.zzc;
        if (zzdljVar != null) {
            final zzelv zzelvVar = ((zzeqi) zzdljVar).zzc;
            final zzfkf zzfkfVar = ((zzeqi) zzdljVar).zzb;
            final zzfkq zzfkqVar = ((zzeqi) zzdljVar).zza;
            final zzeqi zzeqiVar = (zzeqi) zzdljVar;
            ((zzeqi) zzdljVar).zzd.zzc().execute(new Runnable(zzeqiVar, zzfkqVar, zzfkfVar, zzelvVar) { // from class: com.google.android.gms.internal.ads.zzeqh
                private final /* synthetic */ zzfkq zza;
                private final /* synthetic */ zzfkf zzb;
                private final /* synthetic */ zzelv zzc;

                {
                    this.zza = zzfkqVar;
                    this.zzb = zzfkfVar;
                    this.zzc = zzelvVar;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeql.zze(this.zza, this.zzb, this.zzc);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzf(IObjectWrapper iObjectWrapper, int i10) {
        zzdlj zzdljVar = this.zzc;
        if (zzdljVar != null) {
            String str = ((zzeqi) zzdljVar).zzc.zza;
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Fail to initialize adapter ".concat(String.valueOf(str)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzg(IObjectWrapper iObjectWrapper) {
        zzdea zzdeaVar = this.zzb;
        if (zzdeaVar != null) {
            zzdeaVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) {
        zzcca zzccaVar = this.zza;
        if (zzccaVar != null) {
            ((zzeqk) zzccaVar).zza.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        zzcca zzccaVar = this.zza;
        if (zzccaVar != null) {
            ((zzeqk) zzccaVar).zzd.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        zzcca zzccaVar = this.zza;
        if (zzccaVar != null) {
            zzccaVar.zzj(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, zzccb zzccbVar) {
        zzcca zzccaVar = this.zza;
        if (zzccaVar != null) {
            ((zzeqk) zzccaVar).zzd.zzb(zzccbVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) {
        zzcca zzccaVar = this.zza;
        if (zzccaVar != null) {
            ((zzeqk) zzccaVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, int i10) {
        zzdea zzdeaVar = this.zzb;
        if (zzdeaVar != null) {
            zzdeaVar.zzb(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) {
        zzcca zzccaVar = this.zza;
        if (zzccaVar != null) {
            ((zzeqk) zzccaVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) {
        zzcca zzccaVar = this.zza;
        if (zzccaVar != null) {
            ((zzeqk) zzccaVar).zzc.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcca
    public final synchronized void zzp(IObjectWrapper iObjectWrapper) {
        zzcca zzccaVar = this.zza;
        if (zzccaVar != null) {
            ((zzeqk) zzccaVar).zzd.zzb(null);
        }
    }
}
