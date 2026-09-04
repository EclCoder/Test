package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdkq;
import com.google.android.gms.internal.ads.zzfoa;
import com.google.android.gms.internal.ads.zzimu;
import com.google.android.gms.internal.ads.zzind;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzax implements zzimu {
    private final zzind zza;

    private zzax(zzind zzindVar, zzind zzindVar2) {
        this.zza = zzindVar;
    }

    public static zzax zza(zzind zzindVar, zzind zzindVar2) {
        return new zzax(zzindVar, zzindVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdkq((zzr) this.zza.zzb(), zzfoa.zzc());
    }
}
