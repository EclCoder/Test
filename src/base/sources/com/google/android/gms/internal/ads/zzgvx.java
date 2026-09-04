package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgvx extends zzgvz {
    zzgvx() {
        super(null);
    }

    static final zzgvz zzf(int i10) {
        if (i10 < 0) {
            return zzgvz.zzb;
        }
        return i10 > 0 ? zzgvz.zzc : zzgvz.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgvz
    public final zzgvz zza(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgvz
    public final zzgvz zzb(int i10, int i11) {
        return zzf(Integer.compare(i10, i11));
    }

    @Override // com.google.android.gms.internal.ads.zzgvz
    public final zzgvz zzc(boolean z10, boolean z11) {
        return zzf(Boolean.compare(z11, z10));
    }

    @Override // com.google.android.gms.internal.ads.zzgvz
    public final zzgvz zzd(boolean z10, boolean z11) {
        return zzf(Boolean.compare(z10, z11));
    }

    @Override // com.google.android.gms.internal.ads.zzgvz
    public final int zze() {
        return 0;
    }
}
