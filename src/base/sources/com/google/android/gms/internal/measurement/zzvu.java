package com.google.android.gms.internal.measurement;

import com.google.common.collect.c0;
import com.google.common.collect.l0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzvu {
    private static final WeakHashMap zza = new WeakHashMap();
    private static final WeakHashMap zzb = new WeakHashMap();

    public static void zza(Throwable th2) {
        Throwable cause;
        zzxc zzxcVar;
        zzws zzwsVarZzb;
        WeakHashMap weakHashMap = zzb;
        synchronized (weakHashMap) {
            cause = th2;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            weakHashMap.put(th2, Boolean.valueOf(cause != null));
        }
        if (cause != null) {
            return;
        }
        p.w(true, "Trace uncaught exception is disabled.");
        WeakHashMap weakHashMap2 = zza;
        synchronized (weakHashMap2) {
            Throwable cause2 = th2;
            while (cause2 != null) {
                try {
                    if (weakHashMap2.containsKey(cause2)) {
                        break;
                    } else {
                        cause2 = cause2.getCause();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            if (cause2 == null) {
                zzxcVar = null;
            } else {
                zzww zzwwVar = (zzww) weakHashMap2.get(cause2);
                weakHashMap2.put(th2, zzwwVar);
                zzxcVar = new zzxc(cause2, zzwwVar);
            }
        }
        if (zzxcVar != null || (zzwsVarZzb = zzvy.zzd().zzb) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (zzwsVarZzb = zzvy.zzd().zzb; zzwsVarZzb != null; zzwsVarZzb = zzwsVarZzb.zzb()) {
            arrayList.add(zzwsVarZzb);
        }
        zzvo zzvoVar = new zzvo();
        zzvoVar.zzc(((zzws) arrayList.get(0)).zzc());
        ((zzws) arrayList.get(0)).zzk();
        zzvoVar.zzd(-1L);
        c0.a aVarU = c0.u(arrayList.size());
        c0.a aVarU2 = c0.u(arrayList.size());
        for (zzws zzwsVar : l0.l(arrayList)) {
            aVarU2.a(zzwsVar.zze());
            aVarU.a(zzwsVar.zzh());
        }
        WeakHashMap weakHashMap3 = zza;
        synchronized (weakHashMap3) {
            zzvoVar.zza(aVarU2.m());
            zzvoVar.zzb(aVarU.m());
            weakHashMap3.put(th2, zzvoVar.zze());
        }
    }
}
