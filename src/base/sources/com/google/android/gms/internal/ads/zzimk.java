package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzimk implements Iterator {
    int zza = 0;
    final /* synthetic */ zziml zzb;

    zzimk(zziml zzimlVar) {
        this.zzb = zzimlVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zza;
        zziml zzimlVar = this.zzb;
        return i10 < zzimlVar.zza.size() || zzimlVar.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.zza;
        zziml zzimlVar = this.zzb;
        List list = zzimlVar.zza;
        if (i10 >= list.size()) {
            list.add(zzimlVar.zzb.next());
            return next();
        }
        int i11 = this.zza;
        this.zza = i11 + 1;
        return list.get(i11);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
