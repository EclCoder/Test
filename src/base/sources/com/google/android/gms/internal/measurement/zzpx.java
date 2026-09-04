package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.g0;
import com.google.common.util.concurrent.x;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzpx {
    static void zza(final ListenableFuture listenableFuture) {
        listenableFuture.addListener(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzpw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    x.d(listenableFuture);
                } catch (ExecutionException e10) {
                    zzrn.zzb().post(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzpv
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            throw new RuntimeException(e10.getCause());
                        }
                    });
                }
            }
        }, g0.a());
    }
}
