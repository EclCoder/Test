package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcuo implements zzimu {
    private final zzind zza;
    private final zzind zzb;

    private zzcuo(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        this.zza = zzindVar;
        this.zzb = zzindVar3;
    }

    public static zzcuo zza(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        return new zzcuo(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((JSONObject) this.zzb.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new zzdkq((zzcug) this.zza.zzb(), zzfoa.zzc()));
        zzinc.zzb(setSingleton);
        return setSingleton;
    }
}
