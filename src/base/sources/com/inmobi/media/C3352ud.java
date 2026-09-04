package com.inmobi.media;

import c1.pGX.geAgcEazw;
import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.ud, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3352ud extends kotlin.jvm.internal.p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        C3378vd c3378vd = (C3378vd) this.receiver;
        c3378vd.getClass();
        c3378vd.a(gl.l0.m(fl.w.a("errorCode", Short.valueOf(sShortValue))), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        return fl.g0.f38750a;
    }

    public C3352ud(C3378vd c3378vd) {
        super(1, c3378vd, C3378vd.class, "transitionToFetchFailedState", geAgcEazw.IlUS, 0);
    }
}
