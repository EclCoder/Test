package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfuj {
    private boolean zza;

    final boolean zza() {
        return this.zza;
    }

    final void zzb(Context context) {
        zzfwi.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfvq.zza().zzb(context);
        zzfvh.zza().zzd(context);
        zzfwd.zza(context);
        zzfwe.zza(context);
        zzfwh.zza(context);
        zzfvn.zza().zzc(context);
        zzfvg.zza().zzc(context);
        zzfvs.zza().zzb(context);
    }
}
