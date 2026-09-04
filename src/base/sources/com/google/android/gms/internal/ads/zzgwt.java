package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgwt extends zzgwi {
    private final transient zzgwu zza;

    zzgwt(zzgwu zzgwuVar) {
        this.zza = zzgwuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.zzr(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgwi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgwr(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size;
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    /* JADX INFO: renamed from: zza */
    public final zzgza iterator() {
        return new zzgwr(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    final boolean zzf() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgwi
    final int zzg(Object[] objArr, int i10) {
        zzgzb zzgzbVarListIterator = ((zzgwm) this.zza.map.values()).listIterator(0);
        while (zzgzbVarListIterator.hasNext()) {
            i10 = ((zzgwi) zzgzbVarListIterator.next()).zzg(objArr, i10);
        }
        return i10;
    }
}
