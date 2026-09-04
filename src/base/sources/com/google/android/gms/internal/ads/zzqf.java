package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzqf {
    public static final zzqf zza;
    public final String zzb;
    private final zzqe zzc;

    static {
        new zzqf("");
        zza = new zzqf("preload");
    }

    public zzqf(String str) {
        this.zzb = str;
        this.zzc = Build.VERSION.SDK_INT >= 31 ? new zzqe() : null;
    }

    public final synchronized LogSessionId zza() {
        zzqe zzqeVar;
        zzqeVar = this.zzc;
        if (zzqeVar == null) {
            throw null;
        }
        return zzqeVar.zza;
    }

    public final synchronized void zzb(LogSessionId logSessionId) {
        zzqe zzqeVar = this.zzc;
        if (zzqeVar == null) {
            throw null;
        }
        zzgtj.zzi(zzqeVar.zza.equals(LogSessionId.LOG_SESSION_ID_NONE));
        zzqeVar.zza = logSessionId;
    }
}
