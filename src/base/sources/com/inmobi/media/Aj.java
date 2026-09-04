package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Aj extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Tj f24479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ej f24481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ii f24482d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Aj(Ej ej2, Ii ii2, kl.f fVar) {
        super(2, fVar);
        this.f24481c = ej2;
        this.f24482d = ii2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Aj(this.f24481c, this.f24482d, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Aj(this.f24481c, this.f24482d, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f24480b;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Tj tj2 = this.f24479a;
            fl.s.b(obj);
            return tj2;
        }
        fl.s.b(obj);
        Tj tj3 = new Tj(this.f24481c.f24728a);
        Ej ej2 = this.f24481c;
        String str = this.f24482d.f25024a;
        this.f24479a = tj3;
        this.f24480b = 1;
        return Ej.a(ej2, str, tj3, this) == objF ? objF : tj3;
    }
}
