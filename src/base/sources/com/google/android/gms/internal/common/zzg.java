package com.google.android.gms.internal.common;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class zzg extends Handler {
    private final Looper zza;

    public zzg() {
        this.zza = Looper.getMainLooper();
    }

    public zzg(Looper looper) {
        super(looper);
        this.zza = Looper.getMainLooper();
    }

    public zzg(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.zza = Looper.getMainLooper();
    }
}
