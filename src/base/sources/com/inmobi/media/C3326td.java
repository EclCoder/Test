package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;

/* JADX INFO: renamed from: com.inmobi.media.td, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C3326td extends kotlin.jvm.internal.p implements tl.o {
    public C3326td(C3378vd c3378vd) {
        super(2, c3378vd, C3378vd.class, "transitionToFetchedState", "transitionToFetchedState(Lcom/inmobi/media/ads/context/AdComponent;Lcom/inmobi/media/ads/network/inmobiJson/model/InMobiJsonResponse;)V", 0);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        C3416x p10 = (C3416x) obj;
        InMobiJsonResponse p11 = (InMobiJsonResponse) obj2;
        kotlin.jvm.internal.s.h(p10, "p0");
        kotlin.jvm.internal.s.h(p11, "p1");
        C3378vd c3378vd = (C3378vd) this.receiver;
        C3348u9 c3348u9 = c3378vd.f26426e;
        if (c3348u9 != null) {
            c3348u9.a("AUM-NativeLoadResponseState", "transitionToFetchedState - validation successful, transitioning to fetched state");
        }
        c3378vd.f27720r.a(new C2990gd(p10, p11, c3378vd.f27718p, c3378vd.f27719q, c3378vd.f27720r), c3378vd);
        return fl.g0.f38750a;
    }
}
