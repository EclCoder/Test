package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.i;
import java.util.concurrent.Executor;
import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzvg implements Runnable {
    private i zza;
    private Executor zzb;

    zzvg(i iVar, Executor executor) {
        this.zza = (i) p.o(iVar);
        this.zzb = (Executor) p.o(executor);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza = null;
        this.zzb = null;
    }

    final /* synthetic */ i zza() {
        return this.zza;
    }

    final /* synthetic */ Executor zzb() {
        return this.zzb;
    }
}
