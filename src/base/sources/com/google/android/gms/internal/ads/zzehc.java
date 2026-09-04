package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzehc implements zzhbe {
    static final /* synthetic */ zzehc zza = new zzehc();

    private /* synthetic */ zzehc() {
    }

    @Override // com.google.android.gms.internal.ads.zzhbe
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        Throwable cause = (ExecutionException) obj;
        if (cause.getCause() != null) {
            cause = cause.getCause();
        }
        return zzhbw.zzc(cause);
    }
}
