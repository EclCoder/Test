package com.vungle.ads;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class q extends k {
    public /* synthetic */ q(Context context, String str, b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? new b() : bVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, String placementId, b adConfig) {
        super(context, placementId, adConfig);
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(placementId, "placementId");
        kotlin.jvm.internal.s.h(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.i
    public com.vungle.ads.internal.j constructAdInternal$vungle_ads_release(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        return new com.vungle.ads.internal.j(context);
    }
}
