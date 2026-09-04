package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Hd extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A6 f24942b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hd(A6 a10, kl.f fVar) {
        super(2, fVar);
        this.f24942b = a10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Hd(this.f24942b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Hd(this.f24942b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f24941a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            return obj;
        }
        fl.s.b(obj);
        A6 a10 = this.f24942b;
        this.f24941a = 1;
        Object objA = a10.a(this);
        return objA == objF ? objF : objA;
    }
}
