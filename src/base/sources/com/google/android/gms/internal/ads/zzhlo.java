package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhlo {
    private static final Logger zza = Logger.getLogger(zzhlo.class.getName());
    private static final zzhlo zzd = new zzhlo();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    public static zzhlo zza() {
        return zzd;
    }

    private final synchronized zzhdr zzg(String str) {
        ConcurrentMap concurrentMap;
        concurrentMap = this.zzb;
        if (!concurrentMap.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 98);
            sb2.append("No key manager found for key type ");
            sb2.append(str);
            sb2.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb2.toString());
        }
        return (zzhdr) concurrentMap.get(str);
    }

    private final synchronized void zzh(zzhdr zzhdrVar, boolean z10, boolean z11) {
        try {
            String strZzb = zzhdrVar.zzb();
            if (z11) {
                ConcurrentMap concurrentMap = this.zzc;
                if (concurrentMap.containsKey(strZzb) && !((Boolean) concurrentMap.get(strZzb)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(strZzb));
                }
            }
            ConcurrentMap concurrentMap2 = this.zzb;
            zzhdr zzhdrVar2 = (zzhdr) concurrentMap2.get(strZzb);
            if (zzhdrVar2 != null && !zzhdrVar2.getClass().equals(zzhdrVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(strZzb));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strZzb, zzhdrVar2.getClass().getName(), zzhdrVar.getClass().getName()));
            }
            concurrentMap2.putIfAbsent(strZzb, zzhdrVar);
            this.zzc.put(strZzb, Boolean.valueOf(z11));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzb(zzhdr zzhdrVar, boolean z10) {
        zzf(zzhdrVar, 1, z10);
    }

    public final zzhdr zzc(String str, Class cls) throws GeneralSecurityException {
        zzhdr zzhdrVarZzg = zzg(str);
        if (zzhdrVarZzg.zzc().equals(cls)) {
            return zzhdrVarZzg;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzhdrVarZzg.getClass());
        String string = zzhdrVarZzg.zzc().toString();
        StringBuilder sb2 = new StringBuilder(name.length() + 53 + strValueOf.length() + 23 + string.length());
        sb2.append("Primitive type ");
        sb2.append(name);
        sb2.append(" not supported by key manager of type ");
        sb2.append(strValueOf);
        sb2.append(", which only supports: ");
        sb2.append(string);
        throw new GeneralSecurityException(sb2.toString());
    }

    public final zzhdr zzd(String str) {
        return zzg(str);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzc.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzhdr zzhdrVar, int i10, boolean z10) {
        if (!zzhkr.zza(i10)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzhdrVar, false, z10);
    }
}
