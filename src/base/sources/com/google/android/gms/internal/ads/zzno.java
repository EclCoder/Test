package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzno {
    private final zzs zza;
    private final SparseArray zzb;

    public zzno(zzs zzsVar, SparseArray sparseArray) {
        this.zza = zzsVar;
        SparseArray sparseArray2 = new SparseArray(zzsVar.zzb());
        for (int i10 = 0; i10 < zzsVar.zzb(); i10++) {
            int iZzc = zzsVar.zzc(i10);
            zznn zznnVar = (zznn) sparseArray.get(iZzc);
            zznnVar.getClass();
            sparseArray2.append(iZzc, zznnVar);
        }
        this.zzb = sparseArray2;
    }

    public final zznn zza(int i10) {
        zznn zznnVar = (zznn) this.zzb.get(i10);
        zznnVar.getClass();
        return zznnVar;
    }

    public final boolean zzb(int i10) {
        return this.zza.zza(i10);
    }

    public final int zzc() {
        return this.zza.zzb();
    }

    public final int zzd(int i10) {
        return this.zza.zzc(i10);
    }
}
