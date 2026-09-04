package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbym extends zzbne {
    final /* synthetic */ zzbyo zza;

    /* synthetic */ zzbym(zzbyo zzbyoVar, byte[] bArr) {
        Objects.requireNonNull(zzbyoVar);
        this.zza = zzbyoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnf
    public final void zze(zzbmv zzbmvVar, String str) {
        zzbyo zzbyoVar = this.zza;
        if (zzbyoVar.zze() == null) {
            return;
        }
        zzbyoVar.zze().onCustomClick(zzbyoVar.zzc(zzbmvVar), str);
    }
}
