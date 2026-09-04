package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcm extends zzcf {
    private final transient zzcd zza;
    private final transient zzca zzb;

    zzcm(zzcd zzcdVar, zzca zzcaVar) {
        this.zza = zzcdVar;
        this.zzb = zzcaVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcf, com.google.android.gms.internal.play_billing.zzbx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    final int zza(Object[] objArr, int i10) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzcf, com.google.android.gms.internal.play_billing.zzbx
    public final zzca zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzcf, com.google.android.gms.internal.play_billing.zzbx
    /* JADX INFO: renamed from: zze */
    public final zzcs iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbx
    final boolean zzf() {
        throw null;
    }
}
