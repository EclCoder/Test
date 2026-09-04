package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f25093a;

    static {
        String simpleName = K.class.getSimpleName();
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
        AdConfig adConfig = (AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class);
        int maxPoolSize = adConfig.getMaxPoolSize();
        int maxPoolSize2 = adConfig.getMaxPoolSize();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        String name = simpleName + "-AD";
        kotlin.jvm.internal.s.h(name, "name");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(maxPoolSize, maxPoolSize2, 5L, timeUnit, linkedBlockingQueue, new I9(name, false));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f25093a = threadPoolExecutor;
    }
}
