package com.inmobi.media;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Semaphore;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Zb {
    public static void a(Function1 runnable) {
        kotlin.jvm.internal.s.h(runnable, "runnable");
        em.k.d(H9.f24930c, null, null, new Vb(runnable, null), 3, null);
    }

    public static Object a(tl.a run) {
        Semaphore semaphore;
        kotlin.jvm.internal.s.h(run, "run");
        try {
            fl.r.a aVar = fl.r.f38769b;
            try {
                try {
                    semaphore = AbstractC2834ac.f26175b;
                    semaphore.acquire();
                    run.invoke();
                } catch (Exception e10) {
                    fl.k kVar = W9.f25935a;
                    W9.a(new M2(e10));
                    semaphore = AbstractC2834ac.f26175b;
                }
                semaphore.release();
                return fl.r.b(fl.g0.f38750a);
            } catch (Throwable th2) {
                AbstractC2834ac.f26175b.release();
                throw th2;
            }
        } catch (Throwable th3) {
            fl.r.a aVar2 = fl.r.f38769b;
            return fl.r.b(fl.s.a(th3));
        }
    }

    public static String a(Context context, long j10) {
        kotlin.jvm.internal.s.h(context, "context");
        File file = new File(context.getFilesDir() + "/logging");
        if (!file.exists()) {
            file.mkdirs();
        }
        return context.getFilesDir() + "/logging/" + j10 + ".txt";
    }

    public static String a(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        return context.getFilesDir() + "/logging";
    }
}
