package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzher implements zzhdn {
    zzher() {
    }

    @Override // com.google.android.gms.internal.ads.zzhdn
    public final Object zza(zzhec zzhecVar, Class cls) throws GeneralSecurityException {
        if (cls == zzhdi.class) {
            return cls.cast(zzhjy.zza(zzhecVar, zzheq.zza));
        }
        throw new GeneralSecurityException("AeadConfigurationV1 can only create AEADs");
    }
}
