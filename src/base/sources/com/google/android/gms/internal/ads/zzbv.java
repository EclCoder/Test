package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbv {
    public static final zzbv zza = new zzbv(0, 0, 1.0f);
    public final int zzb;
    public final int zzc;
    public final float zzd;

    static {
        String str = zzfl.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public zzbv(int i10, int i11, float f10) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbv) {
            zzbv zzbvVar = (zzbv) obj;
            if (this.zzb == zzbvVar.zzb && this.zzc == zzbvVar.zzc && this.zzd == zzbvVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zzb + Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE) * 31) + this.zzc) * 31) + Float.floatToRawIntBits(this.zzd);
    }
}
