package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.concurrent.Executor;
import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zztu {
    private Executor zza;
    private zzru zzb;
    private final zzvc zzd = zzvc.zza;
    private final HashMap zzc = new HashMap();

    public final zztu zza(Executor executor) {
        this.zza = executor;
        return this;
    }

    public final zztu zzb(zzru zzruVar) {
        this.zzb = zzruVar;
        return this;
    }

    public final zztu zzc(zzuw zzuwVar) {
        p.o(zzti.ALLOWED);
        HashMap map = this.zzc;
        p.j(!map.containsKey("singleproc"), "There is already a factory registered for the ID %s", "singleproc");
        map.put("singleproc", zzuwVar);
        return this;
    }

    public final zztt zzd() {
        return new zztt(this.zza, this.zzb, this.zzd, this.zzc, null);
    }
}
