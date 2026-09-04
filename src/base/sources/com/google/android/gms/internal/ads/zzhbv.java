package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhbv {
    private final boolean zza;
    private final zzgwm zzb;

    /* synthetic */ zzhbv(boolean z10, zzgwm zzgwmVar, byte[] bArr) {
        this.zza = z10;
        this.zzb = zzgwmVar;
    }

    public final ListenableFuture zza(Callable callable, Executor executor) {
        return new zzhbk(this.zzb, this.zza, executor, callable);
    }
}
