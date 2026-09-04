package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgwr extends zzgza {
    final Iterator zza;
    Iterator zzb;
    final /* synthetic */ zzgwu zzc;

    zzgwr(zzgwu zzgwuVar) {
        Objects.requireNonNull(zzgwuVar);
        this.zzc = zzgwuVar;
        this.zza = ((zzgwm) zzgwuVar.map.values()).listIterator(0);
        this.zzb = zzgxc.zza;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzb.hasNext()) {
            this.zzb = ((zzgwi) this.zza.next()).iterator();
        }
        return this.zzb.next();
    }
}
