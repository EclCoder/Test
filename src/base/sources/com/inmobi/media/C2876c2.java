package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Annu.HqKnbV;
import java.lang.ref.WeakReference;
import java.util.Map;
import qd.qPi.SVWsZyNSAChGIA;

/* JADX INFO: renamed from: com.inmobi.media.c2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class C2876c2 extends PublisherCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<InMobiBanner> f26296a;

    public C2876c2(InMobiBanner banner) {
        kotlin.jvm.internal.s.h(banner, "banner");
        this.f26296a = new WeakReference<>(banner);
    }

    public final WeakReference<InMobiBanner> a() {
        return this.f26296a;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(Map<Object, ? extends Object> params) {
        Y1 mPubListener;
        kotlin.jvm.internal.s.h(params, "params");
        InMobiBanner inMobiBanner = this.f26296a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiBanner, params);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        InMobiBanner ad2 = this.f26296a.get();
        if (ad2 == null) {
            return;
        }
        Y1 mPubListener = ad2.getMPubListener();
        if (mPubListener != null) {
            kotlin.jvm.internal.s.h(ad2, "ad");
            ((Z1) mPubListener).f26110a.onAdDismissed(ad2);
        }
        ad2.scheduleRefresh$media_release();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(AdMetaInfo info) {
        Y1 mPubListener;
        kotlin.jvm.internal.s.h(info, "info");
        InMobiBanner ad2 = this.f26296a.get();
        if (ad2 == null || (mPubListener = ad2.getMPubListener()) == null) {
            return;
        }
        kotlin.jvm.internal.s.h(ad2, "ad");
        ((Z1) mPubListener).f26110a.onAdDisplayed(ad2);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(InMobiAdRequestStatus status) {
        Y1 mPubListener;
        kotlin.jvm.internal.s.h(status, "status");
        InMobiBanner ad2 = this.f26296a.get();
        if (ad2 == null || (mPubListener = ad2.getMPubListener()) == null) {
            return;
        }
        kotlin.jvm.internal.s.h(ad2, "ad");
        kotlin.jvm.internal.s.h(status, "status");
        ((Z1) mPubListener).f26110a.onAdFetchFailed(ad2, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo info) {
        Y1 mPubListener;
        kotlin.jvm.internal.s.h(info, "info");
        InMobiBanner inMobiBanner = this.f26296a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiBanner, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(C3437xk c3437xk) {
        InMobiBanner ad2 = this.f26296a.get();
        Y1 mPubListener = ad2 != null ? ad2.getMPubListener() : null;
        if (mPubListener == null) {
            if (c3437xk != null) {
                c3437xk.b();
            }
        } else {
            kotlin.jvm.internal.s.h(ad2, "ad");
            ((Z1) mPubListener).f26110a.onAdImpression(ad2);
            if (c3437xk != null) {
                c3437xk.c();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(InMobiAdRequestStatus status) {
        kotlin.jvm.internal.s.h(status, "status");
        kotlin.jvm.internal.s.g(C2876c2.class.getSimpleName(), "getSimpleName(...)");
        InMobiBanner inMobiBanner = this.f26296a.get();
        if (inMobiBanner == null) {
            return;
        }
        Y1 mPubListener = inMobiBanner.getMPubListener();
        if (mPubListener != null) {
            mPubListener.a(inMobiBanner, status);
        }
        inMobiBanner.scheduleRefresh$media_release();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(AdMetaInfo info) {
        C2927e2 mAdManager;
        kotlin.jvm.internal.s.h(info, "info");
        InMobiBanner inMobiBanner = this.f26296a.get();
        if (inMobiBanner == null || (mAdManager = inMobiBanner.getMAdManager()) == null) {
            return;
        }
        if (!mAdManager.l()) {
            mAdManager.h();
            inMobiBanner.swapAdUnitsAndDisplayAd$media_release();
            Y1 mPubListener = inMobiBanner.getMPubListener();
            if (mPubListener != null) {
                mPubListener.b(inMobiBanner, info);
            }
            inMobiBanner.scheduleRefresh$media_release();
            return;
        }
        if (mAdManager.l()) {
            AbstractC3107l1 abstractC3107l1F = mAdManager.f();
            if (abstractC3107l1F != null) {
                abstractC3107l1F.c((short) 2173);
                return;
            }
            return;
        }
        AbstractC3107l1 abstractC3107l1F2 = mAdManager.f();
        if (abstractC3107l1F2 != null) {
            abstractC3107l1F2.c((short) 2174);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(String log) {
        Y1 mPubListener;
        kotlin.jvm.internal.s.h(log, "log");
        InMobiBanner inMobiBanner = this.f26296a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiBanner, log);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(byte[] request) {
        Y1 mPubListener;
        kotlin.jvm.internal.s.h(request, "request");
        InMobiBanner inMobiBanner = this.f26296a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        ((Z1) mPubListener).f26110a.onRequestPayloadCreated(request);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(Map<Object, ? extends Object> rewards) {
        Y1 mPubListener;
        kotlin.jvm.internal.s.h(rewards, "rewards");
        InMobiBanner ad2 = this.f26296a.get();
        if (ad2 == null || (mPubListener = ad2.getMPubListener()) == null) {
            return;
        }
        kotlin.jvm.internal.s.h(ad2, "ad");
        kotlin.jvm.internal.s.h(rewards, "rewards");
        ((Z1) mPubListener).f26110a.onRewardsUnlocked(ad2, rewards);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        Y1 mPubListener;
        InMobiBanner ad2 = this.f26296a.get();
        if (ad2 == null || (mPubListener = ad2.getMPubListener()) == null) {
            return;
        }
        kotlin.jvm.internal.s.h(ad2, "ad");
        ((Z1) mPubListener).f26110a.onUserLeftApplication(ad2);
    }

    public final void a(WeakReference<InMobiBanner> weakReference) {
        kotlin.jvm.internal.s.h(weakReference, "<set-?>");
        this.f26296a = weakReference;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAudioStatusChanged(V1 item) {
        AudioStatus audioStatus;
        kotlin.jvm.internal.s.h(item, HqKnbV.cIwwL);
        InMobiBanner inMobiBanner = this.f26296a.get();
        if (inMobiBanner == null) {
            return;
        }
        inMobiBanner.setAudioStatusInternal$media_release(item);
        AudioListener mAudioListener = inMobiBanner.getMAudioListener();
        if (mAudioListener != null) {
            V1.f25863b.getClass();
            kotlin.jvm.internal.s.h(item, "item");
            int iOrdinal = item.ordinal();
            if (iOrdinal != 1) {
                audioStatus = iOrdinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED;
            } else {
                audioStatus = AudioStatus.PLAYING;
            }
            mAudioListener.onAudioStatusChanged(inMobiBanner, audioStatus);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus status) {
        Y1 mPubListener;
        kotlin.jvm.internal.s.h(status, SVWsZyNSAChGIA.jRDfMWpBd);
        InMobiBanner inMobiBanner = this.f26296a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        kotlin.jvm.internal.s.h(status, "status");
        ((Z1) mPubListener).f26110a.onRequestPayloadCreationFailed(status);
    }
}
