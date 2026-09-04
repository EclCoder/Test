package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzjx {
    private final Map zza;
    private zziz zzb;

    /* synthetic */ zzjx(zzlh zzlhVar, int i10, byte[] bArr) {
        Objects.requireNonNull(zzlhVar);
        this.zza = new HashMap();
        this.zzb = zziz.zza;
    }

    private static final zziz zzb(zziz zzizVar, List list) {
        zziy zziyVar = new zziy(zzizVar, null);
        HashSet hashSet = new HashSet(list);
        for (String str : zzizVar.zza()) {
            if (!hashSet.contains(str)) {
                zziyVar.zzf(str);
            }
        }
        return zziyVar.zzg();
    }

    final /* synthetic */ void zza(zziz zzizVar) {
        for (Map.Entry entry : new HashMap(this.zza).entrySet()) {
            zzja zzjaVar = (zzja) entry.getKey();
            List list = (List) entry.getValue();
            if (!zzb(zzizVar, list).equals(zzb(this.zzb, list))) {
                zzjaVar.zza();
            }
        }
        this.zzb = zzizVar;
    }
}
