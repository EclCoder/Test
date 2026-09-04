package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.b0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2848b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f26236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f26238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f26239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f26240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C3348u9 f26241f;

    public C2848b0(WeakReference adUnitEventListener, String adtype, boolean z10) {
        kotlin.jvm.internal.s.h(adUnitEventListener, "adUnitEventListener");
        kotlin.jvm.internal.s.h(adtype, "adtype");
        this.f26236a = adUnitEventListener;
        this.f26237b = adtype;
        this.f26238c = z10;
        this.f26239d = new AtomicBoolean(false);
        this.f26240e = String.valueOf(kotlin.jvm.internal.l0.b(C2848b0.class).k());
    }

    public final void a(C3437xk c3437xk) {
        Ph ph2;
        C3462yk c3462yk;
        AtomicBoolean atomicBoolean;
        if (!this.f26239d.getAndSet(true)) {
            C2944ej c2944ej = C2944ej.f26502a;
            String str = this.f26237b;
            Boolean boolValueOf = Boolean.valueOf(this.f26238c);
            c2944ej.getClass();
            C2944ej.a(str, boolValueOf);
            AbstractC2978g1 abstractC2978g1 = (AbstractC2978g1) this.f26236a.get();
            if (abstractC2978g1 != null) {
                abstractC2978g1.a(c3437xk);
            } else if (c3437xk != null) {
                c3437xk.b();
            }
            C3348u9 c3348u9 = this.f26241f;
            if (c3348u9 != null) {
                c3348u9.a(this.f26240e, "==== CHECKPOINT REACHED - IMPRESSION FIRED ====");
            }
            C3348u9 c3348u10 = this.f26241f;
            if (c3348u10 == null || (ph2 = c3348u10.f27613a) == null) {
                return;
            }
            ph2.a();
            return;
        }
        C3348u9 c3348u11 = this.f26241f;
        if (c3348u11 != null) {
            c3348u11.c(this.f26240e, "skipping as Impression is already Called");
        }
        if (c3437xk != null) {
            C3262r1 c3262r1 = c3437xk.f27871a;
            if (c3262r1 == null || (c3462yk = c3262r1.f27362b) == null || (atomicBoolean = c3462yk.f27960a) == null || !atomicBoolean.getAndSet(true)) {
                LinkedHashMap linkedHashMapA = c3437xk.a();
                linkedHashMapA.put("networkType", B5.g());
                linkedHashMapA.put("errorCode", (short) 2179);
                String str2 = c3437xk.f27874d;
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMapA.put("impressionId", str2);
                C3178nk c3178nk = C3178nk.f27064a;
                C3178nk.b("AdImpressionSuccessful", linkedHashMapA, EnumC3281rk.SDK);
            }
        }
    }
}
