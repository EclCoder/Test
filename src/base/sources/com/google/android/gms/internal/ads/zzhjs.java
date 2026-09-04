package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzhjs extends zzhjp {
    public zzhjs(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzhjp
    final int[] zza(int[] iArr, int i10) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        zzhjn.zza(iArr2, zzhjn.zze(this.zza, iArr));
        iArr2[12] = i10;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzhjp
    final int zzb() {
        return 24;
    }
}
