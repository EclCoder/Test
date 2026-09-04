package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzbpo implements zzbpq {
    static final /* synthetic */ zzbpo zza = new zzbpo();

    private /* synthetic */ zzbpo() {
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcmg zzcmgVar = (zzcmg) obj;
        zzbpq zzbpqVar = zzbpp.zza;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] strArrSplit = str.split(",");
        HashMap map2 = new HashMap();
        PackageManager packageManager = zzcmgVar.getContext().getPackageManager();
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split(";", 2);
            boolean z10 = true;
            if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), C.DEFAULT_BUFFER_SEGMENT_SIZE) == null) {
                z10 = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z10);
            map2.put(str2, boolValueOf);
            StringBuilder sb2 = new StringBuilder(str2.length() + 14 + boolValueOf.toString().length());
            sb2.append("/canOpenURLs;");
            sb2.append(str2);
            sb2.append(";");
            sb2.append(boolValueOf);
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
        ((zzbsm) zzcmgVar).zze("openableURLs", map2);
    }
}
