package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzmx extends zzwy {
    private final zzbe zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzmx(zzmy zzmyVar, zzbf zzbfVar) {
        super(zzbfVar);
        Objects.requireNonNull(zzmyVar);
        this.zzc = new zzbe();
    }

    @Override // com.google.android.gms.internal.ads.zzwy, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i10, zzbd zzbdVar, boolean z10) {
        zzbf zzbfVar = this.zzb;
        zzbd zzbdVarZzd = zzbfVar.zzd(i10, zzbdVar, z10);
        if (zzbfVar.zzb(zzbdVarZzd.zzc, this.zzc, 0L).zzb()) {
            zzbdVarZzd.zza(zzbdVar.zza, zzbdVar.zzb, zzbdVar.zzc, zzbdVar.zzd, 0L, zzc.zza, true);
            return zzbdVarZzd;
        }
        zzbdVarZzd.zzf = true;
        return zzbdVarZzd;
    }
}
