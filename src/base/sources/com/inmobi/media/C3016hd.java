package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;

/* JADX INFO: renamed from: com.inmobi.media.hd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C3016hd extends kotlin.jvm.internal.p implements tl.o {
    public C3016hd(C3067jd c3067jd) {
        super(2, c3067jd, C3067jd.class, "transitionToFetchedState", "transitionToFetchedState(Lcom/inmobi/media/ads/context/AdComponent;Lcom/inmobi/media/ads/network/inmobiJson/model/InMobiJsonResponse;)V", 0);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        C3416x p10 = (C3416x) obj;
        InMobiJsonResponse p11 = (InMobiJsonResponse) obj2;
        kotlin.jvm.internal.s.h(p10, "p0");
        kotlin.jvm.internal.s.h(p11, "p1");
        C3067jd c3067jd = (C3067jd) this.receiver;
        C3348u9 c3348u9 = c3067jd.f26426e;
        if (c3348u9 != null) {
            c3348u9.a("AUM-NativeFetchingState", "transitionToFetchedState");
        }
        c3067jd.f26805r.a(new C2990gd(p10, p11, c3067jd.f26803p, c3067jd.f26804q, c3067jd.f26805r), c3067jd);
        return fl.g0.f38750a;
    }
}
