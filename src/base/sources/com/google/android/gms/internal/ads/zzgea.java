package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgea {
    public static String zza(byte[] bArr, boolean z10) {
        return zzc(z10).zzj(bArr, 0, bArr.length);
    }

    public static byte[] zzb(String str, boolean z10) {
        byte[] bArrZzk = zzc(z10).zzk(str);
        if (bArrZzk.length != 0 || str.length() <= 0) {
            return bArrZzk;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    private static zzgzh zzc(boolean z10) {
        return z10 ? zzgzh.zzm().zzh() : zzgzh.zzl();
    }
}
