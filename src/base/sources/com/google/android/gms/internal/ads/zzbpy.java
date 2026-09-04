package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbpy implements zzbpq {
    private final zzeao zza;

    public zzbpy(zzeao zzeaoVar) {
        this.zza = zzeaoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        if (map == null || !map.containsKey("id") || TextUtils.isEmpty((CharSequence) map.get("id")) || !map.containsKey("event_type") || TextUtils.isEmpty((CharSequence) map.get("event_type"))) {
            com.google.android.gms.ads.internal.util.zze.zza("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
            return;
        }
        try {
            this.zza.zza(Long.parseLong((String) map.get("id")), Integer.parseInt((String) map.get("event_type")), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        } catch (NumberFormatException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e10);
        }
    }
}
