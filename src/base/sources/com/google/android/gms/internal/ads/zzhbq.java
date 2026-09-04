package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzhbq extends zzgwd implements Future {
    protected zzhbq() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return zza().cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return zza().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return zza().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return zza().isDone();
    }

    protected abstract Future zza();

    @Override // com.google.android.gms.internal.ads.zzgwd
    protected /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return zza().get(j10, timeUnit);
    }
}
