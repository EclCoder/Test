package com.inmobi.media;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import com.iab.omid.library.inmobi.adsession.AdEvents;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionConfiguration;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.CreativeType;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import com.iab.omid.library.inmobi.adsession.Owner;
import com.iab.omid.library.inmobi.adsession.media.MediaEvents;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.rf, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3276rf implements InterfaceC2952f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImpressionType f27397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AdSessionContext f27398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f27399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f27400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AdSession f27401f;

    public C3276rf(String mAdSessionType, ImpressionType impressionType, AdSessionContext adSessionContext, boolean z10) {
        kotlin.jvm.internal.s.h(mAdSessionType, "mAdSessionType");
        kotlin.jvm.internal.s.h(impressionType, "impressionType");
        this.f27396a = mAdSessionType;
        this.f27397b = impressionType;
        this.f27398c = adSessionContext;
        this.f27399d = z10;
    }

    public static boolean a(byte b10) {
        if (b10 > 0) {
            return true;
        }
        fl.k kVar = W9.f25935a;
        W9.a(new M2(new Exception("Omid AdSession State Error currentState :: " + ((int) b10) + ", expectedState :: 1")));
        return false;
    }

    public static boolean b(byte b10) {
        if (b10 == 1) {
            return true;
        }
        fl.k kVar = W9.f25935a;
        W9.a(new M2(new Exception("Omid AdSession State Error currentState :: " + ((int) b10) + ", expectedState :: 1")));
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    public final void a(WebView view, Map map) {
        AdSession adSession;
        AdSession adSession2;
        CreativeType creativeType;
        Owner owner;
        CreativeType creativeType2;
        kotlin.jvm.internal.s.h(view, "trackingView");
        if (this.f27401f == null) {
            boolean z10 = this.f27399d;
            Owner owner2 = Owner.JAVASCRIPT;
            CreativeType creativeType3 = CreativeType.DEFINED_BY_JAVASCRIPT;
            switch (this.f27396a) {
                case "native_display_ad":
                    owner2 = Owner.NATIVE;
                    owner = Owner.NONE;
                    creativeType = CreativeType.NATIVE_DISPLAY;
                    break;
                case "html_display_ad":
                    owner = Owner.NONE;
                    creativeType = CreativeType.HTML_DISPLAY;
                    break;
                case "native_video_ad":
                    owner2 = Owner.NATIVE;
                    creativeType2 = CreativeType.VIDEO;
                    creativeType = creativeType2;
                    owner = owner2;
                    break;
                case "html_audio_ad":
                    creativeType2 = CreativeType.AUDIO;
                    creativeType = creativeType2;
                    owner = owner2;
                    break;
                case "html_video_ad":
                    creativeType2 = CreativeType.VIDEO;
                    creativeType = creativeType2;
                    owner = owner2;
                    break;
                default:
                    creativeType = creativeType3;
                    owner = null;
                    break;
            }
            AdSession adSession3 = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, this.f27397b, owner2, owner, z10), this.f27398c);
            kotlin.jvm.internal.s.g(adSession3, giNWGaNAgVQoO.gsPvcobtsyj);
            this.f27401f = adSession3;
            if (adSession3 != null) {
                String str = this.f27396a;
                kotlin.jvm.internal.s.h(adSession3, "adSession");
                if (kotlin.jvm.internal.s.c(str, "native_video_ad")) {
                    MediaEvents.createMediaEvents(adSession3);
                    AdEvents.createAdEvents(adSession3);
                } else {
                    AdEvents.createAdEvents(adSession3);
                }
                this.f27400e = (byte) 1;
            }
        }
        kotlin.jvm.internal.s.h(view, "view");
        if (b(this.f27400e) && (adSession2 = this.f27401f) != null) {
            adSession2.registerAdView(view);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                View childView = (View) entry.getKey();
                FriendlyObstructionPurpose obstructionCode = (FriendlyObstructionPurpose) entry.getValue();
                kotlin.jvm.internal.s.h(childView, "childView");
                kotlin.jvm.internal.s.h(obstructionCode, "obstructionCode");
                if (a(this.f27400e) && (adSession = this.f27401f) != null) {
                    adSession.addFriendlyObstruction(childView, obstructionCode, null);
                }
            }
        }
        if (b(this.f27400e)) {
            AdSession adSession4 = this.f27401f;
            if (adSession4 != null) {
                adSession4.start();
            }
            this.f27400e = (byte) 2;
        }
    }
}
