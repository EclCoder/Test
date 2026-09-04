package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdSet;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.xk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3437xk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3262r1 f27871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f27872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f27873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f27874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27876f;

    public C3437xk(C3262r1 c3262r1, String str, String str2, String str3, String markupType) {
        kotlin.jvm.internal.s.h(markupType, "markupType");
        this.f27871a = c3262r1;
        this.f27872b = str;
        this.f27873c = str2;
        this.f27874d = str3;
        this.f27875e = markupType;
    }

    public final LinkedHashMap a() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C3262r1 c3262r1 = this.f27871a;
        if (c3262r1 != null) {
            linkedHashMap.put("adType", c3262r1.f27361a.m());
        }
        C3262r1 c3262r2 = this.f27871a;
        if (c3262r2 != null) {
            linkedHashMap.put("plId", Long.valueOf(c3262r2.f27361a.f26900l.f27659a));
        }
        C3262r1 c3262r3 = this.f27871a;
        if (c3262r3 != null && (str = c3262r3.f27361a.f26900l.f27664f) != null) {
            linkedHashMap.put("plType", str);
        }
        C3262r1 c3262r4 = this.f27871a;
        String str2 = null;
        if (c3262r4 != null) {
            AdSet adSetS = c3262r4.f27361a.s();
            Boolean boolValueOf = adSetS != null ? Boolean.valueOf(adSetS.getIsRewarded()) : null;
            if (boolValueOf != null) {
                linkedHashMap.put("isRewarded", boolValueOf);
            }
        }
        String str3 = this.f27873c;
        if (str3 != null) {
            linkedHashMap.put("creativeId", str3);
        }
        String str4 = this.f27872b;
        if (str4 != null) {
            linkedHashMap.put("creativeType", str4);
        }
        linkedHashMap.put("markupType", this.f27875e);
        String str5 = this.f27876f;
        if (str5 != null) {
            str2 = str5;
        } else {
            kotlin.jvm.internal.s.w("triggerSource");
        }
        linkedHashMap.put("trigger", str2);
        C3262r1 c3262r5 = this.f27871a;
        if (c3262r5 != null && c3262r5.a().length() > 0) {
            linkedHashMap.put("metadataBlob", this.f27871a.a());
        }
        return linkedHashMap;
    }

    public final void b() {
        C3462yk c3462yk;
        AtomicBoolean atomicBoolean;
        C3262r1 c3262r1 = this.f27871a;
        if (c3262r1 == null || (c3462yk = c3262r1.f27362b) == null || (atomicBoolean = c3462yk.f27960a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap linkedHashMapA = a();
            linkedHashMapA.put("networkType", B5.g());
            linkedHashMapA.put("errorCode", (short) 2177);
            String str = this.f27874d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b("AdImpressionSuccessful", linkedHashMapA, EnumC3281rk.SDK);
        }
    }

    public final void c() {
        C3462yk c3462yk;
        AtomicBoolean atomicBoolean;
        C3262r1 c3262r1 = this.f27871a;
        if (c3262r1 == null || (c3462yk = c3262r1.f27362b) == null || (atomicBoolean = c3462yk.f27960a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap linkedHashMapA = a();
            linkedHashMapA.put("networkType", B5.g());
            linkedHashMapA.put("errorCode", (short) 0);
            String str = this.f27874d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            C3178nk c3178nk = C3178nk.f27064a;
            C3178nk.b("AdImpressionSuccessful", linkedHashMapA, EnumC3281rk.SDK);
        }
    }
}
