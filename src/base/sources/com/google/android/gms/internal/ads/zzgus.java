package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class zzgus extends zzgxq {
    final /* synthetic */ zzgvc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgus(zzgvc zzgvcVar, Map map) {
        super(map);
        Objects.requireNonNull(zzgvcVar);
        this.zza = zzgvcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxq, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zzgxf.zzb(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.zzd.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.zzd.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zzd.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgxq, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzgur(this, this.zzd.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzgxq, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.zzd.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        zzgvc zzgvcVar = this.zza;
        zzgvcVar.zzq(zzgvcVar.zzp() - size);
        return size > 0;
    }
}
