package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Mh extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ph f25281a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mh(Ph ph2, kl.f fVar) {
        super(1, fVar);
        this.f25281a = ph2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new Mh(this.f25281a, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Mh(this.f25281a, (kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        this.f25281a.a(true);
        return fl.g0.f38750a;
    }
}
