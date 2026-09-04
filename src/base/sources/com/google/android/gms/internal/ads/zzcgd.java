package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class zzcgd {
    private final zzcfw zza;
    private final AtomicInteger zzb;

    public zzcgd() {
        zzcfw zzcfwVar = new zzcfw();
        this.zza = zzcfwVar;
        this.zzb = new AtomicInteger(0);
        zzhbw.zzr(zzcfwVar, new zzcgb(this), zzcfr.zzh);
    }

    @Deprecated
    public final void zze(zzcga zzcgaVar, zzcfy zzcfyVar) {
        zzhbw.zzr(this.zza, new zzcgc(this, zzcgaVar, zzcfyVar), zzcfr.zzh);
    }

    @Deprecated
    public final void zzf(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th2, String str) {
        this.zza.zzd(th2);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zziF)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, str);
        }
    }

    @Deprecated
    public final int zzi() {
        return this.zzb.get();
    }

    final /* synthetic */ AtomicInteger zzj() {
        return this.zzb;
    }
}
