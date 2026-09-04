package com.google.android.gms.internal.common;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaj extends zzah {
    static final zzah zza = new zzaj(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    zzaj(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzr.zzb(i10, this.zzc, "index");
        Object obj = this.zzb[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.common.zzac
    final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzah, com.google.android.gms.internal.common.zzac
    final int zzg(Object[] objArr, int i10) {
        Object[] objArr2 = this.zzb;
        int i11 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, 0, i11);
        return i11;
    }
}
