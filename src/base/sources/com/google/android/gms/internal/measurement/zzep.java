package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzep extends zzcx {
    private final com.google.android.gms.measurement.internal.zzjp zza;

    zzep(com.google.android.gms.measurement.internal.zzjp zzjpVar) {
        this.zza = zzjpVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final void zze(String str, String str2, Bundle bundle, long j10) {
        this.zza.interceptEvent(str, str2, bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final int zzf() {
        return System.identityHashCode(this.zza);
    }
}
