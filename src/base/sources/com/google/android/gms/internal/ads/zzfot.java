package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfot {
    final /* synthetic */ zzfpc zza;
    private final Object zzb;
    private final List zzc;

    /* synthetic */ zzfot(zzfpc zzfpcVar, Object obj, List list, byte[] bArr) {
        Objects.requireNonNull(zzfpcVar);
        this.zza = zzfpcVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfpb zza(Callable callable) {
        List list = this.zzc;
        zzhbv zzhbvVarZzp = zzhbw.zzp(list);
        ListenableFuture listenableFutureZza = zzhbvVarZzp.zza(zzfos.zza, zzcfr.zzh);
        zzfpc zzfpcVar = this.zza;
        return new zzfpb(zzfpcVar, this.zzb, null, listenableFutureZza, list, zzhbvVarZzp.zza(callable, zzfpcVar.zze()), null);
    }
}
