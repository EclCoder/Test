package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgun extends zzgxp {
    final /* synthetic */ zzgup zza;

    zzgun(zzgup zzgupVar) {
        Objects.requireNonNull(zzgupVar);
        this.zza = zzgupVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return zzgvk.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzguo(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        zzgup zzgupVar = this.zza;
        zzgupVar.zzb.zzn(entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    final Map zza() {
        return this.zza;
    }
}
