package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3029i0 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G f26709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3132m0 f26710b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3029i0(G g10, C3132m0 c3132m0, kl.f fVar) {
        super(2, fVar);
        this.f26709a = g10;
        this.f26710b = c3132m0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3029i0(this.f26709a, this.f26710b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3029i0(this.f26709a, this.f26710b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        Map mapA = AbstractC3487zk.a(this.f26709a);
        C3132m0 c3132m0 = this.f26710b;
        mapA.put("networkType", B5.o());
        long j10 = c3132m0.f26969c.f26292f;
        em.o0 o0Var = AbstractC3488zl.f28033a;
        mapA.put("latency", kotlin.coroutines.jvm.internal.b.e(SystemClock.elapsedRealtime() - j10));
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b("ParseSuccess", mapA, EnumC3281rk.SDK);
        return fl.g0.f38750a;
    }
}
