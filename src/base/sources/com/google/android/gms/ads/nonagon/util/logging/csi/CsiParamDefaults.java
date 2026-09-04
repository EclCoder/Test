package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.devicetier.DeviceTierManager;
import com.google.android.gms.internal.ads.zzbih;
import com.google.android.gms.internal.ads.zzbiq;
import com.google.android.gms.internal.ads.zzgua;
import com.mbridge.msdk.MBridgeConstans;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class CsiParamDefaults {
    private final Context zza;
    private final String zzb;
    private final String zzc;
    private final PackageInfo zzd;
    private final String zze;
    private final DeviceTierManager zzf;

    public CsiParamDefaults(Context context, VersionInfoParcel versionInfoParcel, PackageInfo packageInfo, String str, DeviceTierManager deviceTierManager) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = versionInfoParcel.afmaVersion;
        this.zzd = packageInfo;
        this.zze = str;
        this.zzf = deviceTierManager;
    }

    public void set(Map<String, String> map) {
        PackageInfo packageInfo;
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzt.zzc();
        map.put("device", zzs.zzt());
        map.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.zzb);
        zzt.zzc();
        Context context = this.zza;
        map.put("is_lite_sdk", true != zzs.zzH(context) ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
        zzbih zzbihVar = zzbiq.zza;
        List listZzf = zzba.zzb().zzf();
        if (((Boolean) zzba.zzc().zzd(zzbiq.zzhP)).booleanValue()) {
            listZzf.addAll(zzt.zzh().zzo().zzi().zzh());
        }
        map.put("e", TextUtils.join(",", listZzf));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) zzba.zzc().zzd(zzbiq.zzmL)).booleanValue()) {
            zzt.zzc();
            map.put("is_bstar", true != zzs.zzE(context) ? MBridgeConstans.ENDCARD_URL_TYPE_PL : "1");
        }
        if (((Boolean) zzba.zzc().zzd(zzbiq.zzkP)).booleanValue()) {
            if (((Boolean) zzba.zzc().zzd(zzbiq.zzdg)).booleanValue()) {
                map.put("plugin", zzgua.zza(zzt.zzh().zzu()));
            }
        }
        if (((Boolean) zzba.zzc().zzd(zzbiq.zzmT)).booleanValue()) {
            map.put("uev", zzgua.zza(this.zze));
        }
        if (((Boolean) zzba.zzc().zzd(zzbiq.zzcZ)).booleanValue()) {
            map.put("mem_tier", this.zzf.getAdvertisedMemoryTier().name());
        }
        if (((Boolean) zzba.zzc().zzd(zzbiq.zzda)).booleanValue()) {
            map.put("proc_tier", this.zzf.getAvailableProcessorTier().name());
        }
        if (!((Boolean) zzba.zzc().zzd(zzbiq.zzdb)).booleanValue() || (packageInfo = this.zzd) == null) {
            return;
        }
        map.put("vc", String.valueOf(packageInfo.versionCode));
        map.put("vn", String.valueOf(packageInfo.versionName));
    }
}
