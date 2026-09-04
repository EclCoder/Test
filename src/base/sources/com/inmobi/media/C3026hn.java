package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: renamed from: com.inmobi.media.hn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3026hn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Og f26706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O1 f26707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Zn f26708e;

    public C3026hn(boolean z10, VideoExperience videoExperience, AdConfig.NativeConfig nativeConfig) {
        kotlin.jvm.internal.s.h(videoExperience, "videoExperience");
        kotlin.jvm.internal.s.h(nativeConfig, "nativeConfig");
        this.f26704a = z10;
        Boolean loopVideoOnComplete = videoExperience.getLoopVideoOnComplete();
        this.f26705b = loopVideoOnComplete != null ? loopVideoOnComplete.booleanValue() : nativeConfig.getVideoPlayerConfig().getLoopVideoOnComplete();
        this.f26706c = new Og(videoExperience, nativeConfig.getVideoPlayerConfig().getLoopVideoOnComplete(), nativeConfig.getVideoPlayerConfig().getProgressConfig());
        this.f26707d = new O1(videoExperience, nativeConfig.getVideoPlayerConfig().getAudioConfig());
        this.f26708e = new Zn(nativeConfig.getVideoPlayerConfig().getViewability());
    }
}
