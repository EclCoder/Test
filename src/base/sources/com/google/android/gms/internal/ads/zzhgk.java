package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhgk {
    public static final /* synthetic */ int zza = 0;
    private static final zzhnf zzb = zzhnf.zzd(zzhgj.zza, zzhgh.class, zzhdi.class);
    private static final zzhln zzc = zzhgi.zza;
    private static final zzhdr zzd = zzhlw.zze("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzhdi.class, zzhsp.SYMMETRIC, zzhro.zze());

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (!zzhkr.zza(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i10 = zzhjm.zza;
        zzhjm.zza(zzhmr.zza());
        zzhmo.zza().zzb(zzb);
        zzhmi.zza().zzb(zzc, zzhgm.class);
        zzhmn zzhmnVarZza = zzhmn.zza();
        HashMap map = new HashMap();
        map.put("CHACHA20_POLY1305", zzhgm.zzb(zzhgl.zza));
        map.put("CHACHA20_POLY1305_RAW", zzhgm.zzb(zzhgl.zzc));
        zzhmnVarZza.zzd(Collections.unmodifiableMap(map));
        zzhlo.zza().zzb(zzd, true);
    }
}
