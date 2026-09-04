package com.inmobi.media;

import com.inmobi.media.Eh;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2929e4 f24722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fl.k f24723b;

    public Eh(C2929e4 configDao) {
        kotlin.jvm.internal.s.h(configDao, "configDao");
        this.f24722a = configDao;
        this.f24723b = fl.l.b(new tl.a() { // from class: yh.j1
            @Override // tl.a
            public final Object invoke() {
                return Eh.a();
            }
        });
    }

    public static final Kh a() {
        return new Kh((B9) Pe.f25485b.getValue());
    }

    public static final ArrayList a(Eh eh2) {
        C3240q4 c3240q4;
        C3240q4 c3240q5;
        C3240q4 c3240q6;
        C3240q4 c3240q7;
        C3240q4 c3240q8;
        ArrayList arrayList = new ArrayList();
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(RootConfig.class, "clazz");
        C3136m4 c3136m5 = AbstractC2878c4.f26300a;
        RootConfig rootConfig = (RootConfig) c3136m5.a(RootConfig.class);
        if (a(rootConfig, RootConfig.class)) {
            kotlin.jvm.internal.s.h(RootConfig.class, "clazz");
            RootConfig rootConfig2 = (RootConfig) c3136m5.a(RootConfig.class);
            if (kotlin.jvm.internal.s.c(RootConfig.class, RootConfig.class)) {
                c3240q8 = new C3240q4(rootConfig2.getUrlForType("root"), rootConfig2);
            } else {
                kotlin.jvm.internal.s.h(RootConfig.class, "clazz");
                Config configA = c3136m5.a(RootConfig.class);
                c3240q8 = new C3240q4(rootConfig2.getUrlForType(configA.getType()), configA);
            }
            arrayList.add(c3240q8);
            return arrayList;
        }
        if (a(rootConfig, AdConfig.class)) {
            kotlin.jvm.internal.s.h(RootConfig.class, "clazz");
            RootConfig rootConfig3 = (RootConfig) c3136m5.a(RootConfig.class);
            if (kotlin.jvm.internal.s.c(AdConfig.class, RootConfig.class)) {
                c3240q7 = new C3240q4(rootConfig3.getUrlForType("root"), rootConfig3);
            } else {
                kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
                Config configA2 = c3136m5.a(AdConfig.class);
                c3240q7 = new C3240q4(rootConfig3.getUrlForType(configA2.getType()), configA2);
            }
            arrayList.add(c3240q7);
        }
        if (a(rootConfig, TelemetryConfig.class)) {
            kotlin.jvm.internal.s.h(RootConfig.class, "clazz");
            RootConfig rootConfig4 = (RootConfig) c3136m5.a(RootConfig.class);
            if (kotlin.jvm.internal.s.c(TelemetryConfig.class, RootConfig.class)) {
                c3240q6 = new C3240q4(rootConfig4.getUrlForType("root"), rootConfig4);
            } else {
                kotlin.jvm.internal.s.h(TelemetryConfig.class, "clazz");
                Config configA3 = c3136m5.a(TelemetryConfig.class);
                c3240q6 = new C3240q4(rootConfig4.getUrlForType(configA3.getType()), configA3);
            }
            arrayList.add(c3240q6);
        }
        if (a(rootConfig, SignalsConfig.class)) {
            kotlin.jvm.internal.s.h(RootConfig.class, "clazz");
            RootConfig rootConfig5 = (RootConfig) c3136m5.a(RootConfig.class);
            if (kotlin.jvm.internal.s.c(SignalsConfig.class, RootConfig.class)) {
                c3240q5 = new C3240q4(rootConfig5.getUrlForType("root"), rootConfig5);
            } else {
                kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
                Config configA4 = c3136m5.a(SignalsConfig.class);
                c3240q5 = new C3240q4(rootConfig5.getUrlForType(configA4.getType()), configA4);
            }
            arrayList.add(c3240q5);
        }
        if (a(rootConfig, CrashConfig.class)) {
            kotlin.jvm.internal.s.h(RootConfig.class, "clazz");
            RootConfig rootConfig6 = (RootConfig) c3136m5.a(RootConfig.class);
            if (kotlin.jvm.internal.s.c(CrashConfig.class, RootConfig.class)) {
                c3240q4 = new C3240q4(rootConfig6.getUrlForType("root"), rootConfig6);
            } else {
                kotlin.jvm.internal.s.h(CrashConfig.class, "clazz");
                Config configA5 = c3136m5.a(CrashConfig.class);
                c3240q4 = new C3240q4(rootConfig6.getUrlForType(configA5.getType()), configA5);
            }
            arrayList.add(c3240q4);
        }
        return arrayList;
    }

    public static boolean a(RootConfig rootConfig, Class clazz) {
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(clazz, "clazz");
        Config configA = AbstractC2878c4.f26300a.a(clazz);
        return configA == null || System.currentTimeMillis() - configA.getLastUpdateTimeStamp() > rootConfig.getExpiryInMillisForType(AbstractC3421x4.a(clazz));
    }
}
