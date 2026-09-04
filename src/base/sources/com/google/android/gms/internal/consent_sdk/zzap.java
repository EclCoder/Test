package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzap implements zzth {
    private final zztk zza;
    private final zztk zzb;
    private final zztk zzc;

    private zzap(zztk zztkVar, zztk zztkVar2, zztk zztkVar3, zztk zztkVar4) {
        this.zza = zztkVar;
        this.zzb = zztkVar2;
        this.zzc = zztkVar3;
    }

    public static zzap zzc(zztk zztkVar, zztk zztkVar2, zztk zztkVar3, zztk zztkVar4) {
        return new zzap(zztkVar, zztkVar2, zztkVar3, zztkVar4);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzao zzb() {
        return new zzao((Application) this.zza.zzb(), (zzaq) this.zzb.zzb(), (zzl) this.zzc.zzb(), zzax.zza());
    }
}
