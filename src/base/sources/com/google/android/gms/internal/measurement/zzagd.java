package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzagd extends zzagf {
    zzagd(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    public final void zza(Object obj, long j10, byte b10) {
        if (zzagg.zzb) {
            zzagg.zzC(obj, j10, b10);
        } else {
            zzagg.zzD(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    public final boolean zzb(Object obj, long j10) {
        return zzagg.zzb ? zzagg.zzt(obj, j10) : zzagg.zzu(obj, j10);
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzagg.zzb) {
            zzagg.zzC(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            zzagg.zzD(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    public final float zzd(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    public final void zze(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    public final double zzf(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.zzagf
    public final void zzg(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }
}
