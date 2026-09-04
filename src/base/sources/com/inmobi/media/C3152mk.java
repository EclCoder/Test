package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import com.inmobi.media.core.config.models.TelemetryConfig;

/* JADX INFO: renamed from: com.inmobi.media.mk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3152mk implements InterfaceC3395w4 {
    @Override // com.inmobi.media.InterfaceC3395w4
    public final void a(Config config) {
        kotlin.jvm.internal.s.h(config, "config");
        if (config instanceof TelemetryConfig) {
            TelemetryConfig telemetryConfigB = C3178nk.b();
            C3178nk.f27071h = new Ak(new C3230pk(telemetryConfigB.getEnabled(), telemetryConfigB.getAssetReporting().isImageEnabled(), telemetryConfigB.getAssetReporting().isGifEnabled(), telemetryConfigB.getAssetReporting().isVideoEnabled(), telemetryConfigB.getDisableAllGeneralEvents(), telemetryConfigB.getPriorityEventsList(), telemetryConfigB.getSamplingFactor()), gl.r.I0(C3178nk.f27067d));
            C3411wk c3411wk = C3178nk.f27073j;
            if (c3411wk != null) {
                TelemetryConfig telemetryConfig = C3178nk.b();
                kotlin.jvm.internal.s.h(telemetryConfig, "telemetryConfig");
                c3411wk.f27804a = telemetryConfig;
            }
        }
    }
}
