package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhan extends zzhao {
    zzhan(ListenableFuture listenableFuture, Class cls, zzgta zzgtaVar) {
        super(listenableFuture, cls, zzgtaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhao
    final void zze(Object obj) {
        zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhao
    final /* synthetic */ Object zzf(Object obj, Throwable th2) {
        return ((zzgta) obj).apply(th2);
    }
}
