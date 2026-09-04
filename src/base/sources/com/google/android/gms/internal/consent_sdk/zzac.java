package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzac implements zzth {
    private final zztk zza;
    private final zztk zzb;
    private final zztk zzc;
    private final zztk zzd;

    private zzac(zztk zztkVar, zztk zztkVar2, zztk zztkVar3, zztk zztkVar4) {
        this.zza = zztkVar;
        this.zzb = zztkVar2;
        this.zzc = zztkVar3;
        this.zzd = zztkVar4;
    }

    public static zzac zzc(zztk zztkVar, zztk zztkVar2, zztk zztkVar3, zztk zztkVar4) {
        return new zzac(zztkVar, zztkVar2, zztkVar3, zztkVar4);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.consent_sdk.zztl
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzz zzb() {
        return new zzz((zze) this.zza.zzb(), ((zzap) this.zzb).zzb(), (zzaq) this.zzc.zzb(), (zzcr) this.zzd.zzb());
    }
}
