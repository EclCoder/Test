package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhct extends zzhcd {
    final /* synthetic */ zzhcv zza;
    private final zzhbd zzb;

    zzhct(zzhcv zzhcvVar, zzhbd zzhbdVar) {
        Objects.requireNonNull(zzhcvVar);
        this.zza = zzhcvVar;
        this.zzb = zzhbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final /* bridge */ /* synthetic */ Object zza() {
        zzhbd zzhbdVar = this.zzb;
        ListenableFuture listenableFutureZza = zzhbdVar.zza();
        zzgtj.zzl(listenableFutureZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhbdVar);
        return listenableFutureZza;
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final String zzc() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final boolean zzd() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final /* synthetic */ void zzf(Object obj) {
        this.zza.zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhcd
    final void zzg(Throwable th2) {
        this.zza.zzb(th2);
    }
}
