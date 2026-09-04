package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.l0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3106l0 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3132m0 f26888a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3106l0(C3132m0 c3132m0, kl.f fVar) {
        super(2, fVar);
        this.f26888a = c3132m0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3106l0(this.f26888a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3106l0(this.f26888a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        Map mapA = AbstractC3487zk.a(this.f26888a.f26968b);
        long j10 = this.f26888a.f26969c.f26288b;
        em.o0 o0Var = AbstractC3488zl.f28033a;
        mapA.put("latency", kotlin.coroutines.jvm.internal.b.e(SystemClock.elapsedRealtime() - j10));
        mapA.put("networkType", B5.o());
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b("ServerNoFill", mapA, EnumC3281rk.SDK);
        return fl.g0.f38750a;
    }
}
