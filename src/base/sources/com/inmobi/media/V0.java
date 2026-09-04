package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.ads.network.common.model.MetaInfo;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class V0 {
    public static void a(AdResponse adResponse, C3348u9 c3348u9, Function1 onFetchEvent) {
        MetaInfo metaInfo;
        kotlin.jvm.internal.s.h(adResponse, "adResponse");
        kotlin.jvm.internal.s.h(onFetchEvent, "onFetchEvent");
        Objects.toString(adResponse);
        AdSet adSet = (AdSet) gl.r.e0(adResponse.getAdSets(), 0);
        if (bm.r.V0(adResponse.getRequestId()).toString().length() == 0) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C2867bj(gl.l0.m(fl.w.a("errorCode", (short) 2208))));
        }
        if (adResponse.getAdSets().isEmpty()) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), new C2919dj((short) 54));
        }
        if (adSet == null) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C2919dj((short) 2364));
        }
        if (adSet.getAds().isEmpty()) {
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.NO_FILL), new C2919dj((short) 54));
        }
        com.inmobi.media.ads.network.common.model.Ad ad2 = (com.inmobi.media.ads.network.common.model.Ad) gl.r.e0(adSet.getAds(), 0);
        String creativeType = (ad2 == null || (metaInfo = ad2.getMetaInfo()) == null) ? null : metaInfo.getCreativeType();
        Map mapM = gl.l0.m(fl.w.a("isRewarded", Boolean.valueOf(adSet.getIsRewarded())));
        if (creativeType != null) {
            mapM.put("creativeType", creativeType);
        }
        onFetchEvent.invoke(new C2893cj(mapM));
        a(adSet.getAdSetId(), adSet.getIsRewarded());
        a(adSet, c3348u9);
    }

    public static void a(String str, boolean z10) {
        if (str.length() != 0) {
            return;
        }
        throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C2867bj(gl.l0.m(fl.w.a("errorCode", (short) 2231), fl.w.a("isRewarded", Boolean.valueOf(z10)))));
    }

    public static void a(AdSet adSet, C3348u9 c3348u9) {
        Objects.toString(adSet);
        if (adSet.getAds().peekFirst() != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i10 = 0;
            for (Object obj : adSet.getAds()) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    gl.r.u();
                }
                com.inmobi.media.ads.network.common.model.Ad ad2 = (com.inmobi.media.ads.network.common.model.Ad) obj;
                if (i10 == 0) {
                    a(ad2);
                } else {
                    try {
                        a(ad2);
                        fl.g0 g0Var = fl.g0.f38750a;
                    } catch (Y e10) {
                        if (c3348u9 != null) {
                            c3348u9.b("AdResponseValidator", "validateAdObjects Exception: (Index: " + i10 + ") - " + e10);
                        }
                        linkedHashSet.add(ad2);
                    }
                }
                i10 = i11;
            }
            adSet.getAds().removeAll(linkedHashSet);
            return;
        }
        throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C2867bj(gl.l0.m(fl.w.a("errorCode", (short) 2116), fl.w.a("isRewarded", Boolean.valueOf(adSet.getIsRewarded())))));
    }

    public static void a(com.inmobi.media.ads.network.common.model.Ad ad2) {
        Objects.toString(ad2);
        if (ad2.getImpressionId().length() != 0) {
            String type = ad2.getMarkupType();
            kotlin.jvm.internal.s.h(type, "type");
            if ((kotlin.jvm.internal.s.c(type, "html") || kotlin.jvm.internal.s.c(type, "inmobiJson") || kotlin.jvm.internal.s.c(type, "htmlUrl")) && !kotlin.jvm.internal.s.c(ad2.getMarkupType(), "unknown")) {
                try {
                    ad2.getPubContent().a();
                    return;
                } catch (IllegalArgumentException unused) {
                    throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C2867bj(gl.l0.m(fl.w.a("errorCode", (short) 2163))));
                }
            }
            throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C2867bj(gl.l0.m(fl.w.a("errorCode", (short) 2163))));
        }
        HashMap map = new HashMap();
        map.put("errorCode", (short) 2230);
        throw new Y(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new C2867bj(map));
    }
}
