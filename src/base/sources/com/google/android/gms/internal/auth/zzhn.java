package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzhn {
    public static final /* synthetic */ int zza = 0;
    private static final zzhl zzb;

    static {
        if (zzhj.zzu() && zzhj.zzv()) {
            int i10 = zzds.zza;
        }
        zzb = new zzhm();
    }

    static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        byte b10 = bArr[i10 - 1];
        if (i12 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i12 == 1) {
            byte b11 = bArr[i10];
            if (b10 > -12 || b11 > -65) {
                return -1;
            }
            return (b11 << 8) ^ b10;
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        byte b12 = bArr[i10];
        byte b13 = bArr[i10 + 1];
        if (b10 > -12 || b12 > -65 || b13 > -65) {
            return -1;
        }
        return (b13 << 16) ^ ((b12 << 8) ^ b10);
    }

    static boolean zzb(byte[] bArr) {
        return zzb.zzb(bArr, 0, bArr.length);
    }

    static boolean zzc(byte[] bArr, int i10, int i11) {
        return zzb.zzb(bArr, i10, i11);
    }
}
