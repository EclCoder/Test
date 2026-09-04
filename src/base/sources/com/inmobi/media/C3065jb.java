package com.inmobi.media;

import com.inmobi.media.C3065jb;

/* JADX INFO: renamed from: com.inmobi.media.jb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3065jb extends AbstractC3288s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3185o1 f26799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ic f26800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public em.z1 f26801d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3065jb(C3185o1 adManagerComponent, Ic stateMachine) {
        super(adManagerComponent);
        kotlin.jvm.internal.s.h(adManagerComponent, "adManagerComponent");
        kotlin.jvm.internal.s.h(stateMachine, "stateMachine");
        this.f26799b = adManagerComponent;
        this.f26800c = stateMachine;
    }

    public static final fl.g0 a(C3065jb c3065jb) {
        c3065jb.f26800c.e();
        return fl.g0.f38750a;
    }

    @Override // com.inmobi.media.AbstractC3288s1
    public final void b() {
        g();
    }

    @Override // com.inmobi.media.AbstractC3288s1
    public final void d() {
        g();
    }

    @Override // com.inmobi.media.AbstractC3288s1
    public final void e() {
        L6.a(this.f26801d);
        this.f26801d = null;
    }

    public final void g() {
        long j10 = this.f27424a.f27714c;
        em.o0 coroutineScope = this.f26799b.f27107e;
        tl.a timeOutCallback = new tl.a() { // from class: yh.b9
            @Override // tl.a
            public final Object invoke() {
                return C3065jb.a(this.f57622a);
            }
        };
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.s.h(timeOutCallback, "timeOutCallback");
        this.f26801d = em.k.d(coroutineScope, null, null, new Jk(j10, timeOutCallback, null), 3, null);
    }

    @Override // com.inmobi.media.AbstractC3288s1
    public final void a() {
        L6.a(this.f26801d);
        this.f26801d = null;
    }
}
