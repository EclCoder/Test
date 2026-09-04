package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzck extends zzca {
    final /* synthetic */ zzcl zza;

    zzck(zzcl zzclVar) {
        Objects.requireNonNull(zzclVar);
        this.zza = zzclVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzcl zzclVar = this.zza;
        zzbl.zza(i10, zzclVar.zzc, "index");
        int i11 = i10 + i10;
        Object obj = zzclVar.zzb[i11];
        Objects.requireNonNull(obj);
        Object obj2 = zzclVar.zzb[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    public final boolean zzf() {
        return true;
    }
}
