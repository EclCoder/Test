package com.google.android.gms.internal.measurement;

import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzms extends InputStream {
    final /* synthetic */ zzacv zza;

    zzms(zzmu zzmuVar, zzacv zzacvVar) {
        this.zza = zzacvVar;
        Objects.requireNonNull(zzmuVar);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (this.zza.zzK(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        int i10 = j10 > 2147483647L ? Integer.MAX_VALUE : (int) j10;
        this.zza.zzL(i10);
        return i10;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        return this.zza.zzK(bArr, i10, i11);
    }
}
