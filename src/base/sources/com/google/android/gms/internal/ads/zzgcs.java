package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgcs {
    public static ListenableFuture zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzgcq zzgcqVar = new zzgcq(task, null);
        task.addOnCompleteListener(zzhcn.zza(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzgcr
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task2) {
                zzgcq zzgcqVar2 = zzgcqVar;
                if (task2.isCanceled()) {
                    zzgcqVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzgcqVar2.zza(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzgcqVar2.zzb(exception);
            }
        });
        return zzgcqVar;
    }
}
