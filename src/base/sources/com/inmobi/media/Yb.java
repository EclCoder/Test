package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Yb extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fb f26076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26078c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yb(Fb fb2, long j10, int i10, kl.f fVar) {
        super(1, fVar);
        this.f26076a = fb2;
        this.f26077b = j10;
        this.f26078c = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new Yb(this.f26076a, this.f26077b, this.f26078c, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Yb) create((kl.f) obj)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        em.k.d(H9.f24930c, null, null, new Xb(this.f26076a, this.f26077b, this.f26078c, null), 3, null);
        return fl.g0.f38750a;
    }
}
