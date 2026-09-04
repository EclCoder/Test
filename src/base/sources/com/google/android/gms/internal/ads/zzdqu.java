package com.google.android.gms.internal.ads;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdqu {
    private final zzdzl zza;

    zzdqu(zzdzl zzdzlVar) {
        this.zza = zzdzlVar;
    }

    public final void zza(View view, zzfkf zzfkfVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzot)).booleanValue() || view == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzab.zza(view) ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1";
        zzdzk zzdzkVarZza = this.zza.zza();
        zzdzkVarZza.zzc("action", "hcp");
        zzdzkVarZza.zzc("hcp", str);
        zzdzkVarZza.zzb(zzfkfVar);
        zzdzkVarZza.zzd();
    }
}
