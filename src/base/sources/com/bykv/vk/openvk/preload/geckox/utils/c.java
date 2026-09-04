package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class c implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f11896a;

    public static c a() {
        if (f11896a == null) {
            synchronized (c.class) {
                try {
                    if (f11896a == null) {
                        f11896a = new c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f11896a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}
