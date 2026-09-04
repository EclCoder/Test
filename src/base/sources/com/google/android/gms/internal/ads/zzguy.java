package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class zzguy implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzguz zzc;

    zzguy(zzguz zzguzVar) {
        Objects.requireNonNull(zzguzVar);
        this.zzc = zzguzVar;
        Collection collection = zzguzVar.zzb;
        this.zzb = collection;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        zzguz zzguzVar = this.zzc;
        zzgvc zzgvcVar = zzguzVar.zze;
        zzgvcVar.zzq(zzgvcVar.zzp() - 1);
        zzguzVar.zzb();
    }

    final void zza() {
        zzguz zzguzVar = this.zzc;
        zzguzVar.zza();
        if (zzguzVar.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    zzguy(zzguz zzguzVar, Iterator it) {
        Objects.requireNonNull(zzguzVar);
        this.zzc = zzguzVar;
        this.zzb = zzguzVar.zzb;
        this.zza = it;
    }
}
