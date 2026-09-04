package com.google.android.gms.internal.measurement;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final /* synthetic */ class zzlo implements ThreadFactory {
    static final /* synthetic */ zzlo zza = new zzlo();

    private /* synthetic */ zzlo() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final /* synthetic */ Thread newThread(Runnable runnable) {
        int i10 = zzlk.zza;
        return new Thread(runnable, "ProcessStablePhenotypeFlag");
    }
}
