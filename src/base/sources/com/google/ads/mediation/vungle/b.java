package com.google.ads.mediation.vungle;

import android.content.Context;
import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import com.vungle.ads.b0;
import com.vungle.ads.f0;
import com.vungle.ads.h0;
import com.vungle.ads.q;
import com.vungle.ads.v;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public final com.vungle.ads.b a() {
        return new com.vungle.ads.b();
    }

    public final h0 b(Context context, String placementId, f0 adSize) {
        s.h(context, "context");
        s.h(placementId, "placementId");
        s.h(adSize, "adSize");
        return new h0(context, placementId, adSize);
    }

    public final q c(Context context, String placementId, com.vungle.ads.b adConfig) {
        s.h(context, "context");
        s.h(placementId, "placementId");
        s.h(adConfig, "adConfig");
        return new q(context, placementId, adConfig);
    }

    public final b0 e(Context context, String placementId, com.vungle.ads.b adConfig) {
        s.h(context, "context");
        s.h(placementId, "placementId");
        s.h(adConfig, "adConfig");
        return new b0(context, placementId, adConfig);
    }

    public final v d(Context context, String placementId) {
        s.h(context, UHbHibBvYxKnPE.Yls);
        s.h(placementId, "placementId");
        return new v(context, placementId);
    }
}
