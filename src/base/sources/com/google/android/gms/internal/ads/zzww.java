package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzww {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private zzho zzc;

    public zzww(zzage zzageVar, zzanj zzanjVar) {
    }

    public final void zza(zzho zzhoVar) {
        if (zzhoVar != this.zzc) {
            this.zzc = zzhoVar;
            this.zza.clear();
            this.zzb.clear();
        }
    }
}
