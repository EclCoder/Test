package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.k7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3087k7 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3243q7 f26845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Zf f26846c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3087k7(C3243q7 c3243q7, Zf zf2, kl.f fVar) {
        super(2, fVar);
        this.f26845b = c3243q7;
        this.f26846c = zf2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3087k7(this.f26845b, this.f26846c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3087k7(this.f26845b, this.f26846c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f26844a;
        if (i10 == 0) {
            fl.s.b(obj);
            C3243q7 c3243q7 = this.f26845b;
            Zf zf2 = this.f26846c;
            C3061j7 c3061j7 = new C3061j7(c3243q7, null);
            this.f26844a = 1;
            if (c3243q7.a(zf2, c3061j7, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        return fl.g0.f38750a;
    }
}
