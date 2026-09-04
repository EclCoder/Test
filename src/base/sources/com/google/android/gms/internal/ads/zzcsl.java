package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcsl implements zzcrt {
    private final com.google.android.gms.ads.internal.util.zzg zza;

    zzcsl(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrt
    public final void zza(Map map) {
        int iIntValue;
        String str = (String) map.get("default_queue_capacity");
        if (str == null || (iIntValue = Float.valueOf(str).intValue()) <= 0) {
            return;
        }
        this.zza.zzU(iIntValue);
    }
}
