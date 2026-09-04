package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.mbridge.msdk.MBridgeConstans;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbit {
    private final String zza = (String) zzbkk.zza.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbit(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put("os", Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzt.zzc();
        linkedHashMap.put("device", com.google.android.gms.ads.internal.util.zzs.zzt());
        linkedHashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        com.google.android.gms.ads.internal.zzt.zzc();
        linkedHashMap.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.zzH(context) ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
        Future futureZza = com.google.android.gms.ads.internal.zzt.zzp().zza(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzcbh) futureZza.get()).zzj));
            linkedHashMap.put("network_fine", Integer.toString(((zzcbh) futureZza.get()).zzk));
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzmL)).booleanValue()) {
            Map map = this.zzb;
            com.google.android.gms.ads.internal.zzt.zzc();
            map.put("is_bstar", true != com.google.android.gms.ads.internal.util.zzs.zzE(context) ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzkP)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzdg)).booleanValue() || zzgua.zzc(com.google.android.gms.ads.internal.zzt.zzh().zzu())) {
                return;
            }
            this.zzb.put("plugin", com.google.android.gms.ads.internal.zzt.zzh().zzu());
        }
    }

    final String zza() {
        return this.zza;
    }

    final Context zzb() {
        return this.zzc;
    }

    final String zzc() {
        return this.zzd;
    }

    final Map zzd() {
        return this.zzb;
    }
}
