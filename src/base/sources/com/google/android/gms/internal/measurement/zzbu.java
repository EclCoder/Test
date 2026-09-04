package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbu {
    private static volatile zzbu zza;
    private final List zzb = new CopyOnWriteArrayList();

    private zzbu() {
    }

    public static zzbu zza() {
        if (zza == null) {
            synchronized (zzbu.class) {
                try {
                    if (zza == null) {
                        zza = new zzbu();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return zza;
    }

    public final void zzb(zzbt zzbtVar) {
        this.zzb.add(0, zzbtVar);
    }
}
