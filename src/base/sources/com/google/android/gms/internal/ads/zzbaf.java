package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbaf implements zzfyw {
    final /* synthetic */ zzfxb zza;

    zzbaf(zzbah zzbahVar, zzfxb zzfxbVar) {
        this.zza = zzfxbVar;
        Objects.requireNonNull(zzbahVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfyw
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
