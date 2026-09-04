package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzeps extends zzbwx {
    private final zzelv zza;

    /* synthetic */ zzeps(zzept zzeptVar, zzelv zzelvVar, byte[] bArr) {
        Objects.requireNonNull(zzeptVar);
        this.zza = zzelvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zze() {
        ((zzenh) this.zza.zzc).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzf(String str) {
        ((zzenh) this.zza.zzc).zzw(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        ((zzenh) this.zza.zzc).zzx(zzeVar);
    }
}
