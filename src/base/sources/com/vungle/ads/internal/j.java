package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.internal.model.Placement;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class j extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        super(context);
        s.h(context, "context");
    }

    @Override // com.vungle.ads.internal.a
    public boolean isValidAdTypeForPlacement(Placement placement) {
        s.h(placement, "placement");
        return placement.isInterstitial() || placement.isAppOpen();
    }
}
