package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzatw implements zzatz {
    final /* synthetic */ File zza;

    zzatw(zzaua zzauaVar, File file) {
        this.zza = file;
        Objects.requireNonNull(zzauaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzatz
    public final File zza() {
        return this.zza;
    }
}
