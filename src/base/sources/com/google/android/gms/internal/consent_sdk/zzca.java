package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzca implements zzth {
    private final zztk zza;

    private zzca(zztk zztkVar) {
        this.zza = zztkVar;
    }

    public static zzca zza(zztk zztkVar) {
        return new zzca(zztkVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzbz((Application) this.zza.zzb());
    }
}
