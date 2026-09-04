package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhhz {
    private static final zzhln zza = zzhhy.zza;
    private static final zzhnf zzb = zzhnf.zzd(zzhhx.zza, zzhhw.class, zzhdi.class);

    public static void zza(boolean z10) {
        int i10 = zzhke.zza;
        zzhke.zza(zzhmr.zza());
        zzhmn zzhmnVarZza = zzhmn.zza();
        HashMap map = new HashMap();
        map.put("XAES_256_GCM_192_BIT_NONCE", zzhhv.zzg);
        map.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzhhv.zzh);
        map.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzhhv.zzi);
        map.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzhhv.zzj);
        zzhmnVarZza.zzd(Collections.unmodifiableMap(map));
        zzhmo.zza().zzb(zzb);
        zzhmi.zza().zzb(zza, zzhib.class);
    }
}
