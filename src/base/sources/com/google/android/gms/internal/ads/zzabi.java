package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzabi {
    public final int zza;
    public final zznd[] zzb;
    public final zzaba[] zzc;
    public final zzbn zzd;
    public final Object zze;

    public zzabi(zznd[] zzndVarArr, zzaba[] zzabaVarArr, zzbn zzbnVar, Object obj) {
        int length = zzndVarArr.length;
        zzgtj.zza(length == zzabaVarArr.length);
        this.zzb = zzndVarArr;
        this.zzc = (zzaba[]) zzabaVarArr.clone();
        this.zzd = zzbnVar;
        this.zze = obj;
        this.zza = length;
    }

    public final boolean zza(int i10) {
        return this.zzb[i10] != null;
    }

    public final boolean zzb(zzabi zzabiVar, int i10) {
        return zzabiVar != null && Objects.equals(this.zzb[i10], zzabiVar.zzb[i10]) && Objects.equals(this.zzc[i10], zzabiVar.zzc[i10]);
    }
}
