package com.inmobi.media;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ad extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ld f24469a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ad(Ld ld2, kl.f fVar) {
        super(2, fVar);
        this.f24469a = ld2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Ad(this.f24469a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Ad(this.f24469a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        int i10 = AbstractC3302sf.f27467a;
        Context applicationContext = this.f24469a.f27890a.f27822a.f27104b.getApplicationContext();
        kotlin.jvm.internal.s.g(applicationContext, "getApplicationContext(...)");
        return kotlin.coroutines.jvm.internal.b.a(AbstractC3302sf.a(applicationContext));
    }
}
