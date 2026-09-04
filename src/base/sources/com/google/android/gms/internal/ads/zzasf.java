package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzasf implements zzase {
    private final FileChannel zza;
    private final long zzb;
    private final long zzc;

    public zzasf(FileChannel fileChannel, long j10, long j11) {
        this.zza = fileChannel;
        this.zzb = j10;
        this.zzc = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final void zzb(MessageDigest[] messageDigestArr, long j10, int i10) throws IOException {
        MappedByteBuffer map = this.zza.map(FileChannel.MapMode.READ_ONLY, this.zzb + j10, i10);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
