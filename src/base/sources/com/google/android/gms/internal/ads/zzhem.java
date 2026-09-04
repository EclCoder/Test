package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhem {
    public static zzheb zza(String str) throws GeneralSecurityException {
        try {
            try {
                try {
                    zzhsz zzhszVarZze = zzhsz.zze(zzhdp.zza(str).zzb().zzaN(), zzido.zza());
                    for (zzhsy zzhsyVar : zzhszVarZze.zzb()) {
                        if (zzhsyVar.zzb().zzc() == zzhsp.UNKNOWN_KEYMATERIAL || zzhsyVar.zzb().zzc() == zzhsp.SYMMETRIC || zzhsyVar.zzb().zzc() == zzhsp.ASYMMETRIC_PRIVATE) {
                            throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", zzhsyVar.zzb().zzc().name(), zzhsyVar.zzb().zza()));
                        }
                    }
                    return zzheb.zza(zzhszVarZze);
                } catch (zziet unused) {
                    throw new GeneralSecurityException("invalid keyset");
                }
            } catch (zziet unused2) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IOException unused3) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }
}
