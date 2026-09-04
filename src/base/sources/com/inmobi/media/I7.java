package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class I7 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R7 f24990a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I7(kl.f fVar, R7 r10) {
        super(2, fVar);
        this.f24990a = r10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new I7(fVar, this.f24990a);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new I7((kl.f) obj2, this.f24990a).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        if (this.f24990a.b() == Bg.STATE_PLAYBACK_COMPLETED) {
            this.f24990a.f25603p.seekTo(0L);
            R7 r10 = this.f24990a;
            r10.f25599l.set(Bg.STATE_PREPARED);
        }
        W7 w10 = this.f24990a.f25612y;
        if (w10.f25931e) {
            w10.a();
            w10.f25930d.a();
        } else {
            T4.a(w10.f25927a, new V7(w10, null));
        }
        C3448y6 c3448y6 = this.f24990a.f25611x;
        if (!c3448y6.f27914d.getAndSet(true)) {
            em.o0 o0Var = c3448y6.f27912b;
            long j10 = c3448y6.f27921k;
            C3397w6 action = new C3397w6(c3448y6, null);
            kotlin.jvm.internal.s.h(o0Var, "<this>");
            kotlin.jvm.internal.s.h(action, "action");
            c3448y6.f27915e = em.k.d(o0Var, em.c1.c().X0(), null, new G3(j10, null, action), 2, null);
            em.o0 o0Var2 = c3448y6.f27912b;
            long j11 = c3448y6.f27922l;
            C3423x6 action2 = new C3423x6(c3448y6, null);
            kotlin.jvm.internal.s.h(o0Var2, "<this>");
            kotlin.jvm.internal.s.h(action2, "action");
            c3448y6.f27916f = em.k.d(o0Var2, em.c1.c().X0(), null, new G3(j11, null, action2), 2, null);
        }
        this.f24990a.f25603p.play();
        R7 r11 = this.f24990a;
        r11.f25599l.set(Bg.STATE_PLAYING);
        R7 r12 = this.f24990a;
        r12.a(new C3465yn(r12.f25603p.getCurrentPosition()));
        return fl.g0.f38750a;
    }
}
