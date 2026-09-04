package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfov {
    public static final zzfpb zza(ListenableFuture listenableFuture, Object obj, zzfpc zzfpcVar) {
        return new zzfpb(zzfpcVar, obj, null, zzfpc.zza, Collections.EMPTY_LIST, listenableFuture, null);
    }

    public static final zzfpb zzb(Callable callable, Object obj, zzfpc zzfpcVar) {
        return zzc(callable, zzfpcVar.zze(), obj, zzfpcVar);
    }

    public static final zzfpb zzc(Callable callable, zzhcg zzhcgVar, Object obj, zzfpc zzfpcVar) {
        return new zzfpb(zzfpcVar, obj, null, zzfpc.zza, Collections.EMPTY_LIST, zzhcgVar.submit(callable), null);
    }

    public static final zzfpb zzd(final zzfoq zzfoqVar, zzhcg zzhcgVar, Object obj, zzfpc zzfpcVar) {
        return zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzfou
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzfoqVar.zza();
                return null;
            }
        }, zzhcgVar, obj, zzfpcVar);
    }
}
