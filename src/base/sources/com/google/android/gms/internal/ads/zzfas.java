package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfas implements zzfck {
    private final zzhcg zza;
    private final zzeao zzb;

    zzfas(zzhcg zzhcgVar, zzeao zzeaoVar) {
        this.zza = zzhcgVar;
        this.zzb = zzeaoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfar
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 62;
    }

    final /* synthetic */ zzfat zzc() {
        return new zzfat(this.zzb.zzb());
    }
}
