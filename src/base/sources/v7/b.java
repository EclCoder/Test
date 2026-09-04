package v7;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import com.facebook.h0;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.s;
import u7.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f55199a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f55200b = Process.myUid();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ScheduledExecutorService f55201c = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f55202d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Runnable f55203e = new Runnable() { // from class: v7.a
        @Override // java.lang.Runnable
        public final void run() {
            b.b();
        }
    };

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b() {
        if (x7.a.c(b.class)) {
            return;
        }
        try {
            Object systemService = h0.m().getSystemService("activity");
            s.f(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            c((ActivityManager) systemService);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            x7.a.b(th2, b.class);
        }
    }

    public static final void c(ActivityManager activityManager) {
        if (x7.a.c(b.class) || activityManager == null) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == f55200b) {
                        Thread thread = Looper.getMainLooper().getThread();
                        s.g(thread, "getMainLooper().thread");
                        String strG = k.g(thread);
                        if (!s.c(strG, f55202d) && k.k(thread)) {
                            f55202d = strG;
                            u7.c.a.a(processErrorStateInfo.shortMsg, strG).g();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, b.class);
        }
    }

    public static final void d() {
        if (x7.a.c(b.class)) {
            return;
        }
        try {
            f55201c.scheduleWithFixedDelay(f55203e, 0L, 500L, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            x7.a.b(th2, b.class);
        }
    }
}
