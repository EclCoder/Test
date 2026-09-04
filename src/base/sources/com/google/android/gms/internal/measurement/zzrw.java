package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzrw {
    private final Context zza;
    private final zzsh zzb = new zzsh();

    /* synthetic */ zzrw(Context context, byte[] bArr) {
        zzsq.zza(context != null, "Context cannot be null", new Object[0]);
        this.zza = context.getApplicationContext();
    }

    public final zzrx zza() {
        return new zzrx(this, null);
    }

    final /* synthetic */ Context zzb() {
        return this.zza;
    }

    final /* synthetic */ zzsh zzc() {
        return this.zzb;
    }
}
