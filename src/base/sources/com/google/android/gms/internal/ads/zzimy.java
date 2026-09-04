package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzimy extends zzimq {
    static {
        zzimv.zza(Collections.EMPTY_MAP);
    }

    /* synthetic */ zzimy(Map map, zzimw zzimwVar) {
        super(map);
    }

    public static zzimx zzc(int i10) {
        return new zzimx(i10, null);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap linkedHashMapZzc = zzimr.zzc(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            linkedHashMapZzc.put(entry.getKey(), ((zzind) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMapZzc);
    }
}
