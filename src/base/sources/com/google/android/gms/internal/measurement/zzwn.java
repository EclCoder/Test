package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzwn {
    int zza;
    final int zzb;
    zzwn zzc;
    final Map zzd = new HashMap(0);

    zzwn(int i10, int i11, zzwn zzwnVar) {
        if (i10 > i11) {
            throw new IllegalArgumentException();
        }
        this.zza = i10;
        this.zzb = i11;
        this.zzc = null;
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        StringBuilder sb2 = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 4);
        sb2.append("Node");
        sb2.append(iIdentityHashCode);
        return sb2.toString();
    }
}
