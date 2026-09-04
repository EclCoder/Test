package com.vungle.ads.internal.load;

import android.content.Context;
import com.vungle.ads.AdResponseEmptyError;
import com.vungle.ads.VungleError;
import com.vungle.ads.f0;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.util.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class h extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, com.vungle.ads.internal.network.k vungleApiClient, com.vungle.ads.internal.executor.a sdkExecutors, com.vungle.ads.internal.omsdk.c omInjector, Downloader downloader, s pathProvider, b adRequest) {
        super(context, vungleApiClient, sdkExecutors, omInjector, downloader, pathProvider, adRequest);
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(vungleApiClient, "vungleApiClient");
        kotlin.jvm.internal.s.h(sdkExecutors, "sdkExecutors");
        kotlin.jvm.internal.s.h(omInjector, "omInjector");
        kotlin.jvm.internal.s.h(downloader, "downloader");
        kotlin.jvm.internal.s.h(pathProvider, "pathProvider");
        kotlin.jvm.internal.s.h(adRequest, "adRequest");
    }

    @Override // com.vungle.ads.internal.load.k
    public com.vungle.ads.internal.network.a getAdCall(String placement, f0 f0Var) {
        kotlin.jvm.internal.s.h(placement, "placement");
        return getVungleApiClient().requestCSBAd(placement, f0Var, getAdRequest().getCsbData());
    }

    @Override // com.vungle.ads.internal.load.k
    public String getApiErrorPrefix() {
        return "CSB";
    }

    @Override // com.vungle.ads.internal.load.d
    public VungleError validateAdMetadata(com.vungle.ads.internal.model.b adPayload) {
        kotlin.jvm.internal.s.h(adPayload, "adPayload");
        VungleError vungleErrorValidateAdMetadata = super.validateAdMetadata(adPayload);
        if (vungleErrorValidateAdMetadata != null) {
            return vungleErrorValidateAdMetadata;
        }
        if (adPayload.getCSBResponse() == null) {
            return new AdResponseEmptyError("CSB response is missing from ad payload");
        }
        return null;
    }
}
