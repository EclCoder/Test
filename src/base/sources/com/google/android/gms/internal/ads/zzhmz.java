package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhmz implements Iterable {
    final /* synthetic */ List zza;
    final /* synthetic */ List zzb;

    zzhmz(zzhnc zzhncVar, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
        Objects.requireNonNull(zzhncVar);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzhnb(this.zza.iterator(), this.zzb.iterator(), null);
    }
}
