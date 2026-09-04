package com.inmobi.media;

import com.inmobi.media.Tc;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.List;
import o4.Wz.OGoz;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class Tc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Xc f25745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3306sj f25746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC2979g2 f25747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3306sj f25748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3306sj f25749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3306sj f25750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C3306sj f25751g;

    public static final List a() {
        return gl.r.l();
    }

    public static final List b(Tc tc2) {
        return D4.a("impression_shown", tc2.f25745a.f26005a.f25077a);
    }

    public static final List c(Tc tc2) {
        return D4.a("loaded", tc2.f25745a.f26005a.f25077a);
    }

    public static final List d(Tc tc2) {
        return D4.a("mrc50", tc2.f25745a.f26005a.f25077a);
    }

    public static final List e(Tc tc2) {
        return D4.a("start_tracking", tc2.f25745a.f26005a.f25077a);
    }

    public Tc(Uc uc2, Xc trackerData) {
        kotlin.jvm.internal.s.h(uc2, OGoz.fHEQFy);
        kotlin.jvm.internal.s.h(trackerData, "trackerData");
        this.f25745a = trackerData;
        this.f25746b = new C3306sj(uc2, new tl.a() { // from class: yh.b4
            @Override // tl.a
            public final Object invoke() {
                return Tc.c(this.f57614a);
            }
        });
        C3136m4 c3136m4 = AbstractC2878c4.f26300a;
        kotlin.jvm.internal.s.h(AdConfig.class, "clazz");
        this.f25747c = ((AdConfig) AbstractC2878c4.f26300a.a(AdConfig.class)).getNative().getInteraction().getClickDedupingEnabled() ? new C2877c3(uc2) : new Gc(uc2, new tl.a() { // from class: yh.c4
            @Override // tl.a
            public final Object invoke() {
                return Tc.a();
            }
        });
        this.f25748d = new C3306sj(uc2, new tl.a() { // from class: yh.d4
            @Override // tl.a
            public final Object invoke() {
                return Tc.e(this.f57656a);
            }
        });
        this.f25749e = new C3306sj(uc2, new tl.a() { // from class: yh.e4
            @Override // tl.a
            public final Object invoke() {
                return Tc.b(this.f57686a);
            }
        });
        this.f25750f = new C3306sj(uc2, new tl.a() { // from class: yh.f4
            @Override // tl.a
            public final Object invoke() {
                return Tc.a(this.f57706a);
            }
        });
        this.f25751g = new C3306sj(uc2, new tl.a() { // from class: yh.g4
            @Override // tl.a
            public final Object invoke() {
                return Tc.d(this.f57729a);
            }
        });
    }

    public static final List a(Tc tc2) {
        return gl.r.s0(D4.a("impression", tc2.f25745a.f26005a.f25077a), AbstractC2844am.a("Impression", tc2.f25745a.f26006b));
    }
}
