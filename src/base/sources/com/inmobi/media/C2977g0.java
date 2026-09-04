package com.inmobi.media;

import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2977g0 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3132m0 f26577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ short f26578b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2977g0(C3132m0 c3132m0, short s10, kl.f fVar) {
        super(2, fVar);
        this.f26577a = c3132m0;
        this.f26578b = s10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C2977g0(this.f26577a, this.f26578b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C2977g0(this.f26577a, this.f26578b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        Map mapA = AbstractC3487zk.a(this.f26577a.f26968b);
        mapA.put("errorCode", kotlin.coroutines.jvm.internal.b.f(this.f26578b));
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b("AdLoadDroppedAtSDK", mapA, EnumC3281rk.SDK);
        return fl.g0.f38750a;
    }
}
