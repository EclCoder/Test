package com.vungle.ads;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/vungle/ads/VungleMediationLogger;", "", "<init>", "()V", "Lcom/vungle/ads/VungleAdType;", "ad", "", PglCryptUtils.KEY_MESSAGE, "Lfl/g0;", "logError", "(Lcom/vungle/ads/VungleAdType;Ljava/lang/String;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VungleMediationLogger {
    public static final VungleMediationLogger INSTANCE = new VungleMediationLogger();

    private VungleMediationLogger() {
    }

    public static final void logError(VungleAdType ad2, String message) {
        kotlin.jvm.internal.s.h(message, "message");
        g.INSTANCE.logError$vungle_ads_release(Sdk$SDKError.b.MEDIATION_ERROR, message, ad2 != null ? j0.getAdLogEntry(ad2) : null);
    }
}
