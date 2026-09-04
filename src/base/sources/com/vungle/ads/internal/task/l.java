package com.vungle.ads.internal.task;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.vungle.ads.internal.util.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class l implements f {
    private final com.vungle.ads.internal.task.c creator;
    private final Executor executor;
    private long nextCheck;
    private final List<b> pendingJobs;
    private final Runnable pendingRunnable;
    private final j threadPriorityHelper;
    public static final a Companion = new a(null);
    private static final Handler handler = new Handler(Looper.getMainLooper());
    private static final String TAG = l.class.getSimpleName();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {
        private d info;
        private final long uptimeMillis;

        public b(long j10, d dVar) {
            this.uptimeMillis = j10;
            this.info = dVar;
        }

        public final d getInfo() {
            return this.info;
        }

        public final long getUptimeMillis() {
            return this.uptimeMillis;
        }

        public final void setInfo(d dVar) {
            this.info = dVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c implements Runnable {
        private WeakReference<l> runner;

        public c(WeakReference<l> runner) {
            s.h(runner, "runner");
            this.runner = runner;
        }

        public final WeakReference<l> getRunner() {
            return this.runner;
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = this.runner.get();
            if (lVar != null) {
                lVar.executePendingJobs();
            }
        }

        public final void setRunner(WeakReference<l> weakReference) {
            s.h(weakReference, "<set-?>");
            this.runner = weakReference;
        }
    }

    public l(com.vungle.ads.internal.task.c creator, Executor executor, j jVar) {
        s.h(creator, "creator");
        s.h(executor, "executor");
        this.creator = creator;
        this.executor = executor;
        this.threadPriorityHelper = jVar;
        this.nextCheck = Long.MAX_VALUE;
        this.pendingJobs = new CopyOnWriteArrayList();
        this.pendingRunnable = new c(new WeakReference(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void executePendingJobs() {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long jMin = Long.MAX_VALUE;
            for (b bVar : this.pendingJobs) {
                if (jUptimeMillis >= bVar.getUptimeMillis()) {
                    this.pendingJobs.remove(bVar);
                    d info = bVar.getInfo();
                    if (info != null) {
                        this.executor.execute(new e(info, this.creator, this, this.threadPriorityHelper));
                    }
                } else {
                    jMin = Math.min(jMin, bVar.getUptimeMillis());
                }
            }
            if (jMin != Long.MAX_VALUE && jMin != this.nextCheck) {
                Handler handler2 = handler;
                handler2.removeCallbacks(this.pendingRunnable);
                handler2.postAtTime(this.pendingRunnable, TAG, jMin);
            }
            this.nextCheck = jMin;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.vungle.ads.internal.task.f
    public synchronized void cancelPendingJob(String tag) {
        try {
            s.h(tag, "tag");
            ArrayList arrayList = new ArrayList();
            for (b bVar : this.pendingJobs) {
                d info = bVar.getInfo();
                if (s.c(info != null ? info.getJobTag() : null, tag)) {
                    arrayList.add(bVar);
                }
            }
            this.pendingJobs.removeAll(arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.vungle.ads.internal.task.f
    public synchronized void execute(d jobInfo) {
        try {
            s.h(jobInfo, "jobInfo");
            d dVarCopy = jobInfo.copy();
            if (dVarCopy != null) {
                String jobTag = dVarCopy.getJobTag();
                long delay = dVarCopy.getDelay();
                dVarCopy.setDelay(0L);
                if (dVarCopy.getUpdateCurrent()) {
                    for (b bVar : this.pendingJobs) {
                        d info = bVar.getInfo();
                        if (s.c(info != null ? info.getJobTag() : null, jobTag)) {
                            q.a aVar = q.Companion;
                            String TAG2 = TAG;
                            s.g(TAG2, "TAG");
                            aVar.d(TAG2, "replacing pending job with new " + jobTag);
                            this.pendingJobs.remove(bVar);
                        }
                    }
                }
                this.pendingJobs.add(new b(SystemClock.uptimeMillis() + delay, dVarCopy));
                executePendingJobs();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final int getPendingJobSize$vungle_ads_release() {
        return this.pendingJobs.size();
    }
}
