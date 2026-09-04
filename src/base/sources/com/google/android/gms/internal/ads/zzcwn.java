package com.google.android.gms.internal.ads;

import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcwn implements zzddl {
    private final zzcku zza;
    private final zzdzl zzb;
    private final zzfkf zzc;

    zzcwn(zzcku zzckuVar, zzdzl zzdzlVar, zzfkf zzfkfVar) {
        this.zza = zzckuVar;
        this.zzb = zzdzlVar;
        this.zzc = zzfkfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddl
    public final void zzdr() {
        zzcku zzckuVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzot)).booleanValue() || (zzckuVar = this.zza) == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(zzckuVar.zzE()) ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1";
        zzdzk zzdzkVarZza = this.zzb.zza();
        zzdzkVarZza.zzc("action", "hcp");
        zzdzkVarZza.zzc("hcp", str);
        zzdzkVarZza.zzb(this.zzc);
        zzdzkVarZza.zzd();
    }
}
