package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzan {
    private final EnumMap zza;

    zzan() {
        this.zza = new EnumMap(zzjk.class);
    }

    public static zzan zzd(String str) {
        EnumMap enumMap = new EnumMap(zzjk.class);
        if (str.length() >= zzjk.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                zzjk[] zzjkVarArrValues = zzjk.values();
                int length = zzjkVarArrValues.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put(zzjkVarArrValues[i10], zzam.zza(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new zzan(enumMap);
            }
        }
        return new zzan();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (zzjk zzjkVar : zzjk.values()) {
            zzam zzamVar = (zzam) this.zza.get(zzjkVar);
            if (zzamVar == null) {
                zzamVar = zzam.UNSET;
            }
            sb2.append(zzamVar.zzb());
        }
        return sb2.toString();
    }

    public final zzam zza(zzjk zzjkVar) {
        zzam zzamVar = (zzam) this.zza.get(zzjkVar);
        return zzamVar == null ? zzam.UNSET : zzamVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public final void zzb(zzjk zzjkVar, int i10) {
        zzam zzamVar = zzam.UNSET;
        if (i10 == -30) {
            zzamVar = zzam.TCF;
        } else if (i10 == -20) {
            zzamVar = zzam.API;
        } else if (i10 == -10) {
            zzamVar = zzam.MANIFEST;
        } else if (i10 == 0) {
            zzamVar = zzam.API;
        } else if (i10 == 30) {
            zzamVar = zzam.INITIALIZATION;
        }
        this.zza.put(zzjkVar, zzamVar);
    }

    public final void zzc(zzjk zzjkVar, zzam zzamVar) {
        this.zza.put(zzjkVar, zzamVar);
    }

    private zzan(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.zza = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
