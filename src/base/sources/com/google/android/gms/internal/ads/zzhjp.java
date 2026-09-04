package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzhjp {
    int[] zza;
    private final int zzb;

    public zzhjp(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = zzhjn.zzd(bArr);
        this.zzb = i10;
    }

    abstract int[] zza(int[] iArr, int i10);

    abstract int zzb();

    public final byte[] zzc(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != zzb()) {
            int iZzb = zzb();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb).length() + 36);
            sb2.append("The nonce length (in bytes) must be ");
            sb2.append(iZzb);
            throw new GeneralSecurityException(sb2.toString());
        }
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining / 64;
        for (int i11 = 0; i11 < i10 + 1; i11++) {
            ByteBuffer byteBufferZzd = zzd(bArr, this.zzb + i11);
            if (i11 == i10) {
                zzhzl.zzc(byteBufferAllocate, byteBuffer, byteBufferZzd, iRemaining % 64);
            } else {
                zzhzl.zzc(byteBufferAllocate, byteBuffer, byteBufferZzd, 64);
            }
        }
        return byteBufferAllocate.array();
    }

    final ByteBuffer zzd(byte[] bArr, int i10) {
        int[] iArrZza = zza(zzhjn.zzd(bArr), i10);
        int[] iArr = (int[]) iArrZza.clone();
        zzhjn.zzb(iArr);
        for (int i11 = 0; i11 < 16; i11++) {
            iArrZza[i11] = iArrZza[i11] + iArr[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZza, 0, 16);
        return byteBufferOrder;
    }
}
