package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcpt implements zzehi {
    private final zzcox zza;
    private Context zzb;

    /* synthetic */ zzcpt(zzcox zzcoxVar, byte[] bArr) {
        this.zza = zzcoxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehi
    public final zzehj zza() {
        zzinc.zzc(this.zzb, Context.class);
        return new zzcpu(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzehi
    public final /* bridge */ /* synthetic */ zzehi zzb(Context context) {
        this.zzb = context;
        return this;
    }
}
