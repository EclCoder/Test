package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfcc implements zzfck {
    private final boolean zza;

    zzfcc(zzfia zzfiaVar) {
        this.zza = zzfiaVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final ListenableFuture zza() {
        return zzhbw.zza(new zzfcb(this.zza, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 36;
    }
}
