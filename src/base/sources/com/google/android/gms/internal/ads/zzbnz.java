package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbnz extends zzbne {
    final /* synthetic */ zzbob zza;

    /* synthetic */ zzbnz(zzbob zzbobVar, byte[] bArr) {
        Objects.requireNonNull(zzbobVar);
        this.zza = zzbobVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final void zze(zzbmv zzbmvVar, String str) {
        zzbob zzbobVar = this.zza;
        if (zzbobVar.zzd() == null) {
            return;
        }
        zzbobVar.zzd().zzc(zzbobVar.zze(zzbmvVar), str);
    }
}
