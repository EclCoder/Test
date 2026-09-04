package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzadf {
    static final zzadf zza = new zzadf(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzadf zzd;
    private final Map zze;

    zzadf() {
        this.zze = new HashMap();
    }

    public static zzadf zza() {
        int i10 = zzacf.zza;
        return zza;
    }

    public static zzadf zzb() {
        zzadf zzadfVar = zzd;
        if (zzadfVar != null) {
            return zzadfVar;
        }
        synchronized (zzadf.class) {
            try {
                zzadf zzadfVar2 = zzd;
                if (zzadfVar2 != null) {
                    return zzadfVar2;
                }
                int i10 = zzacf.zza;
                zzadf zzadfVarZzb = zzadn.zzb(zzadf.class);
                zzd = zzadfVarZzb;
                return zzadfVarZzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzadt zzc(zzafc zzafcVar, int i10) {
        return (zzadt) this.zze.get(new zzade(zzafcVar, i10));
    }

    zzadf(boolean z10) {
        this.zze = Collections.EMPTY_MAP;
    }
}
