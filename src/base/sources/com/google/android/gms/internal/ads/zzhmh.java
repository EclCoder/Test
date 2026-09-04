package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzhmh implements zzhln {
    static final /* synthetic */ zzhmh zza = new zzhmh();

    private /* synthetic */ zzhmh() {
    }

    @Override // com.google.android.gms.internal.ads.zzhln
    public final /* synthetic */ zzhdq zza(zzheh zzhehVar, Integer num) throws GeneralSecurityException {
        int i10 = zzhmi.zza;
        zzhst zzhstVarZzc = ((zzhma) zzhehVar).zzb().zzc();
        zzhdr zzhdrVarZzd = zzhlo.zza().zzd(zzhstVarZzc.zza());
        if (!zzhlo.zza().zze(zzhstVarZzc.zza())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        zzhsq zzhsqVarZzd = zzhdrVarZzd.zzd(zzhstVarZzc.zzb());
        return new zzhlz(zzhnm.zza(zzhsqVarZzd.zza(), zzhsqVarZzd.zzb(), zzhsqVarZzd.zzc(), zzhstVarZzc.zzc(), num), zzhdo.zza());
    }
}
