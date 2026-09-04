package com.inmobi.media;

import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.rg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3277rg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ui f27402a;

    static {
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(TelemetryConfig.class, "clazz");
        f27402a = new Ui(((double) 1) - ((TelemetryConfig) AbstractC2878c4.f26300a.a(TelemetryConfig.class)).getPingSamplingFactor());
    }

    public static void a(String eventType, Map keyValueMap) {
        kotlin.jvm.internal.s.h(eventType, "eventType");
        kotlin.jvm.internal.s.h(keyValueMap, "keyValueMap");
        if (kotlin.jvm.internal.s.c(eventType, "PingDBMaxLimitReached")) {
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b(eventType, keyValueMap, EnumC3281rk.SDK);
            return;
        }
        if (f27402a.a()) {
            double d10 = 1;
            C3136m4 c3136m4 = AbstractC2878c4.f26300a;
            kotlin.jvm.internal.s.h(TelemetryConfig.class, "clazz");
            C3136m4 c3136m5 = AbstractC2878c4.f26300a;
            double pingSamplingFactor = d10 - ((TelemetryConfig) c3136m5.a(TelemetryConfig.class)).getPingSamplingFactor();
            kotlin.jvm.internal.s.h(TelemetryConfig.class, "clazz");
            keyValueMap.put("samplingRate", Integer.valueOf((int) ((d10 - ((TelemetryConfig) c3136m5.a(TelemetryConfig.class)).getSamplingFactor()) * pingSamplingFactor * ((double) 100))));
            C3178nk c3178nk2 = C3178nk.f27064a;
            C3178nk.b(eventType, keyValueMap, EnumC3281rk.SDK);
        }
    }
}
