package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzigy extends zzigz {
    zzigy(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzigz
    public final void zza(Object obj, long j10, byte b10) {
        if (zziha.zzb) {
            zziha.zzE(obj, j10, b10);
        } else {
            zziha.zzF(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigz
    public final boolean zzb(Object obj, long j10) {
        return zziha.zzb ? zziha.zzv(obj, j10) : zziha.zzw(obj, j10);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.zziha.zzx(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.zziha.zzy(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z10' boolean)' in method call: com.google.android.gms.internal.ads.zziha.zzx(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z10' boolean)' in method call: com.google.android.gms.internal.ads.zziha.zzy(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.ads.zzigz
    public final void zzc(Object obj, long j10, boolean z10) {
        if (zziha.zzb) {
            zziha.zzx(obj, j10, z10);
        } else {
            zziha.zzy(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzigz
    public final float zzd(Object obj, long j10) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.zzigz
    public final void zze(Object obj, long j10, float f10) {
        this.zza.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.zzigz
    public final double zzf(Object obj, long j10) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.ads.zzigz
    public final void zzg(Object obj, long j10, double d10) {
        this.zza.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.zzigz
    public final byte zzh(long j10) {
        return Memory.peekByte(j10);
    }
}
