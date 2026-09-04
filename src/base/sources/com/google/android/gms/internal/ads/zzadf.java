package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzadf extends HandlerThread implements Handler.Callback {
    private zzdv zza;
    private Handler zzb;
    private Error zzc;
    private RuntimeException zzd;
    private zzadg zze;

    public zzadf() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 == 1) {
                try {
                    try {
                        int i11 = message.arg1;
                        zzdv zzdvVar = this.zza;
                        if (zzdvVar == null) {
                            throw null;
                        }
                        zzdvVar.zza(i11);
                        this.zze = new zzadg(this, this.zza.zzc(), i11 != 0, null);
                        synchronized (this) {
                            notify();
                        }
                    } catch (zzdw e10) {
                        zzeg.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                        this.zzd = new IllegalStateException(e10);
                        synchronized (this) {
                            notify();
                        }
                    }
                } catch (Error e11) {
                    zzeg.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.zzc = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e12) {
                    zzeg.zzf("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.zzd = e12;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i10 == 2) {
                try {
                    zzdv zzdvVar2 = this.zza;
                    if (zzdvVar2 == null) {
                        throw null;
                    }
                    zzdvVar2.zzb();
                    return true;
                } catch (Throwable th2) {
                    try {
                        zzeg.zzf("PlaceholderSurface", "Failed to release placeholder surface", th2);
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th3) {
            synchronized (this) {
                notify();
                throw th3;
            }
        }
    }

    public final zzadg zza(int i10) {
        boolean z10;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzdv(this.zzb, null);
        synchronized (this) {
            z10 = false;
            this.zzb.obtainMessage(1, i10, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzadg zzadgVar = this.zze;
        zzadgVar.getClass();
        return zzadgVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
