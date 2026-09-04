package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbuy;
import com.google.android.gms.internal.ads.zzbyu;
import com.pairip.VMRunner;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class OfflinePingSender extends Worker {
    private final zzbyu zza;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzay.zzb().zzj(context, new zzbuy());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        return (ListenableWorker.a) VMRunner.invoke("HfwF95bUx3UNGnl4", new Object[]{this});
    }
}
