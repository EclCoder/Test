package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcpi {
    private zzcnl zza;
    private zzcqf zzb;
    private zzfpo zzc;
    private zzcqt zzd;
    private zzfmb zze;

    private zzcpi() {
        throw null;
    }

    public final zzcpi zza(zzcnl zzcnlVar) {
        this.zza = zzcnlVar;
        return this;
    }

    public final zzcpi zzb(zzcqf zzcqfVar) {
        this.zzb = zzcqfVar;
        return this;
    }

    public final zzcnj zzc() {
        zzinc.zzc(this.zza, zzcnl.class);
        zzinc.zzc(this.zzb, zzcqf.class);
        if (this.zzc == null) {
            this.zzc = new zzfpo();
        }
        if (this.zzd == null) {
            this.zzd = new zzcqt();
        }
        if (this.zze == null) {
            this.zze = new zzfmb();
        }
        return new zzcox(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    /* synthetic */ zzcpi(byte[] bArr) {
    }
}
