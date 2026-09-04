package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzheq implements zzhnk {
    static final /* synthetic */ zzheq zza = new zzheq();

    private /* synthetic */ zzheq() {
    }

    @Override // com.google.android.gms.internal.ads.zzhnk
    public final /* synthetic */ Object zza(zzhdz zzhdzVar) throws GeneralSecurityException {
        zzhdq zzhdqVarZza = zzhdzVar.zza();
        if (zzhdqVarZza instanceof zzhey) {
            return zzhzu.zzb((zzhey) zzhdqVarZza);
        }
        if (zzhdqVarZza instanceof zzhfq) {
            return zzhzh.zzb((zzhfq) zzhdqVarZza);
        }
        if (zzhdqVarZza instanceof zzhfz) {
            return zzhkn.zzb((zzhfz) zzhdqVarZza);
        }
        if (zzhdqVarZza instanceof zzhfi) {
            return zzhzg.zzb((zzhfi) zzhdqVarZza);
        }
        if (zzhdqVarZza instanceof zzhgh) {
            zzhgh zzhghVar = (zzhgh) zzhdqVarZza;
            return zzhjh.zzd() ? zzhjh.zzb(zzhghVar) : zzhzm.zzb(zzhghVar);
        }
        if (zzhdqVarZza instanceof zzhic) {
            zzhic zzhicVar = (zzhic) zzhdqVarZza;
            return zzhjh.zzd() ? zzhkf.zzb(zzhicVar) : zziay.zzb(zzhicVar);
        }
        if (zzhdqVarZza instanceof zzhhw) {
            return zzhjz.zzb((zzhhw) zzhdqVarZza);
        }
        throw new GeneralSecurityException("Unknown key class: ".concat(String.valueOf(zzhdqVarZza.getClass())));
    }
}
