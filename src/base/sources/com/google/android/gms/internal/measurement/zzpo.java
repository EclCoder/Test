package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzpo {
    private final AtomicReferenceArray zza;
    private final zzog zzb;

    public zzpo(zzog zzogVar, int i10) {
        this.zzb = zzogVar;
        this.zza = new AtomicReferenceArray(i10);
    }

    public final zzom zza(int i10, String str, boolean z10) {
        AtomicReferenceArray atomicReferenceArray = this.zza;
        zzom zzomVar = (zzom) atomicReferenceArray.get(i10);
        if (zzomVar != null) {
            return zzomVar;
        }
        zzom zzomVarZza = this.zzb.zza(str, z10);
        return !a.a(atomicReferenceArray, i10, null, zzomVarZza) ? (zzom) p.o((zzom) atomicReferenceArray.get(i10)) : zzomVarZza;
    }

    public final zzom zzb(int i10, String str, long j10) {
        AtomicReferenceArray atomicReferenceArray = this.zza;
        zzom zzomVar = (zzom) atomicReferenceArray.get(i10);
        if (zzomVar != null) {
            return zzomVar;
        }
        zzom zzomVarZzb = this.zzb.zzb(str, j10);
        return !a.a(atomicReferenceArray, i10, null, zzomVarZzb) ? (zzom) p.o((zzom) atomicReferenceArray.get(i10)) : zzomVarZzb;
    }

    public final zzom zzc(int i10, String str, double d10) {
        AtomicReferenceArray atomicReferenceArray = this.zza;
        zzom zzomVarZzc = (zzom) atomicReferenceArray.get(2);
        if (zzomVarZzc == null) {
            zzomVarZzc = this.zzb.zzc("measurement.test.double_flag", -3.0d);
            if (!a.a(atomicReferenceArray, 2, null, zzomVarZzc)) {
                return (zzom) p.o((zzom) atomicReferenceArray.get(2));
            }
        }
        return zzomVarZzc;
    }

    public final zzom zzd(int i10, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = this.zza;
        zzom zzomVar = (zzom) atomicReferenceArray.get(i10);
        if (zzomVar != null) {
            return zzomVar;
        }
        zzom zzomVarZzd = this.zzb.zzd(str, str2);
        return !a.a(atomicReferenceArray, i10, null, zzomVarZzd) ? (zzom) p.o((zzom) atomicReferenceArray.get(i10)) : zzomVarZzd;
    }
}
