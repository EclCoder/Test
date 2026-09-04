package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzzv implements Iterator {
    final /* synthetic */ zzzw zza;
    private int zzb;

    zzzv(zzzw zzzwVar) {
        Objects.requireNonNull(zzzwVar);
        this.zza = zzzwVar;
        this.zzb = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zza.zzg();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i10 = this.zzb;
        this.zzb = i10 + 1;
        zzzy zzzyVar = this.zza.zza;
        return zzzyVar.zzd(zzzyVar.zzf()[i10] & 31);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
