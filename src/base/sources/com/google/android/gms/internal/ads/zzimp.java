package com.google.android.gms.internal.ads;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class zzimp {
    final LinkedHashMap zza;

    zzimp(int i10) {
        this.zza = zzimr.zzc(i10);
    }

    final zzimp zza(Object obj, zzind zzindVar) {
        zzinc.zza(obj, "key");
        zzinc.zza(zzindVar, "provider");
        this.zza.put(obj, zzindVar);
        return this;
    }
}
