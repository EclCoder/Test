package com.inmobi.media;

import com.inmobi.media.core.config.models.CrashConfig;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Y9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ui f26071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ui f26072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ui f26073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ui f26074d;

    public Y9(CrashConfig config) {
        kotlin.jvm.internal.s.h(config, "config");
        this.f26071a = new Ui(config.getCrashConfig().getSamplingPercent());
        this.f26072b = new Ui(config.getCatchConfig().getSamplingPercent());
        this.f26073c = new Ui(config.getAnr().getWatchdog().getSamplingPercent());
        this.f26074d = new Ui(config.getAnr().getAppExitReason().getSamplingPercent());
    }
}
