package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeuh implements zzfck {
    private final Clock zza;
    private final zzfky zzb;
    private final long zzc;

    zzeuh(Clock clock, zzfky zzfkyVar, long j10) {
        this.zza = clock;
        this.zzb = zzfkyVar;
        this.zzc = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        return zzhbw.zza(new zzeui(this.zzb, this.zza.currentTimeMillis(), this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 4;
    }
}
