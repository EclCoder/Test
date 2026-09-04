package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhzq implements zzhek {
    public static zzhek zzb(zzhvl zzhvlVar) throws GeneralSecurityException {
        if (!zzhkr.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return zzhyc.zzb(zzhvlVar);
        } catch (GeneralSecurityException unused) {
            return new zzhzp(zzhvlVar.zzd().zzc(), zzhvlVar.zze().zzc(), zzhvlVar.zzf().zzc().equals(zzhvd.zzc) ? new byte[]{0} : new byte[0], null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhek
    public final void zza(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
