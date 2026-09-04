package com.pgl.ssdk;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class ar {
    private static Handler a() {
        return a0.a().b();
    }

    public static Handler b() {
        return a0.a().c();
    }

    public static void a(Runnable runnable) {
        Handler handlerA;
        if (runnable == null || (handlerA = a()) == null) {
            return;
        }
        handlerA.post(runnable);
    }

    public static void b(Runnable runnable) {
        a(runnable, 0L);
    }

    public static void a(Runnable runnable, long j10) {
        Handler handlerB;
        if (runnable == null || (handlerB = b()) == null) {
            return;
        }
        handlerB.postDelayed(runnable, j10);
    }
}
