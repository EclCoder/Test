package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.common.collect.g0;
import sc.g;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzon {
    private final g zza;
    private final boolean zzb;
    private final g0 zzc;
    private volatile String zzd = null;

    zzon(g gVar, boolean z10, boolean z11, boolean z12, boolean z13, g0 g0Var) {
        this.zza = gVar;
        this.zzb = z12;
        this.zzc = g0Var;
    }

    final String zza(Context context) {
        String str = this.zzd;
        if (str != null) {
            return str;
        }
        String str2 = (String) this.zza.apply(context);
        this.zzd = str2;
        return str2;
    }

    final boolean zzb() {
        return this.zzb;
    }

    final g0 zzc() {
        return this.zzc;
    }
}
