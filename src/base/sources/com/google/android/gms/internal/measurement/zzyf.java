package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzyf {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();

    protected zzyf() {
    }

    protected abstract Object zza();

    public final Object zzb(zzyd zzydVar, zzzj zzzjVar) {
        ConcurrentHashMap concurrentHashMap = this.zza;
        Object obj = concurrentHashMap.get(zzydVar);
        if (obj != null) {
            return obj;
        }
        Object objZza = zza();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(zzydVar, objZza);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int iZza = zzzjVar.zza();
        zzye zzyeVar = null;
        for (int i10 = 0; i10 < iZza; i10++) {
            if (zzxx.zzf.equals(zzzjVar.zzb(i10))) {
                Object objZzc = zzzjVar.zzc(i10);
                if (objZzc instanceof zzyj) {
                    if (zzyeVar == null) {
                        zzyeVar = new zzye(this, zzydVar);
                    }
                    ((zzyj) objZzc).zza();
                }
            }
        }
        return objZza;
    }

    final /* synthetic */ ConcurrentHashMap zzc() {
        return this.zza;
    }
}
