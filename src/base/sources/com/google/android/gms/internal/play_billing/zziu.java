package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zziu extends zziw {
    zziu(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.zziw
    public final double zza(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.zziw
    public final float zzb(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.zziw
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zzix.zza) {
            zzix.zzi(obj, j10, z10);
        } else {
            zzix.zzj(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zziw
    public final void zzd(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.zziw
    public final void zze(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.zziw
    public final boolean zzf(Object obj, long j10) {
        return zzix.zza ? zzix.zzq(obj, j10) : zzix.zzr(obj, j10);
    }
}
