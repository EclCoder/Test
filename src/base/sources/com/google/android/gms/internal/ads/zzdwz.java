package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdwz {
    private final Map zza = new HashMap();

    zzdwz() {
    }

    final synchronized void zza(String str, zzflw zzflwVar) {
        zzbxq zzbxqVarZzB;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbxq zzbxqVarZzC = null;
        if (zzflwVar == null) {
            zzbxqVarZzB = null;
        } else {
            try {
                zzbxqVarZzB = zzflwVar.zzB();
            } catch (zzflf unused) {
                zzbxqVarZzB = null;
            }
        }
        if (zzflwVar != null) {
            try {
                zzbxqVarZzC = zzflwVar.zzC();
            } catch (zzflf unused2) {
            }
        }
        boolean z10 = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzkL)).booleanValue()) {
            if (zzflwVar == null) {
                z10 = false;
            } else {
                try {
                    zzflwVar.zzn();
                } catch (zzflf unused3) {
                    z10 = false;
                }
            }
        }
        this.zza.put(str, new zzdwy(str, zzbxqVarZzB, zzbxqVarZzC, z10));
    }

    final synchronized void zzb(String str, zzbxb zzbxbVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdwy(str, zzbxbVar.zzf(), zzbxbVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }

    public final synchronized zzdwy zzc(String str) {
        return (zzdwy) this.zza.get(str);
    }

    public final String zzd(String str) {
        zzbxq zzbxqVar;
        zzdwy zzdwyVarZzc = zzc(str);
        return (zzdwyVarZzc == null || (zzbxqVar = zzdwyVarZzc.zzb) == null) ? "" : zzbxqVar.toString();
    }
}
