package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzt implements zzdk {
    final WeakReference zza;
    private final zzo zzb = new zzs(this);

    zzt(zzp zzpVar) {
        this.zza = new WeakReference(zzpVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        zzp zzpVar = (zzp) this.zza.get();
        boolean zCancel = this.zzb.cancel(z10);
        if (!zCancel || zzpVar == null) {
            return zCancel;
        }
        zzpVar.zza();
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.zzb.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zzb.zzc instanceof zze;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zzb.isDone();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    final boolean zza(Object obj) {
        return this.zzb.zzd(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final void zzb(Runnable runnable, Executor executor) {
        this.zzb.zzb(runnable, executor);
    }

    final boolean zzc(Throwable th2) {
        zzg zzgVar = new zzg(th2);
        zzd zzdVar = zzo.zzb;
        zzo zzoVar = this.zzb;
        if (!zzdVar.zzd(zzoVar, null, zzgVar)) {
            return false;
        }
        zzo.zzc(zzoVar);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.zzb.get(j10, timeUnit);
    }
}
