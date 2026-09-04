package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Og {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f25420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f25421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f25423f;

    public Og(VideoExperience videoExperience, boolean z10, AdConfig.VideoPlayerProgressConfig progressConfig) {
        kotlin.jvm.internal.s.h(videoExperience, "videoExperience");
        kotlin.jvm.internal.s.h(progressConfig, "progressConfig");
        Boolean showProgress = videoExperience.getProgress().getShowProgress();
        this.f25418a = showProgress != null ? showProgress.booleanValue() : progressConfig.getShowProgress();
        Boolean loopVideoOnComplete = videoExperience.getLoopVideoOnComplete();
        this.f25419b = !(loopVideoOnComplete != null ? loopVideoOnComplete.booleanValue() : z10);
        int[] color = videoExperience.getProgress().getColor();
        this.f25420c = color == null ? gl.r.H0(progressConfig.getForegroundColor()) : color;
        this.f25421d = gl.r.H0(progressConfig.getBackgroundColor());
        Integer height = videoExperience.getProgress().getHeight();
        this.f25422e = height != null ? height.intValue() : progressConfig.getHeight();
        this.f25423f = progressConfig.getProgressPolling();
    }
}
