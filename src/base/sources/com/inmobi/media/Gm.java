package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Gm extends C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f24885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f24886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AdConfig.VastVideoConfig f24887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3026hn f24888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2922dm f24889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Hn f24890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Z3 f24891h;

    public Gm(String mediaDuration, ArrayList companionAds, ArrayList mediaFiles, AdConfig.VastVideoConfig vastVideoConfig, C3026hn videoPlayerConfig, C2922dm videoBeaconProcessor, Hn videoTelemetryHelper, Z3 companionTelemetryHelper) {
        kotlin.jvm.internal.s.h(mediaDuration, "mediaDuration");
        kotlin.jvm.internal.s.h(companionAds, "companionAds");
        kotlin.jvm.internal.s.h(mediaFiles, "mediaFiles");
        kotlin.jvm.internal.s.h(vastVideoConfig, "vastVideoConfig");
        kotlin.jvm.internal.s.h(videoPlayerConfig, "videoPlayerConfig");
        kotlin.jvm.internal.s.h(videoBeaconProcessor, "videoBeaconProcessor");
        kotlin.jvm.internal.s.h(videoTelemetryHelper, "videoTelemetryHelper");
        kotlin.jvm.internal.s.h(companionTelemetryHelper, "companionTelemetryHelper");
        this.f24884a = mediaDuration;
        this.f24885b = companionAds;
        this.f24886c = mediaFiles;
        this.f24887d = vastVideoConfig;
        this.f24888e = videoPlayerConfig;
        this.f24889f = videoBeaconProcessor;
        this.f24890g = videoTelemetryHelper;
        this.f24891h = companionTelemetryHelper;
    }
}
