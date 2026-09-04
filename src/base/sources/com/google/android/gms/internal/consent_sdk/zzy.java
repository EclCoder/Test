package com.google.android.gms.internal.consent_sdk;

import java.util.HashSet;
import rc.c;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzy {
    private final zzz zza;
    private final zzcn zzb;
    private final zzcr zzc;
    private int zzd = 0;
    private c.EnumC0792c zze = c.EnumC0792c.UNKNOWN;

    zzy(zzz zzzVar, zzcn zzcnVar, zzcr zzcrVar) {
        this.zza = zzzVar;
        this.zzb = zzcnVar;
        this.zzc = zzcrVar;
    }

    final zzab zza() throws zzg {
        String str;
        zzcn zzcnVar = this.zzb;
        int i10 = zzcnVar.zzg;
        boolean z10 = i10 == 8;
        zzz zzzVar = this.zza;
        zzzVar.zzc.zzh(z10);
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        switch (i11) {
            case 1:
            case 2:
            case 3:
                this.zzd = 3;
                break;
            case 4:
                this.zzd = 2;
                break;
            case 5:
                this.zzd = 1;
                break;
            case 6:
                throw new zzg(1, "Invalid response from server: ".concat(String.valueOf(zzcnVar.zzc)));
            case 7:
                throw new zzg(3, "Publisher misconfiguration: ".concat(String.valueOf(zzcnVar.zzc)));
            default:
                throw new zzg(1, "Invalid response from server.");
        }
        int i12 = zzcnVar.zzh;
        int i13 = i12 - 1;
        if (i12 == 0) {
            throw null;
        }
        if (i13 == 1) {
            this.zze = c.EnumC0792c.REQUIRED;
        } else {
            if (i13 != 2) {
                throw new zzg(1, "Invalid response from server.");
            }
            this.zze = c.EnumC0792c.NOT_REQUIRED;
        }
        String str2 = zzcnVar.zza;
        zzbs zzbsVar = str2 == null ? null : new zzbs(zzcnVar.zzb, str2);
        this.zzc.zzk(zzcnVar.zzf);
        zzzVar.zzc.zzj(new HashSet(zzcnVar.zzd));
        for (zzcm zzcmVar : zzcnVar.zze) {
            int i14 = zzcmVar.zzb;
            int i15 = i14 - 1;
            if (i14 == 0) {
                throw null;
            }
            if (i15 == 0) {
                str = null;
            } else if (i15 == 1) {
                str = "write";
            } else {
                if (i15 != 2) {
                    throw new RuntimeException(null, null);
                }
                str = "clear";
            }
            if (str != null) {
                zzzVar.zza.zzb(str, zzcmVar.zza, zzzVar.zzb);
            }
        }
        return new zzab(this.zzd, this.zze, zzbsVar, null);
    }
}
