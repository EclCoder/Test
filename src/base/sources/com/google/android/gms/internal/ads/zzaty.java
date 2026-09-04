package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzaty extends FilterInputStream {
    private final long zza;
    private long zzb;

    zzaty(InputStream inputStream, long j10) {
        super(inputStream);
        this.zza = j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i10 = super.read();
        if (i10 != -1) {
            this.zzb++;
        }
        return i10;
    }

    final long zza() {
        return this.zza - this.zzb;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = super.read(bArr, i10, i11);
        if (i12 != -1) {
            this.zzb += (long) i12;
        }
        return i12;
    }
}
