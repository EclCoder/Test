package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzad implements Iterator {
    final /* synthetic */ zzae zza;
    private int zzb;

    zzad(zzae zzaeVar) {
        Objects.requireNonNull(zzaeVar);
        this.zza = zzaeVar;
        this.zzb = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzh();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        zzae zzaeVar = this.zza;
        if (this.zzb < zzaeVar.zzh()) {
            int i10 = this.zzb;
            this.zzb = i10 + 1;
            return zzaeVar.zzl(i10);
        }
        int i11 = this.zzb;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 21);
        sb2.append("Out of bounds index: ");
        sb2.append(i11);
        throw new NoSuchElementException(sb2.toString());
    }
}
