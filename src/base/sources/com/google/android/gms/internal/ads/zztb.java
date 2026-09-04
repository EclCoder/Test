package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zztb {
    private final Context zza;
    private zztj zzb;
    private zzqh zzc;
    private zzth zzd;

    public zztb(Context context) {
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzb = zztj.zza;
        if (context == null) {
            this.zzc = zzqh.zza;
        }
    }

    public final zztb zza(zztj zztjVar) {
        this.zzb = zztjVar;
        return this;
    }

    final zztb zzb(zzqh zzqhVar) {
        if (this.zza == null) {
            this.zzc = zzqhVar;
        }
        return this;
    }

    public final zztd zzc() {
        if (this.zzd == null) {
            this.zzd = new zzth(this.zza);
        }
        return new zztd(this, null);
    }

    final /* synthetic */ Context zzd() {
        return this.zza;
    }

    final /* synthetic */ zzqh zze() {
        return this.zzc;
    }

    public final zztb zzf(zzth zzthVar) {
        this.zzd = zzthVar;
        return this;
    }

    final /* synthetic */ zzth zzg() {
        return this.zzd;
    }
}
