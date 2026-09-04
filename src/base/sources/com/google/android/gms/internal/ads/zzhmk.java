package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhmk {
    private static final zzhmk zzb = new zzhmk();
    private final Map zza = new HashMap();

    public static zzhmk zza() {
        return zzb;
    }

    public final synchronized void zzb(zzhmj zzhmjVar, Class cls) {
        try {
            Map map = this.zza;
            zzhmj zzhmjVar2 = (zzhmj) map.get(cls);
            if (zzhmjVar2 != null && !zzhmjVar2.equals(zzhmjVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            map.put(cls, zzhmjVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
