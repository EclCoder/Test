package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzdh implements Serializable {
    zzdh() {
    }

    public static zzdh zzc() {
        return zzdf.zza;
    }

    public static zzdh zzd(Object obj) {
        return new zzdi(obj);
    }

    public abstract Object zza();

    public abstract boolean zzb();
}
