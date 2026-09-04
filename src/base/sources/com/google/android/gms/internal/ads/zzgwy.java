package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgwy extends zzgww {
    private final transient zzgwz zza;

    zzgwy(zzgwz zzgwzVar) {
        this.zza = zzgwzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzgwz zzgwzVar = this.zza;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) zzgwzVar.zzu().get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgww, com.google.android.gms.internal.ads.zzgwi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgwq(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size;
    }

    @Override // com.google.android.gms.internal.ads.zzgww, com.google.android.gms.internal.ads.zzgwi
    /* JADX INFO: renamed from: zza */
    public final zzgza iterator() {
        return new zzgwq(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgwi
    final boolean zzf() {
        return false;
    }
}
