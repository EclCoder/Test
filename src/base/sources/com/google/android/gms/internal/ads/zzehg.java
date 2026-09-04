package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzehg {
    private final zzcnj zza;
    private final Context zzb;
    private final Executor zzc;

    zzehg(zzcnj zzcnjVar, Context context, Executor executor) {
        this.zza = zzcnjVar;
        this.zzb = context;
        this.zzc = executor;
    }

    public final void zza() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb();
            }
        });
    }

    final /* synthetic */ void zzb() {
        zzehi zzehiVarZzh = this.zza.zzh();
        zzehiVarZzh.zzb(this.zzb);
        zzehiVarZzh.zza().zza().zza();
    }
}
