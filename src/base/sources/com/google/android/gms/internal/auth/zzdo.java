package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdo {
    public static zzdj zza(zzdj zzdjVar) {
        if ((zzdjVar instanceof zzdm) || (zzdjVar instanceof zzdk)) {
            return zzdjVar;
        }
        return zzdjVar instanceof Serializable ? new zzdk(zzdjVar) : new zzdm(zzdjVar);
    }

    public static zzdj zzb(Object obj) {
        return new zzdn(obj);
    }
}
