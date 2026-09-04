package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgvq extends AbstractSet {
    final /* synthetic */ zzgvt zza;

    /* synthetic */ zzgvq(zzgvt zzgvtVar, byte[] bArr) {
        Objects.requireNonNull(zzgvtVar);
        this.zza = zzgvtVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzgvt zzgvtVar = this.zza;
        Map mapZzc = zzgvtVar.zzc();
        return mapZzc != null ? mapZzc.keySet().iterator() : new zzgvl(zzgvtVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zzgvt zzgvtVar = this.zza;
        Map mapZzc = zzgvtVar.zzc();
        if (mapZzc != null) {
            return mapZzc.keySet().remove(obj);
        }
        return zzgvtVar.zzj(obj) != zzgvt.zzd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
