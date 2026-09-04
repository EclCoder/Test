package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.zzgam;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzf extends zzgam {
    public zzf(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdMobHandler.handleMessage");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgam
    protected final void zza(Message message) {
        try {
            super.zza(message);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzt.zzc();
            zzs.zzP(com.google.android.gms.ads.internal.zzt.zzh().zzp(), th2);
            throw th2;
        }
    }
}
