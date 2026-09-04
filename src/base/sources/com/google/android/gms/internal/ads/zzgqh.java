package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgqh {
    private final zzgfh zza;
    private final zzgcn zzb;

    zzgqh(zzgcn zzgcnVar, zzgfh zzgfhVar) {
        this.zza = zzgfhVar;
        this.zzb = zzgcnVar;
    }

    public final zzgqf zza(int i10) {
        return new zzgqf(i10, this.zzb, this.zza);
    }

    public final void zzb(int i10) {
        this.zza.zzb(i10 - 1, -1L, null, null);
    }

    public final void zzc(int i10, String str) {
        this.zza.zzb(i10 - 1, -1L, null, str);
    }

    public final void zzd(int i10, Throwable th2) {
        this.zza.zzb(i10 - 1, -1L, th2, null);
    }

    public final ListenableFuture zze(int i10, ListenableFuture listenableFuture) {
        zzgqf zzgqfVarZza = zza(i10);
        zzgqfVarZza.zza();
        zzhbw.zzr(listenableFuture, new zzgqg(this, zzgqfVarZza), zzhcn.zza());
        return listenableFuture;
    }

    public final void zzf(int i10, Runnable runnable) {
        zzgqf zzgqfVarZza = zza(i10);
        try {
            zzgqfVarZza.zza();
            runnable.run();
            zzgqfVarZza.zzc();
        } catch (Throwable th2) {
            try {
                zzgqfVarZza.zzb(th2);
                throw th2;
            } catch (Throwable th3) {
                zzgqfVarZza.zzc();
                throw th3;
            }
        }
    }
}
