package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class b implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ThreadFactory f22107e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicLong f22108a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final StrictMode.ThreadPolicy f22111d;

    b(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f22109b = str;
        this.f22110c = i10;
        this.f22111d = threadPolicy;
    }

    public static /* synthetic */ void a(b bVar, Runnable runnable) {
        Process.setThreadPriority(bVar.f22110c);
        StrictMode.ThreadPolicy threadPolicy = bVar.f22111d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f22107e.newThread(new Runnable() { // from class: com.google.firebase.concurrent.a
            @Override // java.lang.Runnable
            public final void run() {
                b.a(this.f22105a, runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f22109b, Long.valueOf(this.f22108a.getAndIncrement())));
        return threadNewThread;
    }
}
