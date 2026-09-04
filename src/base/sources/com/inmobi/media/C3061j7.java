package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.j7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3061j7 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3243q7 f26792c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3061j7(C3243q7 c3243q7, kl.f fVar) {
        super(2, fVar);
        this.f26792c = c3243q7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        C3061j7 c3061j7 = new C3061j7(this.f26792c, fVar);
        c3061j7.f26791b = obj;
        return c3061j7;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        C3061j7 c3061j7 = new C3061j7(this.f26792c, (kl.f) obj2);
        c3061j7.f26791b = (C2967fg) obj;
        return c3061j7.invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f26790a;
        if (i10 == 0) {
            fl.s.b(obj);
            C2967fg c2967fg = (C2967fg) this.f26791b;
            C3243q7 c3243q7 = this.f26792c;
            this.f26790a = 1;
            Object objA = c3243q7.f26681b.a(c2967fg, this);
            if (objA != ll.b.f()) {
                objA = fl.g0.f38750a;
            }
            if (objA == objF) {
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
