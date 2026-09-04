package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zziam implements zzhqd {
    public static zzhqd zzb(zzhqb zzhqbVar) {
        zzhqd zzhqdVarZzb = zzhqh.zzb(zzhqbVar);
        try {
            return new zzial(zzhqdVarZzb, zzhqi.zzb(zzhqbVar), null);
        } catch (GeneralSecurityException unused) {
            return zzhqdVarZzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhqd
    public final byte[] zza(byte[] bArr, int i10) {
        throw null;
    }
}
