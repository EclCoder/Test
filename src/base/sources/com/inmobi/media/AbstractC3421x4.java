package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;

/* JADX INFO: renamed from: com.inmobi.media.x4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3421x4 {
    public static final String a(Class clazz) {
        kotlin.jvm.internal.s.h(clazz, "clazz");
        if (kotlin.jvm.internal.s.c(clazz, RootConfig.class)) {
            return "root";
        }
        if (kotlin.jvm.internal.s.c(clazz, AdConfig.class)) {
            return com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS;
        }
        if (kotlin.jvm.internal.s.c(clazz, TelemetryConfig.class)) {
            return "telemetry";
        }
        if (kotlin.jvm.internal.s.c(clazz, SignalsConfig.class)) {
            return "signals";
        }
        if (kotlin.jvm.internal.s.c(clazz, CrashConfig.class)) {
            return "crashReporting";
        }
        throw new IllegalArgumentException("Type: " + clazz);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class a(String configType) {
        kotlin.jvm.internal.s.h(configType, "configType");
        switch (configType.hashCode()) {
            case -60641721:
                if (configType.equals("crashReporting")) {
                    return CrashConfig.class;
                }
                break;
            case 96432:
                if (configType.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                    return AdConfig.class;
                }
                break;
            case 3506402:
                if (configType.equals("root")) {
                    return RootConfig.class;
                }
                break;
            case 780346297:
                if (configType.equals("telemetry")) {
                    return TelemetryConfig.class;
                }
                break;
            case 2088265419:
                if (configType.equals("signals")) {
                    return SignalsConfig.class;
                }
                break;
        }
        throw new IllegalArgumentException("Type: " + configType);
    }
}
