package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzsj implements Closeable {
    private final Closeable zza;

    private zzsj(Closeable closeable) {
        this.zza = closeable;
    }

    public static zzsj zza(Closeable closeable) {
        return new zzsj(closeable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Closeable closeable = this.zza;
        if (closeable != null) {
            closeable.close();
        }
    }

    public final Closeable zzb() {
        return this.zza;
    }
}
