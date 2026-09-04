package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzhfs implements zzhln {
    static final /* synthetic */ zzhfs zza = new zzhfs();

    private /* synthetic */ zzhfs() {
    }

    @Override // com.google.android.gms.internal.ads.zzhln
    public final /* synthetic */ zzhdq zza(zzheh zzhehVar, Integer num) throws GeneralSecurityException {
        zzhfx zzhfxVar = (zzhfx) zzhehVar;
        int i10 = zzhfu.zza;
        if (zzhfxVar.zzc() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        zzhfp zzhfpVar = new zzhfp(null);
        zzhfpVar.zza(zzhfxVar);
        zzhfpVar.zzc(num);
        zzhfpVar.zzb(zzibb.zzb(zzhfxVar.zzc()));
        return zzhfpVar.zzd();
    }
}
