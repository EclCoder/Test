package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzhgr implements zzhne {
    static final /* synthetic */ zzhgr zza = new zzhgr();

    private /* synthetic */ zzhgr() {
    }

    @Override // com.google.android.gms.internal.ads.zzhne
    public final /* synthetic */ Object zza(zzhdq zzhdqVar) throws GeneralSecurityException {
        zzhhc zzhhcVar = (zzhhc) zzhdqVar;
        int i10 = zzhgt.zza;
        String strZzb = zzhhcVar.zze().zzb();
        zzheu zzheuVarZzd = zzhhcVar.zze().zzd();
        zzhdi zzhdiVarZzb = zzhef.zza(strZzb).zzb();
        int i11 = zzhgq.zza;
        try {
            return zzhju.zzc(new zzhgq(zzhst.zzd(zzhen.zza(zzheuVarZzd), zzido.zza()), zzhdiVarZzb), zzhhcVar.zzc());
        } catch (zziet e10) {
            throw new GeneralSecurityException(e10);
        }
    }
}
