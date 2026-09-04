package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgc {
    static final zzgc zza = new zzgc(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile int zze = 1;
    private final Map zzd;

    zzgc() {
        this.zzd = new HashMap();
    }

    static boolean zzb() {
        return false;
    }

    public final zzgo zza(zzhr zzhrVar, int i10) {
        return (zzgo) this.zzd.get(new zzgb(zzhrVar, i10));
    }

    zzgc(boolean z10) {
        this.zzd = Collections.EMPTY_MAP;
    }
}
