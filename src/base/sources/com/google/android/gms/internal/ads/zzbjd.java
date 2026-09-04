package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class zzbjd {
    private final Map zza = new HashMap();
    private final zzbjf zzb;

    public zzbjd(zzbjf zzbjfVar) {
        this.zzb = zzbjfVar;
    }

    public final void zza(String str, zzbjc zzbjcVar) {
        this.zza.put(str, zzbjcVar);
    }

    public final void zzb(String str, String str2, long j10) {
        Map map = this.zza;
        zzbjc zzbjcVar = (zzbjc) map.get(str2);
        String[] strArr = {str};
        if (zzbjcVar != null) {
            this.zzb.zzb(zzbjcVar, j10, strArr);
        }
        map.put(str, new zzbjc(j10, null, null));
    }

    public final zzbjf zzc() {
        return this.zzb;
    }
}
