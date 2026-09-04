package com.bytedance.sdk.component.aq.hn;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.activity.b0;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dse extends ThreadPoolExecutor implements AutoCloseable {
    private int gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f12737hn;
    private final String hnj;
    private int qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private boolean f12738sk;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class hnj {
        private String hnj = "cache";

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        private int f12740hn = 4;
        private int qor = 100;
        private int gjv = 0;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        private long f12741sk = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        private boolean dkl = false;
        private TimeUnit dse = TimeUnit.MILLISECONDS;
        private boolean aq = false;
        private BlockingQueue<Runnable> ojm = new PriorityBlockingQueue();

        /* JADX INFO: renamed from: ta, reason: collision with root package name */
        private ThreadFactory f12742ta = null;

        public hnj gjv(int i10) {
            return this;
        }

        public hnj sk(int i10) {
            return this;
        }

        public hnj hn(int i10) {
            this.qor = i10;
            return this;
        }

        public hnj hnj(String str) {
            this.hnj = str;
            return this;
        }

        public hnj qor(int i10) {
            this.gjv = i10;
            return this;
        }

        public hnj hn(boolean z10) {
            this.aq = z10;
            return this;
        }

        public hnj hnj(int i10) {
            this.f12740hn = i10;
            return this;
        }

        public hnj hnj(long j10) {
            this.f12741sk = j10;
            return this;
        }

        public hnj hnj(boolean z10) {
            this.dkl = z10;
            return this;
        }

        public dse hnj() {
            if (this.f12742ta == null) {
                this.f12742ta = new sk(this.hnj);
            }
            if (this.f12740hn < 0) {
                this.f12740hn = 8;
            }
            if (this.f12740hn == 0) {
                this.ojm = new SynchronousQueue();
            }
            if (this.ojm == null) {
                this.ojm = new LinkedBlockingQueue();
            }
            if (this.qor > 100) {
                this.qor = 100;
            }
            int i10 = this.qor;
            int i11 = this.f12740hn;
            if (i10 < i11) {
                this.qor = i11;
            }
            return new dse(this);
        }
    }

    private void hn() {
        try {
            if (this.f12737hn != 0 && getCorePoolSize() < this.qor) {
                int size = getQueue().size();
                if (getActiveCount() < this.f12737hn || size < this.gjv) {
                    return;
                }
                setCorePoolSize(this.qor);
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    private void qor() {
        try {
            if (this.f12737hn != 0 && getCorePoolSize() > this.f12737hn && getQueue().size() == 0) {
                setCorePoolSize(this.f12737hn);
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th2) {
        boolean z10 = runnable instanceof qor;
        if (z10) {
            ((qor) runnable).setAfterTimestamp(SystemClock.elapsedRealtime());
        }
        super.afterExecute(runnable, th2);
        if (z10) {
            qor qorVar = (qor) runnable;
            qorVar.getName();
            qorVar.getPriority();
            qorVar.getSubmitTimestamp();
            qorVar.getBeforeTimestamp();
            qorVar.getAfterTimestamp();
        }
        qor();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof qor) {
            ((qor) runnable).setBeforeTimestamp(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        b0.a(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bytedance.sdk.component.aq.hn.hnj hnjVarHnj;
        if (!(runnable instanceof qor)) {
            runnable = new qor("unknown", runnable) { // from class: com.bytedance.sdk.component.aq.hn.dse.2
                @Override // java.lang.Runnable
                public void run() {
                    Runnable target = getTarget();
                    if (target != null) {
                        target.run();
                    }
                }
            };
        }
        if (!"cache".equals(this.hnj)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(sk.hnj(this.hnj)) && (hnjVarHnj = gjv.hnj()) != null) {
                hnjVarHnj.hnj(this, (qor) runnable);
            }
        }
        ((qor) runnable).setSubmitTimestamp(SystemClock.elapsedRealtime());
        try {
            super.execute(runnable);
            hn();
        } catch (Throwable th2) {
            hnj(runnable, th2);
        }
    }

    public void hnj(hnj hnjVar) {
        try {
            if (hnjVar.f12740hn >= 0 && this.f12737hn != hnjVar.f12740hn) {
                int i10 = hnjVar.f12740hn;
                this.f12737hn = i10;
                setCorePoolSize(i10);
            }
            this.qor = hnjVar.qor;
            this.gjv = hnjVar.gjv;
            allowCoreThreadTimeOut(hnjVar.dkl);
            this.f12738sk = hnjVar.aq;
        } catch (Throwable th2) {
            th2.getMessage();
        }
        String unused = hnjVar.hnj;
        int unused2 = hnjVar.f12740hn;
        int unused3 = hnjVar.qor;
        long unused4 = hnjVar.f12741sk;
        int unused5 = hnjVar.gjv;
        boolean unused6 = hnjVar.aq;
        BlockingQueue unused7 = hnjVar.ojm;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.hnj)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return "aidl".equals(this.hnj) ? Collections.EMPTY_LIST : super.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        int priority;
        String name;
        runnable.getClass();
        final RunnableFuture runnableFutureNewTaskFor = newTaskFor(runnable, null);
        if (runnable instanceof qor) {
            qor qorVar = (qor) runnable;
            priority = qorVar.getPriority();
            name = qorVar.getName();
        } else {
            priority = 6;
            name = "";
        }
        if (priority == 0 || TextUtils.isEmpty(name)) {
            new RuntimeException();
        }
        execute(new qor(name, priority) { // from class: com.bytedance.sdk.component.aq.hn.dse.1
            @Override // java.lang.Runnable
            public void run() {
                runnableFutureNewTaskFor.run();
            }
        });
        return runnableFutureNewTaskFor;
    }

    private dse(hnj hnjVar) {
        super(hnjVar.f12740hn, Integer.MAX_VALUE, hnjVar.f12741sk, hnjVar.dse, (BlockingQueue<Runnable>) hnjVar.ojm, hnjVar.f12742ta);
        this.f12738sk = false;
        String unused = hnjVar.hnj;
        int unused2 = hnjVar.f12740hn;
        int unused3 = hnjVar.qor;
        long unused4 = hnjVar.f12741sk;
        int unused5 = hnjVar.gjv;
        boolean unused6 = hnjVar.aq;
        BlockingQueue unused7 = hnjVar.ojm;
        this.hnj = hnjVar.hnj;
        this.f12737hn = hnjVar.f12740hn;
        this.qor = hnjVar.qor;
        this.gjv = hnjVar.gjv;
        allowCoreThreadTimeOut(hnjVar.dkl);
        this.f12738sk = hnjVar.aq;
    }

    private void hnj(Runnable runnable, Throwable th2) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Handler handlerHn = gjv.hn();
                if (handlerHn != null) {
                    handlerHn.post(runnable);
                    return;
                }
                return;
            }
            runnable.run();
        } catch (Throwable unused) {
        }
    }

    public boolean hnj() {
        return this.f12738sk;
    }
}
