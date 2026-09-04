package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class A9 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B9 f24459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ue f24460c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A9(B9 b10, Ue ue2, kl.f fVar) {
        super(2, fVar);
        this.f24459b = b10;
        this.f24460c = ue2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new A9(this.f24459b, this.f24460c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new A9(this.f24459b, this.f24460c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f24458a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            return obj;
        }
        fl.s.b(obj);
        B4 b10 = this.f24459b.f24525a;
        Ue ue2 = this.f24460c;
        this.f24458a = 1;
        Object objA = b10.a(ue2, this);
        return objA == objF ? objF : objA;
    }
}
