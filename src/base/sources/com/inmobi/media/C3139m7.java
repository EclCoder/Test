package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.m7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3139m7 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3243q7 f26985b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3139m7(C3243q7 c3243q7, kl.f fVar) {
        super(2, fVar);
        this.f26985b = c3243q7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3139m7(this.f26985b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3139m7(this.f26985b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f26984a;
        if (i10 == 0) {
            fl.s.b(obj);
            C3243q7 c3243q7 = this.f26985b;
            this.f26984a = 1;
            if (c3243q7.d(this) == objF) {
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
