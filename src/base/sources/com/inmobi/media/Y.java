package com.inmobi.media;

import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import com.inmobi.ads.InMobiAdRequestStatus;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class Y extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiAdRequestStatus f26047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f26048b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(InMobiAdRequestStatus status, V adFetchError) {
        super(status.getMessage());
        kotlin.jvm.internal.s.h(status, "status");
        kotlin.jvm.internal.s.h(adFetchError, "adFetchError");
        this.f26047a = status;
        this.f26048b = adFetchError;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return PvZsvNiPV.YNWuuaDwwRIlQ + this.f26047a.getStatusCode() + ", statusMessage=" + this.f26047a.getMessage() + ", adFetchError=" + this.f26048b + ")";
    }
}
