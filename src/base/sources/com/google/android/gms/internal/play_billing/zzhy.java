package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhy {
    private static final zzhy zza = new zzhy();
    private final ConcurrentMap zzb = new ConcurrentHashMap();

    private zzhy() {
        zzgk.zza();
    }

    static zzhy zza() {
        return zza;
    }

    private <T> zzib<T> zzc(Class<T> cls) {
        Class<T> cls2;
        zzib<T> zzibVarZzl;
        int i10 = zzic.zza;
        if (!zzgp.class.isAssignableFrom(cls)) {
            int i11 = zzfc.zza;
        }
        int i12 = zzfc.zza;
        if (!zzgp.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            zzhp zzhpVar = (zzhp) zzgp.zzr(cls.asSubclass(zzgp.class)).zzd(3, null, null);
            if (zzhpVar.zzb()) {
                zzibVarZzl = zzhv.zzc(zzic.zzm(), zzgf.zza(), zzhpVar.zza());
                cls2 = cls;
            } else {
                cls2 = cls;
                zzibVarZzl = zzhu.zzl(cls2, zzhpVar, zzhx.zza(), zzhf.zza(), zzic.zzm(), zzhpVar.zzc() + (-1) != 1 ? zzgf.zza() : null, zzho.zza());
            }
            zzib<T> zzibVar = (zzib) this.zzb.putIfAbsent(cls2, zzibVarZzl);
            return zzibVar != null ? zzibVar : zzibVarZzl;
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    final zzib zzb(Class cls) {
        Object obj = this.zzb.get(cls);
        return obj == null ? zzc(cls) : (zzib) obj;
    }
}
