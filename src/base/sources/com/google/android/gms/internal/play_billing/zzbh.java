package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbh {
    private final String zza;
    private final zzbg zzb;
    private zzbg zzc;

    /* synthetic */ zzbh(String str, zzbi zzbiVar) {
        zzbg zzbgVar = new zzbg();
        this.zzb = zzbgVar;
        this.zzc = zzbgVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzbg zzbgVar = this.zzb.zzb;
        String str = "";
        while (zzbgVar != null) {
            Object obj = zzbgVar.zza;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzbgVar = zzbgVar.zzb;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzbh zza(Object obj) {
        zzbg zzbgVar = new zzbg();
        this.zzc.zzb = zzbgVar;
        this.zzc = zzbgVar;
        zzbgVar.zza = obj;
        return this;
    }
}
