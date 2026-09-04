package com.inmobi.media;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.ac, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2834ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final em.o0 f26174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Semaphore f26175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f26176c;

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new I9("LogSingle", true));
        kotlin.jvm.internal.s.g(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        f26174a = em.p0.a(em.r1.b(executorServiceNewSingleThreadExecutor));
        f26175b = new Semaphore(1);
        f26176c = new AtomicBoolean(false);
    }
}
