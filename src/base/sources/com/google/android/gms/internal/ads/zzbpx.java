package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbpx implements zzbpq {
    static final Map zza = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", com.vungle.ads.internal.presenter.g.SET_ORIENTATION_PROPERTIES, "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zzb zzb;
    private final zzbya zzc;
    private final zzbyh zzd;

    public zzbpx(com.google.android.gms.ads.internal.zzb zzbVar, zzbya zzbyaVar, zzbyh zzbyhVar) {
        this.zzb = zzbVar;
        this.zzc = zzbyaVar;
        this.zzd = zzbyhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcku zzckuVar = (zzcku) obj;
        int iIntValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i10 = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzb;
                if (!zzbVar.zzb()) {
                    zzbVar.zzc(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.zzc.zza(map);
                    return;
                }
                if (iIntValue == 3) {
                    new zzbyd(zzckuVar, map).zza();
                    return;
                }
                if (iIntValue == 4) {
                    new zzbxx(zzckuVar, map).zza();
                    return;
                }
                if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.zzc.zzb(true);
                        return;
                    } else if (iIntValue != 7) {
                        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean z10 = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (zzckuVar == null) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i10 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i10 = z10 ? -1 : 14;
        }
        zzckuVar.zzam(i10);
    }
}
