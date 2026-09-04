package com.inmobi.ads.listeners;

import com.inmobi.ads.InMobiNative;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/inmobi/ads/listeners/NativeAdEventListener;", "Lcom/inmobi/ads/listeners/AdEventListener;", "Lcom/inmobi/ads/InMobiNative;", "<init>", "()V", "ad", "Lfl/g0;", "onAdFullScreenDismissed", "(Lcom/inmobi/ads/InMobiNative;)V", "onAdFullScreenDisplayed", "onUserWillLeaveApplication", "onAdClicked", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class NativeAdEventListener extends AdEventListener<InMobiNative> {
    public void onAdClicked(InMobiNative ad2) {
        s.h(ad2, "ad");
    }

    public void onAdFullScreenDismissed(InMobiNative ad2) {
        s.h(ad2, "ad");
    }

    public void onAdFullScreenDisplayed(InMobiNative ad2) {
        s.h(ad2, "ad");
    }

    public void onUserWillLeaveApplication(InMobiNative ad2) {
        s.h(ad2, "ad");
    }
}
