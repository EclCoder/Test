package com.google.android.gms.internal.ads;

import androidx.activity.b0;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcfn extends ScheduledThreadPoolExecutor implements AutoCloseable {
    zzcfn(int i10, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        b0.a(this);
    }
}
