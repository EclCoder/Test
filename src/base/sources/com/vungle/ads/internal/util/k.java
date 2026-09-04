package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class k {
    private final Handler handler = new Handler(Looper.getMainLooper());

    private final long calculateTime(long j10) {
        return SystemClock.uptimeMillis() + j10;
    }

    public final void cancel(String tag) {
        kotlin.jvm.internal.s.h(tag, "tag");
        this.handler.removeCallbacksAndMessages(tag);
    }

    public final void cancelAll() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public final void schedule(Runnable runnable, String tag, long j10) {
        kotlin.jvm.internal.s.h(runnable, "runnable");
        kotlin.jvm.internal.s.h(tag, "tag");
        this.handler.postAtTime(runnable, tag, calculateTime(j10));
    }

    public final void schedule(Runnable runnable, long j10) {
        kotlin.jvm.internal.s.h(runnable, "runnable");
        this.handler.postAtTime(runnable, calculateTime(j10));
    }
}
