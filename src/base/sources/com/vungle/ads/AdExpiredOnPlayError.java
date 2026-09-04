package com.vungle.ads;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/vungle/ads/AdExpiredOnPlayError;", "Lcom/vungle/ads/VungleError;", PglCryptUtils.KEY_MESSAGE, "", "(Ljava/lang/String;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AdExpiredOnPlayError extends VungleError {
    /* JADX WARN: Multi-variable type inference failed */
    public AdExpiredOnPlayError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AdExpiredOnPlayError(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str);
    }

    public AdExpiredOnPlayError(String str) {
        super(Sdk$SDKError.b.AD_EXPIRED_ON_PLAY, "Ad expired upon playback request: " + str, null);
    }
}
