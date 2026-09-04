package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhmm {
    private static final zzhmm zza = new zzhmm();
    private static final zzhml zzb = new zzhml(null);
    private final AtomicReference zzc = new AtomicReference();

    public static zzhmm zza() {
        return zza;
    }

    public final zzhme zzb() {
        zzhme zzhmeVar = (zzhme) this.zzc.get();
        return zzhmeVar == null ? zzb : zzhmeVar;
    }
}
