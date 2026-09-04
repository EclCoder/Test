package com.inmobi.media;

import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorEntity;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.inmobi.media.Hc;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.signals.adinfo.SignalCollector;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Hc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f24934a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SignalsConfig f24935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f24936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fl.k f24937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fl.k f24938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f24939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final tl.o f24940g;

    static {
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(SignalsConfig.class, "clazz");
        SignalsConfig signalsConfig = (SignalsConfig) AbstractC2878c4.f26300a.a(SignalsConfig.class);
        f24935b = signalsConfig;
        String topic = signalsConfig.getPublisher().getAuto().getTopic();
        if (topic.length() == 0) {
            topic = "max_revenue_events";
        }
        f24936c = topic;
        f24937d = fl.l.b(new tl.a() { // from class: yh.u1
            @Override // tl.a
            public final Object invoke() {
                return Hc.d();
            }
        });
        f24938e = fl.l.b(new tl.a() { // from class: yh.v1
            @Override // tl.a
            public final Object invoke() {
                return Boolean.valueOf(Hc.b());
            }
        });
        f24940g = new tl.o() { // from class: yh.w1
            @Override // tl.o
            public final Object invoke(Object obj, Object obj2) {
                return Hc.a((Bundle) obj, (String) obj2);
            }
        };
    }

    public static final fl.g0 a(Bundle bundle, String topic) {
        LinkedHashMap linkedHashMapA;
        kotlin.jvm.internal.s.h(topic, "topic");
        if (bundle != null) {
            try {
                if (kotlin.jvm.internal.s.c(topic, f24936c) && (linkedHashMapA = a(bundle)) != null) {
                    Xg.f26013a.getClass();
                    Xg.a(linkedHashMapA);
                    linkedHashMapA.toString();
                }
            } catch (Throwable unused) {
            }
        }
        return fl.g0.f38750a;
    }

    public static final boolean b() {
        try {
            Class<?> cls = Class.forName("com.applovin.communicator.AppLovinCommunicator");
            return kotlin.jvm.internal.s.c(cls.getMethod("getInstance", null).getReturnType(), cls) && kotlin.jvm.internal.s.c(AppLovinCommunicatorSubscriber.class.getMethod("onMessageReceived", Class.forName("com.applovin.communicator.AppLovinCommunicatorMessage")).getReturnType(), Void.TYPE) && kotlin.jvm.internal.s.c(AppLovinCommunicatorEntity.class.getMethod("getCommunicatorId", null).getReturnType(), String.class);
        } catch (Error | Exception unused) {
            return false;
        }
    }

    public static boolean c() {
        String str;
        Boolean bool = f24939f;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Object obj = Class.forName("com.applovin.sdk.AppLovinSdk").getField("VERSION").get(null);
            str = obj instanceof String ? (String) obj : null;
            if (str == null) {
                str = "-1";
            }
        } catch (Throwable unused) {
        }
        List<String> incompatibleSdkVer = f24935b.getPublisher().getAuto().getIncompatibleSdkVer();
        Objects.toString(incompatibleSdkVer);
        boolean z10 = kotlin.jvm.internal.s.c(str, "-1") || incompatibleSdkVer.contains(str);
        f24939f = Boolean.valueOf(z10);
        return z10;
    }

    public static final SignalCollector d() {
        return new SignalCollector(gl.r.e(f24936c));
    }

    public static void a() {
        if (f24935b.getPublisher().getAuto().getEnabled() && !c() && ((Boolean) f24938e.getValue()).booleanValue() && f24936c.length() != 0 && f24934a.compareAndSet(false, true)) {
            ((SignalCollector) f24937d.getValue()).setupAppLovinCommunicator(f24940g);
        }
    }

    public static LinkedHashMap a(Bundle data) {
        boolean z10;
        Object obj;
        Object obj2;
        kotlin.jvm.internal.s.h(data, "data");
        if (!f24934a.get()) {
            return null;
        }
        SignalsConfig signalsConfig = f24935b;
        if (!signalsConfig.getPublisher().getAuto().getEnabled()) {
            return null;
        }
        Map<String, SignalsConfig.PublisherConfig.KeyData> allowedKeys = signalsConfig.getPublisher().getAuto().getAllowedKeys();
        if (allowedKeys.isEmpty()) {
            return null;
        }
        Objects.toString(allowedKeys.keySet());
        Set<String> setKeySet = data.keySet();
        if (setKeySet.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kotlin.jvm.internal.s.e(setKeySet);
        if (setKeySet.contains("ad_format") && (obj2 = data.get("ad_format")) != null) {
            linkedHashMap.put("auto_type", obj2);
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        if (!z10) {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            return null;
        }
        for (Map.Entry<String, SignalsConfig.PublisherConfig.KeyData> entry : allowedKeys.entrySet()) {
            String key = entry.getKey();
            SignalsConfig.PublisherConfig.KeyData value = entry.getValue();
            if (setKeySet.contains(key)) {
                String name = value.getName();
                if (J3.a(name) && (obj = data.get(key)) != null) {
                    linkedHashMap.put(name, obj);
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }
}
