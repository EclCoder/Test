package com.google.android.gms.internal.measurement;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.g0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzlb {
    public static ListenableFuture zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzkz zzkzVar = new zzkz(task, null);
        task.addOnCompleteListener(g0.a(), new OnCompleteListener() { // from class: com.google.android.gms.internal.measurement.zzla
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final /* synthetic */ void onComplete(Task task2) {
                zzkz zzkzVar2 = zzkzVar;
                if (task2.isCanceled()) {
                    zzkzVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzkzVar2.set(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzkzVar2.setException(exception);
            }
        });
        return zzkzVar;
    }
}
