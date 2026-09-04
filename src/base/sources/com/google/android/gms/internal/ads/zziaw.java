package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zziaw {
    public static String zza(zziai zziaiVar) throws GeneralSecurityException {
        zziax.zzb(zziaiVar);
        return zziaiVar.toString().concat("withECDSA");
    }

    public static String zzb(zziai zziaiVar) throws GeneralSecurityException {
        int iOrdinal = zziaiVar.ordinal();
        if (iOrdinal == 0) {
            return "SHA-1";
        }
        if (iOrdinal == 1) {
            return "SHA-224";
        }
        if (iOrdinal == 2) {
            return "SHA-256";
        }
        if (iOrdinal == 3) {
            return "SHA-384";
        }
        if (iOrdinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(zziaiVar.toString()));
    }
}
