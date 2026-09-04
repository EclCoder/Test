package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.w1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3392w1 extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3443y1 f27754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3468z1 f27755b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3392w1(C3443y1 c3443y1, C3468z1 c3468z1, kl.f fVar) {
        super(1, fVar);
        this.f27754a = c3443y1;
        this.f27755b = c3468z1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new C3392w1(this.f27754a, this.f27755b, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3392w1(this.f27754a, this.f27755b, (kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        this.f27754a.f27829a.a(this.f27755b);
        return fl.g0.f38750a;
    }
}
