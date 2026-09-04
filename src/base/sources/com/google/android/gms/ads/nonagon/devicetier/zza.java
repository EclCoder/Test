package com.google.android.gms.ads.nonagon.devicetier;

import com.google.android.gms.internal.ads.zzcns;
import com.google.android.gms.internal.ads.zzimu;
import com.google.android.gms.internal.ads.zzind;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zza implements zzimu {
    private final zzind zza;

    private zza(zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static zza zza(zzind zzindVar) {
        return new zza(zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new DeviceTierManager(((zzcns) this.zza).zza());
    }
}
