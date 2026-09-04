package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcds {
    private final Clock zza;
    private final zzcdq zzb;

    zzcds(Clock clock, zzcdq zzcdqVar) {
        this.zza = clock;
        this.zzb = zzcdqVar;
    }

    public static zzcds zza(Context context) {
        return zzcea.zzb(context).zza();
    }

    public final void zzb() {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzfr zzfrVar) {
        this.zzb.zza(-1, this.zza.currentTimeMillis());
    }

    public final void zzd(int i10, long j10) {
        this.zzb.zza(i10, j10);
    }
}
