package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class A5 extends kotlin.coroutines.jvm.internal.m implements tl.o {
    public A5(kl.f fVar) {
        super(2, fVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new A5(fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new A5((kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        try {
            Context context = Xi.f26021a;
            if (context == null) {
                return fl.g0.f38750a;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            if (activityManager == null) {
                return fl.g0.f38750a;
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            B5 b10 = B5.f24500a;
            B5.f24513n = memoryInfo.lowMemory;
            return fl.g0.f38750a;
        } catch (Exception e10) {
            B5 b11 = B5.f24500a;
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
        }
    }
}
