package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzhez implements zzhln {
    static final /* synthetic */ zzhez zza = new zzhez();

    private /* synthetic */ zzhez() {
    }

    @Override // com.google.android.gms.internal.ads.zzhln
    public final /* synthetic */ zzhdq zza(zzheh zzhehVar, Integer num) throws GeneralSecurityException {
        zzhfg zzhfgVar = (zzhfg) zzhehVar;
        int i10 = zzhfc.zza;
        if (zzhfgVar.zzc() != 16 && zzhfgVar.zzc() != 32) {
            throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
        }
        zzhex zzhexVar = new zzhex(null);
        zzhexVar.zza(zzhfgVar);
        zzhexVar.zzd(num);
        zzhexVar.zzb(zzibb.zzb(zzhfgVar.zzc()));
        zzhexVar.zzc(zzibb.zzb(zzhfgVar.zzd()));
        return zzhexVar.zze();
    }
}
