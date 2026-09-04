package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.AdMarkupInvalidError;
import com.vungle.ads.InvalidBidPayloadError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.d0;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import com.vungle.ads.internal.util.q;
import com.vungle.ads.internal.util.s;
import fl.o;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class m extends d {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.k, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.network.k invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.k.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.i, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.network.i invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.i.class);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, com.vungle.ads.internal.network.k vungleApiClient, com.vungle.ads.internal.executor.a sdkExecutors, com.vungle.ads.internal.omsdk.c omInjector, Downloader downloader, s pathProvider, com.vungle.ads.internal.load.b adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(vungleApiClient, "vungleApiClient");
        kotlin.jvm.internal.s.h(sdkExecutors, "sdkExecutors");
        kotlin.jvm.internal.s.h(omInjector, "omInjector");
        kotlin.jvm.internal.s.h(downloader, "downloader");
        kotlin.jvm.internal.s.h(pathProvider, "pathProvider");
        kotlin.jvm.internal.s.h(adRequest, "adRequest");
    }

    /* JADX INFO: renamed from: requestAd$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.network.k m106requestAd$lambda0(fl.k kVar) {
        return (com.vungle.ads.internal.network.k) kVar.getValue();
    }

    private final void sendWinNotification(List<String> list) {
        if (list == null || !list.isEmpty()) {
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            fl.k kVarA = fl.l.a(o.SYNCHRONIZED, new b(getContext()));
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    com.vungle.ads.internal.network.i.sendTpat$default(m107sendWinNotification$lambda2(kVarA), new com.vungle.ads.internal.network.g.a((String) it.next()).tpatKey(com.vungle.ads.internal.f.WIN_NOTIFICATION).withLogEntry(getLogEntry$vungle_ads_release()).build(), false, 2, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: sendWinNotification$lambda-2, reason: not valid java name */
    private static final com.vungle.ads.internal.network.i m107sendWinNotification$lambda2(fl.k kVar) {
        return (com.vungle.ads.internal.network.i) kVar.getValue();
    }

    @Override // com.vungle.ads.internal.load.d
    public void onAdLoadReady() {
        com.vungle.ads.internal.model.b advertisement$vungle_ads_release = getAdvertisement$vungle_ads_release();
        sendWinNotification(advertisement$vungle_ads_release != null ? advertisement$vungle_ads_release.getWinNotifications() : null);
    }

    @Override // com.vungle.ads.internal.load.d
    protected void requestAd() throws Throwable {
        BidPayload adMarkup = getAdRequest().getAdMarkup();
        if (adMarkup == null) {
            onAdLoadFailed(new InvalidBidPayloadError().setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
            return;
        }
        if (com.vungle.ads.internal.e.INSTANCE.rtaDebuggingEnabled()) {
            try {
                String decodedAdsResponse = adMarkup.getDecodedAdsResponse();
                q.Companion.d("RTA_DEBUGGER", String.valueOf(decodedAdsResponse));
                ServiceLocator.Companion companion = ServiceLocator.Companion;
                fl.k kVarA = fl.l.a(o.SYNCHRONIZED, new a(getContext()));
                if (decodedAdsResponse != null) {
                    new l(m106requestAd$lambda0(kVarA)).reportAdMarkup(decodedAdsResponse);
                }
            } catch (Throwable unused) {
            }
        }
        com.vungle.ads.internal.model.b ad2 = adMarkup.getAd();
        Integer version = adMarkup.getVersion();
        if (version == null || version.intValue() != 2 || ad2 == null) {
            onAdLoadFailed(new AdMarkupInvalidError("The ad response did not contain valid ad markup").setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
        } else {
            handleAdMetaData$vungle_ads_release(ad2, new d0(Sdk$SDKMetric.b.CONFIG_LOADED_FROM_ADM_LOAD));
        }
    }
}
