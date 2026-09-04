package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhat extends zzhav {
    zzhat(ListenableFuture listenableFuture, zzhbe zzhbeVar) {
        super(listenableFuture, zzhbeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    final /* synthetic */ void zze(Object obj) {
        zzk((ListenableFuture) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhav
    final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) {
        zzhbe zzhbeVar = (zzhbe) obj;
        ListenableFuture listenableFutureZza = zzhbeVar.zza(obj2);
        zzgtj.zzl(listenableFutureZza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzhbeVar);
        return listenableFutureZza;
    }
}
