package com.vungle.ads.internal.omsdk;

import android.util.Base64;
import android.view.View;
import com.iab.omid.library.vungle.adsession.AdEvents;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;
import com.iab.omid.library.vungle.adsession.Partner;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.iab.omid.library.vungle.adsession.media.InteractionType;
import com.iab.omid.library.vungle.adsession.media.MediaEvents;
import com.iab.omid.library.vungle.adsession.media.Position;
import com.iab.omid.library.vungle.adsession.media.VastProperties;
import com.vungle.ads.internal.model.OmSdkData;
import com.vungle.ads.internal.util.q;
import fl.g0;
import fl.r;
import java.net.URL;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import kotlinx.serialization.json.v;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static final C0524a Companion = new C0524a(null);
    private static final String TAG = "NativeAd-OMTracker";
    private AdEvents adEvents;
    private AdSession adSession;
    private final boolean isNativeVideo;
    private final kotlinx.serialization.json.b json;
    private MediaEvents mediaEvents;

    /* JADX INFO: renamed from: com.vungle.ads.internal.omsdk.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0524a {
        public /* synthetic */ C0524a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0524a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends t implements Function1 {
        public static final b INSTANCE = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((kotlinx.serialization.json.e) obj);
            return g0.f38750a;
        }

        public final void invoke(kotlinx.serialization.json.e Json) {
            s.h(Json, "$this$Json");
            Json.f(true);
            Json.d(true);
            Json.e(false);
        }
    }

    public a(String omSdkData, String omSdkJS, boolean z10) {
        Object objB;
        OmSdkData omSdkData2;
        s.h(omSdkData, "omSdkData");
        s.h(omSdkJS, "omSdkJS");
        this.isNativeVideo = z10;
        kotlinx.serialization.json.b bVarB = v.b(null, b.INSTANCE, 1, null);
        this.json = bVarB;
        try {
            r.a aVar = r.f38769b;
            AdSessionConfiguration nativeAdSession = z10 ? getNativeAdSession(CreativeType.VIDEO) : getNativeAdSession(CreativeType.NATIVE_DISPLAY);
            Partner partnerCreatePartner = Partner.createPartner("Vungle", "7.7.2");
            byte[] decoded = Base64.decode(omSdkData, 0);
            if (decoded != null) {
                s.g(decoded, "decoded");
                String str = new String(decoded, bm.d.f9079b);
                pm.d dVarB = pm.t.b(bVarB.a(), l0.k(OmSdkData.class));
                s.f(dVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                omSdkData2 = (OmSdkData) bVarB.b(dVarB, str);
            } else {
                omSdkData2 = null;
            }
            if ((omSdkData2 != null ? omSdkData2.getVendorURL() : null) == null) {
                q.Companion.e(TAG, "Invalid OMSDK data: missing vendorURL");
            } else {
                VerificationScriptResource verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(omSdkData2.getVendorKey(), new URL(omSdkData2.getVendorURL()), omSdkData2.getParams());
                s.g(verificationScriptResource, "verificationScriptResource");
                this.adSession = AdSession.createAdSession(nativeAdSession, AdSessionContext.createNativeAdSessionContext(partnerCreatePartner, omSdkJS, gl.r.e(verificationScriptResource), null, null));
            }
            objB = r.b(g0.f38750a);
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            objB = r.b(fl.s.a(th2));
        }
        Throwable thE = r.e(objB);
        if (thE != null) {
            q.Companion.e(TAG, "error occured when create omsdk adSession:", thE);
        }
    }

    private final AdSessionConfiguration getNativeAdSession(CreativeType creativeType) {
        ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
        Owner owner = Owner.NATIVE;
        AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, creativeType == CreativeType.NATIVE_DISPLAY ? Owner.NONE : owner, false);
        s.g(adSessionConfigurationCreateAdSessionConfiguration, "createAdSessionConfigura…          false\n        )");
        return adSessionConfigurationCreateAdSessionConfiguration;
    }

    public final void impressionOccurred() {
        g0 g0Var;
        q.Companion.d(TAG, "track event: impressionOccurred");
        try {
            r.a aVar = r.f38769b;
            AdEvents adEvents = this.adEvents;
            if (adEvents != null) {
                adEvents.impressionOccurred();
                g0Var = g0.f38750a;
            } else {
                g0Var = null;
            }
            r.b(g0Var);
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            r.b(fl.s.a(th2));
        }
    }

    public final boolean isNativeVideo() {
        return this.isNativeVideo;
    }

    public final void onMuteChanged(boolean z10) {
        q.Companion.d(TAG, "track event: onMuteChanged muted=" + z10);
        g0 g0Var = null;
        if (z10) {
            try {
                r.a aVar = r.f38769b;
                MediaEvents mediaEvents = this.mediaEvents;
                if (mediaEvents != null) {
                    mediaEvents.volumeChange(0.0f);
                    g0Var = g0.f38750a;
                }
                r.b(g0Var);
                return;
            } catch (Throwable th2) {
                r.a aVar2 = r.f38769b;
                r.b(fl.s.a(th2));
                return;
            }
        }
        try {
            r.a aVar3 = r.f38769b;
            MediaEvents mediaEvents2 = this.mediaEvents;
            if (mediaEvents2 != null) {
                mediaEvents2.volumeChange(1.0f);
                g0Var = g0.f38750a;
            }
            r.b(g0Var);
        } catch (Throwable th3) {
            r.a aVar4 = r.f38769b;
            r.b(fl.s.a(th3));
        }
    }

    public final void onQuartileChanged(int i10) {
        q.Companion.d(TAG, "track event: onQuartileChanged quartile=" + i10);
        g0 g0Var = null;
        if (i10 == 5) {
            try {
                r.a aVar = r.f38769b;
                MediaEvents mediaEvents = this.mediaEvents;
                if (mediaEvents != null) {
                    mediaEvents.firstQuartile();
                    g0Var = g0.f38750a;
                }
                r.b(g0Var);
                return;
            } catch (Throwable th2) {
                r.a aVar2 = r.f38769b;
                r.b(fl.s.a(th2));
                return;
            }
        }
        if (i10 == 6) {
            try {
                r.a aVar3 = r.f38769b;
                MediaEvents mediaEvents2 = this.mediaEvents;
                if (mediaEvents2 != null) {
                    mediaEvents2.midpoint();
                    g0Var = g0.f38750a;
                }
                r.b(g0Var);
                return;
            } catch (Throwable th3) {
                r.a aVar4 = r.f38769b;
                r.b(fl.s.a(th3));
                return;
            }
        }
        if (i10 != 7) {
            return;
        }
        try {
            r.a aVar5 = r.f38769b;
            MediaEvents mediaEvents3 = this.mediaEvents;
            if (mediaEvents3 != null) {
                mediaEvents3.thirdQuartile();
                g0Var = g0.f38750a;
            }
            r.b(g0Var);
        } catch (Throwable th4) {
            r.a aVar6 = r.f38769b;
            r.b(fl.s.a(th4));
        }
    }

    public final void onQuartileStart(float f10, float f11) {
        g0 g0Var;
        q.Companion.d(TAG, "track event: onQuartileStart duration=" + f10 + " volume=" + f11);
        try {
            r.a aVar = r.f38769b;
            MediaEvents mediaEvents = this.mediaEvents;
            if (mediaEvents != null) {
                mediaEvents.start(f10, f11);
                g0Var = g0.f38750a;
            } else {
                g0Var = null;
            }
            r.b(g0Var);
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            r.b(fl.s.a(th2));
        }
    }

    public final void onStateCompleted() {
        g0 g0Var;
        q.Companion.d(TAG, "track event: onStateCompleted");
        try {
            r.a aVar = r.f38769b;
            MediaEvents mediaEvents = this.mediaEvents;
            if (mediaEvents != null) {
                mediaEvents.complete();
                g0Var = g0.f38750a;
            } else {
                g0Var = null;
            }
            r.b(g0Var);
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            r.b(fl.s.a(th2));
        }
    }

    public final void onStatePaused() {
        g0 g0Var;
        q.Companion.d(TAG, "track event: onStatePaused");
        try {
            r.a aVar = r.f38769b;
            MediaEvents mediaEvents = this.mediaEvents;
            if (mediaEvents != null) {
                mediaEvents.pause();
                g0Var = g0.f38750a;
            } else {
                g0Var = null;
            }
            r.b(g0Var);
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            r.b(fl.s.a(th2));
        }
    }

    public final void onStatePlay() {
        g0 g0Var;
        q.Companion.d(TAG, "track event: onStatePlay");
        try {
            r.a aVar = r.f38769b;
            MediaEvents mediaEvents = this.mediaEvents;
            if (mediaEvents != null) {
                mediaEvents.resume();
                g0Var = g0.f38750a;
            } else {
                g0Var = null;
            }
            r.b(g0Var);
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            r.b(fl.s.a(th2));
        }
    }

    public final void onUserInteraction() {
        g0 g0Var;
        q.Companion.d(TAG, "track event: onUserInteraction");
        try {
            r.a aVar = r.f38769b;
            MediaEvents mediaEvents = this.mediaEvents;
            if (mediaEvents != null) {
                mediaEvents.adUserInteraction(InteractionType.CLICK);
                g0Var = g0.f38750a;
            } else {
                g0Var = null;
            }
            r.b(g0Var);
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            r.b(fl.s.a(th2));
        }
    }

    public final void start(View view) {
        Object objB;
        Integer numValueOf;
        s.h(view, "view");
        q.a aVar = q.Companion;
        aVar.d(TAG, "start OM tracker");
        try {
            r.a aVar2 = r.f38769b;
            AdSession adSession = this.adSession;
            if (adSession != null) {
                this.adEvents = AdEvents.createAdEvents(adSession);
                if (this.isNativeVideo) {
                    this.mediaEvents = MediaEvents.createMediaEvents(adSession);
                }
                adSession.registerAdView(view);
                adSession.start();
                if (this.isNativeVideo) {
                    VastProperties vastPropertiesCreateVastPropertiesForNonSkippableMedia = VastProperties.createVastPropertiesForNonSkippableMedia(false, Position.STANDALONE);
                    AdEvents adEvents = this.adEvents;
                    if (adEvents != null) {
                        adEvents.loaded(vastPropertiesCreateVastPropertiesForNonSkippableMedia);
                    }
                } else {
                    AdEvents adEvents2 = this.adEvents;
                    if (adEvents2 != null) {
                        adEvents2.loaded();
                    }
                }
                numValueOf = Integer.valueOf(aVar.d(TAG, "track event: loaded"));
            } else {
                numValueOf = null;
            }
            objB = r.b(numValueOf);
        } catch (Throwable th2) {
            r.a aVar3 = r.f38769b;
            objB = r.b(fl.s.a(th2));
        }
        Throwable thE = r.e(objB);
        if (thE != null) {
            q.Companion.e(TAG, "error occured when start omsdk adSession:", thE);
        }
    }

    public final void stop() {
        AdSession adSession = this.adSession;
        if (adSession != null) {
            adSession.finish();
        }
        this.adSession = null;
        this.adEvents = null;
        this.mediaEvents = null;
    }
}
