package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzezk implements zzfck {
    private final Context zza;
    private final zzhcg zzb;

    zzezk(zzhcg zzhcgVar, Context context) {
        this.zzb = zzhcgVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzezj
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 57;
    }

    final /* synthetic */ zzezl zzc() {
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzezl(com.google.android.gms.ads.internal.util.zzs.zzu(this.zza));
    }
}
