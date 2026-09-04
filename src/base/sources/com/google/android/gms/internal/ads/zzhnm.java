package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhnm implements zzhns {
    private final String zza;
    private final zziaz zzb;
    private final zzida zzc;
    private final zzhsp zzd;
    private final zzhtm zze;
    private final Integer zzf;

    private zzhnm(String str, zziaz zziazVar, zzida zzidaVar, zzhsp zzhspVar, zzhtm zzhtmVar, Integer num) {
        this.zza = str;
        this.zzb = zziazVar;
        this.zzc = zzidaVar;
        this.zzd = zzhspVar;
        this.zze = zzhtmVar;
        this.zzf = num;
    }

    public static zzhnm zza(String str, zzida zzidaVar, zzhsp zzhspVar, zzhtm zzhtmVar, Integer num) throws GeneralSecurityException {
        if (zzhtmVar == zzhtm.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzhnm(str, zzhnz.zzb(str), zzidaVar, zzhspVar, zzhtmVar, num);
    }

    public final zzida zzb() {
        return this.zzc;
    }

    public final zzhsp zzc() {
        return this.zzd;
    }

    public final zzhtm zzd() {
        return this.zze;
    }

    public final Integer zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzhns
    public final zziaz zzf() {
        return this.zzb;
    }

    public final String zzg() {
        return this.zza;
    }
}
