package com.google.android.gms.internal.location;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbr extends zzbs {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzbs zzc;

    zzbr(zzbs zzbsVar, int i10, int i11) {
        this.zzc = zzbsVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzbm.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzbs, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final Object[] zzb() {
        return this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.location.zzbp
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.location.zzbs
    /* JADX INFO: renamed from: zzh */
    public final zzbs subList(int i10, int i11) {
        zzbm.zzc(i10, i11, this.zzb);
        zzbs zzbsVar = this.zzc;
        int i12 = this.zza;
        return zzbsVar.subList(i10 + i12, i11 + i12);
    }
}
