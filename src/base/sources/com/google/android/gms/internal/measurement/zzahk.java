package com.google.android.gms.internal.measurement;

import sc.x;
import sc.y;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzahk implements x {
    private static final zzahk zza = new zzahk();
    private final x zzb = y.b(new zzahm());

    public static boolean zza() {
        zza.get().zza();
        return true;
    }

    public static boolean zzb() {
        return zza.get().zzb();
    }

    public static boolean zzc() {
        return zza.get().zzc();
    }

    @Override // sc.x
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzahl get() {
        return (zzahl) this.zzb.get();
    }
}
