package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdje implements zzimu {
    private final zzdir zza;

    private zzdje(zzdir zzdirVar) {
        this.zza = zzdirVar;
    }

    public static zzdje zza(zzdir zzdirVar) {
        return new zzdje(zzdirVar);
    }

    public static Set zzc(zzdir zzdirVar) {
        return zzdirVar.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        return this.zza.zzm();
    }
}
