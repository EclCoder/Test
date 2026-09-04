package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class f implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile f f11898a;

    public static f a() {
        if (f11898a == null) {
            synchronized (f.class) {
                try {
                    if (f11898a == null) {
                        f11898a = new f();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f11898a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}
