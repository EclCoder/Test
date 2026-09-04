package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfej implements zzfck {
    final zzhcg zza;
    final List zzb;

    public zzfej(zzbia zzbiaVar, zzhcg zzhcgVar, List list) {
        this.zza = zzhcgVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfei
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfek(this.zza.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 48;
    }
}
