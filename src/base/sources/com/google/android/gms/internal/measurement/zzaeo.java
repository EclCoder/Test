package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaeo {
    zzaeo() {
    }

    public static final List zza(Object obj, long j10) {
        zzaef zzaefVar = (zzaef) zzagg.zzm(obj, j10);
        if (zzaefVar.zza()) {
            return zzaefVar;
        }
        int size = zzaefVar.size();
        zzaef zzaefVarZzg = zzaefVar.zzg(size == 0 ? 10 : size + size);
        zzagg.zzn(obj, j10, zzaefVarZzg);
        return zzaefVarZzg;
    }
}
