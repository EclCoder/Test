package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Eg extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fg f24721a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eg(Fg fg2, kl.f fVar) {
        super(2, fVar);
        this.f24721a = fg2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Eg(this.f24721a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Eg(this.f24721a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        Fg fg2 = this.f24721a;
        fg2.f24780b.setValue(fg2.f24779a.a());
        return fl.g0.f38750a;
    }
}
