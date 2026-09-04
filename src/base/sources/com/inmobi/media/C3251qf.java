package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: renamed from: com.inmobi.media.qf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3251qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B9 f27337a;

    public C3251qf(AdConfig.PingsV2Config pingsConfig) {
        kotlin.jvm.internal.s.h(pingsConfig, "pingsConfig");
        gn.q qVar = new gn.q();
        qVar.i(pingsConfig.getMaxBatchSize().getHigh());
        fl.g0 g0Var = fl.g0.f38750a;
        this.f27337a = C3476z9.a(null, qVar, null, new Gk(pingsConfig.getConnectTimeout(), pingsConfig.getReadTimeout(), pingsConfig.getCallTimeout()), 5);
    }
}
