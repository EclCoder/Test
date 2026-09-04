package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbli {
    private static final AtomicReference zza = new AtomicReference();
    private static final AtomicReference zzb = new AtomicReference();

    static {
        new AtomicBoolean();
    }

    static zzblg zza() {
        return (zzblg) zza.get();
    }

    static zzblh zzb() {
        return (zzblh) zzb.get();
    }

    public static void zzc(zzblg zzblgVar) {
        zza.set(zzblgVar);
    }
}
