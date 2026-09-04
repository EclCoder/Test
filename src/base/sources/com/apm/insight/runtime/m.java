package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile p f11004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Handler f11005b;

    public static p a() {
        if (f11004a == null) {
            b();
        }
        return f11004a;
    }

    private static HandlerThread b() {
        if (f11004a == null) {
            synchronized (m.class) {
                try {
                    if (f11004a == null) {
                        p pVar = new p("default_npth_thread");
                        f11004a = pVar;
                        pVar.b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f11004a.c();
    }
}
