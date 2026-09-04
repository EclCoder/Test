package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdmk implements zzimu {
    private final zzind zza;
    private final zzind zzb;
    private final zzind zzc;
    private final zzind zzd;

    private zzdmk(zzdmd zzdmdVar, zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
        this.zzd = zzindVar4;
    }

    public static zzdmk zza(zzdmd zzdmdVar, zzind zzindVar, zzind zzindVar2, zzind zzindVar3, zzind zzindVar4) {
        return new zzdmk(zzdmdVar, zzindVar, zzindVar2, zzindVar3, zzindVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final VersionInfoParcel versionInfoParcelZza = ((zzcoi) this.zzb).zza();
        final zzfkf zzfkfVarZza = ((zzcyk) this.zzc).zza();
        final zzfky zzfkyVarZza = ((zzdci) this.zzd).zza();
        return new zzdkq(new zzdef() { // from class: com.google.android.gms.internal.ads.zzdmc
            @Override // com.google.android.gms.internal.ads.zzdef
            public final /* synthetic */ void zzg() {
                zzfky zzfkyVar = zzfkyVarZza;
                JSONObject jSONObject = zzfkfVarZza.zzC;
                com.google.android.gms.ads.internal.zzt.zzo().zzg(context, versionInfoParcelZza.afmaVersion, jSONObject.toString(), zzfkyVar.zzg);
            }
        }, zzcfr.zzh);
    }
}
