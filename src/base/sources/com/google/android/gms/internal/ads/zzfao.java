package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfao implements zzfck {
    private static String zzc;
    private final zzhcg zza;
    private final Context zzb;

    public zzfao(zzhcg zzhcgVar, Context context) {
        this.zza = zzhcgVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfan
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 27;
    }

    final /* synthetic */ zzfap zzc() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgk)).booleanValue()) {
            return new zzfap(null);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzgt)).booleanValue()) {
            return new zzfap(com.google.android.gms.ads.internal.zzt.zzu().zzb(this.zzb));
        }
        if (zzc == null) {
            zzc = com.google.android.gms.ads.internal.zzt.zzu().zzb(this.zzb);
        }
        return new zzfap(zzc);
    }
}
