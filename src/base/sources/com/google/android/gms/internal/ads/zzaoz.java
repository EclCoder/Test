package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaoz {
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final Set zzd;

    private zzaoz(String str, int i10, String str2, Set set) {
        this.zzb = i10;
        this.zza = str;
        this.zzc = str2;
        this.zzd = set;
    }

    public static zzaoz zza(String str, int i10) {
        String str2;
        String strTrim = str.trim();
        zzgtj.zza(!strTrim.isEmpty());
        int iIndexOf = strTrim.indexOf(" ");
        if (iIndexOf == -1) {
            str2 = "";
        } else {
            String strTrim2 = strTrim.substring(iIndexOf).trim();
            strTrim = strTrim.substring(0, iIndexOf);
            str2 = strTrim2;
        }
        String str3 = zzfl.zza;
        String[] strArrSplit = strTrim.split("\\.", -1);
        String str4 = strArrSplit[0];
        HashSet hashSet = new HashSet();
        for (int i11 = 1; i11 < strArrSplit.length; i11++) {
            hashSet.add(strArrSplit[i11]);
        }
        return new zzaoz(str4, i10, str2, hashSet);
    }

    public static zzaoz zzb() {
        return new zzaoz("", 0, "", Collections.EMPTY_SET);
    }
}
