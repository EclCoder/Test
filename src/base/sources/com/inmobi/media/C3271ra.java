package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.ra, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class C3271ra extends PublisherCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<InMobiInterstitial> f27384a;

    public C3271ra(InMobiInterstitial interstitial) {
        kotlin.jvm.internal.s.h(interstitial, "interstitial");
        this.f27384a = new WeakReference<>(interstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(Map<Object, ? extends Object> params) {
        AbstractC3194oa mPubListener$media_release;
        kotlin.jvm.internal.s.h(params, "params");
        InMobiInterstitial inMobiInterstitial = this.f27384a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, params);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        AbstractC3194oa mPubListener$media_release;
        InMobiInterstitial ad2 = this.f27384a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.s.h(ad2, "ad");
        ((C3220pa) mPubListener$media_release).f27184a.onAdDismissed(ad2);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayFailed() {
        AbstractC3194oa mPubListener$media_release;
        InMobiInterstitial ad2 = this.f27384a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.s.h(ad2, "ad");
        ((C3220pa) mPubListener$media_release).f27184a.onAdDisplayFailed(ad2);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(AdMetaInfo info) {
        AbstractC3194oa mPubListener$media_release;
        kotlin.jvm.internal.s.h(info, "info");
        InMobiInterstitial ad2 = this.f27384a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.s.h(ad2, "ad");
        kotlin.jvm.internal.s.h(info, "info");
        ((C3220pa) mPubListener$media_release).f27184a.onAdDisplayed(ad2, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(InMobiAdRequestStatus status) {
        AbstractC3194oa mPubListener$media_release;
        kotlin.jvm.internal.s.h(status, "status");
        InMobiInterstitial ad2 = this.f27384a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.s.h(ad2, "ad");
        kotlin.jvm.internal.s.h(status, "status");
        ((C3220pa) mPubListener$media_release).f27184a.onAdFetchFailed(ad2, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo info) {
        AbstractC3194oa mPubListener$media_release;
        kotlin.jvm.internal.s.h(info, "info");
        InMobiInterstitial inMobiInterstitial = this.f27384a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(C3437xk c3437xk) {
        InMobiInterstitial ad2 = this.f27384a.get();
        AbstractC3194oa mPubListener$media_release = ad2 != null ? ad2.getMPubListener$media_release() : null;
        if (mPubListener$media_release == null) {
            if (c3437xk != null) {
                c3437xk.b();
            }
        } else {
            kotlin.jvm.internal.s.h(ad2, "ad");
            ((C3220pa) mPubListener$media_release).f27184a.onAdImpression(ad2);
            if (c3437xk != null) {
                c3437xk.c();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(InMobiAdRequestStatus status) {
        AbstractC3194oa mPubListener$media_release;
        kotlin.jvm.internal.s.h(status, "status");
        InMobiInterstitial inMobiInterstitial = this.f27384a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(AdMetaInfo info) {
        AbstractC3194oa mPubListener$media_release;
        kotlin.jvm.internal.s.h(info, "info");
        InMobiInterstitial inMobiInterstitial = this.f27384a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.b(inMobiInterstitial, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdWillDisplay() {
        AbstractC3194oa mPubListener$media_release;
        InMobiInterstitial ad2 = this.f27384a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.s.h(ad2, "ad");
        ((C3220pa) mPubListener$media_release).f27184a.onAdWillDisplay(ad2);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(String log) {
        AbstractC3194oa mPubListener$media_release;
        kotlin.jvm.internal.s.h(log, "log");
        InMobiInterstitial inMobiInterstitial = this.f27384a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, log);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(byte[] request) {
        AbstractC3194oa mPubListener$media_release;
        kotlin.jvm.internal.s.h(request, "request");
        InMobiInterstitial inMobiInterstitial = this.f27384a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((C3220pa) mPubListener$media_release).f27184a.onRequestPayloadCreated(request);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus status) {
        AbstractC3194oa mPubListener$media_release;
        kotlin.jvm.internal.s.h(status, "reason");
        InMobiInterstitial inMobiInterstitial = this.f27384a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.s.h(status, "status");
        ((C3220pa) mPubListener$media_release).f27184a.onRequestPayloadCreationFailed(status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(Map<Object, ? extends Object> rewards) {
        AbstractC3194oa mPubListener$media_release;
        kotlin.jvm.internal.s.h(rewards, "rewards");
        InMobiInterstitial ad2 = this.f27384a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.s.h(ad2, "ad");
        kotlin.jvm.internal.s.h(rewards, "rewards");
        ((C3220pa) mPubListener$media_release).f27184a.onRewardsUnlocked(ad2, rewards);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        AbstractC3194oa mPubListener$media_release;
        InMobiInterstitial ad2 = this.f27384a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        kotlin.jvm.internal.s.h(ad2, "ad");
        ((C3220pa) mPubListener$media_release).f27184a.onUserLeftApplication(ad2);
    }
}
