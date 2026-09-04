package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.APIFailedStatusCodeError;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.AdRetryActiveError;
import com.vungle.ads.AdRetryError;
import com.vungle.ads.NetworkTimeoutError;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.VungleError;
import com.vungle.ads.d0;
import com.vungle.ads.f0;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.protos.Sdk$SDKMetric;
import java.net.SocketTimeoutException;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class k extends d {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a implements com.vungle.ads.internal.network.b {
        final /* synthetic */ Placement $placement;

        a(Placement placement) {
            this.$placement = placement;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onFailure$lambda-1, reason: not valid java name */
        public static final void m104onFailure$lambda1(k this$0, Throwable th2) {
            s.h(this$0, "this$0");
            this$0.onAdLoadFailed(this$0.retrofitToVungleError(th2).setLogEntry$vungle_ads_release(this$0.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: onResponse$lambda-0, reason: not valid java name */
        public static final void m105onResponse$lambda0(k this$0, Placement placement, com.vungle.ads.internal.network.f fVar) throws Throwable {
            s.h(this$0, "this$0");
            s.h(placement, "$placement");
            if (this$0.getVungleApiClient().getRetryAfterHeaderValue(placement.getReferenceId()) > 0) {
                this$0.onAdLoadFailed(new AdRetryError().setLogEntry$vungle_ads_release(this$0.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
                return;
            }
            if (fVar != null && !fVar.isSuccessful()) {
                this$0.onAdLoadFailed(new APIFailedStatusCodeError(this$0.getApiErrorPrefix() + " API: " + fVar.code()).setLogEntry$vungle_ads_release(this$0.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
                return;
            }
            com.vungle.ads.internal.model.b bVar = fVar != null ? (com.vungle.ads.internal.model.b) fVar.body() : null;
            if ((bVar != null ? bVar.adUnit() : null) != null) {
                this$0.handleAdMetaData$vungle_ads_release(bVar, new d0(Sdk$SDKMetric.b.CONFIG_LOADED_FROM_AD_LOAD));
                return;
            }
            this$0.onAdLoadFailed(new AdResponseEmptyError(this$0.getApiErrorPrefix() + " ad response is empty").setLogEntry$vungle_ads_release(this$0.getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
        }

        @Override // com.vungle.ads.internal.network.b
        public void onFailure(com.vungle.ads.internal.network.a aVar, final Throwable th2) {
            com.vungle.ads.internal.executor.i backgroundExecutor = k.this.getSdkExecutors().getBackgroundExecutor();
            final k kVar = k.this;
            backgroundExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.i
                @Override // java.lang.Runnable
                public final void run() {
                    k.a.m104onFailure$lambda1(kVar, th2);
                }
            });
        }

        @Override // com.vungle.ads.internal.network.b
        public void onResponse(com.vungle.ads.internal.network.a aVar, final com.vungle.ads.internal.network.f fVar) {
            com.vungle.ads.internal.executor.i backgroundExecutor = k.this.getSdkExecutors().getBackgroundExecutor();
            final k kVar = k.this;
            final Placement placement = this.$placement;
            backgroundExecutor.execute(new Runnable() { // from class: com.vungle.ads.internal.load.j
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    k.a.m105onResponse$lambda0(kVar, placement, fVar);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, com.vungle.ads.internal.network.k vungleApiClient, com.vungle.ads.internal.executor.a sdkExecutors, com.vungle.ads.internal.omsdk.c omInjector, Downloader downloader, com.vungle.ads.internal.util.s pathProvider, b adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        s.h(context, "context");
        s.h(vungleApiClient, "vungleApiClient");
        s.h(sdkExecutors, "sdkExecutors");
        s.h(omInjector, "omInjector");
        s.h(downloader, "downloader");
        s.h(pathProvider, "pathProvider");
        s.h(adRequest, "adRequest");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VungleError retrofitToVungleError(Throwable th2) {
        if (th2 instanceof SocketTimeoutException) {
            return new NetworkTimeoutError();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getApiErrorPrefix());
        sb2.append(" request fail: ");
        sb2.append(th2 != null ? th2.getMessage() : null);
        return new NetworkUnreachable(sb2.toString());
    }

    protected void fetchAdMetadata(f0 f0Var, Placement placement) {
        s.h(placement, "placement");
        if (getVungleApiClient().checkIsRetryAfterActive(placement.getReferenceId())) {
            onAdLoadFailed(new AdRetryActiveError().setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
            return;
        }
        com.vungle.ads.internal.network.a adCall = getAdCall(placement.getReferenceId(), f0Var);
        if (adCall != null) {
            adCall.enqueue(new a(placement));
            return;
        }
        onAdLoadFailed(new NetworkUnreachable(getApiErrorPrefix() + " is null").setLogEntry$vungle_ads_release(getLogEntry$vungle_ads_release()).logError$vungle_ads_release());
    }

    public com.vungle.ads.internal.network.a getAdCall(String placement, f0 f0Var) {
        s.h(placement, "placement");
        return getVungleApiClient().requestAd(placement, f0Var);
    }

    public String getApiErrorPrefix() {
        return com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS;
    }

    @Override // com.vungle.ads.internal.load.d
    protected void requestAd() {
        fetchAdMetadata(getAdRequest().getRequestAdSize(), getAdRequest().getPlacement());
    }

    @Override // com.vungle.ads.internal.load.d
    public void onAdLoadReady() {
    }
}
