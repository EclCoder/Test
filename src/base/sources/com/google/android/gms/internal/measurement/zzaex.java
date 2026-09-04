package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaex {
    zzaex() {
    }

    public static final boolean zza(Object obj) {
        return !((zzaew) obj).zze();
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzaew zzaewVarZzc = (zzaew) obj;
        zzaew zzaewVar = (zzaew) obj2;
        if (!zzaewVar.isEmpty()) {
            if (!zzaewVarZzc.zze()) {
                zzaewVarZzc = zzaewVarZzc.zzc();
            }
            zzaewVarZzc.zzb(zzaewVar);
        }
        return zzaewVarZzc;
    }
}
