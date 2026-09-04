package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbir {
    static List zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbka.zzd("gad:dynamite_module:experiment_id", ""));
        zzc(arrayList, zzbkn.zza);
        zzc(arrayList, zzbkn.zzb);
        zzc(arrayList, zzbkn.zzc);
        zzc(arrayList, zzbkn.zzd);
        zzc(arrayList, zzbkn.zze);
        zzc(arrayList, zzbkn.zzu);
        zzc(arrayList, zzbkn.zzf);
        zzc(arrayList, zzbkn.zzm);
        zzc(arrayList, zzbkn.zzn);
        zzc(arrayList, zzbkn.zzo);
        zzc(arrayList, zzbkn.zzp);
        zzc(arrayList, zzbkn.zzq);
        zzc(arrayList, zzbkn.zzr);
        zzc(arrayList, zzbkn.zzs);
        zzc(arrayList, zzbkn.zzt);
        zzc(arrayList, zzbkn.zzg);
        zzc(arrayList, zzbkn.zzh);
        zzc(arrayList, zzbkn.zzi);
        zzc(arrayList, zzbkn.zzj);
        zzc(arrayList, zzbkn.zzk);
        zzc(arrayList, zzbkn.zzl);
        return arrayList;
    }

    static List zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzblc.zza);
        return arrayList;
    }

    private static void zzc(List list, zzbka zzbkaVar) {
        String str = (String) zzbkaVar.zze();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
