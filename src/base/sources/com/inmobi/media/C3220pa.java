package com.inmobi.media;

import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.listeners.InterstitialAdEventListener;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.pa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3220pa extends AbstractC3194oa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterstitialAdEventListener f27184a;

    public C3220pa(InterstitialAdEventListener adEventListener) {
        kotlin.jvm.internal.s.h(adEventListener, "adEventListener");
        this.f27184a = adEventListener;
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, Map params) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.s.h(ad2, "ad");
        kotlin.jvm.internal.s.h(params, "params");
        this.f27184a.onAdClicked(ad2, params);
    }

    @Override // com.inmobi.media.J
    public final void b(Object obj, AdMetaInfo info) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.s.h(ad2, "ad");
        kotlin.jvm.internal.s.h(info, "info");
        this.f27184a.onAdLoadSucceeded(ad2, info);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, AdMetaInfo info) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.s.h(ad2, "ad");
        kotlin.jvm.internal.s.h(info, "info");
        this.f27184a.onAdFetchSuccessful(ad2, info);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, InMobiAdRequestStatus status) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.s.h(ad2, "ad");
        kotlin.jvm.internal.s.h(status, "status");
        this.f27184a.onAdLoadFailed(ad2, status);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, String data) {
        InMobiInterstitial ad2 = (InMobiInterstitial) obj;
        kotlin.jvm.internal.s.h(ad2, "ad");
        kotlin.jvm.internal.s.h(data, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", InterstitialAdEventListener.class, InMobiInterstitial.class, String.class);
            kotlin.jvm.internal.s.g(declaredMethod, UHbHibBvYxKnPE.ieOImDWrfCr);
            declaredMethod.invoke(cls.newInstance(), this.f27184a, ad2, data);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
