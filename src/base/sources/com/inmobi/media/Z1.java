package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.listeners.BannerAdEventListener;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Z1 extends Y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BannerAdEventListener f26110a;

    public Z1(BannerAdEventListener adEventListener) {
        kotlin.jvm.internal.s.h(adEventListener, "adEventListener");
        this.f26110a = adEventListener;
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, Map params) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.s.h(ad2, "ad");
        kotlin.jvm.internal.s.h(params, "params");
        this.f26110a.onAdClicked(ad2, params);
    }

    @Override // com.inmobi.media.J
    public final void b(Object obj, AdMetaInfo info) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.s.h(ad2, "ad");
        kotlin.jvm.internal.s.h(info, "info");
        this.f26110a.onAdLoadSucceeded(ad2, info);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, AdMetaInfo info) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.s.h(ad2, "ad");
        kotlin.jvm.internal.s.h(info, "info");
        this.f26110a.onAdFetchSuccessful(ad2, info);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, InMobiAdRequestStatus status) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.s.h(ad2, "ad");
        kotlin.jvm.internal.s.h(status, "status");
        kotlin.jvm.internal.s.g(Y1.class.getSimpleName(), "getSimpleName(...)");
        this.f26110a.onAdLoadFailed(ad2, status);
    }

    @Override // com.inmobi.media.J
    public final void a(Object obj, String data) {
        InMobiBanner ad2 = (InMobiBanner) obj;
        kotlin.jvm.internal.s.h(ad2, "ad");
        kotlin.jvm.internal.s.h(data, "data");
        try {
            Class<?> cls = Class.forName("IMraidLog");
            Method declaredMethod = cls.getDeclaredMethod("imraidLog", BannerAdEventListener.class, InMobiBanner.class, String.class);
            kotlin.jvm.internal.s.g(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.invoke(cls.newInstance(), this.f26110a, ad2, data);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
