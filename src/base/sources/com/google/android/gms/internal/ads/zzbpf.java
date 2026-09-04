package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzbpf implements zzbpq {
    static final /* synthetic */ zzbpf zza = new zzbpf();

    private /* synthetic */ zzbpf() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcmg zzcmgVar = (zzcmg) obj;
        zzbpq zzbpqVar = zzbpp.zza;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzjy)).booleanValue()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("canOpenAppGmsgHandler disabled.");
            return;
        }
        String str = (String) map.get(CampaignEx.JSON_KEY_PACKAGE_NAME);
        if (TextUtils.isEmpty(str)) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Package name missing in canOpenApp GMSG.");
            return;
        }
        HashMap map2 = new HashMap();
        Boolean boolValueOf = Boolean.valueOf(zzcmgVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
        map2.put(str, boolValueOf);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 13 + boolValueOf.toString().length());
        sb2.append("/canOpenApp;");
        sb2.append(str);
        sb2.append(";");
        sb2.append(boolValueOf);
        com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        ((zzbsm) zzcmgVar).zze("openableApp", map2);
    }
}
