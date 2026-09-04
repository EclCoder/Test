package com.google.android.gms.internal.ads;

import com.mbridge.msdk.MBridgeConstans;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzexy implements zzimu {
    private final zzind zza;
    private final zzind zzb;
    private final zzind zzc;

    private zzexy(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
    }

    public static zzexy zza(zzind zzindVar, zzind zzindVar2, zzind zzindVar3) {
        return new zzexy(zzindVar, zzindVar2, zzindVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object objZzb = ((zzeuc) this.zza).zzb();
        zzewy zzewyVar = (zzewy) this.zzb.zzb();
        if (true == ((List) this.zzc.zzb()).contains(MBridgeConstans.API_REUQEST_CATEGORY_APP)) {
            objZzb = zzewyVar;
        }
        zzinc.zzb(objZzb);
        return objZzb;
    }
}
