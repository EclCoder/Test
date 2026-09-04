package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzftu implements Runnable {
    final /* synthetic */ zzfub zza;

    zzftu(zzfub zzfubVar) {
        Objects.requireNonNull(zzfubVar);
        this.zza = zzfubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfub zzfubVar = this.zza;
        if (zzfubVar.zzN() != null) {
            long jCurrentTimeMillis = zzfubVar.zzO().currentTimeMillis();
            int iZzs = zzfubVar.zzs();
            String strZzM = zzfubVar.zzM();
            zzfubVar.zzN().zzj(jCurrentTimeMillis, zzfubVar.zzP(), iZzs, strZzM);
        }
    }
}
