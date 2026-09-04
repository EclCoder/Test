package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzzt {
    private static final zzzp zza = new zzzr();
    private static final zzzo zzb = new zzzs();

    public static zzzm zza(Set set) {
        zzzm zzzmVar = new zzzm(zza, null);
        zzzmVar.zza(zzb);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzzmVar.zzb((zzyl) it.next());
        }
        return zzzmVar;
    }
}
