package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzahj {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzahj(int i10, byte[] bArr, int i11, int i12) {
        this.zza = i10;
        this.zzb = bArr;
        this.zzc = i11;
        this.zzd = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahj.class == obj.getClass()) {
            zzahj zzahjVar = (zzahj) obj;
            if (this.zza == zzahjVar.zza && this.zzc == zzahjVar.zzc && this.zzd == zzahjVar.zzd && Arrays.equals(this.zzb, zzahjVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.zza * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
