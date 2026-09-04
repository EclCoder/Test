package com.inmobi.media;

import android.os.SystemClock;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3003h0 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f26643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3132m0 f26644b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3003h0(C3132m0 c3132m0, Map map, kl.f fVar) {
        super(2, fVar);
        this.f26643a = map;
        this.f26644b = c3132m0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3003h0(this.f26644b, this.f26643a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        Map map = this.f26643a;
        return new C3003h0(this.f26644b, map, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        long j10;
        long jElapsedRealtime;
        ll.b.f();
        fl.s.b(obj);
        Object obj2 = this.f26643a.get("errorCode");
        Short sh2 = obj2 instanceof Short ? (Short) obj2 : null;
        Map mapA = AbstractC3487zk.a(this.f26644b.f26968b);
        C3132m0 c3132m0 = this.f26644b;
        if (sh2 != null && sh2.shortValue() == 2138) {
            j10 = c3132m0.f26969c.f26289c;
            em.o0 o0Var = AbstractC3488zl.f28033a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else if ((sh2 == null || sh2.shortValue() != 2139) && (sh2 == null || sh2.shortValue() != 2203)) {
            j10 = c3132m0.f26969c.f26287a;
            em.o0 o0Var2 = AbstractC3488zl.f28033a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            j10 = c3132m0.f26969c.f26291e;
            em.o0 o0Var3 = AbstractC3488zl.f28033a;
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        mapA.put("latency", kotlin.coroutines.jvm.internal.b.e(jElapsedRealtime - j10));
        mapA.putAll(this.f26643a);
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b("AdLoadFailed", mapA, EnumC3281rk.SDK);
        return fl.g0.f38750a;
    }
}
