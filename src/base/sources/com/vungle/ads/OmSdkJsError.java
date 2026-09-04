package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/vungle/ads/OmSdkJsError;", "Lcom/vungle/ads/VungleError;", "Lcom/vungle/ads/internal/protos/Sdk$SDKError$b;", "reason", "", "errorMessage", "<init>", "(Lcom/vungle/ads/internal/protos/Sdk$SDKError$b;Ljava/lang/String;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class OmSdkJsError extends VungleError {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OmSdkJsError(Sdk$SDKError.b reason, String errorMessage) {
        super(reason, errorMessage, null);
        kotlin.jvm.internal.s.h(reason, "reason");
        kotlin.jvm.internal.s.h(errorMessage, "errorMessage");
    }
}
