package com.inmobi.media;

import com.inmobi.media.C3181nn;

/* JADX INFO: renamed from: com.inmobi.media.nn, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3181nn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final em.o0 f27079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3111l5 f27080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Zn f27081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fl.k f27082d;

    public C3181nn(em.o0 coroutineScope, C3111l5 trackingView, Zn config) {
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.s.h(trackingView, "trackingView");
        kotlin.jvm.internal.s.h(config, "config");
        this.f27079a = coroutineScope;
        this.f27080b = trackingView;
        this.f27081c = config;
        this.f27082d = fl.l.b(new tl.a() { // from class: yh.z9
            @Override // tl.a
            public final Object invoke() {
                return C3181nn.a(this.f58046a);
            }
        });
    }

    public static final Fg a(C3181nn c3181nn) {
        Zn zn2 = c3181nn.f27081c;
        return new Fg(c3181nn.f27079a, new Hg(c3181nn.f27081c.f26159b), new C2872bo(new C2846ao(zn2.f26158a, zn2.f26160c), new C3280rj(c3181nn.f27080b, gl.r.l())));
    }
}
