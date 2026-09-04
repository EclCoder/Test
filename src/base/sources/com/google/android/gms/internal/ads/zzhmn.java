package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhmn {
    private static final zzhmn zzb = new zzhmn();
    private final Map zza = new HashMap();

    zzhmn() {
    }

    public static zzhmn zza() {
        return zzb;
    }

    public final synchronized void zzb(String str, zzheh zzhehVar) {
        try {
            Map map = this.zza;
            if (!map.containsKey(str)) {
                map.put(str, zzhehVar);
                return;
            }
            if (((zzheh) map.get(str)).equals(zzhehVar)) {
                return;
            }
            String strValueOf = String.valueOf(map.get(str));
            String strValueOf2 = String.valueOf(zzhehVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 45 + strValueOf.length() + 17 + strValueOf2.length());
            sb2.append("Parameters object with name ");
            sb2.append(str);
            sb2.append(" already exists (");
            sb2.append(strValueOf);
            sb2.append("), cannot insert ");
            sb2.append(strValueOf2);
            throw new GeneralSecurityException(sb2.toString());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized zzheh zzc(String str) {
        Map map;
        map = this.zza;
        if (!map.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (zzheh) map.get("AES128_GCM");
    }

    public final synchronized void zzd(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzb((String) entry.getKey(), (zzheh) entry.getValue());
        }
    }
}
