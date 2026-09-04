package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhqb extends zzhqe {
    private final zzhqc zza;
    private final zzibb zzb;

    private zzhqb(zzhqc zzhqcVar, zzibb zzibbVar) {
        this.zza = zzhqcVar;
        this.zzb = zzibbVar;
    }

    public static zzhqb zzc(zzhqc zzhqcVar, zzibb zzibbVar) throws GeneralSecurityException {
        if (zzhqcVar.zzc() == zzibbVar.zzd()) {
            return new zzhqb(zzhqcVar, zzibbVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // com.google.android.gms.internal.ads.zzhqe, com.google.android.gms.internal.ads.zzhdq
    public final /* synthetic */ zzheh zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhdq
    public final Integer zzb() {
        return null;
    }

    public final zzibb zzd() {
        return this.zzb;
    }
}
