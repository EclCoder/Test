package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.x9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3426x9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f27835a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f27836b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3374v9 f27837c = new C3374v9();

    public static void a(Rb finishListener) {
        kotlin.jvm.internal.s.h(finishListener, "finishListener");
        if (!f27836b.getAndSet(true)) {
            AbstractC3488zl.a(new C3400w9(null));
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = f27835a;
        copyOnWriteArrayList.add(new WeakReference(finishListener));
        try {
            for (WeakReference weakReference : copyOnWriteArrayList) {
                if (weakReference.get() == null) {
                    f27835a.remove(weakReference);
                }
            }
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
        }
    }
}
