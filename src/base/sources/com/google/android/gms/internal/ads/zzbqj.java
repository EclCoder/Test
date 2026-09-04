package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbqj implements zzbpq {
    private final zzbqi zza;

    public zzbqj(zzbqi zzbqiVar) {
        this.zza = zzbqiVar;
    }

    public static void zzb(zzcku zzckuVar, zzbqi zzbqiVar) {
        zzckuVar.zzab("/reward", new zzbqj(zzbqiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("action");
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zza();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzc();
                    return;
                }
                return;
            }
        }
        zzccb zzccbVar = null;
        try {
            int i10 = Integer.parseInt((String) map.get(RewardPlus.AMOUNT));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzccbVar = new zzccb(str2, i10);
            }
        } catch (NumberFormatException e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to parse reward amount.", e10);
        }
        this.zza.zzb(zzccbVar);
    }
}
