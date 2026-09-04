package com.vungle.ads.internal.executor;

import androidx.activity.b0;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.internal.util.q;
import fl.g0;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class i extends ThreadPoolExecutor implements AutoCloseable {
    public static final a Companion = new a(null);
    private static final String TAG = "VungleThreadPool";
    private final com.vungle.ads.internal.executor.c threadFactory;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: com.vungle.ads.internal.executor.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class C0507a extends com.vungle.ads.internal.task.h implements b {
            final /* synthetic */ Runnable $command;
            final /* synthetic */ Runnable $fail;

            C0507a(Runnable runnable, Runnable runnable2) {
                this.$command = runnable;
                this.$fail = runnable2;
            }

            @Override // com.vungle.ads.internal.task.h, java.lang.Comparable
            public int compareTo(Object other) {
                s.h(other, "other");
                if (!(other instanceof com.vungle.ads.internal.task.h)) {
                    return 0;
                }
                return s.i(((com.vungle.ads.internal.task.h) other).getPriority(), getPriority());
            }

            @Override // com.vungle.ads.internal.task.h
            public int getPriority() {
                return ((com.vungle.ads.internal.task.h) this.$command).getPriority();
            }

            @Override // java.lang.Runnable
            public void run() {
                i.Companion.wrapRunnableWithFail(this.$command, this.$fail);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class b implements b {
            final /* synthetic */ Runnable $command;
            final /* synthetic */ Runnable $fail;

            b(Runnable runnable, Runnable runnable2) {
                this.$command = runnable;
                this.$fail = runnable2;
            }

            @Override // java.lang.Comparable
            public int compareTo(Object other) {
                s.h(other, "other");
                Runnable runnable = this.$command;
                if (runnable instanceof com.vungle.ads.internal.task.h) {
                    return ((com.vungle.ads.internal.task.h) runnable).compareTo(other);
                }
                return 0;
            }

            @Override // java.lang.Runnable
            public void run() {
                i.Companion.wrapRunnableWithFail(this.$command, this.$fail);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> Callable<T> getWrappedCallableWithFallback(final Callable<T> callable, final tl.a aVar) {
            return new Callable() { // from class: com.vungle.ads.internal.executor.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return i.a.m92getWrappedCallableWithFallback$lambda0(callable, aVar);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: getWrappedCallableWithFallback$lambda-0, reason: not valid java name */
        public static final Object m92getWrappedCallableWithFallback$lambda0(Callable command, tl.a failFallback) {
            s.h(command, "$command");
            s.h(failFallback, "$failFallback");
            try {
                return command.call();
            } catch (OutOfMemoryError unused) {
                failFallback.invoke();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final b getWrappedRunnableWithFail(Runnable runnable, Runnable runnable2) {
            return runnable instanceof com.vungle.ads.internal.task.h ? new C0507a(runnable, runnable2) : new b(runnable, runnable2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void wrapRunnableWithFail(Runnable runnable, Runnable runnable2) {
            try {
                runnable.run();
            } catch (OutOfMemoryError unused) {
                runnable2.run();
            }
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b extends Comparable, Runnable {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends t implements tl.a {
        c() {
            super(0);
        }

        @Override // tl.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m93invoke();
            return g0.f38750a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m93invoke() {
            new OutOfMemory("submit callable error in " + i.this.executorName()).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    public i(int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, com.vungle.ads.internal.executor.c cVar) {
        super(i10, i11, j10, timeUnit, blockingQueue, cVar);
        this.threadFactory = cVar;
        allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: execute$lambda-0, reason: not valid java name */
    public static final void m89execute$lambda0(i this$0) {
        s.h(this$0, "this$0");
        new OutOfMemory("execute error in " + this$0.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String executorName() {
        String name;
        com.vungle.ads.internal.executor.c cVar = this.threadFactory;
        return (cVar == null || (name = cVar.getName()) == null) ? "VungleThreadPoolExecutor" : name;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: submit$lambda-1, reason: not valid java name */
    public static final void m90submit$lambda1(i this$0) {
        s.h(this$0, "this$0");
        new OutOfMemory("submit error in " + this$0.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: submit$lambda-2, reason: not valid java name */
    public static final void m91submit$lambda2(i this$0) {
        s.h(this$0, "this$0");
        new OutOfMemory("submit error with result in " + this$0.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        b0.a(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable command) {
        s.h(command, "command");
        try {
            super.execute(Companion.getWrappedRunnableWithFail(command, new Runnable() { // from class: com.vungle.ads.internal.executor.f
                @Override // java.lang.Runnable
                public final void run() {
                    i.m89execute$lambda0(this.f35802a);
                }
            }));
        } catch (Exception e10) {
            q.Companion.e(TAG, "execute exception", e10);
        } catch (OutOfMemoryError e11) {
            String str = "execute error in " + executorName() + ": " + e11.getLocalizedMessage();
            q.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final com.vungle.ads.internal.executor.c getThreadFactory() {
        return this.threadFactory;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable task) {
        s.h(task, "task");
        try {
            Future<?> futureSubmit = super.submit(Companion.getWrappedRunnableWithFail(task, new Runnable() { // from class: com.vungle.ads.internal.executor.g
                @Override // java.lang.Runnable
                public final void run() {
                    i.m90submit$lambda1(this.f35803a);
                }
            }));
            s.g(futureSubmit, "{\n            super.subm…\n            })\n        }");
            return futureSubmit;
        } catch (Exception e10) {
            q.Companion.e(TAG, "submit exception", e10);
            return new com.vungle.ads.internal.executor.b(null);
        } catch (OutOfMemoryError e11) {
            String str = "submit error in " + executorName() + ": " + e11.getLocalizedMessage();
            q.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            return new com.vungle.ads.internal.executor.b(null);
        }
    }

    public final Future<?> submit$vungle_ads_release(Runnable task, Runnable fail) {
        s.h(task, "task");
        s.h(fail, "fail");
        try {
            Future<?> futureSubmit = super.submit(Companion.getWrappedRunnableWithFail(task, fail));
            s.g(futureSubmit, "{\n            super.subm…il(task, fail))\n        }");
            return futureSubmit;
        } catch (Exception e10) {
            q.Companion.e(TAG, "submit exception with fail", e10);
            fail.run();
            return new com.vungle.ads.internal.executor.b(null);
        } catch (OutOfMemoryError e11) {
            String str = "submit error with fail in " + executorName() + ": " + e11.getLocalizedMessage();
            q.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            fail.run();
            return new com.vungle.ads.internal.executor.b(null);
        }
    }

    public final void execute(Runnable command, Runnable fail) {
        s.h(command, "command");
        s.h(fail, "fail");
        try {
            super.execute(Companion.getWrappedRunnableWithFail(command, fail));
        } catch (Exception e10) {
            q.Companion.e(TAG, "execute exception with fail", e10);
            fail.run();
        } catch (OutOfMemoryError e11) {
            String str = "execute error with fail in " + executorName() + ": " + e11.getLocalizedMessage();
            q.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            fail.run();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable task, T t10) {
        s.h(task, "task");
        try {
            Future<T> futureSubmit = super.submit(Companion.getWrappedRunnableWithFail(task, new Runnable() { // from class: com.vungle.ads.internal.executor.e
                @Override // java.lang.Runnable
                public final void run() {
                    i.m91submit$lambda2(this.f35801a);
                }
            }), t10);
            s.g(futureSubmit, "{\n            super.subm…     }, result)\n        }");
            return futureSubmit;
        } catch (Exception e10) {
            q.Companion.e(TAG, "submit exception with result", e10);
            return new com.vungle.ads.internal.executor.b(null);
        } catch (OutOfMemoryError e11) {
            String str = "submit error with result in " + executorName() + ": " + e11.getLocalizedMessage();
            q.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            return new com.vungle.ads.internal.executor.b(null);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> task) {
        s.h(task, "task");
        try {
            Future<T> futureSubmit = super.submit(Companion.getWrappedCallableWithFallback(task, new c()));
            s.g(futureSubmit, "override fun <T> submit(…Future<T>\n        }\n    }");
            return futureSubmit;
        } catch (Exception e10) {
            q.Companion.e(TAG, "submit exception callable: " + e10);
            return new com.vungle.ads.internal.executor.b(null);
        } catch (OutOfMemoryError e11) {
            String str = "submit error callable in " + executorName() + ": " + e11.getLocalizedMessage();
            q.Companion.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            return new com.vungle.ads.internal.executor.b(null);
        }
    }
}
