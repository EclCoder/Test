package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzifk {
    zzifk() {
    }

    public static final boolean zza(Object obj) {
        return !((zzifj) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzifj zzifjVarZzc = (zzifj) obj;
        zzifj zzifjVar = (zzifj) obj2;
        if (!zzifjVar.isEmpty()) {
            if (!zzifjVarZzc.zze()) {
                zzifjVarZzc = zzifjVarZzc.zzc();
            }
            zzifjVarZzc.zzb(zzifjVar);
        }
        return zzifjVarZzc;
    }
}
