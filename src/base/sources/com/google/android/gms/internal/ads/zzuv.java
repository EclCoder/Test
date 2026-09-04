package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzuv extends Handler {
    final /* synthetic */ zzux zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzuv(zzux zzuxVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(zzuxVar);
        this.zza = zzuxVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.zza.zzh(message);
    }
}
