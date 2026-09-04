package j5;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f42062f = androidx.work.l.f("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadFactory f42063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f42064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f42065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Map f42066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Object f42067e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f42068a = 0;

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f42068a);
            this.f42068a = this.f42068a + 1;
            return threadNewThread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        void a(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o f42070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f42071b;

        c(o oVar, String str) {
            this.f42070a = oVar;
            this.f42071b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f42070a.f42067e) {
                try {
                    if (((c) this.f42070a.f42065c.remove(this.f42071b)) != null) {
                        b bVar = (b) this.f42070a.f42066d.remove(this.f42071b);
                        if (bVar != null) {
                            bVar.a(this.f42071b);
                        }
                    } else {
                        androidx.work.l.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f42071b), new Throwable[0]);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public o() {
        a aVar = new a();
        this.f42063a = aVar;
        this.f42065c = new HashMap();
        this.f42066d = new HashMap();
        this.f42067e = new Object();
        this.f42064b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    public void a() {
        if (this.f42064b.isShutdown()) {
            return;
        }
        this.f42064b.shutdownNow();
    }

    public void b(String str, long j10, b bVar) {
        synchronized (this.f42067e) {
            androidx.work.l.c().a(f42062f, String.format("Starting timer for %s", str), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.f42065c.put(str, cVar);
            this.f42066d.put(str, bVar);
            this.f42064b.schedule(cVar, j10, TimeUnit.MILLISECONDS);
        }
    }

    public void c(String str) {
        synchronized (this.f42067e) {
            try {
                if (((c) this.f42065c.remove(str)) != null) {
                    androidx.work.l.c().a(f42062f, String.format("Stopping timer for %s", str), new Throwable[0]);
                    this.f42066d.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
