package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfef implements zzfck {
    public zzfef(zzces zzcesVar, zzhcg zzhcgVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        final ListenableFuture listenableFutureZza = zzhbw.zza(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgO)).booleanValue()) {
            listenableFutureZza = zzhbw.zza(null);
        }
        final ListenableFuture listenableFutureZza2 = zzhbw.zza(null);
        return zzhbw.zzo(listenableFutureZza, listenableFutureZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfee
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfeg((String) listenableFutureZza.get(), (String) listenableFutureZza2.get());
            }
        }, zzcfr.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 47;
    }
}
