package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzyr extends zzwy {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzyr(zzyu zzyuVar, zzbf zzbfVar) {
        super(zzbfVar);
        Objects.requireNonNull(zzyuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwy, com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i10, zzbe zzbeVar, long j10) {
        this.zzb.zzb(i10, zzbeVar, j10);
        zzbeVar.zzk = true;
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwy, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i10, zzbd zzbdVar, boolean z10) {
        this.zzb.zzd(i10, zzbdVar, z10);
        zzbdVar.zzf = true;
        return zzbdVar;
    }
}
