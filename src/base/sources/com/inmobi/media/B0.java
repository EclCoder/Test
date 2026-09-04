package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.Config;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class B0 implements InterfaceC3395w4 {
    @Override // com.inmobi.media.InterfaceC3395w4
    public final void a(Config config) {
        A0 a10;
        kotlin.jvm.internal.s.h(config, "config");
        if ((config instanceof AdConfig) && (a10 = E0.f24684b) != null) {
            AdConfig adConfig = (AdConfig) config;
            kotlin.jvm.internal.s.h(adConfig, "adConfig");
            if (a10.f24425a.get()) {
                if (adConfig.getAdQuality().getEnabled()) {
                    return;
                }
                a10.f24425a.set(false);
                em.o0 o0Var = E0.f24688f;
                if (o0Var != null) {
                    em.p0.b(o0Var, new CancellationException("Shutdown"));
                }
                E0.f24688f = null;
                return;
            }
            if (!adConfig.getAdQuality().getEnabled() || a10.f24425a.get()) {
                return;
            }
            C3136m4 c3136m4 = AbstractC2878c4.f26300a;
            kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
            if (((AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class)).getAdQuality().getEnabled()) {
                a10.a();
            }
        }
    }
}
