package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Signature;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zziag implements zziah {
    @Override // com.google.android.gms.internal.ads.zziah
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
