package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzql extends BroadcastReceiver {
    final /* synthetic */ zzqn zza;

    /* synthetic */ zzql(zzqn zzqnVar, byte[] bArr) {
        Objects.requireNonNull(zzqnVar);
        this.zza = zzqnVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        zzqn zzqnVar = this.zza;
        zzqnVar.zzh(zzqh.zzb(context, intent, zzqnVar.zzl(), zzqnVar.zzj(), zzqnVar.zzg()));
    }
}
