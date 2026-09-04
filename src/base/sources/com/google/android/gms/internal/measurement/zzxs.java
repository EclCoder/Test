package com.google.android.gms.internal.measurement;

import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzxs extends zzxi {
    private static final zzxr zza = new zzxr(null);

    zzxs(zzzf zzzfVar) {
        super(zzzfVar);
    }

    @Deprecated
    public static zzxs zzd(String str) {
        return new zzxs(zzaad.zzd("Phlogger"));
    }

    public final zzxp zze(Level level) {
        boolean zZzb = zzb(level);
        zzaad.zzh(zza(), level, zZzb);
        return !zZzb ? zza : new zzxq(this, level, false);
    }
}
