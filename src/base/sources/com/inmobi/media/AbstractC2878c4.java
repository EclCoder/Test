package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: com.inmobi.media.c4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2878c4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3136m4 f26300a = new C3136m4(new C3188o4(), new C3162n4(H9.f24930c));

    public static void a(String type, InterfaceC3395w4 listener) {
        kotlin.jvm.internal.s.h(type, "type");
        kotlin.jvm.internal.s.h(listener, "listener");
        C3136m4 c3136m4 = f26300a;
        c3136m4.getClass();
        kotlin.jvm.internal.s.h(type, "type");
        kotlin.jvm.internal.s.h(listener, "listener");
        LinkedHashMap linkedHashMap = c3136m4.f26972a.f27115c;
        Object concurrentLinkedQueue = linkedHashMap.get(type);
        if (concurrentLinkedQueue == null) {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
            linkedHashMap.put(type, concurrentLinkedQueue);
        }
        ((ConcurrentLinkedQueue) concurrentLinkedQueue).add(new WeakReference(listener));
    }
}
