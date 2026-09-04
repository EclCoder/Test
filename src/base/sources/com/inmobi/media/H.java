package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class H {
    public static final int a(String str, String str2, AdConfig adConfig) {
        if (kotlin.jvm.internal.s.c(MimeTypes.BASE_TYPE_VIDEO, str)) {
            return kotlin.jvm.internal.s.c("native", str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getMinPercentageViewed() : adConfig.getViewability().getVideoImpressionMinPercentageViewed();
        }
        if (kotlin.jvm.internal.s.c(MimeTypes.BASE_TYPE_AUDIO, str)) {
            return kotlin.jvm.internal.s.c(MimeTypes.BASE_TYPE_AUDIO, str2) ? adConfig.getViewability().getAudioImpressionMinPercentageViewed() : adConfig.getViewability().getWebImpressionMinPercentageViewed();
        }
        return kotlin.jvm.internal.s.c("native", str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getMinPercentageViewed() : adConfig.getViewability().getWebImpressionMinPercentageViewed();
    }

    public static final int b(String str, String str2, AdConfig adConfig) {
        if (kotlin.jvm.internal.s.c(MimeTypes.BASE_TYPE_VIDEO, str)) {
            return kotlin.jvm.internal.s.c("native", str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getVideoMinTimeViewed() : adConfig.getViewability().getVideoImpressionMinTimeViewed();
        }
        if (kotlin.jvm.internal.s.c(MimeTypes.BASE_TYPE_AUDIO, str)) {
            return kotlin.jvm.internal.s.c(MimeTypes.BASE_TYPE_AUDIO, str2) ? adConfig.getViewability().getAudioImpressionMinTimeViewed() : adConfig.getViewability().getWebImpressionMinTimeViewed();
        }
        return kotlin.jvm.internal.s.c("native", str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getMinTimeViewed() : adConfig.getViewability().getWebImpressionMinTimeViewed();
    }

    public static final int a(String str) {
        if (bm.r.N(str, "track_", false, 2, null)) {
            str = str.substring(6);
            kotlin.jvm.internal.s.g(str, "substring(...)");
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
