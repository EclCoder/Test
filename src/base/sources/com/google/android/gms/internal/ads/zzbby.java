package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzbby extends BroadcastReceiver {
    final /* synthetic */ zzbbz zza;

    zzbby(zzbbz zzbbzVar) {
        Objects.requireNonNull(zzbbzVar);
        this.zza = zzbbzVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("NrJHJFPBCcwTkldS", new Object[]{this, context, intent});
    }
}
