package com.inmobi.media;

import com.inmobi.media.Mc;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Mc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3416x f25267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InMobiJsonResponse f25268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ic f25269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Qc f25270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Cl f25271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fl.k f25272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fl.k f25273g;

    public Mc(C3416x adComponent, InMobiJsonResponse inMobiJsonResponse, Ic adUnitCallback) {
        kotlin.jvm.internal.s.h(adComponent, "adComponent");
        kotlin.jvm.internal.s.h(inMobiJsonResponse, "inMobiJsonResponse");
        kotlin.jvm.internal.s.h(adUnitCallback, "adUnitCallback");
        this.f25267a = adComponent;
        this.f25268b = inMobiJsonResponse;
        this.f25269c = adUnitCallback;
        this.f25270d = new Qc(adComponent);
        this.f25272f = fl.l.b(new tl.a() { // from class: yh.k2
            @Override // tl.a
            public final Object invoke() {
                return Mc.b(this.f57799a);
            }
        });
        this.f25273g = fl.l.b(new tl.a() { // from class: yh.l2
            @Override // tl.a
            public final Object invoke() {
                return Mc.a(this.f57816a);
            }
        });
    }

    public static final C3325tc a(Mc mc2) {
        C3185o1 c3185o1 = mc2.f25270d.f25552a.f27822a;
        return new C3325tc(c3185o1.f27104b, c3185o1.f27107e, c3185o1.f27105c);
    }

    public static final Lc b(Mc mc2) {
        return (Lc) mc2.f25270d.f25553b.getValue();
    }
}
