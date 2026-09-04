package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcew {
    final /* synthetic */ zzcex zza;
    private long zzb;
    private long zzc;

    public zzcew(zzcex zzcexVar) {
        Objects.requireNonNull(zzcexVar);
        this.zza = zzcexVar;
        this.zzb = -1L;
        this.zzc = -1L;
    }

    public final long zza() {
        return this.zzc;
    }

    public final void zzb() {
        this.zzc = this.zza.zzk().elapsedRealtime();
    }

    public final void zzc() {
        this.zzb = this.zza.zzk().elapsedRealtime();
    }

    public final Bundle zzd() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzb);
        bundle.putLong("tclose", this.zzc);
        return bundle;
    }
}
