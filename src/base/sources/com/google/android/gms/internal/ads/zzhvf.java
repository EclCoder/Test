package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhvf extends zzhxj {
    private final zzhvl zza;
    private final zzibb zzb;

    private zzhvf(zzhvl zzhvlVar, zzibb zzibbVar) {
        this.zza = zzhvlVar;
        this.zzb = zzibbVar;
    }

    public static zzhvf zzc(zzhvl zzhvlVar, zzibb zzibbVar) throws GeneralSecurityException {
        if (zzibbVar.zzd() == 32) {
            if (Arrays.equals(zzhvlVar.zzd().zzc(), zzhlc.zza(zzhlc.zzb(zzibbVar.zzc(zzhdo.zza()))))) {
                return new zzhvf(zzhvlVar, zzibbVar);
            }
            throw new GeneralSecurityException("Ed25519 keys mismatch");
        }
        int iZzd = zzibbVar.zzd();
        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzd).length() + 65);
        sb2.append("Ed25519 key must be constructed with key of length 32 bytes, not ");
        sb2.append(iZzd);
        throw new GeneralSecurityException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhxj, com.google.android.gms.internal.ads.zzhdq
    public final /* synthetic */ zzheh zza() {
        return this.zza.zzf();
    }

    public final zzhve zzd() {
        return this.zza.zzf();
    }

    public final zzhvl zze() {
        return this.zza;
    }

    public final zzibb zzf() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzhxj
    public final /* synthetic */ zzhxk zzg() {
        return this.zza;
    }
}
