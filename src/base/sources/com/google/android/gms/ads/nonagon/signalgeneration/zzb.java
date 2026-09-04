package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzcns;
import com.google.android.gms.internal.ads.zzcoi;
import com.google.android.gms.internal.ads.zzcrb;
import com.google.android.gms.internal.ads.zzexr;
import com.google.android.gms.internal.ads.zzimu;
import com.google.android.gms.internal.ads.zzind;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzb implements zzimu {
    private final zzind zza;
    private final zzind zzb;

    private zzb(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4) {
        this.zza = zzindVar;
        this.zzb = zzindVar4;
    }

    public static zzb zza(zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4) {
        return new zzb(zzindVar, zzindVar2, zzindVar3, zzindVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zza(((zzcns) this.zza).zza(), zzcrb.zza(), zzexr.zzc(), ((zzcoi) this.zzb).zza());
    }
}
