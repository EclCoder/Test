package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzimu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaw implements zzimu {
    private final zzat zza;

    private zzaw(zzat zzatVar) {
        this.zza = zzatVar;
    }

    public static zzaw zza(zzat zzatVar) {
        return new zzaw(zzatVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        return this.zza.zza();
    }
}
