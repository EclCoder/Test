package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ve, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3379ve extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Be f27722b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3379ve(Be be2, kl.f fVar) {
        super(2, fVar);
        this.f27722b = be2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3379ve(this.f27722b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3379ve(this.f27722b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27721a;
        if (i10 == 0) {
            fl.s.b(obj);
            InterfaceC3322t9 interfaceC3322t9L = this.f27722b.l();
            if (interfaceC3322t9L != null) {
                ((C3348u9) interfaceC3322t9L).a("NativeRenderedState", "Impression Tracking Started - waiting for viewability criteria");
            }
            hm.e eVarB = ((C3171nd) this.f27722b.f24536b.f24605j.getValue()).b();
            C3353ue c3353ue = new C3353ue(null);
            this.f27721a = 1;
            if (hm.g.q(eVarB, c3353ue, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        this.f27722b.m();
        ((C3171nd) this.f27722b.f24536b.f24605j.getValue()).a();
        return fl.g0.f38750a;
    }
}
