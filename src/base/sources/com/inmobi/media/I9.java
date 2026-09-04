package com.inmobi.media;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class I9 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24993b;

    public I9(String name, boolean z10) {
        kotlin.jvm.internal.s.h(name, "name");
        this.f24992a = z10;
        this.f24993b = "TIM-" + name;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r10) {
        kotlin.jvm.internal.s.h(r10, "r");
        try {
            Thread thread = new Thread(r10, this.f24993b);
            thread.setDaemon(this.f24992a);
            return thread;
        } catch (InternalError e10) {
            e10.toString();
            return null;
        }
    }
}
