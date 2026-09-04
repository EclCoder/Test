package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Cn extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Gn f24628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Zj f24629b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cn(Gn gn2, Zj zj2, kl.f fVar) {
        super(2, fVar);
        this.f24628a = gn2;
        this.f24629b = zj2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Cn(this.f24628a, this.f24629b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Cn(this.f24628a, this.f24629b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        Gn gn2 = this.f24628a;
        gn2.f24899h = this.f24629b;
        gn2.f24897f.a(gn2.f24901j);
        return fl.g0.f38750a;
    }
}
