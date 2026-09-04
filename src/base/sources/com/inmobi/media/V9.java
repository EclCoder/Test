package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.CrashConfig;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class V9 implements InterfaceC3395w4 {
    @Override // com.inmobi.media.InterfaceC3395w4
    public final void a(Config config) {
        kotlin.jvm.internal.s.h(config, "config");
        if (config instanceof CrashConfig) {
            Sa sa2 = W9.f25938d;
            CrashConfig crashConfig = (CrashConfig) config;
            sa2.getClass();
            kotlin.jvm.internal.s.h(crashConfig, "crashConfig");
            sa2.f25681a = crashConfig;
            Y9 y10 = sa2.f25683c;
            y10.getClass();
            kotlin.jvm.internal.s.h(crashConfig, "config");
            y10.f26071a.f25843a = crashConfig.getCrashConfig().getSamplingPercent();
            y10.f26072b.f25843a = crashConfig.getCatchConfig().getSamplingPercent();
            y10.f26073c.f25843a = crashConfig.getAnr().getWatchdog().getSamplingPercent();
            y10.f26074d.f25843a = crashConfig.getAnr().getAppExitReason().getSamplingPercent();
            C3216p6 c3216p6 = sa2.f25682b;
            if (c3216p6 != null) {
                C2983g6 eventConfig = crashConfig.getEventConfig();
                kotlin.jvm.internal.s.h(eventConfig, "eventConfig");
                c3216p6.f27176i = eventConfig;
            }
            C3447y5 c3447y5 = W9.f25937c;
            if (c3447y5 != null) {
                kotlin.jvm.internal.s.h(crashConfig, "crashConfig");
                c3447y5.f27908a = crashConfig;
            }
        }
    }
}
