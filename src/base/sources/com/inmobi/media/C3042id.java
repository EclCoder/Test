package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.id, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C3042id extends kotlin.jvm.internal.p implements Function1 {
    public C3042id(C3067jd c3067jd) {
        super(1, c3067jd, C3067jd.class, "transitionToFetchFailedState", "transitionToFetchFailedState(S)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        C3067jd c3067jd = (C3067jd) this.receiver;
        c3067jd.getClass();
        c3067jd.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), sShortValue);
        return fl.g0.f38750a;
    }
}
