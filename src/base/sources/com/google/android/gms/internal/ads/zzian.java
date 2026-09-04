package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzian extends ThreadLocal {
    final /* synthetic */ zziao zza;

    zzian(zziao zziaoVar) {
        Objects.requireNonNull(zziaoVar);
        this.zza = zziaoVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.lang.ThreadLocal
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        try {
            zzhzz zzhzzVar = zzhzz.zzb;
            zziao zziaoVar = this.zza;
            Mac mac = (Mac) zzhzzVar.zzb(zziaoVar.zzb());
            mac.init(zziaoVar.zzc());
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
