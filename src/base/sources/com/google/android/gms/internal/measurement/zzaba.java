package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaba implements Iterator {
    final /* synthetic */ zzabb zza;
    private int zzb;

    zzaba(zzabb zzabbVar) {
        Objects.requireNonNull(zzabbVar);
        this.zza = zzabbVar;
        this.zzb = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zzb;
        zzabb zzabbVar = this.zza;
        return i10 < zzabbVar.zzc() - zzabbVar.zzb();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.zzb;
        zzabb zzabbVar = this.zza;
        if (i10 >= zzabbVar.zzc() - zzabbVar.zzb()) {
            throw new NoSuchElementException();
        }
        zzabc zzabcVar = zzabbVar.zzb;
        Object obj = zzabcVar.zzb()[zzabbVar.zzb() + i10];
        this.zzb = i10 + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
