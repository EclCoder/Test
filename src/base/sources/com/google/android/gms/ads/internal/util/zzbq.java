package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzgam;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbq {
    private HandlerThread zza = null;
    private Handler zzb = null;
    private int zzc = 0;
    private final Object zzd = new Object();

    public final Looper zza() {
        Looper looper;
        Object obj = this.zzd;
        synchronized (obj) {
            try {
                if (this.zzc != 0) {
                    Preconditions.checkNotNull(this.zza, "Invalid state: handlerThread should already been initialized.");
                } else if (this.zza == null) {
                    zze.zza("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.zza = handlerThread;
                    handlerThread.start();
                    this.zzb = new zzgam(this.zza.getLooper());
                    zze.zza("Looper thread started.");
                } else {
                    zze.zza("Resuming the looper thread");
                    obj.notifyAll();
                }
                this.zzc++;
                looper = this.zza.getLooper();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public final Handler zzb() {
        return this.zzb;
    }
}
