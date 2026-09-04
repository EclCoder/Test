package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfye;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzh implements zzfye {
    final /* synthetic */ zzk zza;

    zzh(zzk zzkVar) {
        Objects.requireNonNull(zzkVar);
        this.zza = zzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfye
    public final void zza(int i10, long j10) {
        this.zza.zzo().zzb(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.zzfye
    public final void zzb(int i10, long j10, String str) {
        this.zza.zzo().zzf(i10, System.currentTimeMillis() - j10, str);
    }
}
