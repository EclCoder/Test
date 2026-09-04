package com.inmobi.media;

import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3054j0 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3132m0 f26762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f26763b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3054j0(C3132m0 c3132m0, Map map, kl.f fVar) {
        super(2, fVar);
        this.f26762a = c3132m0;
        this.f26763b = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3054j0(this.f26762a, this.f26763b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3054j0(this.f26762a, this.f26763b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        Map mapA = AbstractC3487zk.a(this.f26762a.f26968b);
        mapA.putAll(this.f26763b);
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b("ServerError", mapA, EnumC3281rk.SDK);
        return fl.g0.f38750a;
    }
}
