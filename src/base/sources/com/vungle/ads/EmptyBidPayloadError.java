package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/EmptyBidPayloadError;", "Lcom/vungle/ads/VungleError;", "placementId", "", "(Ljava/lang/String;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class EmptyBidPayloadError extends VungleError {
    public EmptyBidPayloadError(String str) {
        super(Sdk$SDKError.b.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD, str + " header bidding status does not match with loadAd parameters", null);
    }
}
