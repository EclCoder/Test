package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zzcf extends BroadcastReceiver {
    final /* synthetic */ zzcg zza;

    zzcf(zzcg zzcgVar) {
        Objects.requireNonNull(zzcgVar);
        this.zza = zzcgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("aPV0N8LaHMPHdCQr", new Object[]{this, context, intent});
    }
}
