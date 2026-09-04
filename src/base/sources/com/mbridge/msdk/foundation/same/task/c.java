package com.mbridge.msdk.foundation.same.task;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ThreadPoolExecutor f30792a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("mb-task-loader-thread");
            return thread;
        }
    }

    private static ThreadFactory a() {
        return new a();
    }

    public static ThreadPoolExecutor b() {
        c();
        if (f30792a == null) {
            int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
            f30792a = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), a(), new ThreadPoolExecutor.DiscardPolicy());
            f30792a.allowCoreThreadTimeOut(true);
        }
        return f30792a;
    }

    private static void c() {
        if (f30792a != null) {
            return;
        }
        int iA = a(10, "c_t_l_t_p_c");
        int iA2 = a(50, "c_t_l_t_p_m");
        int iA3 = a(5, "c_t_l_t_p_t");
        int i10 = iA2 < iA ? iA : iA2;
        try {
            if (MBridgeConstans.DEBUG) {
                q0.a("CommonTaskLoaderThreadPool", "create ThreadPoolExecutor for core " + iA + " max " + i10 + " timeout " + iA3);
            }
            long j10 = iA3;
            if (j10 <= 0) {
                j10 = 1;
            }
            f30792a = new ThreadPoolExecutor(iA, i10, j10, TimeUnit.SECONDS, new LinkedBlockingDeque(), a(), new ThreadPoolExecutor.DiscardPolicy());
            f30792a.allowCoreThreadTimeOut(true);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonTaskLoaderThreadPool", "create ThreadPoolExecutor failed ", e10);
            }
        }
    }

    private static int a(int i10, String str) {
        try {
            int iB = s0.a().b(str, i10);
            return iB <= 0 ? i10 : iB;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("CommonTaskLoaderThreadPool", e10.getMessage());
            }
        }
    }
}
