package com.inmobi.media;

import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.inmobi.media.kh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC3097kh {
    public static final void a(AbstractC3071jh telemetryType) {
        kotlin.jvm.internal.s.h(telemetryType, "telemetryType");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (telemetryType instanceof C2994gh) {
            linkedHashMap.put("trigger", ((C2994gh) telemetryType).f26620a);
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b("BillingClientConnectionError", linkedHashMap, EnumC3281rk.SDK);
        } else if (telemetryType instanceof C3020hh) {
            linkedHashMap.put("errorCode", Short.valueOf(((C3020hh) telemetryType).f26685a));
            C3178nk c3178nk2 = C3178nk.f27064a;
            C3178nk.b("IAPFetchFailed", linkedHashMap, EnumC3281rk.SDK);
        } else {
            if (!(telemetryType instanceof C3045ih)) {
                throw new NoWhenBranchMatchedException();
            }
            C3178nk c3178nk3 = C3178nk.f27064a;
            C3178nk.b("IAPFetchSuccess", linkedHashMap, EnumC3281rk.SDK);
        }
    }
}
