package com.google.android.gms.internal.auth;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhh extends zzhi {
    zzhh(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzhj.zza) {
            zzhj.zzi(obj, j10, z10);
        } else {
            zzhj.zzj(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zzd(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final void zze(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.auth.zzhi
    public final boolean zzf(Object obj, long j10) {
        return zzhj.zza ? zzhj.zzq(obj, j10) : zzhj.zzr(obj, j10);
    }
}
