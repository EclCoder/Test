package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzff implements zzdy {
    private Message zza;

    private zzff() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        this.zza = null;
        zzfg.zzo(this);
    }

    public final zzff zzb(Message message, zzfg zzfgVar) {
        this.zza = message;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.zza = null;
        zzfg.zzo(this);
        return zSendMessageAtFrontOfQueue;
    }

    /* synthetic */ zzff(byte[] bArr) {
    }
}
