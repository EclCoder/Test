package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcs implements zzth {
    private final zztk zza;
    private final zztk zzb;
    private final zztk zzc;

    private zzcs(zztk zztkVar, zztk zztkVar2, zztk zztkVar3, zztk zztkVar4, zztk zztkVar5) {
        this.zza = zztkVar;
        this.zzb = zztkVar2;
        this.zzc = zztkVar4;
    }

    public static zzcs zza(zztk zztkVar, zztk zztkVar2, zztk zztkVar3, zztk zztkVar4, zztk zztkVar5) {
        return new zzcs(zztkVar, zztkVar2, zztkVar3, zztkVar4, zztkVar5);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcr((zzad) this.zza.zzb(), (Application) this.zzb.zzb(), zzax.zza(), (zzco) this.zzc.zzb(), Boolean.FALSE.booleanValue());
    }
}
