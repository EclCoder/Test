package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdox implements zzimu {
    private final zzind zza;

    private zzdox(zzind zzindVar, zzind zzindVar2) {
        this.zza = zzindVar;
    }

    public static zzdox zza(zzind zzindVar, zzind zzindVar2) {
        return new zzdox(zzindVar, zzindVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        VersionInfoParcel versionInfoParcelZza = ((zzcoi) this.zza).zza();
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzben(UUID.randomUUID().toString(), versionInfoParcelZza, "native", new JSONObject(), false, true);
    }
}
