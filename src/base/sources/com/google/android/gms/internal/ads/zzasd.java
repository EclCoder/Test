package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzasd implements zzase {
    private final ByteBuffer zza;

    public zzasd(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.slice();
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final long zza() {
        return this.zza.capacity();
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final void zzb(MessageDigest[] messageDigestArr, long j10, int i10) {
        ByteBuffer byteBufferSlice;
        ByteBuffer byteBuffer = this.zza;
        synchronized (byteBuffer) {
            int i11 = (int) j10;
            byteBuffer.position(i11);
            byteBuffer.limit(i11 + i10);
            byteBufferSlice = byteBuffer.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }
}
