package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbhg extends PushbackInputStream {
    final /* synthetic */ zzbhj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbhg(zzbhj zzbhjVar, InputStream inputStream, int i10) {
        super(inputStream, 1);
        Objects.requireNonNull(zzbhjVar);
        this.zza = zzbhjVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.zza.zzc.zzb();
        super.close();
    }
}
