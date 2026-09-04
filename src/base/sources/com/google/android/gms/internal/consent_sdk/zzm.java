package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzm implements zzth {
    private final zztk zza;
    private final zztk zzb;

    private zzm(zztk zztkVar, zztk zztkVar2) {
        this.zza = zztkVar;
        this.zzb = zztkVar2;
    }

    public static zzm zza(zztk zztkVar, zztk zztkVar2) {
        return new zzm(zztkVar, zztkVar2);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzl((Application) this.zza.zzb(), (zzam) this.zzb.zzb());
    }
}
