package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.g0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzwi implements Runnable, zzwt {
    private zzws zza;
    private final boolean zzb = zzrn.zza(Thread.currentThread());
    private boolean zzc;
    private boolean zzd;
    private boolean zze;

    zzwi(zzws zzwsVar, boolean z10) {
        this.zze = false;
        this.zza = zzwsVar;
        this.zze = z10;
    }

    private final void zzb() {
        this.zzc = true;
        if (!this.zzb || this.zzd) {
            return;
        }
        zzrn.zza(Thread.currentThread());
    }

    @Override // com.google.android.gms.internal.measurement.zzwt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zzws zzwsVar = this.zza;
        try {
            this.zza = null;
            if (!this.zzd) {
                if (this.zzc) {
                    throw new IllegalStateException("Span was already closed!");
                }
                zzb();
            }
            if (zzwsVar != null) {
                zzwsVar.close();
            }
            if (this.zze) {
                zzvy.zzc(zzvy.zzd(), zzwg.zza);
            }
        } catch (Throwable th2) {
            if (zzwsVar != null) {
                try {
                    zzwsVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.zzc && this.zzd) {
            zzb();
        } else {
            zzrn.zzb().post(zzwh.zza);
        }
    }

    public final ListenableFuture zza(ListenableFuture listenableFuture) {
        if (this.zzc) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (this.zzd) {
            throw new IllegalStateException("Signal is already attached to future");
        }
        this.zzd = true;
        listenableFuture.addListener(this, g0.a());
        return listenableFuture;
    }
}
