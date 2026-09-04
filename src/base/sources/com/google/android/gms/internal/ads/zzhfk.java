package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzhfk implements zzhln {
    static final /* synthetic */ zzhfk zza = new zzhfk();

    private /* synthetic */ zzhfk() {
    }

    @Override // com.google.android.gms.internal.ads.zzhln
    public final /* synthetic */ zzhdq zza(zzheh zzhehVar, Integer num) throws GeneralSecurityException {
        zzhfo zzhfoVar = (zzhfo) zzhehVar;
        int i10 = zzhfl.zza;
        if (zzhfoVar.zzc() == 24) {
            throw new GeneralSecurityException("192 bit AES EAX Parameters are not valid");
        }
        zzhfh zzhfhVar = new zzhfh(null);
        zzhfhVar.zza(zzhfoVar);
        zzhfhVar.zzc(num);
        zzhfhVar.zzb(zzibb.zzb(zzhfoVar.zzc()));
        return zzhfhVar.zzd();
    }
}
