package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzerr {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzdxc zzb;

    public zzerr(zzdxc zzdxcVar) {
        this.zzb = zzdxcVar;
    }

    public final void zza(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e10);
        }
    }

    public final zzbxb zzb(String str) {
        ConcurrentHashMap concurrentHashMap = this.zza;
        if (concurrentHashMap.containsKey(str)) {
            return (zzbxb) concurrentHashMap.get(str);
        }
        return null;
    }
}
