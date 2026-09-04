package com.google.ads.mediation.inmobi;

import android.content.Context;
import android.widget.FrameLayout;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import com.inmobi.ads.listeners.NativeAdEventListener;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class b {
    public c a(Context context) {
        return new c(new FrameLayout(context));
    }

    public e b(Context context, Long l10) {
        return new e(new InMobiBanner(context, l10.longValue()));
    }

    public k c(Context context, Long l10, InterstitialAdEventListener interstitialAdEventListener) {
        return new k(new InMobiInterstitial(context, l10.longValue(), interstitialAdEventListener));
    }

    public n d(Context context, Long l10, NativeAdEventListener nativeAdEventListener) {
        return new n(new InMobiNative(context, l10.longValue(), nativeAdEventListener));
    }

    public n e(InMobiNative inMobiNative) {
        return new n(inMobiNative);
    }
}
