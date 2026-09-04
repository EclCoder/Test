package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzifb {
    zzifb() {
    }

    public static final List zza(Object obj, long j10) {
        zzieq zzieqVar = (zzieq) zziha.zzm(obj, j10);
        if (zzieqVar.zza()) {
            return zzieqVar;
        }
        int size = zzieqVar.size();
        zzieq zzieqVarZzh = zzieqVar.zzh(size == 0 ? 10 : size + size);
        zziha.zzn(obj, j10, zzieqVarZzh);
        return zzieqVarZzh;
    }
}
