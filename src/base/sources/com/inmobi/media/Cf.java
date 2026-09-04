package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Cf {
    public static C3276rf a(String creativeType, GestureDetectorOnGestureListenerC3228pi webView, boolean z10, String str, byte b10, String str2) {
        ImpressionType impressionType;
        kotlin.jvm.internal.s.h(creativeType, "creativeType");
        Kf kf2 = Jf.f25068a;
        kf2.getClass();
        kotlin.jvm.internal.s.h(webView, "webView");
        AdSessionContext adSessionContextCreateHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(kf2.f25120b, webView, str, str2);
        kotlin.jvm.internal.s.g(adSessionContextCreateHtmlAdSessionContext, "createHtmlAdSessionContext(...)");
        if (b10 == 1) {
            impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
        } else if (b10 == 2) {
            impressionType = ImpressionType.UNSPECIFIED;
        } else if (b10 == 3) {
            impressionType = ImpressionType.LOADED;
        } else if (b10 == 4) {
            impressionType = ImpressionType.BEGIN_TO_RENDER;
        } else if (b10 == 5) {
            impressionType = ImpressionType.ONE_PIXEL;
        } else if (b10 == 6) {
            impressionType = ImpressionType.VIEWABLE;
        } else if (b10 == 7) {
            impressionType = ImpressionType.AUDIBLE;
        } else {
            impressionType = b10 == 0 ? ImpressionType.OTHER : ImpressionType.OTHER;
        }
        int iHashCode = creativeType.hashCode();
        if (iHashCode != -284840886) {
            if (iHashCode != 93166550) {
                if (iHashCode != 112202875) {
                    if (iHashCode == 1425678798 && creativeType.equals("nonvideo")) {
                        return new C3276rf("html_display_ad", impressionType, adSessionContextCreateHtmlAdSessionContext, false);
                    }
                } else if (creativeType.equals(MimeTypes.BASE_TYPE_VIDEO)) {
                    return new C3276rf("html_video_ad", impressionType, adSessionContextCreateHtmlAdSessionContext, z10);
                }
            } else if (creativeType.equals(MimeTypes.BASE_TYPE_AUDIO)) {
                return new C3276rf("html_audio_ad", impressionType, adSessionContextCreateHtmlAdSessionContext, z10);
            }
        } else if (creativeType.equals("unknown")) {
            kotlin.jvm.internal.s.g("Df", "access$getTAG$cp(...)");
            return null;
        }
        kotlin.jvm.internal.s.g("Df", "access$getTAG$cp(...)");
        return null;
    }
}
