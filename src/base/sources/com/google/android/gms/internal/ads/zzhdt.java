package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhdt {
    static final zzhst zza(zzheh zzhehVar) {
        try {
            return ((zzhnn) zzhmr.zza().zzk(null, zzhnn.class)).zzc();
        } catch (GeneralSecurityException e10) {
            throw new zzhny("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e10);
        }
    }

    public static final zzheh zzb(zzheh zzhehVar) {
        return zzhehVar != null ? zzhehVar : zzhen.zzb(zza(null).zzaN());
    }
}
