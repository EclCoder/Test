package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzhbj extends zzhcd {
    private final Executor zza;
    final /* synthetic */ zzhbk zzb;

    zzhbj(zzhbk zzhbkVar, Executor executor) {
        Objects.requireNonNull(zzhbkVar);
        this.zzb = zzhbkVar;
        executor.getClass();
        this.zza = executor;
    }

    abstract void zzb(Object obj);

    @Override // com.google.android.gms.internal.ads.zzhcd
    final boolean zzd() {
        return this.zzb.isDone();
    }

    final void zze() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e10) {
            this.zzb.zzb(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final void zzf(Object obj) {
        this.zzb.zzD(null);
        zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final void zzg(Throwable th2) {
        zzhbk zzhbkVar = this.zzb;
        zzhbkVar.zzD(null);
        if (th2 instanceof ExecutionException) {
            zzhbkVar.zzb(((ExecutionException) th2).getCause());
        } else if (th2 instanceof CancellationException) {
            zzhbkVar.cancel(false);
        } else {
            zzhbkVar.zzb(th2);
        }
    }
}
