package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgtf {
    private final String zza;
    private final zzgte zzb;
    private zzgte zzc;

    /* synthetic */ zzgtf(String str, byte[] bArr) {
        zzgte zzgteVar = new zzgte();
        this.zzb = zzgteVar;
        this.zzc = zzgteVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append('{');
        zzgte zzgteVar = this.zzb.zzb;
        String str = "";
        while (zzgteVar != null) {
            Object obj = zzgteVar.zza;
            sb2.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzgteVar = zzgteVar.zzb;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final zzgtf zza(Object obj) {
        zzgte zzgteVar = new zzgte();
        this.zzc.zzb = zzgteVar;
        this.zzc = zzgteVar;
        zzgteVar.zza = obj;
        return this;
    }
}
