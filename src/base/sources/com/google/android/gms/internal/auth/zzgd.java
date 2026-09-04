package com.google.android.gms.internal.auth;

import com.google.firebase.installations.ktx.gUsI.dmHT;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgd {
    private static final zzgc zza;
    private static final zzgc zzb;

    static {
        zzgc zzgcVar = null;
        try {
            zzgcVar = (zzgc) Class.forName(dmHT.Bcpc).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzgcVar;
        zzb = new zzgc();
    }

    static zzgc zza() {
        return zza;
    }

    static zzgc zzb() {
        return zzb;
    }
}
