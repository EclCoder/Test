package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class zzgux extends zzgus implements SortedSet {
    final /* synthetic */ zzgvc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgux(zzgvc zzgvcVar, SortedMap sortedMap) {
        super(zzgvcVar, sortedMap);
        Objects.requireNonNull(zzgvcVar);
        this.zzc = zzgvcVar;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return zza().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return zza().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new zzgux(this.zzc, zza().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return zza().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new zzgux(this.zzc, zza().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new zzgux(this.zzc, zza().tailMap(obj));
    }

    SortedMap zza() {
        return (SortedMap) this.zzd;
    }
}
