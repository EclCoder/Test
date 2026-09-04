package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class O1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2989gc f25378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25379e;

    public O1(VideoExperience videoExperience, AdConfig.VideoPlayerAudioConfig audioConfig) {
        C2989gc c2989gc;
        C2989gc c2989gc2;
        kotlin.jvm.internal.s.h(videoExperience, "videoExperience");
        kotlin.jvm.internal.s.h(audioConfig, "audioConfig");
        Boolean startMuted = videoExperience.getAudio().getStartMuted();
        this.f25375a = startMuted != null ? startMuted.booleanValue() : audioConfig.getStartMuted();
        Integer muteIconWidth = videoExperience.getAudio().getMuteIconWidth();
        this.f25376b = muteIconWidth != null ? muteIconWidth.intValue() : audioConfig.getMuteIconWidth();
        Integer muteIconHeight = videoExperience.getAudio().getMuteIconHeight();
        this.f25377c = muteIconHeight != null ? muteIconHeight.intValue() : audioConfig.getMuteIconHeight();
        int[] muteIconMargin = videoExperience.getAudio().getMuteIconMargin();
        if (muteIconMargin != null) {
            kotlin.jvm.internal.s.h(muteIconMargin, "<this>");
            if (muteIconMargin.length != 4) {
                c2989gc2 = new C2989gc(0, 0, 0, 0);
            } else {
                c2989gc = new C2989gc(muteIconMargin[0], muteIconMargin[1], muteIconMargin[2], muteIconMargin[3]);
                c2989gc2 = c2989gc;
            }
        } else {
            List<Integer> muteIconMargin2 = audioConfig.getMuteIconMargin();
            kotlin.jvm.internal.s.h(muteIconMargin2, "<this>");
            if (muteIconMargin2.size() != 4) {
                c2989gc2 = new C2989gc(0, 0, 0, 0);
            } else {
                c2989gc = new C2989gc(muteIconMargin2.get(0).intValue(), muteIconMargin2.get(1).intValue(), muteIconMargin2.get(2).intValue(), muteIconMargin2.get(3).intValue());
                c2989gc2 = c2989gc;
            }
        }
        this.f25378d = c2989gc2;
        Integer muteIconPosition = videoExperience.getAudio().getMuteIconPosition();
        this.f25379e = muteIconPosition != null ? muteIconPosition.intValue() : audioConfig.getMuteIconPosition();
    }
}
