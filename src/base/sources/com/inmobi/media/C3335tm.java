package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.tm, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3335tm extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fm f27575a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3335tm(Fm fm2, kl.f fVar) {
        super(2, fVar);
        this.f27575a = fm2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3335tm(this.f27575a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3335tm(this.f27575a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        Fm fm2 = this.f27575a;
        return new C2836ae(fm2.f26834a, fm2.f24801b, fm2.f24802c.f24888e, fm2.f24804e);
    }
}
