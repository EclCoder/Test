package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzieo extends AbstractList {
    private final zziem zza;
    private final zzien zzb;

    public zzieo(zziem zziemVar, zzien zzienVar) {
        this.zza = zziemVar;
        this.zzb = zzienVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return this.zzb.zzb(this.zza.zzf(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
