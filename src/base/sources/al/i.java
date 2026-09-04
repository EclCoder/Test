package al;

import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final AtomicReference f395c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Map f396d = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f398b;

        a() {
        }

        void a(Properties properties) {
            if (properties.containsKey("rx2.purge-enabled")) {
                this.f397a = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
            } else {
                this.f397a = true;
            }
            if (!this.f397a || !properties.containsKey("rx2.purge-period-seconds")) {
                this.f398b = 1;
                return;
            }
            try {
                this.f398b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
            } catch (NumberFormatException unused) {
                this.f398b = 1;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList(i.f396d.keySet());
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) obj;
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    i.f396d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        a aVar = new a();
        aVar.a(properties);
        f393a = aVar.f397a;
        f394b = aVar.f398b;
        b();
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        c(f393a, scheduledExecutorServiceNewScheduledThreadPool);
        return scheduledExecutorServiceNewScheduledThreadPool;
    }

    public static void b() {
        d(f393a);
    }

    static void c(boolean z10, ScheduledExecutorService scheduledExecutorService) {
        if (z10 && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f396d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    static void d(boolean z10) {
        if (!z10) {
            return;
        }
        while (true) {
            AtomicReference atomicReference = f395c;
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, new f("RxSchedulerPurge"));
            if (androidx.lifecycle.b.a(atomicReference, scheduledExecutorService, scheduledExecutorServiceNewScheduledThreadPool)) {
                b bVar = new b();
                int i10 = f394b;
                scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(bVar, i10, i10, TimeUnit.SECONDS);
                return;
            }
            scheduledExecutorServiceNewScheduledThreadPool.shutdownNow();
        }
    }
}
