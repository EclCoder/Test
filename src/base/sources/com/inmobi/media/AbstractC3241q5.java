package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;

/* JADX INFO: renamed from: com.inmobi.media.q5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3241q5 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Config a(String configType) {
        kotlin.jvm.internal.s.h(configType, "configType");
        switch (configType.hashCode()) {
            case -60641721:
                if (configType.equals("crashReporting")) {
                    return new CrashConfig();
                }
                break;
            case 96432:
                if (configType.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                    return new AdConfig();
                }
                break;
            case 3506402:
                if (configType.equals("root")) {
                    return new RootConfig();
                }
                break;
            case 780346297:
                if (configType.equals("telemetry")) {
                    return new TelemetryConfig();
                }
                break;
            case 2088265419:
                if (configType.equals("signals")) {
                    return new SignalsConfig();
                }
                break;
        }
        throw new IllegalArgumentException("Type: " + configType);
    }
}
