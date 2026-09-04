package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhen {
    public static byte[] zza(zzheh zzhehVar) {
        return ((zzhnn) zzhmr.zza().zzk(zzhehVar, zzhnn.class)).zzc().zzaN();
    }

    public static zzheh zzb(byte[] bArr) {
        try {
            zzhst zzhstVarZzd = zzhst.zzd(bArr, zzido.zza());
            zzhmr zzhmrVarZza = zzhmr.zza();
            zzhnn zzhnnVarZzb = zzhnn.zzb(zzhstVarZzd);
            return !zzhmrVarZza.zzi(zzhnnVarZzb) ? new zzhma(zzhnnVarZzb) : zzhmrVarZza.zzj(zzhnnVarZzb);
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }
}
