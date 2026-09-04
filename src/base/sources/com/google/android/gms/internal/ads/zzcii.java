package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcii implements zzimg {
    private final ByteBuffer zza;

    zzcii(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.duplicate();
    }

    @Override // com.google.android.gms.internal.ads.zzimg
    public final int zza(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.zza;
        if (byteBuffer2.remaining() == 0 && byteBuffer.remaining() > 0) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), byteBuffer2.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer2.get(bArr);
        byteBuffer.put(bArr);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzimg
    public final long zzb() {
        return this.zza.limit();
    }

    @Override // com.google.android.gms.internal.ads.zzimg
    public final long zzc() {
        return this.zza.position();
    }

    @Override // com.google.android.gms.internal.ads.zzimg
    public final void zzd(long j10) {
        this.zza.position((int) j10);
    }

    @Override // com.google.android.gms.internal.ads.zzimg
    public final ByteBuffer zze(long j10, long j11) {
        ByteBuffer byteBuffer = this.zza;
        int iPosition = byteBuffer.position();
        byteBuffer.position((int) j10);
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.limit((int) j11);
        byteBuffer.position(iPosition);
        return byteBufferSlice;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
