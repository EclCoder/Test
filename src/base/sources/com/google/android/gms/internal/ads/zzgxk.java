package com.google.android.gms.internal.ads;

import java.util.ListIterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgxk extends zzgyz {
    final /* synthetic */ zzgxl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgxk(zzgxl zzgxlVar, ListIterator listIterator) {
        super(listIterator);
        Objects.requireNonNull(zzgxlVar);
        this.zza = zzgxlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyy
    final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
