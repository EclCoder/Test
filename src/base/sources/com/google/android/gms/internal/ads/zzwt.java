package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzwt implements zzze {
    private final zzze zza;
    private final zzgwm zzb;

    public zzwt(zzze zzzeVar, List list) {
        this.zza = zzzeVar;
        this.zzb = zzgwm.zzq(list);
    }

    public final zzgwm zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final void zzg(long j10) {
        this.zza.zzg(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final long zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final long zzl() {
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final boolean zzm(zzma zzmaVar) {
        return this.zza.zzm(zzmaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzze
    public final boolean zzn() {
        return this.zza.zzn();
    }
}
